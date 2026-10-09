import card from "./components/card.js";
import header from "./components/header.js";
import footer from "./components/footer.js";

const root = document.getElementById("root");

if (!root) {
    throw new Error('Element with id "root" was not found.');
}

// Render header and footer
root.insertAdjacentHTML("beforebegin", header());
root.insertAdjacentHTML("afterend", footer());

// Infinite scroll configuration
const BATCH_SIZE = 10;
const SCROLL_MARGIN = "200px";

let isLoading = false;

// Create a sentinel that remains at the bottom of the cards
const sentinel = document.createElement("div");
sentinel.id = "scroll-sentinel";
sentinel.style.height = "1px";
root.appendChild(sentinel);


// Generates a random past date
function getRandomPastDate() {
    const start = new Date(2020, 0, 1).getTime();
    const end = Date.now();

    const randomDate = new Date(
        start + Math.random() * (end - start)
    );

    return randomDate.toLocaleDateString("en-US", {
        month: "short",
        day: "2-digit",
        year: "numeric"
    });
}


// Fetches a random name
async function getRandomName() {
    try {
        const response = await fetch("https://randomuser.me/api/");

        if (!response.ok) {
            throw new Error("Failed to fetch random user.");
        }

        const data = await response.json();
        const user = data.results?.[0];

        if (!user) {
            throw new Error("No user returned.");
        }

        return `${user.name.first} ${user.name.last}`;
    } catch (error) {
        console.error("Name fetch failed:", error);
        return "John Doe";
    }
}


// Generates a random alphanumeric string
function getRandomString(max, min) {
    const len = Math.floor(
        Math.random() * (max - min + 1)
    ) + min;

    const chars =
        "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    let str = "";

    for (let i = 0; i < len; i++) {
        str += chars[
            Math.floor(Math.random() * chars.length)
        ];
    }

    return str;
}


// Selects a random avatar style
function getRandomStyle() {
    const styles = [
        "blobs",
        "glyphs",
        "identicon",
        "initial-face",
        "loops",
        "patchwork",
        "rings",
        "slices",
        "shapes",
        "squircles",
        "stack",
        "waves",
        "bottts-neutral",
        "avataaars",
        "adventurer",
        "bottts",
        "clay",
        "critters"
    ];

    const index = Math.floor(Math.random() * styles.length);

    return styles[index];
}


// Generates and renders a batch of cards
async function addArray(len = BATCH_SIZE) {
    if (isLoading) return;

    isLoading = true;

    try {
        // Fetch names concurrently instead of one at a time
        const names = await Promise.all(
            Array.from({ length: len }, () => getRandomName())
        );

        const cards = names.map((name) => ({
            main_img: `https://picsum.photos/500?random=${crypto.randomUUID()}`,
            profile_img_style: getRandomStyle(),
            profile_img_seed: getRandomString(8, 3),
            name,
            date: getRandomPastDate()
        }));

        // Render the complete batch before the sentinel
        const html = cards.map((el) =>
            card(
                el.main_img,
                el.profile_img_style,
                el.profile_img_seed,
                el.name,
                el.date
            )
        ).join("");

        sentinel.insertAdjacentHTML("beforebegin", html);

    } catch (error) {
        console.error("Failed to render cards:", error);
    } finally {
        isLoading = false;
    }

    // Fill the viewport if the page is not tall enough to scroll
    if (
        sentinel.isConnected &&
        sentinel.getBoundingClientRect().top <= window.innerHeight + 200
    ) {
        requestAnimationFrame(() => addArray(BATCH_SIZE));
    }
}


// Observe when the user approaches the bottom
const observer = new IntersectionObserver(
    (entries) => {
        if (entries.some(entry => entry.isIntersecting)) {
            addArray(BATCH_SIZE);
        }
    },
    {
        root: null,
        rootMargin: SCROLL_MARGIN,
        threshold: 0
    }
);

observer.observe(sentinel);

// Load the first batch
addArray(BATCH_SIZE);
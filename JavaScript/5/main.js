import card from "./components/card.js";
import header from "./components/header.js";
import footer from "./components/footer.js";

const root = document.getElementById('root');
// const data = [
//     {
//         main_img: "https://picsum.photos/500?random=1",
//         profile_img_style: getRandomStyle(),
//         profile_img_seed: getRandomString(8, 3),
//         name: await getRandomName(),
//         date: getRandomPastDate() //fetches random date
//     }
// ]

const data = await addArray(10);

root.insertAdjacentHTML("beforebegin", header());
// root.innerHTML = card(main_img, pfp_style, pfp_seed, name, date);
root.insertAdjacentHTML("afterend", footer());


function getRandomPastDate() {
  const start = new Date(2020, 0, 1).getTime(); // Jan 1, 2020
  const end = Date.now(); // Right now (ensures it's not in the future)
  
  const randomDate = new Date(start + Math.random() * (end - start));
  
  // Format as "Mar 25, 2026"
  return randomDate.toLocaleDateString('en-US', {
    month: 'short',
    day: '2-digit',
    year: 'numeric'
  });
} //generates random date

async function getRandomName() {
    try {
        const response = await fetch('https://randomuser.me/api/');
        const data = await response.json();
        const user = data.results[0];

        const fullName = `${user.name.first} ${user.name.last}`
        return fullName;
    } catch (e) {
        return "Jon Doe";
    }
}


function getRandomString(max, min) {
    const len = Math.floor(Math.random() * (max - min + 1)) + min;
    const chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"; //stores the all permitted characters used to generate the string
    let str = "";

    for (let i = 0; i < len; i++) {
        str += chars[Math.floor(Math.random() * chars.length)]; //assigns a random character from chars
    }

    return str;
}

function getRandomStyle() {
    const styles = ['blobs', 'glyphs', 'identicon', 'initial-face', 'loops', 'patchwork', 'rings', 'slices', 'shapes', 'squircles', 'stack', 'waves', 'bottts-neutral', 'avataaars', 'adventurer', 'bottts', 'clay', 'critters']; //stores all the selected styles

    let index = Math.floor(Math.random() * styles.length); //selects a random index number

    return styles[index]; //returns the random style
}

async function addArray(len) {
    for (let i = 0; i < len; i++) {
        const el = {
            main_img: `https://picsum.photos/500?random=${i + 1}`,
            profile_img_style: getRandomStyle(),
            profile_img_seed: getRandomString(8, 3),
            name: await getRandomName(),
            date: getRandomPastDate()
        };

        // Render each card as soon as its data is ready
        root.insertAdjacentHTML(
            "beforeend",
            card(
                el.main_img,
                el.profile_img_style,
                el.profile_img_seed,
                el.name,
                el.date
            )
        );
    }
}
import card from "./components/card.js";
import header from "./components/header.js";
import footer from "./components/footer.js";

const root = document.getElementById('root');
const data = [
    {
        main_img: "https://picsum.photos/500?random=1",
        profile_img_style: "patchwork",
        profile_img_seed: "1dej",
        name: await getRandomName(),
        date: getRandomPastDate() //fetches random date
    }
]

root.insertAdjacentHTML("beforebegin", header());
// root.innerHTML = card(main_img, pfp_style, pfp_seed, name, date);
root.insertAdjacentHTML("afterend", footer());

data.forEach(el => {
    root.innerHTML += card(el.main_img, el.profile_img_style, el.profile_img_seed, el.name, el.date);
});


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
import card from "./components/card.js";
import header from "./components/header.js";
import footer from "./components/footer.js";

const root = document.getElementById('root');

root.insertAdjacentHTML("beforebegin", header());
root.innerHTML = card();
root.insertAdjacentHTML("afterend", footer())
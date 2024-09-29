const time = new Date(); // gets the current date as a whole
const hour = time.getHours(); // gets the current hour value
const minute = time.getMinutes(); // gets the current minute value
const second = time.getSeconds(); // gets the current second value

const s = 6*second; // handles second hand initial current position
const m = (60*minute+second)/10; // handles minute hand initial current position
const h = 30*hour+((60*minute+second)/600); // handles hour hand initial current position

const root = document.documentElement; // targets the root element (i.e. <html> element)
root.style.setProperty('--hour', `${h}deg`); // moves the hour hand
root.style.setProperty('--min', `${m}deg`); // moves the minute hand
root.style.setProperty('--sec', `${s}deg`); // moves the second hand
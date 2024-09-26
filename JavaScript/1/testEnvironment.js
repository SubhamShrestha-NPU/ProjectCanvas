var pi = '3.14159';
let and = "&";
document.getElementById("testEnvironment").innerHTML = "<h1>TEST ENVIRONMENT</h1>" +
"5 ==='5' is " + (5 === '5') + "<br> but <br> 5 == '5' is " + (5 == '5') + "<br> but <br> 5 == 6 is " + (5 == 6) + "<br> &#128527;   &#128526; YoYo <br> <br>" + 
"The second digit of &pi; after the decimal point is " + pi.charAt(2+1) +
"<br><br> The unicode of & is " + and.charCodeAt(0);

// Input array
let array = [1, 2, 3, 4, 5, 6, 7];

// placing at index position 0 the element
// between index 3 and 6
//console.log("Array " + array.copyWithin(3,0,4));

const demoArray = [
    "Banana", "Apple", "Cherry", "Date", "Elderberry", "Fig", "Grape",
    42, 17, 23, 56, 34, 89, 12,
    { name: "Alice", age: 25 },
    { name: "Bob", age: 30 },
    { name: "Charlie", age: 35 }
];

// const d = new Date();
// d.setFullYear(2010, 4,14);
// d.setMonth(6);
// d.setDate(9);
// d.setHours(5);
// d.setMinutes(30);
// d.setSeconds(30);
// console.log(d);


// const today = new Date();

// const someday = new Date();
// someday.setFullYear(2010,4,14);

// if (today>someday) {
//     console.log('Today is after 14th May, 2010');
// }
// else {
//     if(today<someday) {
//         console.log('Today is before 14th May, 2010');
//     }
//     else {
//         console.log('Today is 14th May, 2010');
//     }
// }


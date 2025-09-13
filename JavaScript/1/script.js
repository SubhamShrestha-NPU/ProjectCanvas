document.getElementById("id1").innerHTML = 11 + 9;
document.getElementById("id2").innerHTML =  2 + 3;
let name1 = "Subham Shrestha";
document.getElementById("id3").innerHTML = name1;
const cars = ["BMW","Toyota","Tata","Maruti"]; //Creating an array
cars[0] = "Tesla"; //changing a variable by redefinig the value of const
cars.push("BMW"); //adding an element in the array
document.getElementById("id4").innerHTML = cars;
const ownerDetails = {type:"fiat", model:"345"}; // creating an object
ownerDetails.model = "234"; //changing object
document.getElementById("id5").innerHTML = ownerDetails;
document.getElementById("id6").innerHTML = typeof 'Subham'; // using typeof operator
var any = 12; //LET any BE A LUCID PROTOTYPING RE-DECLARABLE VARIABLE
any<<=9;
document.getElementById("id7").innerHTML = any;

//functions
function InToCm(inches){
    return inches*2.54;
}
    let Centimeter = InToCm(500);
    document.getElementById("id8").innerHTML = Centimeter;
//objects
    const person1 = {name:"John Doe", age:"50 years", height:"1.6m", weight:"70kg"};
    //delete person1.age;
    const myArray = Object.values(person1);
    document.getElementById("id9").innerHTML =person1.name + " aged " + person1.age + ", is " + person1.height + " in strature, weighs about " + person1.weight + ".";//using object
    document.getElementById("id11").innerHTML = myArray; //displaying the properties of an object,by storing it at an array
    //methods
const person2 = {
    firstName:"Michael",
    lastname:"Hood",
    fullName:function(){
        return (this.firstName + " " + this.lastname).toUpperCase();
    },//this is a method
};
document.getElementById("id10").innerHTML = person2.fullName();//method calling  
//JS Object Constructors
function Animal(type,color,feed){
    this.Type = type;
    this.Color = color;
    this.Feed = feed;
}
let horns = true;
Animal.prototype.Horns = horns; //adding a new property
const tiger = new Animal("mammal","yellow","herbivores","have horns");
const crocodile = new Animal("amphibians","green","carnivores", "have no horns");
const myArray1 = Object.values(tiger);
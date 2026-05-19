const prompt = require("prompt-sync")();
const numberOne = Number(prompt("enter first number: "))
const numberTwo = Number(prompt("enter second number: "))

let sum = numberOne + numberTwo;
console.log("sum of the two numbers is: " + sum)
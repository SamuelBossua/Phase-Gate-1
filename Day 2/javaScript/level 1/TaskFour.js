const prompt = require("prompt-sync")();
const numberOne = Number(prompt("enter first number: "))
const numberTwo = Number(prompt("enter second number: "))

let product = numberOne * numberTwo;
console.log("product of the two numbers is: " + product)
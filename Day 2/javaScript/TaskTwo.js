
const prompt = require("prompt-sync")();
const age = Number(prompt("Enter your age: "));
const newAge = (age + 5);
console.log("your age in 5 years is: " + newAge);
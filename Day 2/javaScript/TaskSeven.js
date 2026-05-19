const prompt = require("prompt-sync")();
const radius = Number(prompt("enter a radius: "))


let circumference = 2 * 3.14 * radius;
console.log("the circumference is : " + circumference)
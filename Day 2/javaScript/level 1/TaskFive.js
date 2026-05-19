const prompt = require("prompt-sync")();
const celcius = Number(prompt("enter number in celcius: "))


let farenheit = (celcius * (9/5)) + 32;
console.log("the temp in farenheit is : " + farenheit)
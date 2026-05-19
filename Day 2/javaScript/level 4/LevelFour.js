function addition(numberOne, numberTwo){
	let sum = numberOne + numberTwo;
	return sum;
}


function evenNumber(number){

	if(number % 2 == 0){
	return "it is even";
}
	return "it is odd";

}       

function squareNumber(number){

	int square = number * number;
	return square;
}

function celciusToFahrenheit(celcius){

	let fahrenheit = (celcius * (9/5)) + 32;
	return fahrenheit;

}

function primeNumberChecker(number){
	let checker = 2;
	if(number % 2 == 0){
	return "it is not a prime number";
}
	while(number % checker != 0){
	checker = checker + 1;
	if(number % checker == 0){
	return "it is a prime number";}
}
	return "it is not a prime number";
}	 

function largestOfThree(numberOne, numberTwo, numberThree){

	let largest = numberOne;
	
	if(numberTwo > largest){

		largest = numberTwo;
}
		
	if(numberThree > largest){
		largest = numberThree;
}

	return largest;


}

return simpleInterest(rate, principle, time){

	int simpleIn = (principle * rate * time)/100;
	return simpleIn;



}



function areOfRectangle( length, width){


	let area = length * width;

	return area;
}

function reverseNumber(int number){

let reverse = 0;
let remainder = 0;
let i = 0;
	while(number > 0){
	 reverse = number / 10;
	 remainder = number % 10;
	
	 reverse += remainder;
	 i++;

	


}
	return reverse;
}

public class LevelFour {

public static int addTwoNumber(int numberOne, int numberTwo){

	int sum = numberOne + numberTwo;
	return sum;
}

public static String evenNumber(int number){

	if(number % 2 == 0){
	return "it is even";
}
	return "it is odd";

}       
public static int squareNumber(int number){

	int square = number * number;
	return square;
}

public static int celciusToFahrenheit(int celcius){

	int fahrenheit = (celcius * (9/5)) + 32;
	return fahrenheit;

}


public static String primeNumberChecker(int number){
	int checker = 2;
	if(number % 2 == 0){
	return "it is not a prime number";
}
	while(number % checker != 0){
	checker++;
	if(number % checker == 0){
	return "it is a prime number";}
}
	return "it is not a prime number";
}	 






public static int largestOfThree(int numberOne, int numberTwo, int numberThree){

	int largest = numberOne;
	
	if(numberTwo > largest){

		largest = numberTwo;
}
		
	if(numberThree > largest){
		largest = numberThree;
}

	return largest;


}


public static int simpleInterest(int rate, int principle, int time){

	int simpleIn = (principle * rate * time)/100;
	return simpleIn;



}


public static int areOfRectangle(int length, int width){


	int area = length * width;

	return area;
}


public static int reverseNumber(int number){

int reverse = 0;
int remainder = 0;
int i = 0;
	while(number > 0){
	 reverse = number / 10;
	 remainder = number % 10;
	
	 reverse += remainder;
	 i++;

	


}
	return reverse;
}


























}
import java.util.Arrays;
public class levelFive {

	public static int[] primeNumbersArray(int[] numbers){


	for(int number : numbers){

	int checker = 2;
	if(number % 2 == 0){
	return null;
}
	while(number % checker != 0){
	checker++;
	if(number % checker == 0){
	return numbers[number];
}
		 


}
	return numbers[number];
}

























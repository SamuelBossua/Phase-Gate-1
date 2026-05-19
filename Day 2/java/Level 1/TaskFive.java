import java.util.Scanner;
public class TaskFive {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a temperature in celcius ");
	int celcius = input.nextInt();
	System.out.println(celcius + "^o");
	int farenheit = (celcius * (9/5)) + 32;
	System.out.println("The temperature in farenheit is:" + farenheit);
	
	}
}
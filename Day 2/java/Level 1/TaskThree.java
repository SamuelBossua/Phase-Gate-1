import java.util.Scanner;
public class TaskThree {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a first number: ");
	int numberOne = input.nextInt();
	System.out.println("Enter a second number: ");
	int numberTwo = input.nextInt();
	int sum = numberOne + numberTwo;
	System.out.println("The sum is:" + sum);
}
}
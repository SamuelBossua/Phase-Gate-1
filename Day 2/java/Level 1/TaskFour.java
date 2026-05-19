import java.util.Scanner;
public class TaskFour {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a first number: ");
	int numberOne = input.nextInt();
	System.out.println("Enter a second number: ");
	int numberTwo = input.nextInt();
	int product = numberOne * numberTwo;
	System.out.println("The product is:" + product);
}
}
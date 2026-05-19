import java.util.Scanner;
public class TaskTwo {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a first number: ");
	int number = input.nextInt();
	
	if(number > 0){System.out.println("It is a positive number");}
	else if(number < 0){System.out.println("it is an negative number");}
}
}
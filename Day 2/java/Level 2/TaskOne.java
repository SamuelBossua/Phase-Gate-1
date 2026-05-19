import java.util.Scanner;
public class TaskOne {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a first number: ");
	int number = input.nextInt();
	
	if(number % 2 == 0){System.out.println("It is an even number");}
	else{System.out.println("it is an odd number");}
}
}
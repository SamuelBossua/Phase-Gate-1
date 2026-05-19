import java.util.Scanner;
public class TaskFour {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a number one: ");
	int numberOne = input.nextInt();
	
	System.out.println("Enter a number two: ");
	int numberTwo = input.nextInt();
	
	if(numberOne > numberTwo){System.out.println(numberOne);}
	else{System.out.println(numberTwo);}
}
}
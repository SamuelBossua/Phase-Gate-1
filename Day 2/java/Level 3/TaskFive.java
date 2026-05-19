import java.util.Scanner;
public class TaskFive {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a number: ");
	int number = input.nextInt();
	


	for(int i = 1; number >= 1; i--){

	number = number *(i-1); 	
}
	System.out.println(number);
}
}
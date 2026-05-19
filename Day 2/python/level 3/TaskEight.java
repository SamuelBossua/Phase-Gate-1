import java.util.Scanner;
public class TaskEight {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int sum = 0;
	int number;
	

	while(number != 0){
	
	System.out.println("Enter a number: ");
	number = input.nextInt();
	sum+= number;
		
}
	System.out.print(sum);

	
}
}
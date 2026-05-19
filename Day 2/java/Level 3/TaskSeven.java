import java.util.Scanner;
public class TaskSeven {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int sum = 0;
	int number;
	

	for(int i = 0 ; i < 5 ; i++){
	
	System.out.println("Enter a number: ");
	number = input.nextInt();
	sum+= number;
	
}
	System.out.print(sum);

	
}
}
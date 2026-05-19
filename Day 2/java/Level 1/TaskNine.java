import java.util.Scanner;
public class TaskSNine {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a price:");
	int price = input.nextInt();
	int tax = price + (0.1 * price);
	System.out.println("The price after tax is : " + tax);
	
	}
}
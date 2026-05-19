import java.util.Scanner;
public class TaskSix {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a length:");
	int length = input.nextInt();
	System.out.println("Enter a width:");
	int width = input.nextInt();
	
	int area = width * length;
	System.out.println("The area of the rectangle is: " + area);
	
	}
}
import java.util.Scanner;
public class TaskTwo {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("What is your age?: ");
	int age = input.nextInt();
	int newAge = age + 5;
	System.out.println("Your age in 5 years will be:" + newAge);
}
}
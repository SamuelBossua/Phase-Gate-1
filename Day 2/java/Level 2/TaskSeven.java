import java.util.Scanner;
public class TaskSeven {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a password: ");
	int password = input.nextInt();
	
	if(password == "admin123"){
	System.out.println("It is correct");
}	

	else{System.out.print("It is incorrect");}

	



	
}
}
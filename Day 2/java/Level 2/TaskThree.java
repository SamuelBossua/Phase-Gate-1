import java.util.Scanner;
public class TaskThree {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a score: ");
	int score = input.nextInt();
	
	if(score >= 0){System.out.println("pass");}
	else{System.out.println("fail");}
}
}
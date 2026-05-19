import java.util.Scanner;
public class TaskNine {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter an age: ");
	int age = input.nextInt();
	
	if(age < 13){
	System.out.println("child");
}	


	if(age >= 13 && age <= 17){
	System.out.println("teen");
}	

	if(age >= 18){
	System.out.println("adult");
}	


	
	



	
}
}
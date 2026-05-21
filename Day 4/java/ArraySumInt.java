public class ArraySumInt {

	public static int[] arraySum(int[] digits, int number){

	
	for(int count = 1; count <= digits.length; count++){


	
	if(digits[count] + digits[count + 1] == number){
		
			int[] result = {count, count + 1};
				
	
}
	
			
			return result;
}


		














}
	public static void main(String[] args){

		
	int[] digits = {8,6,12,4,-2};
	int number = 6;

	System.out.println(arraySum(digits, number));


}

}
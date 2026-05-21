public class LargestFill {



	public static int[] largestFill(int[] numbers){

		//largest
		int largest = numbers[0];

		for(int count = 0; count < numbers.length; count++){


			if(numbers[count] > largest){
				largest =numbers[count];

}
}
		//smallest
		int smallest = numbers[0];

		for(int count = 0; count < numbers.length; count++){


			
			if(numbers[count] < smallest){
				smallest = numbers[count];
					

}
}

			

		//smallest to largest
	

		for(int count = smallest; count < largest; count++){

		int smallest;
			
}
		return int[] newArray = int[smallest];
}


}

		public static void main(Sting[] args){

			int[] numbers = {6,8,9,10,3,4,5};

			System.out.println(largestFill(numbers));

}

		

















}

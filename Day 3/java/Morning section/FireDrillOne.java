import java.util.Arrays;
public class FireDrillOne {
		




public static String facebooklikeSystem (String[] name){

		
		int  number =  name.length;
		if(name.length == 0){
			return "no one likes this";

}


		else if(number == 1){

			return name[0] + " likes this";
}


		

		else if(number == 2){

			return name[0] + " and " + name[1] + " like this";
}

		else if(number == 3 ){
			
			return name[0] + ", " + name[1] + " and " + name[2] + " like this";

}

		else if(number > 3){

			return name[0] + ", " + name[1] +  " and " + (number - 2) + " others like this";

}


			return "incorrect";


}
}
			
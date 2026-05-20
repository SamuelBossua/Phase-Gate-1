import java.util.Arrays;
public class MiniParkingSystem {

	public static String parkingLotSystem(int[] parkingLotEnter[]){

System.out.println("----------- WELCOME TO THE PARKING LOT------------");



for(int slot = 1; slot <= 20; slot++){
		if(parkingLotEnter[slot].equals(0)){
		return " has available space";
}
		
		else if(parkingLotEnter[slot].equals(0)){
		return " has empty space";
}
	
		else{return "incorrect input choose either 0 or 1";}
}
		


int[] parkingLotLeave = new int[20];

for(int slot = 1; slot <= 20; slot++){
	while(parkingLotEnter[slot].equals(1)){
	if(parkingLotLeave[slot].equals(0)){
		return " is now empty";
}
}


}
return "incorrect input only 1 or 0";
































}
}
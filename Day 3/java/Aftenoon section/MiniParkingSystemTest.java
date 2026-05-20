import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MiniParkingSystemTest {

@Test

public void testThatParkingSpaceIsOccupied(){

	int[] parkingLot = {0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0};
	String expected = {"has empty space,has empty space,has empty space,has empty space,has empty space,has available space,has available space,has available space,has available space,has available space,has empty space,has empty space,has empty space,has empty space,has empty space,has available space,has available space,has available space,has available space,has available space"};


	String actual = MiniParkingSystem.parkingLotSystem(parkingLot);
	assertEquals(expected, actual);


}



























}
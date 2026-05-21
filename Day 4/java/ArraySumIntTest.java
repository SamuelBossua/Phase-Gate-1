import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArraySumIntTest {
	
	@Test
	public void testThatTwoDigitsInTheArrayReturnTheOutSideDigit(){

	int[] digits = {8,6,12,4,-2};
	int number = 6;
	
	int[] expected = {8, -2};
	int[] actual = ArraySumInt.arraySum(digits, number);
	assertEquals(expected, actual);




}


























}
import junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FireDrillOneTest {

@Test

public void testThatIfNoNameIsEnteredNoOneLikes(){

	String[] name = {};
	String expected = "no one likes this";
	String[] actual = FireDrillOne.facebookLikeSystem(name);
	asssertEquals(actual, expected);

}



public void testThatIfOneNameIsEnteredOnePersonLikes(){

	String[] name = {"peter"};
	String = {"peter likes this"};
	String[] actual = FireDrillOne.facebookLikeSystem(name);
	assertEquals(actual, expected);

}

public void testThatIfTwoNamesAreEnteredTwoPeopleLike(){

	String[] name = {"jacob", "alex"};
	String = {"jacob and peter like this"};
	String[] actual = FireDrillOne.facebookLikeSystem(name);
	assertEquals(actual, expected);

}

public void testThatIfThreeNamesAreEnteredThreePeopleLike(){

	String[] name = {"max", "john", "mark"};
	String = {"max, john, and peter like this"};
	String[] actual = FireDrillOne.facebookLikeSystem(name);
	assertEquals(actual, expected);

}

public void testThatIfMoreThanThreeNamesAreEnteredTheFirstTwoAndRemainingPeopleLike(){

	String[] name = {"alex","max", "john", "mark"};
	String = {"alex, max and 2 others like this"};
	String[] actual = FireDrillOne.facebookLikeSystem(name);
	assertEquals(actual, expected);

}










































}
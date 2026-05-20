import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FireDrillOneTest {

@Test

public void testThatIfNoNameIsEnteredNoOneLikes(){

	String[] name = {};
	String expected = "no one likes this";
	String actual = FireDrillOne.facebookLikeSystem(name);
	asssertEquals(actual, expected);

}

@Test

public void testThatIfOneNameIsEnteredOnePersonLikes(){

	String[] name = {"peter"};
	String expected = "peter likes this";
	String actual = FireDrillOne.facebookLikeSystem(name);
	assertEquals(actual, expected);

}

@Test

public void testThatIfTwoNamesAreEnteredTwoPeopleLike(){

	String[] name = {"jacob", "alex"};
	String expected = "jacob and peter like this";
	String actual = FireDrillOne.facebookLikeSystem(name);
	assertEquals(actual, expected);

}

@Test

public void testThatIfThreeNamesAreEnteredThreePeopleLike(){

	String[] name = {"max", "john", "mark"};
	String expected = "max, john, and peter like this";
	String actual = FireDrillOne.facebookLikeSystem(name);
	assertEquals(actual, expected);

}

@Test

public void testThatIfMoreThanThreeNamesAreEnteredTheFirstTwoAndRemainingPeopleLike(){

	String[] name = {"alex","max", "john", "mark"};
	String expected = "alex, max and 2 others like this";
	String actual = FireDrillOne.facebookLikeSystem(name);
	assertEquals(actual, expected);

}










































}
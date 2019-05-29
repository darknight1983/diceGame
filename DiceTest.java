import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;



class DiceTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test 
	void testRoll() {
		// Call the roll function to get randomly generated number
		int num = Dice.roll();
		
		// Assert that the sum of the two numbers are return
		// Assert that the sum is greater than one
		// Assert that the sum is less that or equal to 12
		assertTrue(num > 0 && num > 1 && num <= 12);

    }
	
	@Test
	void testRange() {
		// Call the roll function to get randomly generated number
		int num = Dice.roll();
		
		// Assert that the number returned is in the range of 2-12
		assertTrue(num >= 2 && num <= 12);
	}
	
	@Test
	void testFirstRollCheck() {
		
		// Randomly generate the first roll
		int firstRoll = Dice.roll();
		
		// Pass the first roll to the checkFirstRoll() method 
		int playerPoint = Dice.checkFirstRoll(firstRoll);
		
		// Assert that the playerPoint is not equal to 7, 11, 2, 3, or 12
		assertTrue(playerPoint != 7);
		assertTrue(playerPoint != 11);
		assertTrue(playerPoint != 2);
		assertTrue(playerPoint != 3);
		assertTrue(playerPoint != 12);
	}
	
	
	
	
}



import java.lang.Math;

public class Dice {
	
	// This variable holds the value of the players roll if the player did not 
	//  win or lose on the first roll. 
	public static int playerPoint;
	public static int firstRoll;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 playGame();
		
		
	}
	
	public static int roll() {
		// This function is to simulate the rolling of the dice.

		
		// a.) Generate two random numbers in the range between 2-6
		//     a store the value in a variable.
		
		int firstDice = 1 + (int)(Math.random() * 6);
		int secondDice = 1 + (int)(Math.random() * 6);
		
		int sum = firstDice + secondDice;
		System.out.println("You rolled " + sum);
		
		// b.) Call the firstRoll() method to check if the player won or
		//     lost on the first roll.
		
		return sum;
	}
	
	public static int checkFirstRoll(int point) {
		// If the player rolls a 7 or 11, the player wins.
		if (point == 7 || point == 11) {
			System.out.println("You rolled a " + point + " you win");
			return 0;
			
		} else if (point == 3 || point == 2 || point == 12) {
			System.out.println("You rolled a " + point + ". You lose.");
			return 0;
			
		} else {
			System.out.println("Keep Rolling");
			return point;

		}
//		return point;
		
		// If the player rolls a 2, 3, or 12 on the first roll, the player 
		// loses.
	}
	
	public static void hitPoint(int point) {
		if (point == 0) {
			return;
		}
		
		boolean stillShooting = true;
		// The player should keep rolling until they win or roll a 7.
		
		
		// Limit the game to 10 rolls for testing purposes
		int limit = 10;
		int i = 0;
		
		while(stillShooting && i <= limit) {
			int diceRoll = 1 + (int)(Math.random() * 6);
			
			// Check to see if the user hit their point.
			if (point == diceRoll) {
				// The player hit their point.
				System.out.println("You hit your point. You win!");
				stillShooting = false;
				break;
			} else if (point == 7) {
				// The player rolled a seven before hitting their point. 
				System.out.println("Snap! You crapped out!");
				stillShooting = false;
				break;
			} else {
				System.out.println("Hit that point mane! I got money on this game!");
				
			}
			// Increment i ----- test
			i++;
		}
		
	}
	
	public static void playGame() {
		// Start the game with the first roll.
		firstRoll = roll();
		 
		// Check the first roll to see if the player won or lose.
		playerPoint = checkFirstRoll(firstRoll);
		
		// Check to see if the player will hit their point or crap out.
		hitPoint(playerPoint);
			
	}


}

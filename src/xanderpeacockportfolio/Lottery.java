package xanderpeacockportfolio;

import java.util.Scanner;

/*
 * Xander Peacock
 * 10.17.18
 * Lottery
 */

public class Lottery {

	public static void main(String[] args) {
	
		// Generate a lottery number	
		int lottery = (int)(Math.random() * 100);
		
		// Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (two digits): ");
		int guess = input.nextInt();
		
		// Get digits from lottery
		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;
		
		// Get digits from guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		System.out.println("The lottery number is: " + lottery);
		
		// Check if fully match
		if (guess == lottery) {
			System.out.println("Exact Match! You win $10,000!");
		}
		// Check if both digits match but are mixed
		else if (guessDigit2 == lotteryDigit1 
				&& guessDigit1 == lotteryDigit2) {
			System.out.println("Digits Match! You win $3,000!");
		}
		// Check if a digit matches on either side
		else if (guessDigit1 == lotteryDigit1 
				|| guessDigit1 == lotteryDigit2
				|| guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2) {
			System.out.println("One Digit Matches! You win $1,000!");
		}
		// Checks if no matches
		else {
			System.out.println("You have lost, try again");
		}

	}

}

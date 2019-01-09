package xanderpeacockportfolio;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Guessing_Game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Get Random Number
		int random = ThreadLocalRandom.current().nextInt(1,100);
		
		// Get Attempts
		int attempts = 0;
		
		// Ask for Number
		System.out.println("Guess a number between 1-100");
		
		// Get Guess Input
		int guess = input.nextInt();
		
		// If Wrong
		while (guess != random) {
			attempts++;
			
			if (guess > random) {
				System.out.println("Guess Lower");
			}
			else {
				System.out.println("Guess Higher");
			}
			if (attempts >= 10) {
				break;
			}
			guess = input.nextInt();
		}
		// If Won
		if (guess == random) {
		System.out.println("Correct! Nice Job!");
		System.out.println("It took you " + attempts + " attempts");
		System.exit(3);
		}
		else {
			System.out.println("You hecking suck at this game");
		}
		
		
	}

}

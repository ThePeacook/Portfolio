/*
 * Xander Peacock
 * 01.09.19
 * Guess the number (Advanced)
 */
package xanderpeacockportfolio;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Guessing_Game_Loops {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Get Random Number
		int random = ThreadLocalRandom.current().nextInt(1,100);
		
		// Ask for Number
		System.out.println("Guess a number between 1-100");
		
		// Get Guess Input
		int guess = input.nextInt();
		
		
		
		// WHILE CODE
		while (guess != random) {
			
			if (guess > random) {
				System.out.println("Guess Lower");
			}
			else {
				System.out.println("Guess Higher");
			}
			guess = input.nextInt();
		}
		// If Won
		if (guess == random) {
			System.out.println("Correct! Nice Job!");
		}
		
		
		
		// DO CODE
		System.out.println("Guess a number between 1-100");
		do {
			
			if (guess > random) {
				System.out.println("Guess Lower");
			}
			else {
				System.out.println("Guess Higher");
			}
			guess = input.nextInt();
		}while(guess != random);
		// If Won
		System.out.println("Correct! Nice Job!");
		
		
		
		// FOR CODE
		for (guess = 0; guess != random; guess = input.nextInt()) {
			if (guess > random) {
				System.out.println("Guess Lower");
			}
			else {
				System.out.println("Guess Higher");
			}
		}
		// If Won
		System.out.println("Correct! Nice Job!");
	}
}

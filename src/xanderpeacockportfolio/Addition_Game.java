/*
 * Xander Peacock
 * 10.17.18
 * Addition Game
 */

package xanderpeacockportfolio;

import java.util.Scanner;

public class Addition_Game {

	public static void main(String[] args) {
		int x = 1;
		while (x == 1) {
		
		// Scanner
		Scanner input = new Scanner(System.in);
		
		// Variables
		int Number_1 = (int)(System.currentTimeMillis() % 10);
		int Number_2 = (int)(System.currentTimeMillis() /7 % 10);
		int Total;
		
		// Ask Math
		System.out.println("What is " + Number_1 + " + " + Number_2 + "?");
		int Answer = input.nextInt();
		
		// Computer Math
		Total = Number_1 + Number_2;
		
		// If statement (True)
		if (Total == Answer) {
			System.out.println("Correct! Nice job!");
		}
		
		// Else statement (False)
		else {
			System.out.println("Nice Try!");
			System.out.println("The answer was actually " + Total + ", try again");
	    }

	}
		
  }

}


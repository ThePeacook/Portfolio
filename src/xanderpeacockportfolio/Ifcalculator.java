package xanderpeacockportfolio;

import java.util.Scanner;

/*
 * Xander Peacock
 * 10.17.18
 * Calculation Statements
 */

public class Ifcalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		// Get 2 numbers from user
		System.out.println("Please enter the first value: ");
		double number1 = input.nextDouble();
		
		System.out.println("Please enter the second value: ");
		double number2 = input.nextDouble();
		
		
		// Get the operator
		System.out.println("Do you want to Add \"+\", Subtract \"-\", Times \"*\", Divide \"/\", or %? ");
		String operator = input.next();
		
		// Test input
		double total = 0;
		
		// Plus
		if (operator.equals("+")) {
			total = number1 + number2;
		}
		// Minus
		else if (operator.equals("-")) {
			total = number1 - number2;
		}
		// Times
	    else if (operator.equals("*")) {
			total = number1 * number2;
		}
		// Divide
		else if (operator.equals("/")) {
			total = number1 / number2;
		}
		// Modulo
		else if (operator.equals("%")) {
			total = number1 % number2;
		}
		// If we didn't input any above then...
		else {
			System.out.println ("You put in the wrong operator or an error has occurred");
		}
		
		
		
		// Print output
		System.out.println("Your total is: " + total);
		

	}

}

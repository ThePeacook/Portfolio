package xanderpeacockportfolio;

import java.util.Scanner;

public class BirthdayGuess {

	public static void main(String[] args) {
		
		// Set up scanner
		Scanner input = new Scanner(System.in);
		
		// Binary numbers
		final int num128 = 128;
		final int num64 = 64;
		final int num32 = 32;
		final int num16 = 16;
		final int num8 = 8;
		final int num4 = 4;
		final int num2 = 2;
		final int num1 = 1;

		// String Numbers
		String set1 = "";
		String set2 = "";
		String set3 = "";
		String set4 = "";
		String set5 = "";
		
		// Input Number
		int inputnum = 0;
		
		// Placeholder
		int whatsLeft;
		
		for(int i = 0; i < 31; i++) {
			String biannum = "";
			inputnum = inputnum + 1;
			
			// Initialize what's left
			whatsLeft = inputnum;
			
			// Creat binary in string
			// 128
			if (inputnum >= num128) {
				whatsLeft = inputnum - num128;
				biannum = biannum + "1";
			}
			else {
				biannum = biannum + "0";
			}
			// 64
			if (whatsLeft >= num64) {
				whatsLeft = inputnum - num64;
				biannum = biannum + "1";
			}
			else {
				biannum = biannum + "0";
			}
			// 32
			if (whatsLeft >= num32) {
				whatsLeft = inputnum - num32;
				biannum = biannum + "1";
			}
			else {
				biannum = biannum + "0";
			}
			// 16
			if (whatsLeft >= num16) {
				whatsLeft = inputnum - num16;
				biannum = biannum + "1";
			}
			else {
				biannum = biannum + "0";
			}
			// 8
			if (whatsLeft >= num8) {
				whatsLeft = inputnum - num8;
				biannum = biannum + "1";
			}
			else {
				biannum = biannum + "0";
			}
			// 4
			if (whatsLeft >= num4) {
				whatsLeft = inputnum - num4;
				biannum = biannum + "1";
			}
			else {
				biannum = biannum + "0";
			}
			// 2
			if (whatsLeft >= num2) {
				whatsLeft = inputnum - num2;
				biannum = biannum + "1";
			}
			else {
				biannum = biannum + "0";
			}
			// 1
			if (whatsLeft >= num1) {
				whatsLeft = inputnum - num1;
				biannum = biannum + "1";
			}
			else {
				biannum = biannum + "0";
			}
			
			
			// Display
			System.out.println("");
			System.out.println("The binary number for " + inputnum + " is " + biannum);
			System.out.println("");
			// Check binary number
			char xnum7 = biannum.charAt(7);
			char xnum6 = biannum.charAt(6);
			char xnum5 = biannum.charAt(5);
			char xnum4 = biannum.charAt(4);
			char xnum3 = biannum.charAt(3);
			
			// Assign to sets
			if (xnum7 == '1') {
				set1 = set1 + inputnum + " ";
			}
			if (xnum6 == '1') {
				set2 = set2 + inputnum+ " ";
			}
			if (xnum5 == '1') {
				set3 = set3 + inputnum+ " ";
			}
			if (xnum4 == '1') {
				set4 = set4 + inputnum+ " ";
			}
			if (xnum3 == '1') {
				set5 = set5 + inputnum+ " ";
			}
			
			// Display
			System.out.println("set1 is " + set1);
			System.out.println("set2 is " + set2);
			System.out.println("set3 is " + set3);
			System.out.println("set4 is " + set4);
			System.out.println("set5 is " + set5);	
		}	
		
		// Declare Variables
		int answer = 0;
		int guess = 0;
					
		// Ask for 5 birthday questions
		System.out.println("");
		// 16
		System.out.println("Is your birthday on set5? (1 or 0) ");
		answer = input.nextInt();
		if (answer == 1) {
			guess = guess + 16;
		}
		// 8
		System.out.println("Is your birthday on set4? (1 or 0) ");
		answer = input.nextInt();
		if (answer == 1) {
			guess = guess + 8;
		}
		// 4
		System.out.println("Is your birthday on set3? (1 or 0) ");
		answer = input.nextInt();
		if (answer == 1) {
			guess = guess + 4;
		}
		// 2
		System.out.println("Is your birthday on set2? (1 or 0) ");
		answer = input.nextInt();
		if (answer == 1) {
			guess = guess + 2;
		}
		// 1
		System.out.println("Is your birthday on set1? (1 or 0) ");
		answer = input.nextInt();
		if (answer == 1) {
			guess = guess + 1;
			System.out.println("Your birthday is on: " + guess);
			System.exit(5);
		}
		
	}
}

/*
 * Xander Peacock
 * 01.09.19
 * Grade Check
 */
package xanderpeacockportfolio;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Input
		double English;
		double Math;
		double Science;
		double Art;
		double Gym;
		double Fernit;
		double Cooking;
		double Google;
		double Survivalism;
		double Debate;
		double sum;
		double avg = 0;
		
		
		// Output
		System.out.println("What is your grade average in English? ");
		English = input.nextDouble();
		System.out.println("What is your grade average in Math? ");
		Math = input.nextDouble();
		System.out.println("What is your grade average in Science? ");
		Science = input.nextDouble();
		System.out.println("What is your grade average in Art? ");
		Art = input.nextDouble();
		System.out.println("What is your grade average in Gym? ");
		Gym = input.nextDouble();
		System.out.println("What is your grade average in Fernit? ");
		Fernit = input.nextDouble();
		System.out.println("What is your grade average in Cooking? ");
		Cooking = input.nextDouble();
		System.out.println("What is your grade average in Google? ");
		Google = input.nextDouble();
		System.out.println("What is your grade average in Survivalism? ");
		Survivalism = input.nextDouble();
		System.out.println("What is your grade average in Debate? ");
		Debate = input.nextDouble();
		
		
		// Sum
		sum = English + Math + Science + Art + Gym + Fernit + Cooking + Google + Survivalism + Debate;
		
		
		// Average
		avg = sum / 10;
		
		
		// If Statements
		if (avg>=90){
			System.out.println("You have a A!");
		}
		else if (avg>=80){
			System.out.println("You have a B!");
		}
		else if (avg>=70){
			System.out.println("You have a C!");
		}
		else if (avg>=60){
			System.out.println("You have a D!");
		}
		else if (avg<60){
			System.out.println("You have a F!");
		}
		else {
			System.out.println("Something went wrong! Try again");
		}
		
		
		// Display Total
		System.out.println("Your grade average is: " + avg);
		 
		
		
	}

}

package xanderpeacockfive;

import java.util.Scanner;

/*
 * Xander Peacock
 * 10.17.18
 * Zodiac Switch Statements
 */

public class Zodiacs {

	public static void main(String[] args) {
		/*
		 * Switch (switch-expression) {
		 * case value1:
		 *  Statements;
		 *  break;
		 * case value2:
		 *  Statements;
		 *  break;
		 * case value3:
		 *  Statements;
		 *  break;
		 * case value4:
		 *  Statements;
		 *  break;
		 * default:
		 *  Statements;
		 *  break;
		 * }
		 */
		
		// Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year you were born: ");
		int year = input.nextInt();
		
		// Case Statement
		switch (year % 12) {
		case 0:
			System.out.println("Zodiac: Monkey");
			System.out.println("Traits: wise, intelligent, confident, charismatic, loyal, inventive and leadership.");
			System.out.println("Disabilities: egotistical, arrogant, crafty, restless and snobbish.");
			break;
		case 1:
			System.out.println("Zodiac: Rooster");
			System.out.println("Traits: beautiful, kind-hearted, hard-working, courageous, independent, humorous and honest. They like to keep home neat and organized.");
			System.out.println("Disabilities: arrogant, self-aggrandizing, persuasive to others and wild as well as admire things or persons blindly.");
			break;
		case 2:
			System.out.println("Zodiac: Dog");
			System.out.println("Traits: honest, friendly, faithful, loyal, smart, straightforward, venerable and a strong sense of responsibility.");
			System.out.println("Disabilities: ");
			break;
		case 3:
			System.out.println("Zodiac: Pig");
			System.out.println("Traits:  happy, easygoing, honest, trusting, educated, sincere and brave.");
			System.out.println("Disabilities: stubbornness, naive, over-reliant, self-indulgent, easy to anger and materialistic.");
			break;
		case 4:
			System.out.println("Zodiac: Rat");
			System.out.println("Traits: intelligent, charming, quick-witted, practical, ambitious, and good at economizing as well as social activities.");
			System.out.println("Disabilities: timid, stubborn, wordy, greedy, devious, too eager for power and love to gossip.");
			break;
		case 5:
			System.out.println("Zodiac: Ox");
			System.out.println("Traits: hard working, honest, creative, ambitious, cautious, patient and handle things steadily.");
			System.out.println("Disabilities: stubborn, narrow-minded, indifferent, prejudiced, slow and not good at communication.");
			break;
		case 6:
			System.out.println("Zodiac: Tiger");
			System.out.println("Traits: friendly, brave, competitive, charming and endowed with good luck and authority.");
			System.out.println("Disabilities: impetuous, irritable, overindulged and love to boast to others.");
			break;
		case 7:
			System.out.println("Zodiac: Rabbit");
			System.out.println("Traits: kind-hearted, friendly, intelligent, cautious, skillful, gentle, quick and live long.");
			System.out.println("Disabilities: superficial, stubborn, melancholy and overly-discreet.");
			break;
		case 8:
			System.out.println("Zodiac: Dragon");
			System.out.println("Traits: powerful, kind-hearted, successful, innovative, brave, healthy courageous and enterprising.");
			System.out.println("Disabilities: conceited, scrutinizing, tactless, quick-tempered and over-confident.");
			break;
		case 9:
			System.out.println("Zodiac: Snake");
			System.out.println("Traits: wise, discreet, agile, attractive and full of sympathy.");
			System.out.println("Disabilities: lazy, greedy, arrogant and indulging in self-admiration.");
			break;
		case 10:
			System.out.println("Zodiac: Horse");
			System.out.println("Traits: clever, active, energetic, quick-witted, fashionable, agile, popular among others and have the ability to persuade others.");
			System.out.println("Disabilities: selfish, arrogant and over-confident.");
			break;
		case 11:
			System.out.println("Zodiac: Goat");
			System.out.println("Traits: polite, mild mannered, shy, imaginative, determined and have good taste.");
			System.out.println("Disabilities: pessimistic, unrealistic, short-sighted and slow in behavior.");
			break;
			
		}
	}

}

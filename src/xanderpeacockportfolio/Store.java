package xanderpeacockportfolio;

import pickle.java.Grocery;

public class Store {

	public static void main(String[] args) {
		
		// Foods
		Grocery ribsteak = new Grocery(); 
		Grocery human = new Grocery(); 
		Grocery applejuice = new Grocery(); 
		Grocery chowmein = new Grocery(); 
		Grocery spaghetti = new Grocery(); 
		Grocery lasagna = new Grocery(); 
		// Rib Steak
		ribsteak.setTypefood("Meat");
		ribsteak.setWeight(5);
		ribsteak.setPrice(5.99);
		ribsteak.setServings(1);
		ribsteak.setCalories(1000);
		// Human
		human.setTypefood("Meat");
		human.setWeight(200);
		human.setPrice(999.99);
		human.setServings(6);
		human.setCalories(10000);
		// Apple Juice
		applejuice.setTypefood("Drink");
		applejuice.setWeight(1);
		applejuice.setPrice(2.99);
		applejuice.setServings(10);
		applejuice.setCalories(100);
		// Chow Mein
		chowmein.setTypefood("Noodles");
		chowmein.setWeight(2);
		chowmein.setPrice(4.50);
		chowmein.setServings(1);
		chowmein.setCalories(500);	
		// Spaghetti
		spaghetti.setTypefood("Pasta");
		spaghetti.setWeight(10);
		spaghetti.setPrice(2.99);
		spaghetti.setServings(3);
		spaghetti.setCalories(100);
		// Lasagna
		lasagna.setTypefood("Pasta");
		lasagna.setWeight(50);
		lasagna.setPrice(19.99);
		lasagna.setServings(20);
		lasagna.setCalories(200);
		
		// Print
		System.out.println("---------");
		System.out.println("Rib Steak");
		System.out.println(" ");
		ribsteak.display();
		ribsteak.servcal();
		ribsteak.calcal();
		System.out.println("-----");
		System.out.println("Human");
		System.out.println(" ");
		human.display();
		human.servcal();
		human.calcal();
		System.out.println("-----------");
		System.out.println("Apple Juice");
		System.out.println(" ");
		applejuice.display();
		applejuice.servcal();
		applejuice.calcal();
		System.out.println("---------");
		System.out.println("Chow Mein");
		System.out.println(" ");
		chowmein.display();
		chowmein.servcal();
		chowmein.calcal();
		System.out.println("---------");
		System.out.println("Spaghetti");
		System.out.println(" ");
		spaghetti.display();
		spaghetti.servcal();
		spaghetti.calcal();
		System.out.println("-------");
		System.out.println("Lasagna");
		System.out.println(" ");
		lasagna.display();
		lasagna.servcal();
		lasagna.calcal();

	}

}

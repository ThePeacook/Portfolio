package xanderpeacockportfolio;

public class Bank {

	public static void main(String[] args) {
		Bank2 myacc = new Bank2(); 
		Bank2 youracc = new Bank2(); 
		
		myacc.name = "Xander Peacock";
		youracc.name = "Jane Doe";
		myacc.address = "No";
		youracc.name = "123 Seasame Street";
		myacc.balance = 0;
		youracc.balance = 1000;
		myacc.phone = "7777777";
		youracc.phone = "6666666";
		
		myacc.display();
		youracc.display();
		
	}

}

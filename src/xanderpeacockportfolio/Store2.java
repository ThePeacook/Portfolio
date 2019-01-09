package xanderpeacockportfolio;

public class Store2 {

	private String typefood;
	private int weight;
	private double price;
	private int servings;
	private int calories;
	
	public String getTypefood() {
		return typefood;
	}

	public void setTypefood(String typefood) {
		this.typefood = typefood;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public void display() {
		System.out.println("Type: " + typefood);
		System.out.println("Weight: " + weight);
		System.out.println("Price: " + price);
		System.out.println("Servings: " + servings);
		System.out.println("Calories per Serving: " + calories);
	}
	
	public void servcal() {
		double servpri = price/servings;
		System.out.println("Serving Price: " + servpri);
	}
	
	public void calcal() {
		double calitem = calories*servings;
		System.out.println("Calories for All: " + calitem);
	}
	
	
	
	
	
	
	
	
	
}

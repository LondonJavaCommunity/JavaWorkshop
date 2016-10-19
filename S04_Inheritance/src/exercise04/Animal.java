package exercise04;

public class Animal {

	private int weight;

	public void eat( int mealSize ) {
		weight+= mealSize / 2;
	}

	public Animal(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

}

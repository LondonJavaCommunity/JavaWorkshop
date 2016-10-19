package exercise04b;

public abstract class Animal {

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

	public abstract void sayHi();

}

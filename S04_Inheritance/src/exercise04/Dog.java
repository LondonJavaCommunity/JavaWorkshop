package exercise04;

public class Dog extends Animal {

	private String name;

	public Dog(String name, int weight) {
		super(weight);
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", getWeight()=" + getWeight() + "]";
	}


}

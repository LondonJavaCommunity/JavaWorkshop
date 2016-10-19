package exercise04b;

public class Cat extends Animal {

	private String name;

	public Cat(String name, int weight) {
		super(weight);
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", weight=" + getWeight() + "]";
	}

	@Override
	public void sayHi() {
		System.out.println( "Miaw!" );
	}

}

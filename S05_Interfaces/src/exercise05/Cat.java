package exercise05;

public class Cat extends Animal implements Buyable {

	private String name;
	private int price= 200;

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

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public void buy() {
	}

}

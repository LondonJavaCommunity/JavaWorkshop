package exercise05;

//public class Vehicle {
public abstract class Vehicle { /// 2. was^

	private final String make;
	private final String model;

	public Vehicle() {
		this( "SomeMake", "SomeModel");
	}

	public Vehicle(String make, String model) {
		this.make = make;
		this.model = model;
	}

	public void showMakeAndModel() {
		System.out.print( "I'm a shiny "+ make+ " "+ model);
	}

	//	public void alertWalkers() {}
	public abstract void alertWalkers(); /// 2. was^

}

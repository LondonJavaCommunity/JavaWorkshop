package exercise05;

public class Duck extends Animal { // But not Buyable!!!

	public Duck(int weight) {
		super(weight);
	}

	@Override
	public void sayHi() {
		System.out.println( "Quack!" );
	}

}

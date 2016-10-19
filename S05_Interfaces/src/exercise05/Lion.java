package exercise05;

public class Lion extends Animal {  // But not Buyable!!!

	public Lion(int weight) {
		super(weight);
	}

	@Override
	public void sayHi() {
		System.out.println( "Rooooarrr!!!!" );
	}

}

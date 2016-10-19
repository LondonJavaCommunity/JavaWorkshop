package interfaces;

public class Bus extends Vehicle {

	private int takings;

	public Bus(String make, String model) {
		super( make, model );
	}

	public void payFare( int f ) {
		takings+= f;
	}

	@Override
	public void alertWalkers() {
		System.out.println( "Honk Honk!" );
	}

	@Override
	public void showMakeAndModel() {	/// 4.
		super.showMakeAndModel();
		System.out.print( " Bus. " );
	}

}

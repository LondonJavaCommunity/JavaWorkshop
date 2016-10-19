package inheritance2;

public class Bike extends Vehicle {

	public Bike(String make, String model) {
		super( make, model );
	}

	@Override
	public void alertWalkers() { /// 2.
		System.out.println( "Ding ding!" );
	}

	public void carry( int metres ) {
		//		rider.exert (metres / 3)	// How many pounds does rider lose?!
	}

	@Override
	public void showModel() {	/// 4.
		super.showModel();
		System.out.print( " Bike. " );
	}

}

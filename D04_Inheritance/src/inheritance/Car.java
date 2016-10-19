package inheritance;

public class Car extends Vehicle {

	private int fuelLevel;

	public Car(String make, String model, int initialFuel) { /// 4.  and chain:
		super( make, model );
		fuelLevel= initialFuel;
	}

	public Car() { /// 4. Maybe?
	}

	public void addFuel( int litres ) {	/// 2.
		fuelLevel+= litres;
	}

	public void showDetails() { /// 3.
		System.out.println( "My Fuel Level is "+ fuelLevel+ " and...");
		showMakeAndModel(); 	// Call to "parent"  super.showModel() etc to disambiguate
		System.out.println();
	}

}

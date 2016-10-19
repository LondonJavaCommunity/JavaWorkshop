package exercise05;

public class Car extends Vehicle implements Buyable {

	private int fuelLevel;
	private int price= 10000;

	public Car(String make, String model) {
		super( make, model );
	}

	public void addFuel( int litres ) {
		fuelLevel+= litres;
	}

	@Override
	public void alertWalkers() {
		System.out.println( "Toot toot" );
	}

	@Override
	public void showMakeAndModel() {	/// 4.
		super.showMakeAndModel();
		System.out.print( " Car. " );
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public void buy() {
	}

}

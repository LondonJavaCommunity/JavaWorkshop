package exercise05;

public class Bike extends Vehicle implements Buyable {
	
	int price= 1300;

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
	public void showMakeAndModel() {	/// 4.
		super.showMakeAndModel();
		System.out.print( " Bike. " );
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public void buy() {
	}

}

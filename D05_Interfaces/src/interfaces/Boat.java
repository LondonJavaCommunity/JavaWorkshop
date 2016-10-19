package interfaces;

//public class Boat extends Vehicle {
public class Boat extends Vehicle implements Habitable { /// 3. was^

	public void sleepIn() {
		System.out.println( "Creak grown puke yawn yawn" );
	}

	@Override
	public void alertWalkers() {
		System.out.println( "Paaaaaaaarp!" );		
	}

}

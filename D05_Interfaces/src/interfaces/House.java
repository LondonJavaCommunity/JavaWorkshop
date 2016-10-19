package interfaces;

//public class House extends Building {
public class House extends Building implements Habitable { /// 3. was^

	public void sleepIn() {
		System.out.println( "zzzzzzZ zzzzzzzZ" );
	}

}

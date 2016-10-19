/**
 * London Java Community - "Introduction to Java" Workshop - Tue 20 Sep 2016
 * 
 * Mike Burton  mikeb [at] mycosystems.co.uk
 * 
 */
package inheritance2;

/**
 *  Section 4. Inheritance
 */
public class Demo {

	public static void main(String[] args) {

		// 1. Substitutability, base ref Variable can refer to sub-class object (but not vice versa)
		Car aCar= new Car( "Datsun", "Cherry" );	
		Vehicle aVehicle= aCar;		// But cant do:  c2= v;
		aVehicle.alertWalkers();
		aVehicle= new Bus( "Dennis", "Routemaster" );
		aVehicle.alertWalkers();	/* Same call, different action, Polymorphism! */


		/* // 2. How does a `Vehicle` alert walkers
		Vehicle vehicle2= new Vehicle( "Some", "Vehicle" );
		System.out.println( "Vehicle about to alert walkers:" );
		vehicle2.alertWalkers();	// It can't !!
		System.out.println( "Did you hear that??" );
		/*  - Need to know what "kind" of Vehicle, ie no such thing as a Vehicle ("Give me a Vehicle") (or Fruit or Sweet) => Abstract*/


		// 3. So make  Vehicle  & its  alertWalkers()  abstract, 
		//	  so cant do new Vehicle as above, need to create specific kinds.
		//    And note error now in Bike, "effectively abstract"
		System.out.println( "Part 3......" );
		Vehicle vehicle3= aCar;
		vehicle3.alertWalkers();
		vehicle3= new Bike( "Santa Cruz", "Blur" );
		vehicle3.alertWalkers();	/* */


		// 4. Array of base (even abstract) references:
		System.out.println( "Part 4...." );
		Vehicle traffic[]= {vehicle3, aCar, aVehicle};
		for (Vehicle theVehicle: traffic) {
			theVehicle.showModel();		// And add  .showModel() calling super. to Bike, Bus, Car  then print (not println) " Car. " etc
			theVehicle.alertWalkers();
		} /* **Mention protected */

	}

}









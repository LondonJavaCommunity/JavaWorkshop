/**
 * London Java Community - "Introduction to Java" Workshop - Tue 20 Sep 2016
 * 
 * Mike Burton  mikeb [at] mycosystems.co.uk
 * 
 */
package inheritance;

/**
 *  Section 4. Inheritance
 */
public class Demo {

	public static void main(String[] args) {

		// 1. Car is a kind of Vehicle, inherits Vehicle's  showModel()  behaviour
		Car aCar= new Car();
		aCar.showMakeAndModel();		// In Vehicle , no need to define in Car
		System.out.println();


		// 2. Car can do extra things that Vehicle cant do, like addFuel
		aCar.addFuel( 25 ); 	// Cant do v.addFuel(..)


		// 3. Car method can call Vehicle method, to save duplication:
		aCar.showDetails();	/* Add this method, have it call showModel (or super.) */ 


		// 4. Better to initialise its fields  make, model, fuel -
		// 	  Pass them to Car ctor and have it "chain" to parent. Maybe also add a no-args Car ctor for defaults?)
		Car car2= new Car( "Ford", "Focus", 5 );	// Note Car ctor super() call must be first stmt
		car2.showDetails(); /* */

	}

}









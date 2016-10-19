/**
 * London Java Community - "Introduction to Java" Workshop - Tue 20 Sep 2016
 * 
 * Mike Burton  mikeb [at] mycosystems.co.uk
 * 
 */
package exercise05;

/**
 *  Exercise 5. Interfaces
 */
public class Interfaces {

	public static void main(String[] args) {

		// Using the Person, Cat and Animal classes that you developed earlier (or from solution S04b_Inheritance2 if you prefer),
		// implement the following:

		// Add more kinds of Animal such as Rabbit, Lion, Elephant

		// Add a new hierarchy of classes for various kinds of Vehicle (or use the Car, Bus, Bike and Animal classes from D04b_Inheritance2 if you prefer)

		// People can buy certain kinds of Animal and certain kinds of Vehicle, which we will designate as "Buyable".
		// For something to be Buyable it must have getPrice() and buy() methods, so add these methods to the Buyable interface.
		// Choose which Animals and Vehicles should implement the Buyable interface eg class car extends Vehicle implements Buyable.
		// for simplicity the getPrice() methods should just return the car's price field, which can be initialised to the same value for all cars

		// Add to your  Person  class an array of  Buyable  called  favourites , and an  addFavourites()  method.
		// Also add to the  Person  class a  favouritesValuation()  method which will loop through their favourites and calculate their total cost
		// In your main() method create a Person and add a few favourites to them, then call their  favouritesValuation()  method  
		// Note we avoided the obvious and insecure idea of providing a  getFavourites()  method to the  Person  class


		// Attempt to add a protected species such as Lion to the person's favourites

	}

}

/**
 * London Java Community - "Introduction to Java" Workshop - Tue 20 Sep 2016
 * 
 * Mike Burton  mikeb [at] mycosystems.co.uk
 * 
 */
package exercise04b;

/**
 *  Exercise 4b. Inheritance part 2
 */
public class Inheritance {
	public static void main(String[] args) {

		// Using the Person, Animal, Cat and Dog classes that you developed earlier
		// (or Person from solution S03_Association and Person, Animal, Cat and Dog from S04_Inheritance if you prefer),
		// implement the following:


		// 1. All Animals can announce their presence so add an abstract void sayHi() method to the Animal class
		//	  and implement it in the Cat and Dog classes by printing "woof" etc.
		//	  Test by coding like:
		//	Animal a= d; a.sayHi(); a= c; a.sayHi();
		//	  Notice that the same code a.sayHi() does two different things, that's polymorphism!


		// 2. Change the Person class, renaming any fields and methods that have Cat in their name so as to instead be named ...Pet...
		//    Likewise change the type of these fields and methods from Cat to Animal.
		//	  For example the Person's private   Cat[] myCats   field should become   private Animal[] myPets
		//	  Hint: Use your IDE's Refactoring mechanism eg Eclipse> Right-click> Refactor> Rename
		//	  Test by creating a Person and a few Animals, and adding them as pets to the Person.
		//	  Then display the Person including their pets. Do this by adding code to the Person.toString() method
		//	  so that it displays the person and all of the different Animals that are stored in the person's collection of pets.

	}

}

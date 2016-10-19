/**
 * London Java Community - "Introduction to Java" Workshop - Tue 20 Sep 2016
 * 
 * Mike Burton  mikeb [at] mycosystems.co.uk
 * 
 */
package exercise04;

/**
 *  Exercise 4. Inheritance
 */
public class Inheritance {
	public static void main(String[] args) {

		// Using the Person and Cat classes that you developed earlier (or solution S03_Association if you prefer),
		// implement the following:

		// 1. A Person can choose whether to have a Cat or Dog, both of which are `kinds of` Animal.
		//	  So create new classes for Animal and Dog, and add the `extends` keyword as appropriate
		//	  All Animals have a weight and can eat, so move this state & behaviour from the Cat class into the Animal class.
		//	  The `name` field might also be considered common but leave it in the Cat and Dog classes for now.

		// 2. Notice that the Cat constructor now has a problem whilst trying to set the  weight  field
		//	  which is now part of the  Animal  class. 
		//	  Add a constructor to the Animal class which takes an int for the Animal's weight, 
		//	  and call this constructor from the Cat's constructor, passing on the  weight  parameter. 
		//	  Note that this super-class constructor call must be the first statement in the Cat constructor.

		// 3. Notice that the Cat.toString method has a similar error whilst trying to read the  weight  field
		//	  Fix this by adding an int method to the  Animal  class, called  getWeight()  which simply returns the  weight.
		//	  Change the  Cat.toString()  method so that it calls  getWeight()  instead of referring to  weight.
		//	  Similarly correct the errors in the  Dog  class, first making sure that it has a  name  field.
		//	  Eclipse can help here, with its Source> generate Constructor  and  toString  features
		//	  Note that  "generate toString"  can add calls to inherited methods such as  Animal.getWeight()

		//	  Test that Cat and Dog inherit the eat() functionality by coding like:
		//	Cat c= new Cat( "Sid", 6 ); syso; c.eat( 6 ); syso; And likewise for a Dog

	}

}

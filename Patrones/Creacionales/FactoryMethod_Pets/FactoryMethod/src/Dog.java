/*
 * Class "concrete product" - Dog
 *
 */

public class Dog extends Pet {

	/**
	 * Constructor
	 * Set the number of legs for a dog
	 */
	Dog(){
		super(4);
	}
	
	/**
	 * Defines how a dog is fed 
	 */
	@Override
	public void feed() {
		System.out.println("The dog eats a bone");
	}
	/**
	 * Defines how to take the dog for a walk
	 */
	@Override
	public void walk() {
		System.out.println("The dog walks in the park wagging the tail");
	}

}

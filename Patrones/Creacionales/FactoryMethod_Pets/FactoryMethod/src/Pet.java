/**
 * class abstract product
 *
 */
public abstract class Pet {

	protected int legs; // number of legs of the pet

	/**
	 * Constructor
	 * 
	 * @param legs number of legs of the pet
	 */
	public Pet(int legs) {
		this.legs = legs;
	}

	/**
	 * Getter for the number of legs
	 * 
	 * @return the number of legs
	 */
	public int getLegs() {
		return this.legs;
	}

	// Common behaviour to all products
	// but to be defined in the concrete products

	/**
	 * Feeding the pet
	 */
	public abstract void feed();

	/**
	 * Walking the pet
	 */
	public abstract void walk();
}

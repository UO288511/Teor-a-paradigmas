/**
 * This is the class "abstract creator" where the factory method is used
 * Although in this case, the method is implemented in the subclasses
 *
 */
public abstract class Keeper {

	/**
	 * Method where the product (Pet) is created and used In this case,
	 * independently of the concrete pet, as all pets will are kept in a similar
	 * way.
	 */
	public void keep() {
		// create the pet
		Pet pet = this.createPet(); // <- with the factory method we don't need to worry about the concrete pet

		// we give it its favourite food
		pet.feed();

		// we take it for a walk if it has at least 2 legs
		if (pet.getLegs() >= 2) // here we consider the pets differently
			pet.walk();
	}

	/**
	 * Abstrac factory method - generates a pet. The type is defined in the
	 * subclasses
	 * 
	 * @return a pet
	 */
	public abstract Pet createPet();
}

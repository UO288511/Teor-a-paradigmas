/**
 * Class "concrete creator" - DogKeeper
 *
 */
public class DogKeeper extends Keeper {

	/**
	 * Factory method implemented for dogs
	 */
	@Override
	public Pet createPet() {
		return new Dog();
	}

}

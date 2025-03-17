/**
 * Class "concrete creator" - ViperKeeper
 *
 */
public class ViperKeeper extends Keeper {

	/**
	 * Factory Method implemented for vipers
	 */
	@Override
	public Pet createPet() {
		return new Viper();
	}

}

/**
 * Class "concrete product" - Viper
 *
 */
public class Viper extends Pet {

	/**
	 * Constructor Sets the number of legs of viper
	 */
	Viper() {
		super(0);
	}

	/**
	 * Defines how to feed a viper
	 */
	@Override
	public void feed() {
		System.out.println("The viper gets sleepy after eating Mickey");
	}

	/**
	 * Defines how to walk a viper
	 */
	@Override
	public void walk() {
		System.out.println("The viper warns you with its look... it doesn't like walks");
	}

}

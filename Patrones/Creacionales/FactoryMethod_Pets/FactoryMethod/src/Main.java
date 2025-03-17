
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// creating a dog keeper
		Keeper k1 = new DogKeeper();
		// asking to take care of its pet
		k1.keep();
		
		// creating a viper keeper
		Keeper k2 = new ViperKeeper();
		// asking to take care of its pet
		k2.keep();
	}

}

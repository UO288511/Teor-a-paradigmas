
public class DiceSingletonInheritance extends Dice {

	// Static variable for the creation of a unique instance
	private static DiceSingletonInheritance theDice;

	// Unique method public and static
	public static DiceSingletonInheritance getInstance() {
		// Lazy construction, where the creation is put off
		// until the first access is made
		if (theDice == null)
			theDice = new DiceSingletonInheritance();

		return theDice;
	}

	private DiceSingletonInheritance() {
		super();
	}

	// The rest of attributes and methods are
	// available by Inheritance

	/*
	 * If the dice has more functions, then they should be implemented here as
	 * public/protected/private methods according to their needs
	 */
}
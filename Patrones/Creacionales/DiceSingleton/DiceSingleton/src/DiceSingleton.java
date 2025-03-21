
import java.util.Random; // generator of random numbers

public class DiceSingleton {

	// Static Area
	private static DiceSingleton theDice;  // A unique instance
	
	/* A UNIQUE PUBLIC AND STATIC METHOD*/
	public static DiceSingleton getInstance(){
		if (theDice == null) // LAZY CONSTRUCTION, IT IS DELAYED UNTIL THE FIRST ACCESS IS PERFORMED
			theDice = new DiceSingleton();	
		return theDice;
	}
	
	// Instance methods 
	private Random generator;
	/**
	 * The constructor cannot be used by other classes
	 */
	private DiceSingleton()
	{ 
		generator = new Random(); 
	}
		
	public int roll()
	{
		return roll(6); 
	}
		
	public int roll(int sides) 
	{
		return generator.nextInt(sides) + 1;
	}
}
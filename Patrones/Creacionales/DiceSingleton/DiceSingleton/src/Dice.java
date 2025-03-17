
import java.util.Random;

public class Dice {
		
	private Random generator = new Random(); // generator of random numbers
		
	/**
	 * Roll a dice with 6 sides: from 1 to 6
	 * @return the result of rolling the dice from 1 to 6 
	 */
		
	public int roll()
	{
		return roll(6); // by default a dice has 6 sides
	}
		
	/**
	 * Roll a dice with N sides
	 * @param sides the number N of sides: from 1 to N
	 * @return the result of rolling the dice, a number from 1 to N
	 */
	public int roll(int sides) // Need: the number of sides
	{
		return generator.nextInt(sides) + 1;
	}
}
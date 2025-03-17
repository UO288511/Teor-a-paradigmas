/**
 * Exercise of Methodology of Programming.
 * Jeroquest - An example of Programming geared towards objects.
 * Class Dice - static class which represents a dice in a game.
 *
 */

import java.util.Random; // generator for random numbers

	public class DiceStatic {
		
		private static Random generator = new Random(); // generator of random numbers
		
		/**
		 * throw a dice with six sides: 1 to 6
		 * @return return the result: number between 1 and 6
		 */
		public static int roll()
		{
			return roll(6); // by default the dice has 6 sides
		}
		
		/**
		 * Throw a dice with N sides
		 * @param sides, the number N of sides: 1 to N
		 * @return the result: number 1 to N
		 */
		public static int roll(int sides) // Need: the number of sides
		{
			return generator.nextInt(sides) + 1;
		}
		
		/**
		 * Function for testing that all sides have the same odd
		 */
		public static void testDice()
		{
			final int ATTEMPTS = 1000000;
			double total[]={0,0,0,0,0,0};
			for(int x = 0; x < ATTEMPTS; x++)
				total[roll()-1]++;
			for(int x = 0; x < 6; x++)
				System.out.printf("%d: %f\n", x, total[x]/ATTEMPTS);
		}
	}
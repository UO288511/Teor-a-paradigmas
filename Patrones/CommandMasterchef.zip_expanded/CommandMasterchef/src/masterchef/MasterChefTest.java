package masterchef;
import java.util.ArrayList;
import java.util.List;

public class MasterChefTest {

	public static void main(String[] args) {

		// the cook template
		Cook cook1 = new Cook("cook1"); 
		Cook cook2 = new Cook("cook2"); 
		Cook cook3 = new Cook("cook3"); 

		// frying eggs directly
		System.out.println("Cook!!!... a fried egg!");
		fryEgg(cook1);
		

         // Using the pattern COMMAND: 
		// 1� Design every recipe with the responsible of every step
		// 2� ONLY when it is needed, the recipe will be executed
		
		
		// A fried egg: the cook 1 does everything (prepare, fry and plate)
		List<ICommand> recipeFriedEgg = new ArrayList<ICommand>(); // we are going to prepare a recipe to fry an egg
		// steps in the recipe
		recipeFriedEgg.add(new CPrepareEgg(cook1));
		recipeFriedEgg.add(new CFry(cook1));
		recipeFriedEgg.add(new CPlate(cook1));
		
		// A fried egg
		System.out.println(" Kitchen!!!... a fried egg!");
		executeRecipe(recipeFriedEgg);

		// Two fried eggs
		System.out.println("Kitchen!!!... two fried eggs!");
		executeRecipe(recipeFriedEgg);
		executeRecipe(recipeFriedEgg);

		
		
		// COMMAND: Modifying the recipe
		// Three fried eggs: every cook prepares an egg, the cook1 fry all together and plate them
		// We base on the original recipe, adding the two new eggs, one per cook
		List<ICommand> recipe3Eggs = new ArrayList<ICommand>(recipeFriedEgg); // copy the recipe for one egg
		// new steps for the recipe
		recipe3Eggs.add(0,new CPrepareEgg(cook2)); // adding a second egg
		recipe3Eggs.add(0,new CPrepareEgg(cook3)); // adding a third egg

		//... whenever it is needed

		// three fried eggs "at the same time"
		System.out.println("Kitchen!!! ... three fried eggs!");
		executeRecipe(recipe3Eggs);
	}

	/**
	 * Direct method where a cook fry an egg
	 * @param theCook - the cook responsible of the recipe
	 */
	private static void fryEgg(Cook theCook)
	{
		theCook.heatOil();
		theCook.breakEgg();
		theCook.saltIngredients();
		theCook.fryIngredients();
		theCook.plate();
	}
	
	/**
	 * Method to prepare any recipe which is received (includes both actions and receivers)
	 * @param recipe - the recipe to cook
	 */
	private static void executeRecipe(List<ICommand> recipe) {
		for(ICommand step: recipe)
			step.perform();
		System.out.println("Recipe is ready!!!\n");	
	}

}

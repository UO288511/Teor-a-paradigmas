
public class SnackClient {

	public void createSnack(String typeOfSnack) {
		/* We choose a "compatible" snack and drink */

		//------------------------------------------------------
		// we create the products to be consumed

		Food c = Food.giveFood(typeOfSnack);

		Drinks d = Drinks.giveDrink(typeOfSnack);

		//------------------------------------------------------
		// we use them
		c.eat();
		d.drink();
	}

	public void createSnackNotCompatible() {
		/* we choose an "incompatible" snack and drink */

		//------------------------------------------------------
		// we create the products to be consumed

		Food c = Food.giveFood("Hamburguer");

		Drinks d = Drinks.giveDrink("Churros");

		//------------------------------------------------------
		// we use them
		c.eat();
		d.drink();
	}
}


public class SnackClient {
	private FactoryOfSnacks f = null;
	SnackClient(String typeOfSnack) {
		/* We choose a kind of food and the drink is linked to it */
		/* They are already compatible, because they are created together */
		//------------------------------------------------------
		// SELECT THE FAMILY OF PRODUCTS TO CONSUME
		switch (typeOfSnack) {
		case "Hamburguer":
			f = new FactoryOfHamburguers();
			break;
		case "Churros":
			f = new FactoryOfChocolate();
			break;
		default: //nothing
		}
	}

	public void createSnack() {
		//------------------------------------------------------
		// https://marketplace.eclipse.org/marketplace-client-intro?mpc_install=3085446Creation of compatible products to consume
		Food c = f.giveFood();
		Drinks b = f.giveDrink();
		//------------------------------------------------------
		// Use them
		c.eat();
		b.drink();
	}
}

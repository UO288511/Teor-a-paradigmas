
public class SnackClient {

	public void createSnack(String typeOfSnack) {

		System.out.println("This is a standard snack");

		/* We choose a compatible food and drink */
		switch (typeOfSnack) {
		case "Hamburguer":
			// We create the products to consume
			Hamburguer h = new Hamburguer();
			Coke c = new Coke();

			// we use them
			h.eat();
			c.drink();
			break;
		case "Churros":
			// we create the products to consume  
			Churros ch = new Churros();
			Chocolate d = new Chocolate();

			// we use them
			ch.eat();
			d.drink();
			break;

		default: // Nothing
		}
	}

	public void createWeirdSnack(String typeOfSnack) {

		System.out.println("This is a weird snack");

		/* We choose an incompatible food and drink */
		switch (typeOfSnack) {
		case "Hamburguer":
			// We create the products to consume
			Hamburguer h = new Hamburguer();
			Chocolate d = new Chocolate();

			// we use them
			h.eat();
			d.drink();
			break;
		case "Churros":
			// we create the products to consume  
			Churros ch = new Churros();
			Coke c = new Coke();

			// we use them
			ch.eat();
			c.drink();
			break;

		default: // Nothing
		}
	}
}

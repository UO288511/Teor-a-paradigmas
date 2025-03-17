
public abstract class Drinks {

	public abstract void drink();

	public static Drinks giveDrink(String type) {

		switch (type) {
		case "Hamburguer":
			return new Coke();

		case "Churros":
			return new Chocolate();

		/* ADD MORE DRINKS HERE */
		default:
			return null;
		}
	}
}

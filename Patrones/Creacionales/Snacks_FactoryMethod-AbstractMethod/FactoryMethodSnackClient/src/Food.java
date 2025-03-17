
public abstract class Food {
	public abstract void eat();

	public static Food giveFood(String type) {
		switch (type) {
		case "Hamburguer":
			return new Hamburguer();

		case "Churros":
			return new Churros();

		/* ADD MORE FOOD HERE */
		default:
			return null;
		}
	}
}

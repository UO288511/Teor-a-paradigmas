
public class FactoryOfChocolate implements FactoryOfSnacks {

	@Override
	public Food giveFood() {

		return new Churros();
	}

	@Override
	public Drinks giveDrink() {

		return new Chocolate();
	}

}

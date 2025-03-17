
public class FactoryOfHamburguers implements FactoryOfSnacks {
	@Override
	public Food giveFood() {
		return new Hamburguer();
	}
	@Override
	public Drinks giveDrink() {
		return new Coke();
	}

}

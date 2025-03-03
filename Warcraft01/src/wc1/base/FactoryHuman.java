package wc1.base;

public class FactoryHuman extends AbstractFactory{

	@Override
	public Unit createInfantry() {
		// TODO Auto-generated method stub
		return new Soldier();
	}

	@Override
	public Unit createArcher() {
		// TODO Auto-generated method stub
		return new Archer();
	}

	@Override
	public Unit createHorseman() {
		// TODO Auto-generated method stub
		return new Knight();
	}

	@Override
	public Unit createSiegeMachine() {
		// TODO Auto-generated method stub
		return new Catapult();
	}

}

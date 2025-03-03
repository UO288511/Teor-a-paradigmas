package wc1.base;

public class FactoryOrcs extends AbstractFactory{

	@Override
	public Unit createInfantry() {
		// TODO Auto-generated method stub
		return new Grunt();
	}

	@Override
	public Unit createArcher() {
		// TODO Auto-generated method stub
		return new SpearThrower();
	}

	@Override
	public Unit createHorseman() {
		// TODO Auto-generated method stub
		return new Raider();
	}

	@Override
	public Unit createSiegeMachine() {
		// TODO Auto-generated method stub
		return new Catapult();
	}

}

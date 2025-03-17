package domotics;

public class Factory1000 extends AbstractFactory {

	@Override
	public CameraSensor createCamSensor(String name) {
		// TODO Auto-generated method stub
		return new CameraSensor1000(name);
	}

	@Override
	public SmartHub createHub() {
		// TODO Auto-generated method stub
		return new SmartHub1000();
	}

}

package domotics;

public class LegacyFactory extends AbstractFactory {

	@Override
	public CameraSensor createCamSensor(String name) {
		// TODO Auto-generated method stub
		return new CameraSensor(name);
	}

	@Override
	public SmartHub createHub() {
		// TODO Auto-generated method stub
		return new SmartHub();
	}

}

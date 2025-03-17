package domotics;

public abstract class AbstractFactory {
	
	public abstract CameraSensor createCamSensor(String name);
	public abstract SmartHub createHub();
	

}

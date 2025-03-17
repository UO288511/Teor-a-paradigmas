package domotics;

public class SensorAdapter implements Detector{

	
	//by composition we need a variable 
	private Sensor theSensor;
	
	public SensorAdapter(Sensor sensor) {
		this.theSensor=sensor;
	}
	
	@Override
	public void switchOn() {
		theSensor.turnOn();
	}

	@Override
	public void switchOff() {		
		theSensor.turnOff();
	}

	@Override
	public boolean isOn() {
		return theSensor.isOn();
	}

}

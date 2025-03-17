package domotics;

import java.util.ArrayList;
import java.util.List;

public class SmartHub {
	private List<Sensor> sensors;
	
	public SmartHub() {
		sensors = new ArrayList<Sensor>();
	}
	
	public void activateSensors() {
		// activate all sensors
	}
	
	public void deactivateSensors() {
		// deactivate all sensors
	}
	
	public void addSensor(Sensor s) {
		sensors.add(s);
	}

	@Override
	public String toString() {
		String s = "class " + this.getClass().getSimpleName();
		s += "\n";//String.format(": sensors=\n");
		for(Sensor sen: sensors)
		s += "\t\t" + sen +"\n";
		return s;
	}


	
}

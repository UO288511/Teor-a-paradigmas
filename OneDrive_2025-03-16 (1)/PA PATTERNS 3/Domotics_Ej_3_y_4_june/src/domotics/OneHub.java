package domotics;

import java.util.ArrayList;
import java.util.List;

public class OneHub {
	private List<Detector> detectors;
	
	public OneHub() {
		detectors = new ArrayList<Detector>();
	}
	
	public void activateDetectors() {
		// activate all sensors
		for (Detector detector : detectors) {
			detector.switchOn();
		}
	}
	
	public void deactivateDetectors() {
		// deactivate all sensors
		for (Detector detector : detectors) {
			detector.switchOff();
		}
	}
	
	public void addDetector(Detector s) {
		detectors.add(s);
	}
	
	@Override
	public String toString() {
		String s = "Hub detectors:\n";
		for(Detector d: detectors)
			s += "\t" + d + "\n";
		return s;
	}
}

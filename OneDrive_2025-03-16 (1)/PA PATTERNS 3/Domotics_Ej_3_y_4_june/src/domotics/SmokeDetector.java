package domotics;


// WARNING: THIS CLASS CANNOT BE MODIFIED

public class SmokeDetector implements Detector{
	private boolean activated; // true -> activated, false -> deactivated


	
	/** 
	 * All detectors start deactivated
	 */
	public SmokeDetector() {
		this.switchOff();
	}

	// interface Detector
	
	/**
	 * activate detector
	 */
	public void switchOn() {
		this.activated = true;
	}

	/**
	 * deactivate detector
	 */
	public void switchOff() {
		this.activated = false;
	}

	/**
	 * check if it is activated
	 * return true if activated
	 */

	@Override
	public boolean isOn() {
		return activated;
	}

	@Override
	public String toString() {
		String s = "SmokeDetector ";
		s += (isOn()?"ON":"OFF");
		return s;
		
	}

}

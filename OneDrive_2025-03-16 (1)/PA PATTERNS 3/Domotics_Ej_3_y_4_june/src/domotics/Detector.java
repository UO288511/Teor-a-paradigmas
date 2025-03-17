package domotics;

public interface Detector {

	void switchOn();
	/**
	 * deactivate the detector
	 */
	void switchOff();
	/** 
	 * check the detector is activated
	 * @return true if it is activated
	 */
	boolean isOn();
}

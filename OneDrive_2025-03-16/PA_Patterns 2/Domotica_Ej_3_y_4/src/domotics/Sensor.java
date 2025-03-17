package domotics;

public abstract class Sensor {
	private boolean activated; // true -> activated, false -> deactivated
	private String name;

	/** 
	 * All sensors start deactivated
	 * @param name - serial number
	 */
	public Sensor(String name) {
		this.turnOff();
		this.setName(name);
	}

	/**
	 * check the sensor is activated
	 * @return
	 */
	public boolean isOn() {
		return activated;
	}

	/**
	 * activate sensor
	 */
	public void turnOn() {
		this.activated = true;
	}

	/**
	 * deactivate sensor
	 */
	public void turnOff() {
		this.activated = false;
	}

	/**
	 * get sensor serial number
	 * @return serial number
	 */
	public String getName() {
		return name;
	}

	/**
	 * set sensor serial number
	 * @param Name - new sensor serial number
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		String s = this.getClass().getSimpleName();
		s += "(" + this.getName() + ")";
		s += " " + (isOn()?"ON":"OFF");
		return s;
	}
}

package domotics;

public class Client {
	private OneHub hub1;

	public Client() {
		// detectors and sensors
		Detector smoke01 = new SmokeDetector();
		Sensor camera01= new CameraSensor("Cam01");
		Sensor move01= new MovementSensor("Mov01");

		// create hubs
		this.hub1 = new OneHub();


		// configure hub
		// add a smoke detector
		this.hub1.addDetector(smoke01);
		
		// TO COMPLETE: add a camera "detector"
		this.hub1.addDetector(new SensorAdapter(camera01));
		
		// TO COMPLETE: add a movement "detector"
		this.hub1.addDetector(new SensorAdapter(move01));
	}

	@Override
	public String toString() {
		// Show hub and its detectors
		return this.hub1.toString();
	}



	public static void main(String[] args) {
		// create client (its hub and its detectors)
		Client client1 = new Client();

		// show hub and its detectors
		System.out.println(client1);
		
		/*
		 * Expected Output in Console:
		 * Hub detectors:
		 *		SmokeDetector OFF
		 *		CameraSensor(Cam01) OFF
		 *		MovementSensor(Mov01) OFF
		 */


	}




}

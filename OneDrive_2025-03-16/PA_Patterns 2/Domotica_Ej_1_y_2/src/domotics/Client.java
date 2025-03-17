package domotics;

public class Client {

	// sensors
	private Sensor camSensor;
	private Sensor tempSensor;
	private Sensor moveSensor;
	private SmartHub hub1;
	


	public Client() {
		this.camSensor = new CameraSensor("Cam01");
		this.tempSensor = new TemperatureSensor("Temp01");
		this.moveSensor = new MovementSensor("Move01");
		
		// create hubs CHANGE HERE TOO
		this.hub1 = SingletonHub.getInstance(); //Get only the instance of the class 
		
	}


	/**
	 * add camera and movement sensor to the hub
	 */
	public void configureCamAndMove() {
		hub1.addSensor(camSensor);
		hub1.addSensor(moveSensor);
	}

	/**
	 * add temperature sensor to the hub
	 */
	public void configureTemp() {
		hub1.addSensor(tempSensor);
	}

	
	
	@Override
	public String toString() {
		return String.format("Client \n\thub1=%s\n]", hub1);
	}

       
	public static void main(String[] args) {
		// create client
		Client client1 = new Client();

		// add sensors to the hubs
		client1.configureCamAndMove();
		client1.configureTemp();

		// show the client hub(s) and sensors
		System.out.println(client1);
		
		
	}	
}

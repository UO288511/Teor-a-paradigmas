package domotics;

public class Client {

	// sensors
	private Sensor camera;
	private SmartHub hub;
	private AbstractFactory factory;


	public Client() {
		camera = null;
		hub = null;
	}


	/**
	 * this method creates the appropriate sensor and hubs for the given series:
	 * @param serie - should be "standard" or "1000"
	 */
	public void configure(String serie) {
		if(serie.contentEquals("1000")) {
			//Create factory for 1000
			factory= new Factory1000();
			// create hub
			hub = factory.createHub(); // <--- <!> ERROR INCOMPATIBLE HUB: should be "SmartHub1000" hub <!>
			// create camera
			camera = factory.createCamSensor(serie);

		} else if(serie.contentEquals("standard")){
			//Create old factory
			factory=new LegacyFactory();
			// create hub
			hub = factory.createHub();
			// create camera
			camera = factory.createCamSensor(serie);

		}
		
		//You can also take out the hub and camera bc u only need in the if the factory and then it will already know which factory it is and will create the correct one
		
		// assign camera to the hub
		hub.addSensor(camera);
		
	}
	

	@Override
	public String toString() {
		return String.format("Client\n\thub=%s", hub);
	}


	public static void main(String[] args) {
		Client client1 = new Client();
		Client client2 = new Client();
		
		// configuration with: standard series
		client1.configure("standard");
		
		//configuration with: 1000 series
		client2.configure("1000");
		
		// show clients
		System.out.println(client1);
		System.out.println(client2);
	}	
}

package composite;
public class CompositeMain {

	/**
	 * This method creates the "hierarchy of components" to configure a computer:
	 * 
	 * myPC
	 *   |
	 *   +- Monitor TFT 23"
	 *   |
	 *   +- Keyboard
	 *   |
	 *   +- Mouse
	 *   |
	 *   +- CPU
	 *       |
	 *       +- Micro Intel Core i5
	 *       |
	 *       +- Module 4GB RAM
	 * 
	 * @return the defined equipment
	 */
	public static Equipment createCompleteEquipment() {
		// We are going to create a new PC made of:
		CompoundComponent miPC = new CompoundComponent("My equipment");
		
		// A monitor TFT 23"
		miPC.add(new FinalComponent("Monitor TFT 23\"", 45, 150.00));
		
		// A keyboard
		miPC.add(new FinalComponent("Keyboard", 5, 30.00));
		
		// A mouse
		miPC.add(new FinalComponent("Mouse", 1, 35.00));
		
		// A CPU (we create a variable to be able to identify its content
		CompoundComponent miCPU = new CompoundComponent("My CPU");
		
		// A microprocessor
		miCPU.add(new FinalComponent("Micro Intel Core i5", 200, 300.00));
		
		// A memory
		miCPU.add(new FinalComponent("Module 4GB de RAM", 20, 90.00));

		// Add the CPU to the equipment
		miPC.add(miCPU);

		return miPC;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// We are going to create a new PC which is made of:
		Equipment myPC = createCompleteEquipment();
		
		System.out.println(myPC);
		System.out.println("Total power: " +myPC.getPower()+" watios");
		System.out.println("Total price: " +myPC.getTotalPrice()+" euros");
		
	}

}



public class Main {

	public static void main(String[] args) {
		
		//Example of how to use the four types of implementation for a Dice
		
		Dice d1 = new Dice();
		
		//Raw implementation 
		System.out.println("Raw implementation -> Rolling result is "+ d1.roll());
				
		//Static implementation
		System.out.println("Static implementation -> Rolling result is "+ DiceStatic.roll());
		
		//Inheritance implementation
		DiceSingletonInheritance d2 = DiceSingletonInheritance.getInstance();
		System.out.println("Inheritance implementation -> Rolling result is "+ d2.roll());
		
		//Singleton implementation
		DiceSingleton d3 = DiceSingleton.getInstance();
		System.out.println("Singleton implementation -> Rolling result is "+ d3.roll());
	}

}
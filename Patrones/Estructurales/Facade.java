package after;

// "Subsystem One" 
class SubSystemOne {
	public void MethodOne() {
		System.out.println(" SubSystemOne Method");
	}
}

// Subsystem Two"
class SubSystemTwo {
	public void MethodTwo() {
		System.out.println(" SubSystemTwo Method");
	}
}

// Subsystem Three"
class SubSystemThree {
	public void MethodThree() {
		System.out.println(" SubSystemThree Method");
	}
}

// Subsystem Four"
class SubSystemFour {
	public void MethodFour() {
		System.out.println(" SubSystemFour Method");
	}
}

// "Facade"
public class Facade {
	private SubSystemOne one;
	private SubSystemTwo two;
	private SubSystemThree three;
	private SubSystemFour four;

	public Facade() {
		one = new SubSystemOne();
		two = new SubSystemTwo();
		three = new SubSystemThree();
		four = new SubSystemFour();
	}

	public void MethodA() {
		System.out.println("\nMethodA() ---- ");
		one.MethodOne();
		two.MethodTwo();
		four.MethodFour();
	}

	public void MethodB() {
		System.out.println("\nMethodB() ---- ");
		two.MethodTwo();
		three.MethodThree();
	}
}

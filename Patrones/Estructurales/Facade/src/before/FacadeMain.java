package before;

public class FacadeMain {

	public static void main(String[] args) {

		// Subsystem objects
		SubSystemOne one = new SubSystemOne();
		SubSystemTwo two = new SubSystemTwo();
		SubSystemThree three = new SubSystemThree();
		SubSystemFour four = new SubSystemFour();

		System.out.println("\nMethodA() ---- ");
		one.MethodOne();
		two.MethodTwo();
		four.MethodFour();

		System.out.println("\nMethodB() ---- ");
		two.MethodTwo();
		three.MethodThree();

	}
}

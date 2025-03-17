/*
 * Example based on: http://sourcemaking.com/design_patterns/adapter/java/1
 */
public class AdapterMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("With no adapter ...");
		before.AdapterBeforeClient.main();

		System.out.println("With adapter ...");
		after.AdapterAfterClient.main();

	}

}

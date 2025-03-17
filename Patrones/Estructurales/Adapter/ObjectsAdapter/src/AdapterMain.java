/*
 * Example based on http://sourcemaking.com/design_patterns/adapter/java/1
 */
public class AdapterMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("No adapter ...");
		before.AdapterBeforeClient.main();

		System.out.println("With objects adapter ...");
		after.AdapterAfterClient.main();

	}

}

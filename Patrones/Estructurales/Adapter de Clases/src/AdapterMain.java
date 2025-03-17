/*
 * Ejemplo inspirado en: http://sourcemaking.com/design_patterns/adapter/java/1
 */
public class AdapterMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Sin adaptador...");
		before.AdapterBeforeClient.main();
		
		System.out.println("Con adaptador...");
		after.AdapterAfterClient.main();
		
	}

}

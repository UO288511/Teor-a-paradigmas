
public class Client {

	public static void main(String[] args) {
		//Client: Hamburguer
		SnackClient c1 = new SnackClient();
		System.out.println("Snack for Client 1:");
		c1.createSnack("Hamburguer");

		//Client: Churros
		SnackClient c2 = new SnackClient();
		System.out.println("Snack for Client 2:");
		c2.createSnack("Churros");

		//A weird client
		SnackClient c3 = new SnackClient();
		System.out.println("Snack for Client 3:");
		c3.createSnackNotCompatible();
	}

}

public class Client {
	public static void main(String[] args) {
		//Client: Hamburguer
		SnackClient c1 = new SnackClient("Hamburguer");
		System.out.println("Snack for Client 1:");
		c1.createSnack();
		//Client: Churros
		SnackClient c2 = new SnackClient("Churros");
		System.out.println("Snack for Client 2:");
		c2.createSnack();
		//A WEIRD CLIENT IS NOT POSSIBLE NOW
	}
}
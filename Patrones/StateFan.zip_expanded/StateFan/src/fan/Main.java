package fan;

import fan.monolithic.MonolithicFan;
import fan.state.StateFan;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Monolithic version");
		MonolithicFan v;

		v = new MonolithicFan();

		for (int x = 0; x < 5; x++)
			v.pull();

		System.out.println("State version");
		StateFan v2;

		v2 = new StateFan();

		for (int x = 0; x < 5; x++)
			v2.pull();
	}

}

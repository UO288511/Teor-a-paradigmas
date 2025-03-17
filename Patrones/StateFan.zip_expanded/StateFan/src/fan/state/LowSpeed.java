package fan.state;

public class LowSpeed extends State {

	@Override
	public void pull(StateFan v) {
		System.out.println("   changing to medium speed");
		v.setState(new MediumSpeed());

	}

}

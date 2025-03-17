package fan.state;

public class SwitchOff extends State {

	@Override
	public void pull(StateFan v) {
		System.out.println("   changing to low speed");
		v.setState(new LowSpeed());
	}

}

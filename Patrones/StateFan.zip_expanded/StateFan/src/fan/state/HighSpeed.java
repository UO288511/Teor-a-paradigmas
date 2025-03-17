package fan.state;

public class HighSpeed extends State {

	@Override
	public void pull(StateFan v) {
		System.out.println("   switching off");
		v.setState(new SwitchOff());
	}

}

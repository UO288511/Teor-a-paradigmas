package fan.state;

public class MediumSpeed extends State {

	@Override
	public void pull(StateFan v) {
		System.out.println("   changing to high speed");
		v.setState(new HighSpeed());
	}

}

package fan.state;

public class StateFan {

	private State currentState;
	
	public StateFan()
	{
		currentState = new SwitchOff();
	}
	
	public void pull()
	{
		// I leave the object according to its current state
		// to execute the link action to "pull" 
		// and change the current state "if it is necessary" 
		//(so, the current object is provided)
		currentState.pull(this);
	}
	
	public void setState(State e)
	{
		currentState = e;
	}
}

package observer.twitter;
import java.util.ArrayList;
import java.util.List;

public class Influencer implements Subject {

	private List<Observer> followers; // followers connected to the Influencer
	private String tweetMsg; // tweet message
	private boolean changed; // flag showing whether there is a pending message

	public Influencer() {
		this.followers = new ArrayList<>();
	}

	@Override
	public void register(Observer follower) {
		// add the follower to the list
		followers.add(follower);
		// inform the follower the Influencer object
		follower.setSubject(this);
	}

	@Override
	public void unregister(Observer obj) {
		followers.remove(obj);
	}

	@Override
	public void notifyObservers() {
		if (changed) {
			// notify all followers
			for (Observer obj : followers)
				obj.update();
			// reset msg
			this.changed = false;
			this.tweetMsg = null;
		}
	}

	// the follower asks for the message
	@Override
	public Object getUpdate(Observer follower) {
		return this.tweetMsg;
	}

	// method for the influencer to tweet a message
	public void newTweet(String msg) {
		System.out.println("Tweet posted by the influencer:" + msg);
		this.tweetMsg = msg;
		this.changed = true;
		notifyObservers();
	}

}
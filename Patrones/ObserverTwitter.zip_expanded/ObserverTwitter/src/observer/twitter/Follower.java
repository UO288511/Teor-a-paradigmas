package observer.twitter;

public class Follower implements Observer {

	private String name;
	private Subject influencer;

	public Follower(String nm) {
		this.name = nm;
	}

	@Override
	public void update() {
		String msg = (String) influencer.getUpdate(this);
		if (msg == null) {
			System.out.println(name + ":: No new tweet");
		} else
			System.out.println(name + ":: Consuming tweet::" + msg);
	}

	@Override
	public void setSubject(Subject sub) {
		this.influencer = sub;
	}

}

package observer.twitter;
/**
 * Twitter: Observer Pattern example Inspired in the example from:
 * https://www.journaldev.com/1739/observer-design-pattern-in-java
 */

public class ObserverMain {

	public static void main(String[] args) {
		// create the influencer (subject)
		Influencer theInfluencer = new Influencer();

		// create the followers (observers)
		Observer follower1 = new Follower("Obj1");
		Observer follower2 = new Follower("Obj2");
		Observer follower3 = new Follower("Obj3");

		// followers (observers) start to follow the influencer (Subject)
		theInfluencer.register(follower1);
		theInfluencer.register(follower2);
		theInfluencer.register(follower3);

		// follower1 manually check if any update is available
		follower1.update();

		// The influencer tweet a new message
		theInfluencer.newTweet("New Message");
	}

}

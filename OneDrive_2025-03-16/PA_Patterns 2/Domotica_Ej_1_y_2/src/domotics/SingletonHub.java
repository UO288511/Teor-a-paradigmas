package domotics;

public class SingletonHub extends SmartHub{

		private static SingletonHub theHub;

		public SingletonHub getTheHub() {
			return theHub;
		}

		public void setTheHub(SingletonHub theHub) {
			this.theHub = theHub;
		}
		
		public static SingletonHub getInstance() {
			//Only create the hub only if its needed
			if (theHub==null)
				theHub=new SingletonHub();
			return theHub;
		}
		
		private SingletonHub() {}; //To make sure that no other class can create this
		
		//We have to combine the SmartHub and the SingletonHub so the singleton is a smartHub ;; extends SmartHb
		
}

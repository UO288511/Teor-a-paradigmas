package masterchef;

public class CPrepareEgg implements ICommand {
	private Cook theCook;
	
	public CPrepareEgg(Cook c){
		this.theCook = c;
	}
	@Override
	public void perform() {
		theCook.breakEgg();
		theCook.saltIngredients();
	}

}

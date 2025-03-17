package masterchef;

public class CFry implements ICommand {
	private Cook theCook;
	
	public CFry(Cook c){
		this.theCook = c;
	}
	@Override
	public void perform() {
		theCook.heatOil();
		theCook.fryIngredients();
	}

}

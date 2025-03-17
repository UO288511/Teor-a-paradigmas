package masterchef;

public class CPlate implements ICommand {
	private Cook theCook;
	
	public CPlate(Cook c){
		this.theCook = c;
	}
	@Override
	public void perform() {
		theCook.plate();
	}

}

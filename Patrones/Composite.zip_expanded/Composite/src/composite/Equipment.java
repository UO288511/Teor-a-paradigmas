package composite;

public abstract class Equipment {
	String name;
	
	public Equipment(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	abstract public int getPower();
	abstract public double getTotalPrice();

}
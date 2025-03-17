package composite;
public class FinalComponent extends Equipment {
	private int power;
	private double price;
	
	public FinalComponent(String name, int power, double price){
		super(name);
		this.power = power;
		this.price =  price;
	}
	
	public int getPower(){
		return this.power;
	}
	public double getTotalPrice(){
		return this.price;
	}
	
	public String toString(){
		return this.getName() + ": "+ this.power + " Watios y "+this.price+" euros";
	}
}

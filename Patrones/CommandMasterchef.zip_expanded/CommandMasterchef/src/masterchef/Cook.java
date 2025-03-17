package masterchef;
/**
 * Class Cook, acts as a "Receiver" in the pattern "Command"
 * @author puente
 *
 */
public class Cook {

	private String name;

	public Cook(String name){
		this.name = name;
	}
	
	// Actions that the Receiver is able to do
	
	public void heatOil(){
		System.out.printf("%s: Heating oil ...\n",this.name);
	}

	public void breakEgg(){
		System.out.printf("%s: Breaking egg ...\n",this.name);
	}

	public void saltIngredients(){
		System.out.printf("%s: Salting ingredients ...\n",this.name);
	}

	public void fryIngredients(){
		System.out.printf("%s: Frying all ...\n",this.name);
	}

	public void plate(){
		System.out.printf("%s: Plating ...\n",this.name);
	}
}

package composite;

public class CompoundComponent extends Equipment{
	private Equipment[] components = new Equipment[10]; // components for this equipment
	private int totalComponents = 0; // total of children components
	// inherited abstract operations
	
	/**
	 * Constructor which links to the father
	 * @param name name of the compound equipment
	 */
	public CompoundComponent(String name){
		super(name);
	}
	/**
	 * Get the total power taking into account all its components
	 */
	public int getPower(){
		int totalPower = 0;
		for(Equipment e : components){
			if(e != null)
				totalPower += e.getPower();
		}
		return totalPower;
	}

	/**
	 * Get the total price taking into account all its components
	 */
	public double getTotalPrice(){
		double totalPrice = 0;
		for(Equipment e : components){
			if(e != null)
				totalPrice += e.getTotalPrice();
		}
		return totalPrice;
	}


	public String toString(){
		String s = new String();
		s= this.getName()+ ":";
		for(Equipment e : components){
			if(e != null){
				s+="[";
				s += e.toString();
				s+="] ";
			}
		}

		return s;
	}
	
	/*
	 * OPERATIONS TO MANAGE COMPONENTS
	 */

	/**
	 * Add a new component to the equipment
	 * @param e the equipment (compound or final) to which is added the new component
	 * @throws RuntimeException there is not more space for more components
	 */
	public void add(Equipment e)throws RuntimeException{
		// testing available space
		if(totalComponents == 10)
			throw new RuntimeException("EquipoCompuesto.Add(): Number of components exceded");

		// adding a new child
		components[totalComponents] = e;
		
		totalComponents++;
	}
	
	/**
	 * Remove a component from the equipment
	 * @param pos position of the element to be removed
	 * @throws RuntimeException If there is a try to remove a not valid position
	 */
	public void remove(int pos) throws RuntimeException{
		if ((pos < 0) || (pos >= totalComponents))
			throw new RuntimeException("It cannot be removed a component which does not exist");
		totalComponents--;
		for(int x = pos; x < totalComponents; x++)
			components[x] = components[x+1];
		components[totalComponents] = null;
	}
	
}

// Artifitial Intelligence for Orcs
package wc1.base;

public class AICommon {
	
	AbstractFactory factory;
	public AICommon (String species) {
		// We create the specific factory according to the specie
		if(species.equals("orcs")) 
		 factory = new FactoryOrcs(); 
		 else
		 factory = new FactoryHuman(); 
	}
	
	/**
	 * Generation of a group of attack  for A.I.
	 * @return An attack group with Orcs
	 */
	public Unit[] createGroupOfAttack()
	{
		// Array of Orcs Units
		Unit[] groupOfAttack = new Unit[10];
		
		// 4 x infantry
		for(int x = 0; x < 4; x++)
			groupOfAttack[x] = factory.createInfantry();
		// 3 x archers
		for(int x = 4; x < 7; x++)
			groupOfAttack[x] = factory.createArcher();
		// 2 x horseman
		groupOfAttack[7] = factory.createHorseman();
		groupOfAttack[8] = factory.createHorseman();
		// 1 x machine of siege
		groupOfAttack[9] = factory.createSiegeMachine();
		
		return groupOfAttack;
	}
}




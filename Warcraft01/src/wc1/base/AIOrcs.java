// Artifitial Intelligence for Orcs
package wc1.base;

public class AIOrcs {

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
			groupOfAttack[x] = new Grunt();
		// 3 x archers
		for(int x = 4; x < 7; x++)
			groupOfAttack[x] = new SpearThrower();
		// 2 x horseman
		groupOfAttack[7] = new Raider();
		groupOfAttack[8] = new Raider();
		// 1 x machine of siege
		groupOfAttack[9] = new Catapult();
		
		return groupOfAttack;
	}
}


//Artificial Inteligence for Humans (= I.A. for Orcs)
class IAHumans {
	// ...
}


public abstract class Pokemon {
	public void golpea(){
		// golpea a algún pokemon enemigo a tiro
	}

	public void defender(){
		// el pokemon se concentra para recibir menos daño en el siguiente ataque
	}
	/*
	 * El método factoria genera un Pokemon del tipo especificado
	 * @param tipo - tipo de pokemon a crear
	 * @return un objeto pokemon del subtipo especificado 
	 */
	public static Pokemon creaPokemon(String tipo){
		switch(tipo){
		case "pikachu": return new Pikachu();
		case "charmander": return new Charmander();	
		default: return null;
		}
	}
}

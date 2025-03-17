
public abstract class Pokemon {
	public void golpea(){
		// golpea a alg�n pokemon enemigo a tiro
	}

	public void defender(){
		// el pokemon se concentra para recibir menos da�o en el siguiente ataque
	}
	/*
	 * El m�todo factoria genera un Pokemon del tipo especificado
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

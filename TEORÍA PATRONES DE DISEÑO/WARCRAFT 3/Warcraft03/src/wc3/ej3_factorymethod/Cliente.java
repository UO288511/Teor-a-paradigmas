package wc3.ej3_factorymethod;

public class Cliente{
	public void creaYLanzaPirata(int tipo){
		if(tipo == 1){
			CorsarioUnidad p = new CorsarioUnidad();
			p.move();
			p.move();
			p.attack();
			p.defend();
		}
		if(tipo == 2){
			GoblinUnidad p = new GoblinUnidad();
			p.move();
			p.move();
			p.attack();
			p.defend();
		}
	}
}
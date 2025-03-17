package wc3.ej3_factorymethod;

import wc3.base.Unidad;

//esta clase representa a todos los tipos de piratas
public abstract class Pirata extends Unidad {
	//Metodo factoria que en funcion del tipo devuelve
	//un nuevo objeto pirata "concreto" solicitado
	public static Pirata metodoFactoria(int tipo) {
		switch(tipo){
		case 1: return new CorsarioUnidad();
		case 2: return new GoblinUnidad();
		case 3: return new Grumete();
		default: return null;
		}
	}
}
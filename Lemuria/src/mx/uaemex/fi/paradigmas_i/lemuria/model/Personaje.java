package mx.uaemex.fi.paradigmas_i.lemuria.model;

import mx.uaemex.fi.paradigmas_i.lemuria_dao.transfer_objs.Arma;
import mx.uaemex.fi.paradigmas_i.lemuria_dao.transfer_objs.Guerrero;
import mx.uaemex.fi.paradigmas_i.lemuria_dao.transfer_objs.Pocion;

public class Personaje extends Guerrero {
/**************************************************************************************
 * 
 * 									ATRIBUTOS
 * 
*************************************************************************************/
	private Mochila mochila;
	private Arma mano;
	private int maxAtaque;
	private int maxDefensa;
	private int maxVida;
	
/**************************************************************************************
* 
* 									METODOS
* 
*************************************************************************************/
	public Personaje(int mA, int mD, int mV) {
		this.maxAtaque=mA;
		this.maxDefensa=mD;
		this.maxVida=mV;
	}
	
	public void usarPocion(Pocion o) {
		
	}

	public Mochila getMochila() {
		return mochila;
	}

	public void setMochila(Mochila mochila) {
		this.mochila = mochila;
	}

	public Arma getMano() {
		return mano;
	}

	public void setMano(Arma mano) {
		this.mano = mano;
	}

	
}

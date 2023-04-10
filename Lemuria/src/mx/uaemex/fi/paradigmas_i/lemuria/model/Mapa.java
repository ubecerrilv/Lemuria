package mx.uaemex.fi.paradigmas_i.lemuria.model;

import mx.uaemex.fi.paradigmas_i.lemuria_dao.transfer_objs.Sala;

public class Mapa {
/**************************************************************************************
 * 
 * 									ATRIBUTOS
 * 
*************************************************************************************/
	private int columnas;
	private int renglones;
	private Sala[][] cuadrantes;
	private Coordenada posicionActual;
		
/**************************************************************************************
* 
* 									METODOS
* 
*************************************************************************************/
	public Mapa(int r, int c) {
	}
	
	public Mapa(Sala [][] salas) {
	}
	
	public void cambiarSala(int dir) {
		
	}

	public Sala getSala() {
		return null;
	}
	
	public void setSala(Sala s, Coordenada c) {
		
	}
}
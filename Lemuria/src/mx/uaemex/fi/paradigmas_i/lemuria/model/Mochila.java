package mx.uaemex.fi.paradigmas_i.lemuria.model;

import java.util.List;

import mx.uaemex.fi.paradigmas_i.lemuria_dao.transfer_objs.Item;

public class Mochila {
/**************************************************************************************
 * 
 * 									ATRIBUTOS
 * 
*************************************************************************************/
	private int capacidad;
	private List<Item> inventario;
		
/**************************************************************************************
* 
* 									METODOS
* 
*************************************************************************************/
	public Mochila(int cap) {
		this.capacidad=cap;
	}

	public Item sacar(Item i) {
		return null;
	}
	
	public void guardar (Item i) {
		
	}
}

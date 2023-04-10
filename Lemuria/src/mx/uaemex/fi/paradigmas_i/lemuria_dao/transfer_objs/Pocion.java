package mx.uaemex.fi.paradigmas_i.lemuria_dao.transfer_objs;

public class Pocion extends Item {
/**************************************************************************************
 * 
 * 									ATRIBUTOS
 * 
*************************************************************************************/
	private int tipo;
		
/**************************************************************************************
* 
* 									METODOS
* 
*************************************************************************************/
	public Pocion() {
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
}
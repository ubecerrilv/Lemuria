package mx.uaemex.fi.paradigmas_i.lemuria_dao.transfer_objs;

public abstract class Item extends ElementoConNombre {
/**************************************************************************************
 * 
 * 									ATRIBUTOS
 * 
*************************************************************************************/
	protected int nivel;
	protected String descripcion;
		
/**************************************************************************************
* 
* 									METODOS
* 
*************************************************************************************/

	public Item() {
	}

	public int getNivel() {
			return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public boolean equals (Object o) {
		return false;
	}
}

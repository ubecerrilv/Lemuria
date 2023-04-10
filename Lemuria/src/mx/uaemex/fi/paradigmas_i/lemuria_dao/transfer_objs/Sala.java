package mx.uaemex.fi.paradigmas_i.lemuria_dao.transfer_objs;

public class Sala extends ElementoConNombre {
/**************************************************************************************
 * 
 * 									ATRIBUTOS
 * 
*************************************************************************************/
	private Enemigo masSiOsare;
	private Item coso;
		
/**************************************************************************************
* 
* 									METODOS
* 
 *************************************************************************************/

	public Sala() {
	}

	public Sala(String n) {
	}
	
	public Sala(String c, Enemigo enemigo, Item item) {
	}

	public Enemigo getMasSiOsare() {
		return masSiOsare;
	}

	public void setMasSiOsare(Enemigo masSiOsare) {
		this.masSiOsare = masSiOsare;
	}

	public Item getCoso() {
		return coso;
	}

	public void setCoso(Item coso) {
		this.coso = coso;
	}
	
	@Override
	public String toString() {
		return "Id: "+this.id+"Nombre: "+this.nombre;
	}
}

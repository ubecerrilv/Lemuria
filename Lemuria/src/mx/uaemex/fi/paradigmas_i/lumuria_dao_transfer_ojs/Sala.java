package mx.uaemex.fi.paradigmas_i.lumuria_dao_transfer_ojs;

public class Sala extends ElementoConNombre {
/**************************************************************************************
 * 
 * 									ATRIBUTOS
 * 
*************************************************************************************/
	private String masSiOsare;
	private String coso;
		
/**************************************************************************************
* 
* 									METODODOS
* 
 *************************************************************************************/

	public Sala() {
	}

	public Sala(String n) {
	}
	
	public Sala(String c, String enemigo, String item) {
	}

	public String getMasSiOsare() {
		return masSiOsare;
	}

	public void setMasSiOsare(String masSiOsare) {
		this.masSiOsare = masSiOsare;
	}

	public String getCoso() {
		return coso;
	}

	public void setCoso(String coso) {
		this.coso = coso;
	}
	
	@Override
	public String toString() {
		return "Id: "+this.id+"Nombre: "+this.nombre;
	}
}

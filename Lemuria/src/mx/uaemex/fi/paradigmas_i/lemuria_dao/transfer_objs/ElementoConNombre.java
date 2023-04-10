package mx.uaemex.fi.paradigmas_i.lemuria_dao.transfer_objs;

public abstract class ElementoConNombre {
/**************************************************************************************
 * 
 * 									ATRIBUTOS
 * 
 *************************************************************************************/
	protected String nombre;
	protected int id;
	protected String imagen;
	
/**************************************************************************************
* 
* 									METODOS
* 
 *************************************************************************************/
public ElementoConNombre() {
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getImagen() {
	return imagen;
}

public void setImagen(String imagen) {
	this.imagen = imagen;
}

@Override
public String toString() {
	return "Id: "+this.getId()+"Nombre: "+this.getNombre();
}

/*@Override
public boolean equals(Object o) {
	
}*/
	
}

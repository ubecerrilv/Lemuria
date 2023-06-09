package mx.uaemex.fi.paradigmas_i.lumuria_dao.daos;

import java.util.List;

import mx.uaemex.fi.paradigmas_i.lemuria_dao.transfer_objs.Sala;

public interface SalasDAO {
/**************************************************************************************
 * 
 * 									ATRIBUTOS
 * 
*************************************************************************************/
		
/**************************************************************************************
* 
* 									METODOS
* 
*************************************************************************************/
	public void create();
	public Sala read (Sala s);
	public List<Sala> read();
	public void update(Sala s);
	public void delete(Sala s);

}

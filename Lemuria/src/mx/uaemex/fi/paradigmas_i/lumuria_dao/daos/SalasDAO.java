package mx.uaemex.fi.paradigmas_i.lumuria_dao.daos;

import java.util.List;

import mx.uaemex.fi.paradigmas_i.lumuria_dao_transfer_ojs.Sala;

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

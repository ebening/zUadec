
package com.uadec.service;

import com.uadec.domain.DetalleCuentas;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for DetalleCuentas entities
 * 
 */
public interface DetalleCuentasService {

	/**
	* Return all DetalleCuentas entity
	* 
	 */
	public List<DetalleCuentas> findAllDetalleCuentass(Integer startResult, Integer maxRows);

	/**
	* Load an existing DetalleCuentas entity
	* 
	 */
	public Set<DetalleCuentas> loadDetalleCuentass();

	/**
	* Save an existing DetalleCuentas entity
	* 
	 */
	public void saveDetalleCuentas(DetalleCuentas detallecuentas);

	/**
	 */
	public DetalleCuentas findDetalleCuentasByPrimaryKey(Integer idDetalleCuentas);

	/**
	* Delete an existing DetalleCuentas entity
	* 
	 */
	public void deleteDetalleCuentas(DetalleCuentas detallecuentas_1);

	/**
	* Return a count of all DetalleCuentas entity
	* 
	 */
	public Integer countDetalleCuentass();
}
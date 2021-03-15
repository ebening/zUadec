
package com.uadec.service;

import com.uadec.domain.Bitacora;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Bitacora entities
 * 
 */
public interface BitacoraService {

	/**
	* Return all Bitacora entity
	* 
	 */
	public List<Bitacora> findAllBitacoras(Integer startResult, Integer maxRows);

	/**
	* Load an existing Bitacora entity
	* 
	 */
	public Set<Bitacora> loadBitacoras();

	/**
	* Return a count of all Bitacora entity
	* 
	 */
	public Integer countBitacoras();

	/**
	* Delete an existing Bitacora entity
	* 
	 */
	public void deleteBitacora(Bitacora bitacora);

	/**
	* Save an existing Bitacora entity
	* 
	 */
	public void saveBitacora(Bitacora bitacora_1);

	/**
	 */
	public Bitacora findBitacoraByPrimaryKey(Integer idBitacora);
}
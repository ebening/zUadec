
package com.uadec.service;

import com.uadec.domain.CatTipoCuenta;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for CatTipoCuenta entities
 * 
 */
public interface CatTipoCuentaService {

	/**
	* Load an existing CatTipoCuenta entity
	* 
	 */
	public Set<CatTipoCuenta> loadCatTipoCuentas();

	/**
	 */
	public CatTipoCuenta findCatTipoCuentaByPrimaryKey(Integer idTipoCuenta);

	/**
	* Delete an existing CatTipoCuenta entity
	* 
	 */
	public void deleteCatTipoCuenta(CatTipoCuenta cattipocuenta);

	/**
	* Save an existing CatTipoCuenta entity
	* 
	 */
	public void saveCatTipoCuenta(CatTipoCuenta cattipocuenta_1);

	/**
	* Return a count of all CatTipoCuenta entity
	* 
	 */
	public Integer countCatTipoCuentas();

	/**
	* Return all CatTipoCuenta entity
	* 
	 */
	public List<CatTipoCuenta> findAllCatTipoCuentas(Integer startResult, Integer maxRows);
}
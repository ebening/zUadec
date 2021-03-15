
package com.uadec.service;

import com.uadec.domain.CatTipoTramite;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for CatTipoTramite entities
 * 
 */
public interface CatTipoTramiteService {

	/**
	* Return all CatTipoTramite entity
	* 
	 */
	public List<CatTipoTramite> findAllCatTipoTramites(Integer startResult, Integer maxRows);

	/**
	* Load an existing CatTipoTramite entity
	* 
	 */
	public Set<CatTipoTramite> loadCatTipoTramites();

	/**
	 */
	public CatTipoTramite findCatTipoTramiteByPrimaryKey(Integer idTipoTramite);

	/**
	* Delete an existing CatTipoTramite entity
	* 
	 */
	public void deleteCatTipoTramite(CatTipoTramite cattipotramite);

	/**
	* Return a count of all CatTipoTramite entity
	* 
	 */
	public Integer countCatTipoTramites();

	/**
	* Save an existing CatTipoTramite entity
	* 
	 */
	public void saveCatTipoTramite(CatTipoTramite cattipotramite_1);
}
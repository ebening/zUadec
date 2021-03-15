
package com.uadec.service;

import com.uadec.domain.Rol;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Rol entities
 * 
 */
public interface RolService {

	/**
	 */
	public Rol findRolByPrimaryKey(Integer idRol);

	/**
	* Save an existing Rol entity
	* 
	 */
	public void saveRol(Rol rol);

	/**
	* Load an existing Rol entity
	* 
	 */
	public Set<Rol> loadRols();

	/**
	* Delete an existing Rol entity
	* 
	 */
	public void deleteRol(Rol rol_1);

	/**
	* Return all Rol entity
	* 
	 */
	public List<Rol> findAllRols(Integer startResult, Integer maxRows);

	/**
	* Return a count of all Rol entity
	* 
	 */
	public Integer countRols();
}
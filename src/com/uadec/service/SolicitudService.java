
package com.uadec.service;

import com.uadec.domain.Solicitud;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Solicitud entities
 * 
 */
public interface SolicitudService {

	/**
	* Save an existing Solicitud entity
	* 
	 */
	public void saveSolicitud(Solicitud solicitud);

	/**
	* Return a count of all Solicitud entity
	* 
	 */
	public Integer countSolicituds();

	/**
	* Delete an existing Solicitud entity
	* 
	 */
	public void deleteSolicitud(Solicitud solicitud_1);

	/**
	* Load an existing Solicitud entity
	* 
	 */
	public Set<Solicitud> loadSolicituds();

	/**
	* Return all Solicitud entity
	* 
	 */
	public List<Solicitud> findAllSolicituds(Integer startResult, Integer maxRows);

	/**
	 */
	public Solicitud findSolicitudByPrimaryKey(Integer idSolicitud);
}
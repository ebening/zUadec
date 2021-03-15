
package com.uadec.dao;

import com.uadec.domain.CatTipoTramite;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage CatTipoTramite entities.
 * 
 */
public interface CatTipoTramiteDAO extends JpaDao<CatTipoTramite> {

	/**
	 * JPQL Query - findCatTipoTramiteByDescripcionContaining
	 *
	 */
	public Set<CatTipoTramite> findCatTipoTramiteByDescripcionContaining(String descripcion) throws DataAccessException;

	/**
	 * JPQL Query - findCatTipoTramiteByDescripcionContaining
	 *
	 */
	public Set<CatTipoTramite> findCatTipoTramiteByDescripcionContaining(String descripcion, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCatTipoTramiteByDescripcion
	 *
	 */
	public Set<CatTipoTramite> findCatTipoTramiteByDescripcion(String descripcion_1) throws DataAccessException;

	/**
	 * JPQL Query - findCatTipoTramiteByDescripcion
	 *
	 */
	public Set<CatTipoTramite> findCatTipoTramiteByDescripcion(String descripcion_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllCatTipoTramites
	 *
	 */
	public Set<CatTipoTramite> findAllCatTipoTramites() throws DataAccessException;

	/**
	 * JPQL Query - findAllCatTipoTramites
	 *
	 */
	public Set<CatTipoTramite> findAllCatTipoTramites(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCatTipoTramiteByPrimaryKey
	 *
	 */
	public CatTipoTramite findCatTipoTramiteByPrimaryKey(Integer idTipoTramite) throws DataAccessException;

	/**
	 * JPQL Query - findCatTipoTramiteByPrimaryKey
	 *
	 */
	public CatTipoTramite findCatTipoTramiteByPrimaryKey(Integer idTipoTramite, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCatTipoTramiteByIdTipoTramite
	 *
	 */
	public CatTipoTramite findCatTipoTramiteByIdTipoTramite(Integer idTipoTramite_1) throws DataAccessException;

	/**
	 * JPQL Query - findCatTipoTramiteByIdTipoTramite
	 *
	 */
	public CatTipoTramite findCatTipoTramiteByIdTipoTramite(Integer idTipoTramite_1, int startResult, int maxRows) throws DataAccessException;

}

package com.uadec.dao;

import com.uadec.domain.CatDocumentos;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage CatDocumentos entities.
 * 
 */
public interface CatDocumentosDAO extends JpaDao<CatDocumentos> {

	/**
	 * JPQL Query - findCatDocumentosByDescripcion
	 *
	 */
	public Set<CatDocumentos> findCatDocumentosByDescripcion(String descripcion) throws DataAccessException;

	/**
	 * JPQL Query - findCatDocumentosByDescripcion
	 *
	 */
	public Set<CatDocumentos> findCatDocumentosByDescripcion(String descripcion, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCatDocumentosByPrimaryKey
	 *
	 */
	public CatDocumentos findCatDocumentosByPrimaryKey(Integer idDocumento) throws DataAccessException;

	/**
	 * JPQL Query - findCatDocumentosByPrimaryKey
	 *
	 */
	public CatDocumentos findCatDocumentosByPrimaryKey(Integer idDocumento, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllCatDocumentoss
	 *
	 */
	public Set<CatDocumentos> findAllCatDocumentoss() throws DataAccessException;

	/**
	 * JPQL Query - findAllCatDocumentoss
	 *
	 */
	public Set<CatDocumentos> findAllCatDocumentoss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCatDocumentosByDescripcionContaining
	 *
	 */
	public Set<CatDocumentos> findCatDocumentosByDescripcionContaining(String descripcion_1) throws DataAccessException;

	/**
	 * JPQL Query - findCatDocumentosByDescripcionContaining
	 *
	 */
	public Set<CatDocumentos> findCatDocumentosByDescripcionContaining(String descripcion_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCatDocumentosByIdDocumento
	 *
	 */
	public CatDocumentos findCatDocumentosByIdDocumento(Integer idDocumento_1) throws DataAccessException;

	/**
	 * JPQL Query - findCatDocumentosByIdDocumento
	 *
	 */
	public CatDocumentos findCatDocumentosByIdDocumento(Integer idDocumento_1, int startResult, int maxRows) throws DataAccessException;

}
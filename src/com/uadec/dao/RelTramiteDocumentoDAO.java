
package com.uadec.dao;

import com.uadec.domain.RelTramiteDocumento;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage RelTramiteDocumento entities.
 * 
 */
public interface RelTramiteDocumentoDAO extends JpaDao<RelTramiteDocumento> {

	/**
	 * JPQL Query - findRelTramiteDocumentoByIdTramiteDoc
	 *
	 */
	public RelTramiteDocumento findRelTramiteDocumentoByIdTramiteDoc(Integer idTramiteDoc) throws DataAccessException;

	/**
	 * JPQL Query - findRelTramiteDocumentoByIdTramiteDoc
	 *
	 */
	public RelTramiteDocumento findRelTramiteDocumentoByIdTramiteDoc(Integer idTramiteDoc, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRelTramiteDocumentoByPrimaryKey
	 *
	 */
	public RelTramiteDocumento findRelTramiteDocumentoByPrimaryKey(Integer idTramiteDoc_1) throws DataAccessException;

	/**
	 * JPQL Query - findRelTramiteDocumentoByPrimaryKey
	 *
	 */
	public RelTramiteDocumento findRelTramiteDocumentoByPrimaryKey(Integer idTramiteDoc_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRelTramiteDocumentoByIdTipoTramite
	 *
	 */
	public Set<RelTramiteDocumento> findRelTramiteDocumentoByIdTipoTramite(Integer idTipoTramite) throws DataAccessException;

	/**
	 * JPQL Query - findRelTramiteDocumentoByIdTipoTramite
	 *
	 */
	public Set<RelTramiteDocumento> findRelTramiteDocumentoByIdTipoTramite(Integer idTipoTramite, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRelTramiteDocumentos
	 *
	 */
	public Set<RelTramiteDocumento> findAllRelTramiteDocumentos() throws DataAccessException;

	/**
	 * JPQL Query - findAllRelTramiteDocumentos
	 *
	 */
	public Set<RelTramiteDocumento> findAllRelTramiteDocumentos(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRelTramiteDocumentoByIdDocumento
	 *
	 */
	public Set<RelTramiteDocumento> findRelTramiteDocumentoByIdDocumento(Integer idDocumento) throws DataAccessException;

	/**
	 * JPQL Query - findRelTramiteDocumentoByIdDocumento
	 *
	 */
	public Set<RelTramiteDocumento> findRelTramiteDocumentoByIdDocumento(Integer idDocumento, int startResult, int maxRows) throws DataAccessException;

}
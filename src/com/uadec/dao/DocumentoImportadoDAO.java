
package com.uadec.dao;

import com.uadec.domain.DocumentoImportado;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage DocumentoImportado entities.
 * 
 */
public interface DocumentoImportadoDAO extends JpaDao<DocumentoImportado> {

	/**
	 * JPQL Query - findDocumentoImportadoByPid
	 *
	 */
	public Set<DocumentoImportado> findDocumentoImportadoByPid(String pid) throws DataAccessException;

	/**
	 * JPQL Query - findDocumentoImportadoByPid
	 *
	 */
	public Set<DocumentoImportado> findDocumentoImportadoByPid(String pid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDocumentoImportadoByNombredocContaining
	 *
	 */
	public Set<DocumentoImportado> findDocumentoImportadoByNombredocContaining(String nombredoc) throws DataAccessException;

	/**
	 * JPQL Query - findDocumentoImportadoByNombredocContaining
	 *
	 */
	public Set<DocumentoImportado> findDocumentoImportadoByNombredocContaining(String nombredoc, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDocumentoImportadoByIdDocumento
	 *
	 */
	public Set<DocumentoImportado> findDocumentoImportadoByIdDocumento(Integer idDocumento) throws DataAccessException;

	/**
	 * JPQL Query - findDocumentoImportadoByIdDocumento
	 *
	 */
	public Set<DocumentoImportado> findDocumentoImportadoByIdDocumento(Integer idDocumento, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDocumentoImportadoByIdSolicitud
	 *
	 */
	public Set<DocumentoImportado> findDocumentoImportadoByIdSolicitud(Integer idSolicitud) throws DataAccessException;

	/**
	 * JPQL Query - findDocumentoImportadoByIdSolicitud
	 *
	 */
	public Set<DocumentoImportado> findDocumentoImportadoByIdSolicitud(Integer idSolicitud, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllDocumentoImportados
	 *
	 */
	public Set<DocumentoImportado> findAllDocumentoImportados() throws DataAccessException;

	/**
	 * JPQL Query - findAllDocumentoImportados
	 *
	 */
	public Set<DocumentoImportado> findAllDocumentoImportados(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDocumentoImportadoByNombredoc
	 *
	 */
	public Set<DocumentoImportado> findDocumentoImportadoByNombredoc(String nombredoc_1) throws DataAccessException;

	/**
	 * JPQL Query - findDocumentoImportadoByNombredoc
	 *
	 */
	public Set<DocumentoImportado> findDocumentoImportadoByNombredoc(String nombredoc_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDocumentoImportadoByIdDocumentoImportado
	 *
	 */
	public DocumentoImportado findDocumentoImportadoByIdDocumentoImportado(Integer idDocumentoImportado) throws DataAccessException;

	/**
	 * JPQL Query - findDocumentoImportadoByIdDocumentoImportado
	 *
	 */
	public DocumentoImportado findDocumentoImportadoByIdDocumentoImportado(Integer idDocumentoImportado, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDocumentoImportadoByPidContaining
	 *
	 */
	public Set<DocumentoImportado> findDocumentoImportadoByPidContaining(String pid_1) throws DataAccessException;

	/**
	 * JPQL Query - findDocumentoImportadoByPidContaining
	 *
	 */
	public Set<DocumentoImportado> findDocumentoImportadoByPidContaining(String pid_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDocumentoImportadoByPrimaryKey
	 *
	 */
	public DocumentoImportado findDocumentoImportadoByPrimaryKey(Integer idDocumentoImportado_1) throws DataAccessException;

	/**
	 * JPQL Query - findDocumentoImportadoByPrimaryKey
	 *
	 */
	public DocumentoImportado findDocumentoImportadoByPrimaryKey(Integer idDocumentoImportado_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDocumentoImportadoByIdUsuario
	 *
	 */
	public Set<DocumentoImportado> findDocumentoImportadoByIdUsuario(Integer idUsuario) throws DataAccessException;

	/**
	 * JPQL Query - findDocumentoImportadoByIdUsuario
	 *
	 */
	public Set<DocumentoImportado> findDocumentoImportadoByIdUsuario(Integer idUsuario, int startResult, int maxRows) throws DataAccessException;

}
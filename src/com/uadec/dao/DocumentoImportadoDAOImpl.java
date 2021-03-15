
package com.uadec.dao;

import com.uadec.domain.DocumentoImportado;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage DocumentoImportado entities.
 * 
 */
@Repository("DocumentoImportadoDAO")

@Transactional
public class DocumentoImportadoDAOImpl extends AbstractJpaDao<DocumentoImportado> implements DocumentoImportadoDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			DocumentoImportado.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql
	 *
	 */
	@PersistenceContext(unitName = "mysql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new DocumentoImportadoDAOImpl
	 *
	 */
	public DocumentoImportadoDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findDocumentoImportadoByPid
	 *
	 */
	@Transactional
	public Set<DocumentoImportado> findDocumentoImportadoByPid(String pid) throws DataAccessException {

		return findDocumentoImportadoByPid(pid, -1, -1);
	}

	/**
	 * JPQL Query - findDocumentoImportadoByPid
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<DocumentoImportado> findDocumentoImportadoByPid(String pid, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDocumentoImportadoByPid", startResult, maxRows, pid);
		return new LinkedHashSet<DocumentoImportado>(query.getResultList());
	}

	/**
	 * JPQL Query - findDocumentoImportadoByNombredocContaining
	 *
	 */
	@Transactional
	public Set<DocumentoImportado> findDocumentoImportadoByNombredocContaining(String nombredoc) throws DataAccessException {

		return findDocumentoImportadoByNombredocContaining(nombredoc, -1, -1);
	}

	/**
	 * JPQL Query - findDocumentoImportadoByNombredocContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<DocumentoImportado> findDocumentoImportadoByNombredocContaining(String nombredoc, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDocumentoImportadoByNombredocContaining", startResult, maxRows, nombredoc);
		return new LinkedHashSet<DocumentoImportado>(query.getResultList());
	}

	/**
	 * JPQL Query - findDocumentoImportadoByIdDocumento
	 *
	 */
	@Transactional
	public Set<DocumentoImportado> findDocumentoImportadoByIdDocumento(Integer idDocumento) throws DataAccessException {

		return findDocumentoImportadoByIdDocumento(idDocumento, -1, -1);
	}

	/**
	 * JPQL Query - findDocumentoImportadoByIdDocumento
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<DocumentoImportado> findDocumentoImportadoByIdDocumento(Integer idDocumento, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDocumentoImportadoByIdDocumento", startResult, maxRows, idDocumento);
		return new LinkedHashSet<DocumentoImportado>(query.getResultList());
	}

	/**
	 * JPQL Query - findDocumentoImportadoByIdSolicitud
	 *
	 */
	@Transactional
	public Set<DocumentoImportado> findDocumentoImportadoByIdSolicitud(Integer idSolicitud) throws DataAccessException {

		return findDocumentoImportadoByIdSolicitud(idSolicitud, -1, -1);
	}

	/**
	 * JPQL Query - findDocumentoImportadoByIdSolicitud
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<DocumentoImportado> findDocumentoImportadoByIdSolicitud(Integer idSolicitud, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDocumentoImportadoByIdSolicitud", startResult, maxRows, idSolicitud);
		return new LinkedHashSet<DocumentoImportado>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllDocumentoImportados
	 *
	 */
	@Transactional
	public Set<DocumentoImportado> findAllDocumentoImportados() throws DataAccessException {

		return findAllDocumentoImportados(-1, -1);
	}

	/**
	 * JPQL Query - findAllDocumentoImportados
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<DocumentoImportado> findAllDocumentoImportados(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllDocumentoImportados", startResult, maxRows);
		return new LinkedHashSet<DocumentoImportado>(query.getResultList());
	}

	/**
	 * JPQL Query - findDocumentoImportadoByNombredoc
	 *
	 */
	@Transactional
	public Set<DocumentoImportado> findDocumentoImportadoByNombredoc(String nombredoc) throws DataAccessException {

		return findDocumentoImportadoByNombredoc(nombredoc, -1, -1);
	}

	/**
	 * JPQL Query - findDocumentoImportadoByNombredoc
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<DocumentoImportado> findDocumentoImportadoByNombredoc(String nombredoc, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDocumentoImportadoByNombredoc", startResult, maxRows, nombredoc);
		return new LinkedHashSet<DocumentoImportado>(query.getResultList());
	}

	/**
	 * JPQL Query - findDocumentoImportadoByIdDocumentoImportado
	 *
	 */
	@Transactional
	public DocumentoImportado findDocumentoImportadoByIdDocumentoImportado(Integer idDocumentoImportado) throws DataAccessException {

		return findDocumentoImportadoByIdDocumentoImportado(idDocumentoImportado, -1, -1);
	}

	/**
	 * JPQL Query - findDocumentoImportadoByIdDocumentoImportado
	 *
	 */

	@Transactional
	public DocumentoImportado findDocumentoImportadoByIdDocumentoImportado(Integer idDocumentoImportado, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findDocumentoImportadoByIdDocumentoImportado", startResult, maxRows, idDocumentoImportado);
			return (com.uadec.domain.DocumentoImportado) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findDocumentoImportadoByPidContaining
	 *
	 */
	@Transactional
	public Set<DocumentoImportado> findDocumentoImportadoByPidContaining(String pid) throws DataAccessException {

		return findDocumentoImportadoByPidContaining(pid, -1, -1);
	}

	/**
	 * JPQL Query - findDocumentoImportadoByPidContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<DocumentoImportado> findDocumentoImportadoByPidContaining(String pid, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDocumentoImportadoByPidContaining", startResult, maxRows, pid);
		return new LinkedHashSet<DocumentoImportado>(query.getResultList());
	}

	/**
	 * JPQL Query - findDocumentoImportadoByPrimaryKey
	 *
	 */
	@Transactional
	public DocumentoImportado findDocumentoImportadoByPrimaryKey(Integer idDocumentoImportado) throws DataAccessException {

		return findDocumentoImportadoByPrimaryKey(idDocumentoImportado, -1, -1);
	}

	/**
	 * JPQL Query - findDocumentoImportadoByPrimaryKey
	 *
	 */

	@Transactional
	public DocumentoImportado findDocumentoImportadoByPrimaryKey(Integer idDocumentoImportado, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findDocumentoImportadoByPrimaryKey", startResult, maxRows, idDocumentoImportado);
			return (com.uadec.domain.DocumentoImportado) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findDocumentoImportadoByIdUsuario
	 *
	 */
	@Transactional
	public Set<DocumentoImportado> findDocumentoImportadoByIdUsuario(Integer idUsuario) throws DataAccessException {

		return findDocumentoImportadoByIdUsuario(idUsuario, -1, -1);
	}

	/**
	 * JPQL Query - findDocumentoImportadoByIdUsuario
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<DocumentoImportado> findDocumentoImportadoByIdUsuario(Integer idUsuario, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDocumentoImportadoByIdUsuario", startResult, maxRows, idUsuario);
		return new LinkedHashSet<DocumentoImportado>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(DocumentoImportado entity) {
		return true;
	}
}


package com.uadec.dao;

import com.uadec.domain.RelTramiteDocumento;

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
 * DAO to manage RelTramiteDocumento entities.
 * 
 */
@Repository("RelTramiteDocumentoDAO")

@Transactional
public class RelTramiteDocumentoDAOImpl extends AbstractJpaDao<RelTramiteDocumento> implements RelTramiteDocumentoDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			RelTramiteDocumento.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql
	 *
	 */
	@PersistenceContext(unitName = "mysql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new RelTramiteDocumentoDAOImpl
	 *
	 */
	public RelTramiteDocumentoDAOImpl() {
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
	 * JPQL Query - findRelTramiteDocumentoByIdTramiteDoc
	 *
	 */
	@Transactional
	public RelTramiteDocumento findRelTramiteDocumentoByIdTramiteDoc(Integer idTramiteDoc) throws DataAccessException {

		return findRelTramiteDocumentoByIdTramiteDoc(idTramiteDoc, -1, -1);
	}

	/**
	 * JPQL Query - findRelTramiteDocumentoByIdTramiteDoc
	 *
	 */

	@Transactional
	public RelTramiteDocumento findRelTramiteDocumentoByIdTramiteDoc(Integer idTramiteDoc, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRelTramiteDocumentoByIdTramiteDoc", startResult, maxRows, idTramiteDoc);
			return (com.uadec.domain.RelTramiteDocumento) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRelTramiteDocumentoByPrimaryKey
	 *
	 */
	@Transactional
	public RelTramiteDocumento findRelTramiteDocumentoByPrimaryKey(Integer idTramiteDoc) throws DataAccessException {

		return findRelTramiteDocumentoByPrimaryKey(idTramiteDoc, -1, -1);
	}

	/**
	 * JPQL Query - findRelTramiteDocumentoByPrimaryKey
	 *
	 */

	@Transactional
	public RelTramiteDocumento findRelTramiteDocumentoByPrimaryKey(Integer idTramiteDoc, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRelTramiteDocumentoByPrimaryKey", startResult, maxRows, idTramiteDoc);
			return (com.uadec.domain.RelTramiteDocumento) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRelTramiteDocumentoByIdTipoTramite
	 *
	 */
	@Transactional
	public Set<RelTramiteDocumento> findRelTramiteDocumentoByIdTipoTramite(Integer idTipoTramite) throws DataAccessException {

		return findRelTramiteDocumentoByIdTipoTramite(idTipoTramite, -1, -1);
	}

	/**
	 * JPQL Query - findRelTramiteDocumentoByIdTipoTramite
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RelTramiteDocumento> findRelTramiteDocumentoByIdTipoTramite(Integer idTipoTramite, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRelTramiteDocumentoByIdTipoTramite", startResult, maxRows, idTipoTramite);
		return new LinkedHashSet<RelTramiteDocumento>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRelTramiteDocumentos
	 *
	 */
	@Transactional
	public Set<RelTramiteDocumento> findAllRelTramiteDocumentos() throws DataAccessException {

		return findAllRelTramiteDocumentos(-1, -1);
	}

	/**
	 * JPQL Query - findAllRelTramiteDocumentos
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RelTramiteDocumento> findAllRelTramiteDocumentos(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRelTramiteDocumentos", startResult, maxRows);
		return new LinkedHashSet<RelTramiteDocumento>(query.getResultList());
	}

	/**
	 * JPQL Query - findRelTramiteDocumentoByIdDocumento
	 *
	 */
	@Transactional
	public Set<RelTramiteDocumento> findRelTramiteDocumentoByIdDocumento(Integer idDocumento) throws DataAccessException {

		return findRelTramiteDocumentoByIdDocumento(idDocumento, -1, -1);
	}

	/**
	 * JPQL Query - findRelTramiteDocumentoByIdDocumento
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RelTramiteDocumento> findRelTramiteDocumentoByIdDocumento(Integer idDocumento, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRelTramiteDocumentoByIdDocumento", startResult, maxRows, idDocumento);
		return new LinkedHashSet<RelTramiteDocumento>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(RelTramiteDocumento entity) {
		return true;
	}
}

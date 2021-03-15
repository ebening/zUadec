
package com.uadec.dao;

import com.uadec.domain.CatDocumentos;

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
 * DAO to manage CatDocumentos entities.
 * 
 */
@Repository("CatDocumentosDAO")

@Transactional
public class CatDocumentosDAOImpl extends AbstractJpaDao<CatDocumentos> implements CatDocumentosDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			CatDocumentos.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql
	 *
	 */
	@PersistenceContext(unitName = "mysql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new CatDocumentosDAOImpl
	 *
	 */
	public CatDocumentosDAOImpl() {
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
	 * JPQL Query - findCatDocumentosByDescripcion
	 *
	 */
	@Transactional
	public Set<CatDocumentos> findCatDocumentosByDescripcion(String descripcion) throws DataAccessException {

		return findCatDocumentosByDescripcion(descripcion, -1, -1);
	}

	/**
	 * JPQL Query - findCatDocumentosByDescripcion
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CatDocumentos> findCatDocumentosByDescripcion(String descripcion, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCatDocumentosByDescripcion", startResult, maxRows, descripcion);
		return new LinkedHashSet<CatDocumentos>(query.getResultList());
	}

	/**
	 * JPQL Query - findCatDocumentosByPrimaryKey
	 *
	 */
	@Transactional
	public CatDocumentos findCatDocumentosByPrimaryKey(Integer idDocumento) throws DataAccessException {

		return findCatDocumentosByPrimaryKey(idDocumento, -1, -1);
	}

	/**
	 * JPQL Query - findCatDocumentosByPrimaryKey
	 *
	 */

	@Transactional
	public CatDocumentos findCatDocumentosByPrimaryKey(Integer idDocumento, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCatDocumentosByPrimaryKey", startResult, maxRows, idDocumento);
			return (com.uadec.domain.CatDocumentos) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllCatDocumentoss
	 *
	 */
	@Transactional
	public Set<CatDocumentos> findAllCatDocumentoss() throws DataAccessException {

		return findAllCatDocumentoss(-1, -1);
	}

	/**
	 * JPQL Query - findAllCatDocumentoss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CatDocumentos> findAllCatDocumentoss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllCatDocumentoss", startResult, maxRows);
		return new LinkedHashSet<CatDocumentos>(query.getResultList());
	}

	/**
	 * JPQL Query - findCatDocumentosByDescripcionContaining
	 *
	 */
	@Transactional
	public Set<CatDocumentos> findCatDocumentosByDescripcionContaining(String descripcion) throws DataAccessException {

		return findCatDocumentosByDescripcionContaining(descripcion, -1, -1);
	}

	/**
	 * JPQL Query - findCatDocumentosByDescripcionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CatDocumentos> findCatDocumentosByDescripcionContaining(String descripcion, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCatDocumentosByDescripcionContaining", startResult, maxRows, descripcion);
		return new LinkedHashSet<CatDocumentos>(query.getResultList());
	}

	/**
	 * JPQL Query - findCatDocumentosByIdDocumento
	 *
	 */
	@Transactional
	public CatDocumentos findCatDocumentosByIdDocumento(Integer idDocumento) throws DataAccessException {

		return findCatDocumentosByIdDocumento(idDocumento, -1, -1);
	}

	/**
	 * JPQL Query - findCatDocumentosByIdDocumento
	 *
	 */

	@Transactional
	public CatDocumentos findCatDocumentosByIdDocumento(Integer idDocumento, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCatDocumentosByIdDocumento", startResult, maxRows, idDocumento);
			return (com.uadec.domain.CatDocumentos) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(CatDocumentos entity) {
		return true;
	}
}

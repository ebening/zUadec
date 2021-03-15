
package com.uadec.dao;

import com.uadec.domain.CatTipoTramite;

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
 * DAO to manage CatTipoTramite entities.
 * 
 */
@Repository("CatTipoTramiteDAO")

@Transactional
public class CatTipoTramiteDAOImpl extends AbstractJpaDao<CatTipoTramite> implements CatTipoTramiteDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			CatTipoTramite.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql
	 *
	 */
	@PersistenceContext(unitName = "mysql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new CatTipoTramiteDAOImpl
	 *
	 */
	public CatTipoTramiteDAOImpl() {
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
	 * JPQL Query - findCatTipoTramiteByDescripcionContaining
	 *
	 */
	@Transactional
	public Set<CatTipoTramite> findCatTipoTramiteByDescripcionContaining(String descripcion) throws DataAccessException {

		return findCatTipoTramiteByDescripcionContaining(descripcion, -1, -1);
	}

	/**
	 * JPQL Query - findCatTipoTramiteByDescripcionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CatTipoTramite> findCatTipoTramiteByDescripcionContaining(String descripcion, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCatTipoTramiteByDescripcionContaining", startResult, maxRows, descripcion);
		return new LinkedHashSet<CatTipoTramite>(query.getResultList());
	}

	/**
	 * JPQL Query - findCatTipoTramiteByDescripcion
	 *
	 */
	@Transactional
	public Set<CatTipoTramite> findCatTipoTramiteByDescripcion(String descripcion) throws DataAccessException {

		return findCatTipoTramiteByDescripcion(descripcion, -1, -1);
	}

	/**
	 * JPQL Query - findCatTipoTramiteByDescripcion
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CatTipoTramite> findCatTipoTramiteByDescripcion(String descripcion, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCatTipoTramiteByDescripcion", startResult, maxRows, descripcion);
		return new LinkedHashSet<CatTipoTramite>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllCatTipoTramites
	 *
	 */
	@Transactional
	public Set<CatTipoTramite> findAllCatTipoTramites() throws DataAccessException {

		return findAllCatTipoTramites(-1, -1);
	}

	/**
	 * JPQL Query - findAllCatTipoTramites
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CatTipoTramite> findAllCatTipoTramites(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllCatTipoTramites", startResult, maxRows);
		return new LinkedHashSet<CatTipoTramite>(query.getResultList());
	}

	/**
	 * JPQL Query - findCatTipoTramiteByPrimaryKey
	 *
	 */
	@Transactional
	public CatTipoTramite findCatTipoTramiteByPrimaryKey(Integer idTipoTramite) throws DataAccessException {

		return findCatTipoTramiteByPrimaryKey(idTipoTramite, -1, -1);
	}

	/**
	 * JPQL Query - findCatTipoTramiteByPrimaryKey
	 *
	 */

	@Transactional
	public CatTipoTramite findCatTipoTramiteByPrimaryKey(Integer idTipoTramite, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCatTipoTramiteByPrimaryKey", startResult, maxRows, idTipoTramite);
			return (com.uadec.domain.CatTipoTramite) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findCatTipoTramiteByIdTipoTramite
	 *
	 */
	@Transactional
	public CatTipoTramite findCatTipoTramiteByIdTipoTramite(Integer idTipoTramite) throws DataAccessException {

		return findCatTipoTramiteByIdTipoTramite(idTipoTramite, -1, -1);
	}

	/**
	 * JPQL Query - findCatTipoTramiteByIdTipoTramite
	 *
	 */

	@Transactional
	public CatTipoTramite findCatTipoTramiteByIdTipoTramite(Integer idTipoTramite, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCatTipoTramiteByIdTipoTramite", startResult, maxRows, idTipoTramite);
			return (com.uadec.domain.CatTipoTramite) query.getSingleResult();
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
	public boolean canBeMerged(CatTipoTramite entity) {
		return true;
	}
}

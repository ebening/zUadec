
package com.uadec.dao;

import com.uadec.domain.CatTipoCuenta;

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
 * DAO to manage CatTipoCuenta entities.
 * 
 */
@Repository("CatTipoCuentaDAO")

@Transactional
public class CatTipoCuentaDAOImpl extends AbstractJpaDao<CatTipoCuenta> implements CatTipoCuentaDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			CatTipoCuenta.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql
	 *
	 */
	@PersistenceContext(unitName = "mysql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new CatTipoCuentaDAOImpl
	 *
	 */
	public CatTipoCuentaDAOImpl() {
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
	 * JPQL Query - findAllCatTipoCuentas
	 *
	 */
	@Transactional
	public Set<CatTipoCuenta> findAllCatTipoCuentas() throws DataAccessException {

		return findAllCatTipoCuentas(-1, -1);
	}

	/**
	 * JPQL Query - findAllCatTipoCuentas
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CatTipoCuenta> findAllCatTipoCuentas(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllCatTipoCuentas", startResult, maxRows);
		return new LinkedHashSet<CatTipoCuenta>(query.getResultList());
	}

	/**
	 * JPQL Query - findCatTipoCuentaByIdTipoCuenta
	 *
	 */
	@Transactional
	public CatTipoCuenta findCatTipoCuentaByIdTipoCuenta(Integer idTipoCuenta) throws DataAccessException {

		return findCatTipoCuentaByIdTipoCuenta(idTipoCuenta, -1, -1);
	}

	/**
	 * JPQL Query - findCatTipoCuentaByIdTipoCuenta
	 *
	 */

	@Transactional
	public CatTipoCuenta findCatTipoCuentaByIdTipoCuenta(Integer idTipoCuenta, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCatTipoCuentaByIdTipoCuenta", startResult, maxRows, idTipoCuenta);
			return (com.uadec.domain.CatTipoCuenta) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findCatTipoCuentaByDescripcion
	 *
	 */
	@Transactional
	public Set<CatTipoCuenta> findCatTipoCuentaByDescripcion(String descripcion) throws DataAccessException {

		return findCatTipoCuentaByDescripcion(descripcion, -1, -1);
	}

	/**
	 * JPQL Query - findCatTipoCuentaByDescripcion
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CatTipoCuenta> findCatTipoCuentaByDescripcion(String descripcion, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCatTipoCuentaByDescripcion", startResult, maxRows, descripcion);
		return new LinkedHashSet<CatTipoCuenta>(query.getResultList());
	}

	/**
	 * JPQL Query - findCatTipoCuentaByDescripcionContaining
	 *
	 */
	@Transactional
	public Set<CatTipoCuenta> findCatTipoCuentaByDescripcionContaining(String descripcion) throws DataAccessException {

		return findCatTipoCuentaByDescripcionContaining(descripcion, -1, -1);
	}

	/**
	 * JPQL Query - findCatTipoCuentaByDescripcionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CatTipoCuenta> findCatTipoCuentaByDescripcionContaining(String descripcion, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCatTipoCuentaByDescripcionContaining", startResult, maxRows, descripcion);
		return new LinkedHashSet<CatTipoCuenta>(query.getResultList());
	}

	/**
	 * JPQL Query - findCatTipoCuentaByPrimaryKey
	 *
	 */
	@Transactional
	public CatTipoCuenta findCatTipoCuentaByPrimaryKey(Integer idTipoCuenta) throws DataAccessException {

		return findCatTipoCuentaByPrimaryKey(idTipoCuenta, -1, -1);
	}

	/**
	 * JPQL Query - findCatTipoCuentaByPrimaryKey
	 *
	 */

	@Transactional
	public CatTipoCuenta findCatTipoCuentaByPrimaryKey(Integer idTipoCuenta, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCatTipoCuentaByPrimaryKey", startResult, maxRows, idTipoCuenta);
			return (com.uadec.domain.CatTipoCuenta) query.getSingleResult();
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
	public boolean canBeMerged(CatTipoCuenta entity) {
		return true;
	}
}


package com.uadec.dao;

import com.uadec.domain.Rol;

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
 * DAO to manage Rol entities.
 * 
 */
@Repository("RolDAO")

@Transactional
public class RolDAOImpl extends AbstractJpaDao<Rol> implements RolDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Rol.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql
	 *
	 */
	@PersistenceContext(unitName = "mysql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new RolDAOImpl
	 *
	 */
	public RolDAOImpl() {
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
	 * JPQL Query - findRolByNombreRol
	 *
	 */
	@Transactional
	public Set<Rol> findRolByNombreRol(String nombreRol) throws DataAccessException {

		return findRolByNombreRol(nombreRol, -1, -1);
	}

	/**
	 * JPQL Query - findRolByNombreRol
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Rol> findRolByNombreRol(String nombreRol, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRolByNombreRol", startResult, maxRows, nombreRol);
		return new LinkedHashSet<Rol>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRols
	 *
	 */
	@Transactional
	public Set<Rol> findAllRols() throws DataAccessException {

		return findAllRols(-1, -1);
	}

	/**
	 * JPQL Query - findAllRols
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Rol> findAllRols(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRols", startResult, maxRows);
		return new LinkedHashSet<Rol>(query.getResultList());
	}

	/**
	 * JPQL Query - findRolByNombreRolContaining
	 *
	 */
	@Transactional
	public Set<Rol> findRolByNombreRolContaining(String nombreRol) throws DataAccessException {

		return findRolByNombreRolContaining(nombreRol, -1, -1);
	}

	/**
	 * JPQL Query - findRolByNombreRolContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Rol> findRolByNombreRolContaining(String nombreRol, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRolByNombreRolContaining", startResult, maxRows, nombreRol);
		return new LinkedHashSet<Rol>(query.getResultList());
	}

	/**
	 * JPQL Query - findRolByIdRol
	 *
	 */
	@Transactional
	public Rol findRolByIdRol(Integer idRol) throws DataAccessException {

		return findRolByIdRol(idRol, -1, -1);
	}

	/**
	 * JPQL Query - findRolByIdRol
	 *
	 */

	@Transactional
	public Rol findRolByIdRol(Integer idRol, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRolByIdRol", startResult, maxRows, idRol);
			return (com.uadec.domain.Rol) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRolByPrimaryKey
	 *
	 */
	@Transactional
	public Rol findRolByPrimaryKey(Integer idRol) throws DataAccessException {

		return findRolByPrimaryKey(idRol, -1, -1);
	}

	/**
	 * JPQL Query - findRolByPrimaryKey
	 *
	 */

	@Transactional
	public Rol findRolByPrimaryKey(Integer idRol, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRolByPrimaryKey", startResult, maxRows, idRol);
			return (com.uadec.domain.Rol) query.getSingleResult();
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
	public boolean canBeMerged(Rol entity) {
		return true;
	}
}

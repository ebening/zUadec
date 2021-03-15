
package com.uadec.dao;

import com.uadec.domain.DetalleCuentas;

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
 * DAO to manage DetalleCuentas entities.
 * 
 */
@Repository("DetalleCuentasDAO")

@Transactional
public class DetalleCuentasDAOImpl extends AbstractJpaDao<DetalleCuentas> implements DetalleCuentasDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			DetalleCuentas.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql
	 *
	 */
	@PersistenceContext(unitName = "mysql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new DetalleCuentasDAOImpl
	 *
	 */
	public DetalleCuentasDAOImpl() {
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
	 * JPQL Query - findDetalleCuentasByCiclo
	 *
	 */
	@Transactional
	public Set<DetalleCuentas> findDetalleCuentasByCiclo(String ciclo) throws DataAccessException {

		return findDetalleCuentasByCiclo(ciclo, -1, -1);
	}

	/**
	 * JPQL Query - findDetalleCuentasByCiclo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<DetalleCuentas> findDetalleCuentasByCiclo(String ciclo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDetalleCuentasByCiclo", startResult, maxRows, ciclo);
		return new LinkedHashSet<DetalleCuentas>(query.getResultList());
	}

	/**
	 * JPQL Query - findDetalleCuentasByIdTipoCuenta
	 *
	 */
	@Transactional
	public Set<DetalleCuentas> findDetalleCuentasByIdTipoCuenta(Integer idTipoCuenta) throws DataAccessException {

		return findDetalleCuentasByIdTipoCuenta(idTipoCuenta, -1, -1);
	}

	/**
	 * JPQL Query - findDetalleCuentasByIdTipoCuenta
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<DetalleCuentas> findDetalleCuentasByIdTipoCuenta(Integer idTipoCuenta, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDetalleCuentasByIdTipoCuenta", startResult, maxRows, idTipoCuenta);
		return new LinkedHashSet<DetalleCuentas>(query.getResultList());
	}

	/**
	 * JPQL Query - findDetalleCuentasByCicloContaining
	 *
	 */
	@Transactional
	public Set<DetalleCuentas> findDetalleCuentasByCicloContaining(String ciclo) throws DataAccessException {

		return findDetalleCuentasByCicloContaining(ciclo, -1, -1);
	}

	/**
	 * JPQL Query - findDetalleCuentasByCicloContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<DetalleCuentas> findDetalleCuentasByCicloContaining(String ciclo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDetalleCuentasByCicloContaining", startResult, maxRows, ciclo);
		return new LinkedHashSet<DetalleCuentas>(query.getResultList());
	}

	/**
	 * JPQL Query - findDetalleCuentasByNumero
	 *
	 */
	@Transactional
	public Set<DetalleCuentas> findDetalleCuentasByNumero(String numero) throws DataAccessException {

		return findDetalleCuentasByNumero(numero, -1, -1);
	}

	/**
	 * JPQL Query - findDetalleCuentasByNumero
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<DetalleCuentas> findDetalleCuentasByNumero(String numero, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDetalleCuentasByNumero", startResult, maxRows, numero);
		return new LinkedHashSet<DetalleCuentas>(query.getResultList());
	}

	/**
	 * JPQL Query - findDetalleCuentasByCuentaPagar
	 *
	 */
	@Transactional
	public Set<DetalleCuentas> findDetalleCuentasByCuentaPagar(String cuentaPagar) throws DataAccessException {

		return findDetalleCuentasByCuentaPagar(cuentaPagar, -1, -1);
	}

	/**
	 * JPQL Query - findDetalleCuentasByCuentaPagar
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<DetalleCuentas> findDetalleCuentasByCuentaPagar(String cuentaPagar, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDetalleCuentasByCuentaPagar", startResult, maxRows, cuentaPagar);
		return new LinkedHashSet<DetalleCuentas>(query.getResultList());
	}

	/**
	 * JPQL Query - findDetalleCuentasByPrimaryKey
	 *
	 */
	@Transactional
	public DetalleCuentas findDetalleCuentasByPrimaryKey(Integer idDetalleCuentas) throws DataAccessException {

		return findDetalleCuentasByPrimaryKey(idDetalleCuentas, -1, -1);
	}

	/**
	 * JPQL Query - findDetalleCuentasByPrimaryKey
	 *
	 */

	@Transactional
	public DetalleCuentas findDetalleCuentasByPrimaryKey(Integer idDetalleCuentas, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findDetalleCuentasByPrimaryKey", startResult, maxRows, idDetalleCuentas);
			return (com.uadec.domain.DetalleCuentas) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findDetalleCuentasByIdDetalleCuentas
	 *
	 */
	@Transactional
	public DetalleCuentas findDetalleCuentasByIdDetalleCuentas(Integer idDetalleCuentas) throws DataAccessException {

		return findDetalleCuentasByIdDetalleCuentas(idDetalleCuentas, -1, -1);
	}

	/**
	 * JPQL Query - findDetalleCuentasByIdDetalleCuentas
	 *
	 */

	@Transactional
	public DetalleCuentas findDetalleCuentasByIdDetalleCuentas(Integer idDetalleCuentas, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findDetalleCuentasByIdDetalleCuentas", startResult, maxRows, idDetalleCuentas);
			return (com.uadec.domain.DetalleCuentas) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findDetalleCuentasByCuentaPagarContaining
	 *
	 */
	@Transactional
	public Set<DetalleCuentas> findDetalleCuentasByCuentaPagarContaining(String cuentaPagar) throws DataAccessException {

		return findDetalleCuentasByCuentaPagarContaining(cuentaPagar, -1, -1);
	}

	/**
	 * JPQL Query - findDetalleCuentasByCuentaPagarContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<DetalleCuentas> findDetalleCuentasByCuentaPagarContaining(String cuentaPagar, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDetalleCuentasByCuentaPagarContaining", startResult, maxRows, cuentaPagar);
		return new LinkedHashSet<DetalleCuentas>(query.getResultList());
	}

	/**
	 * JPQL Query - findDetalleCuentasByNumeroContaining
	 *
	 */
	@Transactional
	public Set<DetalleCuentas> findDetalleCuentasByNumeroContaining(String numero) throws DataAccessException {

		return findDetalleCuentasByNumeroContaining(numero, -1, -1);
	}

	/**
	 * JPQL Query - findDetalleCuentasByNumeroContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<DetalleCuentas> findDetalleCuentasByNumeroContaining(String numero, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDetalleCuentasByNumeroContaining", startResult, maxRows, numero);
		return new LinkedHashSet<DetalleCuentas>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllDetalleCuentass
	 *
	 */
	@Transactional
	public Set<DetalleCuentas> findAllDetalleCuentass() throws DataAccessException {

		return findAllDetalleCuentass(-1, -1);
	}

	/**
	 * JPQL Query - findAllDetalleCuentass
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<DetalleCuentas> findAllDetalleCuentass(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllDetalleCuentass", startResult, maxRows);
		return new LinkedHashSet<DetalleCuentas>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(DetalleCuentas entity) {
		return true;
	}
}

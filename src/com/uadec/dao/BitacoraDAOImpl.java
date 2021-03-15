
package com.uadec.dao;

import com.uadec.domain.Bitacora;

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
 * DAO to manage Bitacora entities.
 * 
 */
@Repository("BitacoraDAO")

@Transactional
public class BitacoraDAOImpl extends AbstractJpaDao<Bitacora> implements BitacoraDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Bitacora.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql
	 *
	 */
	@PersistenceContext(unitName = "mysql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new BitacoraDAOImpl
	 *
	 */
	public BitacoraDAOImpl() {
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
	 * JPQL Query - findBitacoraByModuloContaining
	 *
	 */
	@Transactional
	public Set<Bitacora> findBitacoraByModuloContaining(String modulo) throws DataAccessException {

		return findBitacoraByModuloContaining(modulo, -1, -1);
	}

	/**
	 * JPQL Query - findBitacoraByModuloContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bitacora> findBitacoraByModuloContaining(String modulo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBitacoraByModuloContaining", startResult, maxRows, modulo);
		return new LinkedHashSet<Bitacora>(query.getResultList());
	}

	/**
	 * JPQL Query - findBitacoraByIdUsuario
	 *
	 */
	@Transactional
	public Set<Bitacora> findBitacoraByIdUsuario(Integer idUsuario) throws DataAccessException {

		return findBitacoraByIdUsuario(idUsuario, -1, -1);
	}

	/**
	 * JPQL Query - findBitacoraByIdUsuario
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bitacora> findBitacoraByIdUsuario(Integer idUsuario, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBitacoraByIdUsuario", startResult, maxRows, idUsuario);
		return new LinkedHashSet<Bitacora>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllBitacoras
	 *
	 */
	@Transactional
	public Set<Bitacora> findAllBitacoras() throws DataAccessException {

		return findAllBitacoras(-1, -1);
	}

	/**
	 * JPQL Query - findAllBitacoras
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bitacora> findAllBitacoras(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllBitacoras", startResult, maxRows);
		return new LinkedHashSet<Bitacora>(query.getResultList());
	}

	/**
	 * JPQL Query - findBitacoraByDetalleContaining
	 *
	 */
	@Transactional
	public Set<Bitacora> findBitacoraByDetalleContaining(String detalle) throws DataAccessException {

		return findBitacoraByDetalleContaining(detalle, -1, -1);
	}

	/**
	 * JPQL Query - findBitacoraByDetalleContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bitacora> findBitacoraByDetalleContaining(String detalle, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBitacoraByDetalleContaining", startResult, maxRows, detalle);
		return new LinkedHashSet<Bitacora>(query.getResultList());
	}

	/**
	 * JPQL Query - findBitacoraByIpContaining
	 *
	 */
	@Transactional
	public Set<Bitacora> findBitacoraByIpContaining(String ip) throws DataAccessException {

		return findBitacoraByIpContaining(ip, -1, -1);
	}

	/**
	 * JPQL Query - findBitacoraByIpContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bitacora> findBitacoraByIpContaining(String ip, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBitacoraByIpContaining", startResult, maxRows, ip);
		return new LinkedHashSet<Bitacora>(query.getResultList());
	}

	/**
	 * JPQL Query - findBitacoraByFechaHora
	 *
	 */
	@Transactional
	public Set<Bitacora> findBitacoraByFechaHora(java.util.Calendar fechaHora) throws DataAccessException {

		return findBitacoraByFechaHora(fechaHora, -1, -1);
	}

	/**
	 * JPQL Query - findBitacoraByFechaHora
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bitacora> findBitacoraByFechaHora(java.util.Calendar fechaHora, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBitacoraByFechaHora", startResult, maxRows, fechaHora);
		return new LinkedHashSet<Bitacora>(query.getResultList());
	}

	/**
	 * JPQL Query - findBitacoraByIdBitacora
	 *
	 */
	@Transactional
	public Bitacora findBitacoraByIdBitacora(Integer idBitacora) throws DataAccessException {

		return findBitacoraByIdBitacora(idBitacora, -1, -1);
	}

	/**
	 * JPQL Query - findBitacoraByIdBitacora
	 *
	 */

	@Transactional
	public Bitacora findBitacoraByIdBitacora(Integer idBitacora, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findBitacoraByIdBitacora", startResult, maxRows, idBitacora);
			return (com.uadec.domain.Bitacora) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findBitacoraByModulo
	 *
	 */
	@Transactional
	public Set<Bitacora> findBitacoraByModulo(String modulo) throws DataAccessException {

		return findBitacoraByModulo(modulo, -1, -1);
	}

	/**
	 * JPQL Query - findBitacoraByModulo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bitacora> findBitacoraByModulo(String modulo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBitacoraByModulo", startResult, maxRows, modulo);
		return new LinkedHashSet<Bitacora>(query.getResultList());
	}

	/**
	 * JPQL Query - findBitacoraByAccion
	 *
	 */
	@Transactional
	public Set<Bitacora> findBitacoraByAccion(String accion) throws DataAccessException {

		return findBitacoraByAccion(accion, -1, -1);
	}

	/**
	 * JPQL Query - findBitacoraByAccion
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bitacora> findBitacoraByAccion(String accion, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBitacoraByAccion", startResult, maxRows, accion);
		return new LinkedHashSet<Bitacora>(query.getResultList());
	}

	/**
	 * JPQL Query - findBitacoraByAccionContaining
	 *
	 */
	@Transactional
	public Set<Bitacora> findBitacoraByAccionContaining(String accion) throws DataAccessException {

		return findBitacoraByAccionContaining(accion, -1, -1);
	}

	/**
	 * JPQL Query - findBitacoraByAccionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bitacora> findBitacoraByAccionContaining(String accion, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBitacoraByAccionContaining", startResult, maxRows, accion);
		return new LinkedHashSet<Bitacora>(query.getResultList());
	}

	/**
	 * JPQL Query - findBitacoraByPrimaryKey
	 *
	 */
	@Transactional
	public Bitacora findBitacoraByPrimaryKey(Integer idBitacora) throws DataAccessException {

		return findBitacoraByPrimaryKey(idBitacora, -1, -1);
	}

	/**
	 * JPQL Query - findBitacoraByPrimaryKey
	 *
	 */

	@Transactional
	public Bitacora findBitacoraByPrimaryKey(Integer idBitacora, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findBitacoraByPrimaryKey", startResult, maxRows, idBitacora);
			return (com.uadec.domain.Bitacora) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findBitacoraByDetalle
	 *
	 */
	@Transactional
	public Set<Bitacora> findBitacoraByDetalle(String detalle) throws DataAccessException {

		return findBitacoraByDetalle(detalle, -1, -1);
	}

	/**
	 * JPQL Query - findBitacoraByDetalle
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bitacora> findBitacoraByDetalle(String detalle, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBitacoraByDetalle", startResult, maxRows, detalle);
		return new LinkedHashSet<Bitacora>(query.getResultList());
	}

	/**
	 * JPQL Query - findBitacoraByIp
	 *
	 */
	@Transactional
	public Set<Bitacora> findBitacoraByIp(String ip) throws DataAccessException {

		return findBitacoraByIp(ip, -1, -1);
	}

	/**
	 * JPQL Query - findBitacoraByIp
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bitacora> findBitacoraByIp(String ip, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBitacoraByIp", startResult, maxRows, ip);
		return new LinkedHashSet<Bitacora>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Bitacora entity) {
		return true;
	}
}

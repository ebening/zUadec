
package com.uadec.dao;

import com.uadec.domain.Usuario;

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
 * DAO to manage Usuario entities.
 * 
 */
@Repository("UsuarioDAO")

@Transactional
public class UsuarioDAOImpl extends AbstractJpaDao<Usuario> implements UsuarioDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Usuario.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql
	 *
	 */
	@PersistenceContext(unitName = "mysql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new UsuarioDAOImpl
	 *
	 */
	public UsuarioDAOImpl() {
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
	 * JPQL Query - findUsuarioByNombre
	 *
	 */
	@Transactional
	public Set<Usuario> findUsuarioByNombre(String nombre) throws DataAccessException {

		return findUsuarioByNombre(nombre, -1, -1);
	}

	/**
	 * JPQL Query - findUsuarioByNombre
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Usuario> findUsuarioByNombre(String nombre, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsuarioByNombre", startResult, maxRows, nombre);
		return new LinkedHashSet<Usuario>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsuarioByApellidoPaterno
	 *
	 */
	@Transactional
	public Set<Usuario> findUsuarioByApellidoPaterno(String apellidoPaterno) throws DataAccessException {

		return findUsuarioByApellidoPaterno(apellidoPaterno, -1, -1);
	}

	/**
	 * JPQL Query - findUsuarioByApellidoPaterno
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Usuario> findUsuarioByApellidoPaterno(String apellidoPaterno, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsuarioByApellidoPaterno", startResult, maxRows, apellidoPaterno);
		return new LinkedHashSet<Usuario>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsuarioByLogin
	 *
	 */
	@Transactional
	public Set<Usuario> findUsuarioByLogin(String login) throws DataAccessException {

		return findUsuarioByLogin(login, -1, -1);
	}

	/**
	 * JPQL Query - findUsuarioByLogin
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Usuario> findUsuarioByLogin(String login, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsuarioByLogin", startResult, maxRows, login);
		return new LinkedHashSet<Usuario>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsuarioByIdUsuario
	 *
	 */
	@Transactional
	public Usuario findUsuarioByIdUsuario(Integer idUsuario) throws DataAccessException {

		return findUsuarioByIdUsuario(idUsuario, -1, -1);
	}

	/**
	 * JPQL Query - findUsuarioByIdUsuario
	 *
	 */

	@Transactional
	public Usuario findUsuarioByIdUsuario(Integer idUsuario, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUsuarioByIdUsuario", startResult, maxRows, idUsuario);
			return (com.uadec.domain.Usuario) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findUsuarioByPrimaryKey
	 *
	 */
	@Transactional
	public Usuario findUsuarioByPrimaryKey(Integer idUsuario) throws DataAccessException {

		return findUsuarioByPrimaryKey(idUsuario, -1, -1);
	}

	/**
	 * JPQL Query - findUsuarioByPrimaryKey
	 *
	 */

	@Transactional
	public Usuario findUsuarioByPrimaryKey(Integer idUsuario, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUsuarioByPrimaryKey", startResult, maxRows, idUsuario);
			return (com.uadec.domain.Usuario) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findUsuarioByApellidoMaternoContaining
	 *
	 */
	@Transactional
	public Set<Usuario> findUsuarioByApellidoMaternoContaining(String apellidoMaterno) throws DataAccessException {

		return findUsuarioByApellidoMaternoContaining(apellidoMaterno, -1, -1);
	}

	/**
	 * JPQL Query - findUsuarioByApellidoMaternoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Usuario> findUsuarioByApellidoMaternoContaining(String apellidoMaterno, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsuarioByApellidoMaternoContaining", startResult, maxRows, apellidoMaterno);
		return new LinkedHashSet<Usuario>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsuarioByPassword
	 *
	 */
	@Transactional
	public Set<Usuario> findUsuarioByPassword(String password) throws DataAccessException {

		return findUsuarioByPassword(password, -1, -1);
	}

	/**
	 * JPQL Query - findUsuarioByPassword
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Usuario> findUsuarioByPassword(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsuarioByPassword", startResult, maxRows, password);
		return new LinkedHashSet<Usuario>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsuarioByIdRol
	 *
	 */
	@Transactional
	public Set<Usuario> findUsuarioByIdRol(Integer idRol) throws DataAccessException {

		return findUsuarioByIdRol(idRol, -1, -1);
	}

	/**
	 * JPQL Query - findUsuarioByIdRol
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Usuario> findUsuarioByIdRol(Integer idRol, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsuarioByIdRol", startResult, maxRows, idRol);
		return new LinkedHashSet<Usuario>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsuarioByNombreContaining
	 *
	 */
	@Transactional
	public Set<Usuario> findUsuarioByNombreContaining(String nombre) throws DataAccessException {

		return findUsuarioByNombreContaining(nombre, -1, -1);
	}

	/**
	 * JPQL Query - findUsuarioByNombreContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Usuario> findUsuarioByNombreContaining(String nombre, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsuarioByNombreContaining", startResult, maxRows, nombre);
		return new LinkedHashSet<Usuario>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsuarioByApellidoPaternoContaining
	 *
	 */
	@Transactional
	public Set<Usuario> findUsuarioByApellidoPaternoContaining(String apellidoPaterno) throws DataAccessException {

		return findUsuarioByApellidoPaternoContaining(apellidoPaterno, -1, -1);
	}

	/**
	 * JPQL Query - findUsuarioByApellidoPaternoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Usuario> findUsuarioByApellidoPaternoContaining(String apellidoPaterno, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsuarioByApellidoPaternoContaining", startResult, maxRows, apellidoPaterno);
		return new LinkedHashSet<Usuario>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsuarioByPasswordContaining
	 *
	 */
	@Transactional
	public Set<Usuario> findUsuarioByPasswordContaining(String password) throws DataAccessException {

		return findUsuarioByPasswordContaining(password, -1, -1);
	}

	/**
	 * JPQL Query - findUsuarioByPasswordContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Usuario> findUsuarioByPasswordContaining(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsuarioByPasswordContaining", startResult, maxRows, password);
		return new LinkedHashSet<Usuario>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllUsuarios
	 *
	 */
	@Transactional
	public Set<Usuario> findAllUsuarios() throws DataAccessException {

		return findAllUsuarios(-1, -1);
	}

	/**
	 * JPQL Query - findAllUsuarios
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Usuario> findAllUsuarios(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllUsuarios", startResult, maxRows);
		return new LinkedHashSet<Usuario>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsuarioByLoginContaining
	 *
	 */
	@Transactional
	public Set<Usuario> findUsuarioByLoginContaining(String login) throws DataAccessException {

		return findUsuarioByLoginContaining(login, -1, -1);
	}

	/**
	 * JPQL Query - findUsuarioByLoginContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Usuario> findUsuarioByLoginContaining(String login, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsuarioByLoginContaining", startResult, maxRows, login);
		return new LinkedHashSet<Usuario>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsuarioByApellidoMaterno
	 *
	 */
	@Transactional
	public Set<Usuario> findUsuarioByApellidoMaterno(String apellidoMaterno) throws DataAccessException {

		return findUsuarioByApellidoMaterno(apellidoMaterno, -1, -1);
	}

	/**
	 * JPQL Query - findUsuarioByApellidoMaterno
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Usuario> findUsuarioByApellidoMaterno(String apellidoMaterno, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsuarioByApellidoMaterno", startResult, maxRows, apellidoMaterno);
		return new LinkedHashSet<Usuario>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Usuario entity) {
		return true;
	}
}

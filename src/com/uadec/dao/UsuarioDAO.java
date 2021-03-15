
package com.uadec.dao;

import com.uadec.domain.Usuario;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Usuario entities.
 * 
 */
public interface UsuarioDAO extends JpaDao<Usuario> {

	/**
	 * JPQL Query - findUsuarioByNombre
	 *
	 */
	public Set<Usuario> findUsuarioByNombre(String nombre) throws DataAccessException;

	/**
	 * JPQL Query - findUsuarioByNombre
	 *
	 */
	public Set<Usuario> findUsuarioByNombre(String nombre, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsuarioByApellidoPaterno
	 *
	 */
	public Set<Usuario> findUsuarioByApellidoPaterno(String apellidoPaterno) throws DataAccessException;

	/**
	 * JPQL Query - findUsuarioByApellidoPaterno
	 *
	 */
	public Set<Usuario> findUsuarioByApellidoPaterno(String apellidoPaterno, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsuarioByLogin
	 *
	 */
	public Set<Usuario> findUsuarioByLogin(String login) throws DataAccessException;

	/**
	 * JPQL Query - findUsuarioByLogin
	 *
	 */
	public Set<Usuario> findUsuarioByLogin(String login, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsuarioByIdUsuario
	 *
	 */
	public Usuario findUsuarioByIdUsuario(Integer idUsuario) throws DataAccessException;

	/**
	 * JPQL Query - findUsuarioByIdUsuario
	 *
	 */
	public Usuario findUsuarioByIdUsuario(Integer idUsuario, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsuarioByPrimaryKey
	 *
	 */
	public Usuario findUsuarioByPrimaryKey(Integer idUsuario_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsuarioByPrimaryKey
	 *
	 */
	public Usuario findUsuarioByPrimaryKey(Integer idUsuario_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsuarioByApellidoMaternoContaining
	 *
	 */
	public Set<Usuario> findUsuarioByApellidoMaternoContaining(String apellidoMaterno) throws DataAccessException;

	/**
	 * JPQL Query - findUsuarioByApellidoMaternoContaining
	 *
	 */
	public Set<Usuario> findUsuarioByApellidoMaternoContaining(String apellidoMaterno, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsuarioByPassword
	 *
	 */
	public Set<Usuario> findUsuarioByPassword(String password) throws DataAccessException;

	/**
	 * JPQL Query - findUsuarioByPassword
	 *
	 */
	public Set<Usuario> findUsuarioByPassword(String password, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsuarioByIdRol
	 *
	 */
	public Set<Usuario> findUsuarioByIdRol(Integer idRol) throws DataAccessException;

	/**
	 * JPQL Query - findUsuarioByIdRol
	 *
	 */
	public Set<Usuario> findUsuarioByIdRol(Integer idRol, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsuarioByNombreContaining
	 *
	 */
	public Set<Usuario> findUsuarioByNombreContaining(String nombre_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsuarioByNombreContaining
	 *
	 */
	public Set<Usuario> findUsuarioByNombreContaining(String nombre_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsuarioByApellidoPaternoContaining
	 *
	 */
	public Set<Usuario> findUsuarioByApellidoPaternoContaining(String apellidoPaterno_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsuarioByApellidoPaternoContaining
	 *
	 */
	public Set<Usuario> findUsuarioByApellidoPaternoContaining(String apellidoPaterno_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsuarioByPasswordContaining
	 *
	 */
	public Set<Usuario> findUsuarioByPasswordContaining(String password_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsuarioByPasswordContaining
	 *
	 */
	public Set<Usuario> findUsuarioByPasswordContaining(String password_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllUsuarios
	 *
	 */
	public Set<Usuario> findAllUsuarios() throws DataAccessException;

	/**
	 * JPQL Query - findAllUsuarios
	 *
	 */
	public Set<Usuario> findAllUsuarios(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsuarioByLoginContaining
	 *
	 */
	public Set<Usuario> findUsuarioByLoginContaining(String login_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsuarioByLoginContaining
	 *
	 */
	public Set<Usuario> findUsuarioByLoginContaining(String login_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsuarioByApellidoMaterno
	 *
	 */
	public Set<Usuario> findUsuarioByApellidoMaterno(String apellidoMaterno_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsuarioByApellidoMaterno
	 *
	 */
	public Set<Usuario> findUsuarioByApellidoMaterno(String apellidoMaterno_1, int startResult, int maxRows) throws DataAccessException;

}
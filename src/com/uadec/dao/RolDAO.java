
package com.uadec.dao;

import com.uadec.domain.Rol;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Rol entities.
 * 
 */
public interface RolDAO extends JpaDao<Rol> {

	/**
	 * JPQL Query - findRolByNombreRol
	 *
	 */
	public Set<Rol> findRolByNombreRol(String nombreRol) throws DataAccessException;

	/**
	 * JPQL Query - findRolByNombreRol
	 *
	 */
	public Set<Rol> findRolByNombreRol(String nombreRol, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRols
	 *
	 */
	public Set<Rol> findAllRols() throws DataAccessException;

	/**
	 * JPQL Query - findAllRols
	 *
	 */
	public Set<Rol> findAllRols(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRolByNombreRolContaining
	 *
	 */
	public Set<Rol> findRolByNombreRolContaining(String nombreRol_1) throws DataAccessException;

	/**
	 * JPQL Query - findRolByNombreRolContaining
	 *
	 */
	public Set<Rol> findRolByNombreRolContaining(String nombreRol_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRolByIdRol
	 *
	 */
	public Rol findRolByIdRol(Integer idRol) throws DataAccessException;

	/**
	 * JPQL Query - findRolByIdRol
	 *
	 */
	public Rol findRolByIdRol(Integer idRol, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRolByPrimaryKey
	 *
	 */
	public Rol findRolByPrimaryKey(Integer idRol_1) throws DataAccessException;

	/**
	 * JPQL Query - findRolByPrimaryKey
	 *
	 */
	public Rol findRolByPrimaryKey(Integer idRol_1, int startResult, int maxRows) throws DataAccessException;

}
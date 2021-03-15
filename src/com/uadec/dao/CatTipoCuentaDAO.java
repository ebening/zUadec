
package com.uadec.dao;

import com.uadec.domain.CatTipoCuenta;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage CatTipoCuenta entities.
 * 
 */
public interface CatTipoCuentaDAO extends JpaDao<CatTipoCuenta> {

	/**
	 * JPQL Query - findAllCatTipoCuentas
	 *
	 */
	public Set<CatTipoCuenta> findAllCatTipoCuentas() throws DataAccessException;

	/**
	 * JPQL Query - findAllCatTipoCuentas
	 *
	 */
	public Set<CatTipoCuenta> findAllCatTipoCuentas(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCatTipoCuentaByIdTipoCuenta
	 *
	 */
	public CatTipoCuenta findCatTipoCuentaByIdTipoCuenta(Integer idTipoCuenta) throws DataAccessException;

	/**
	 * JPQL Query - findCatTipoCuentaByIdTipoCuenta
	 *
	 */
	public CatTipoCuenta findCatTipoCuentaByIdTipoCuenta(Integer idTipoCuenta, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCatTipoCuentaByDescripcion
	 *
	 */
	public Set<CatTipoCuenta> findCatTipoCuentaByDescripcion(String descripcion) throws DataAccessException;

	/**
	 * JPQL Query - findCatTipoCuentaByDescripcion
	 *
	 */
	public Set<CatTipoCuenta> findCatTipoCuentaByDescripcion(String descripcion, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCatTipoCuentaByDescripcionContaining
	 *
	 */
	public Set<CatTipoCuenta> findCatTipoCuentaByDescripcionContaining(String descripcion_1) throws DataAccessException;

	/**
	 * JPQL Query - findCatTipoCuentaByDescripcionContaining
	 *
	 */
	public Set<CatTipoCuenta> findCatTipoCuentaByDescripcionContaining(String descripcion_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCatTipoCuentaByPrimaryKey
	 *
	 */
	public CatTipoCuenta findCatTipoCuentaByPrimaryKey(Integer idTipoCuenta_1) throws DataAccessException;

	/**
	 * JPQL Query - findCatTipoCuentaByPrimaryKey
	 *
	 */
	public CatTipoCuenta findCatTipoCuentaByPrimaryKey(Integer idTipoCuenta_1, int startResult, int maxRows) throws DataAccessException;

}
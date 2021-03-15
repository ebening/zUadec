
package com.uadec.dao;

import com.uadec.domain.DetalleCuentas;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage DetalleCuentas entities.
 * 
 */
public interface DetalleCuentasDAO extends JpaDao<DetalleCuentas> {

	/**
	 * JPQL Query - findDetalleCuentasByCiclo
	 *
	 */
	public Set<DetalleCuentas> findDetalleCuentasByCiclo(String ciclo) throws DataAccessException;

	/**
	 * JPQL Query - findDetalleCuentasByCiclo
	 *
	 */
	public Set<DetalleCuentas> findDetalleCuentasByCiclo(String ciclo, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDetalleCuentasByIdTipoCuenta
	 *
	 */
	public Set<DetalleCuentas> findDetalleCuentasByIdTipoCuenta(Integer idTipoCuenta) throws DataAccessException;

	/**
	 * JPQL Query - findDetalleCuentasByIdTipoCuenta
	 *
	 */
	public Set<DetalleCuentas> findDetalleCuentasByIdTipoCuenta(Integer idTipoCuenta, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDetalleCuentasByCicloContaining
	 *
	 */
	public Set<DetalleCuentas> findDetalleCuentasByCicloContaining(String ciclo_1) throws DataAccessException;

	/**
	 * JPQL Query - findDetalleCuentasByCicloContaining
	 *
	 */
	public Set<DetalleCuentas> findDetalleCuentasByCicloContaining(String ciclo_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDetalleCuentasByNumero
	 *
	 */
	public Set<DetalleCuentas> findDetalleCuentasByNumero(String numero) throws DataAccessException;

	/**
	 * JPQL Query - findDetalleCuentasByNumero
	 *
	 */
	public Set<DetalleCuentas> findDetalleCuentasByNumero(String numero, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDetalleCuentasByCuentaPagar
	 *
	 */
	public Set<DetalleCuentas> findDetalleCuentasByCuentaPagar(String cuentaPagar) throws DataAccessException;

	/**
	 * JPQL Query - findDetalleCuentasByCuentaPagar
	 *
	 */
	public Set<DetalleCuentas> findDetalleCuentasByCuentaPagar(String cuentaPagar, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDetalleCuentasByPrimaryKey
	 *
	 */
	public DetalleCuentas findDetalleCuentasByPrimaryKey(Integer idDetalleCuentas) throws DataAccessException;

	/**
	 * JPQL Query - findDetalleCuentasByPrimaryKey
	 *
	 */
	public DetalleCuentas findDetalleCuentasByPrimaryKey(Integer idDetalleCuentas, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDetalleCuentasByIdDetalleCuentas
	 *
	 */
	public DetalleCuentas findDetalleCuentasByIdDetalleCuentas(Integer idDetalleCuentas_1) throws DataAccessException;

	/**
	 * JPQL Query - findDetalleCuentasByIdDetalleCuentas
	 *
	 */
	public DetalleCuentas findDetalleCuentasByIdDetalleCuentas(Integer idDetalleCuentas_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDetalleCuentasByCuentaPagarContaining
	 *
	 */
	public Set<DetalleCuentas> findDetalleCuentasByCuentaPagarContaining(String cuentaPagar_1) throws DataAccessException;

	/**
	 * JPQL Query - findDetalleCuentasByCuentaPagarContaining
	 *
	 */
	public Set<DetalleCuentas> findDetalleCuentasByCuentaPagarContaining(String cuentaPagar_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDetalleCuentasByNumeroContaining
	 *
	 */
	public Set<DetalleCuentas> findDetalleCuentasByNumeroContaining(String numero_1) throws DataAccessException;

	/**
	 * JPQL Query - findDetalleCuentasByNumeroContaining
	 *
	 */
	public Set<DetalleCuentas> findDetalleCuentasByNumeroContaining(String numero_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllDetalleCuentass
	 *
	 */
	public Set<DetalleCuentas> findAllDetalleCuentass() throws DataAccessException;

	/**
	 * JPQL Query - findAllDetalleCuentass
	 *
	 */
	public Set<DetalleCuentas> findAllDetalleCuentass(int startResult, int maxRows) throws DataAccessException;

}
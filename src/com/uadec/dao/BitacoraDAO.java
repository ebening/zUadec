
package com.uadec.dao;

import com.uadec.domain.Bitacora;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Bitacora entities.
 * 
 */
public interface BitacoraDAO extends JpaDao<Bitacora> {

	/**
	 * JPQL Query - findBitacoraByModuloContaining
	 *
	 */
	public Set<Bitacora> findBitacoraByModuloContaining(String modulo) throws DataAccessException;

	/**
	 * JPQL Query - findBitacoraByModuloContaining
	 *
	 */
	public Set<Bitacora> findBitacoraByModuloContaining(String modulo, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBitacoraByIdUsuario
	 *
	 */
	public Set<Bitacora> findBitacoraByIdUsuario(Integer idUsuario) throws DataAccessException;

	/**
	 * JPQL Query - findBitacoraByIdUsuario
	 *
	 */
	public Set<Bitacora> findBitacoraByIdUsuario(Integer idUsuario, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllBitacoras
	 *
	 */
	public Set<Bitacora> findAllBitacoras() throws DataAccessException;

	/**
	 * JPQL Query - findAllBitacoras
	 *
	 */
	public Set<Bitacora> findAllBitacoras(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBitacoraByDetalleContaining
	 *
	 */
	public Set<Bitacora> findBitacoraByDetalleContaining(String detalle) throws DataAccessException;

	/**
	 * JPQL Query - findBitacoraByDetalleContaining
	 *
	 */
	public Set<Bitacora> findBitacoraByDetalleContaining(String detalle, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBitacoraByIpContaining
	 *
	 */
	public Set<Bitacora> findBitacoraByIpContaining(String ip) throws DataAccessException;

	/**
	 * JPQL Query - findBitacoraByIpContaining
	 *
	 */
	public Set<Bitacora> findBitacoraByIpContaining(String ip, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBitacoraByFechaHora
	 *
	 */
	public Set<Bitacora> findBitacoraByFechaHora(java.util.Calendar fechaHora) throws DataAccessException;

	/**
	 * JPQL Query - findBitacoraByFechaHora
	 *
	 */
	public Set<Bitacora> findBitacoraByFechaHora(Calendar fechaHora, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBitacoraByIdBitacora
	 *
	 */
	public Bitacora findBitacoraByIdBitacora(Integer idBitacora) throws DataAccessException;

	/**
	 * JPQL Query - findBitacoraByIdBitacora
	 *
	 */
	public Bitacora findBitacoraByIdBitacora(Integer idBitacora, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBitacoraByModulo
	 *
	 */
	public Set<Bitacora> findBitacoraByModulo(String modulo_1) throws DataAccessException;

	/**
	 * JPQL Query - findBitacoraByModulo
	 *
	 */
	public Set<Bitacora> findBitacoraByModulo(String modulo_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBitacoraByAccion
	 *
	 */
	public Set<Bitacora> findBitacoraByAccion(String accion) throws DataAccessException;

	/**
	 * JPQL Query - findBitacoraByAccion
	 *
	 */
	public Set<Bitacora> findBitacoraByAccion(String accion, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBitacoraByAccionContaining
	 *
	 */
	public Set<Bitacora> findBitacoraByAccionContaining(String accion_1) throws DataAccessException;

	/**
	 * JPQL Query - findBitacoraByAccionContaining
	 *
	 */
	public Set<Bitacora> findBitacoraByAccionContaining(String accion_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBitacoraByPrimaryKey
	 *
	 */
	public Bitacora findBitacoraByPrimaryKey(Integer idBitacora_1) throws DataAccessException;

	/**
	 * JPQL Query - findBitacoraByPrimaryKey
	 *
	 */
	public Bitacora findBitacoraByPrimaryKey(Integer idBitacora_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBitacoraByDetalle
	 *
	 */
	public Set<Bitacora> findBitacoraByDetalle(String detalle_1) throws DataAccessException;

	/**
	 * JPQL Query - findBitacoraByDetalle
	 *
	 */
	public Set<Bitacora> findBitacoraByDetalle(String detalle_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBitacoraByIp
	 *
	 */
	public Set<Bitacora> findBitacoraByIp(String ip_1) throws DataAccessException;

	/**
	 * JPQL Query - findBitacoraByIp
	 *
	 */
	public Set<Bitacora> findBitacoraByIp(String ip_1, int startResult, int maxRows) throws DataAccessException;

}
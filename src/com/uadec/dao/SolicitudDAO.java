
package com.uadec.dao;

import com.uadec.domain.Solicitud;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Solicitud entities.
 * 
 */
public interface SolicitudDAO extends JpaDao<Solicitud> {

	/**
	 * JPQL Query - findSolicitudByUnidadOrgContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByUnidadOrgContaining(String unidadOrg) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByUnidadOrgContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByUnidadOrgContaining(String unidadOrg, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByClaveBeneficiarioContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByClaveBeneficiarioContaining(String claveBeneficiario) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByClaveBeneficiarioContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByClaveBeneficiarioContaining(String claveBeneficiario, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByFolioSdr
	 *
	 */
	public Set<Solicitud> findSolicitudByFolioSdr(String folioSdr) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByFolioSdr
	 *
	 */
	public Set<Solicitud> findSolicitudByFolioSdr(String folioSdr, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByAutorizadorContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByAutorizadorContaining(String autorizador) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByAutorizadorContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByAutorizadorContaining(String autorizador, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByRfcProveedorContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByRfcProveedorContaining(String rfcProveedor) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByRfcProveedorContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByRfcProveedorContaining(String rfcProveedor, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByFolioVentanilla
	 *
	 */
	public Set<Solicitud> findSolicitudByFolioVentanilla(String folioVentanilla) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByFolioVentanilla
	 *
	 */
	public Set<Solicitud> findSolicitudByFolioVentanilla(String folioVentanilla, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByNCompromisoContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByNCompromisoContaining(String NCompromiso) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByNCompromisoContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByNCompromisoContaining(String NCompromiso, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByChequeContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByChequeContaining(String cheque) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByChequeContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByChequeContaining(String cheque, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByNCbancariaContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByNCbancariaContaining(String NCbancaria) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByNCbancariaContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByNCbancariaContaining(String NCbancaria, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByPrimaryKey
	 *
	 */
	public Solicitud findSolicitudByPrimaryKey(Integer idSolicitud) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByPrimaryKey
	 *
	 */
	public Solicitud findSolicitudByPrimaryKey(Integer idSolicitud, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllSolicituds
	 *
	 */
	public Set<Solicitud> findAllSolicituds() throws DataAccessException;

	/**
	 * JPQL Query - findAllSolicituds
	 *
	 */
	public Set<Solicitud> findAllSolicituds(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByContrato
	 *
	 */
	public Set<Solicitud> findSolicitudByContrato(String contrato) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByContrato
	 *
	 */
	public Set<Solicitud> findSolicitudByContrato(String contrato, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByFechaSolicitud
	 *
	 */
	public Set<Solicitud> findSolicitudByFechaSolicitud(java.util.Calendar fechaSolicitud) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByFechaSolicitud
	 *
	 */
	public Set<Solicitud> findSolicitudByFechaSolicitud(Calendar fechaSolicitud, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByImporte
	 *
	 */
	public Set<Solicitud> findSolicitudByImporte(java.math.BigDecimal importe) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByImporte
	 *
	 */
	public Set<Solicitud> findSolicitudByImporte(BigDecimal importe, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByContratoContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByContratoContaining(String contrato_1) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByContratoContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByContratoContaining(String contrato_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByNCompromiso
	 *
	 */
	public Set<Solicitud> findSolicitudByNCompromiso(String NCompromiso_1) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByNCompromiso
	 *
	 */
	public Set<Solicitud> findSolicitudByNCompromiso(String NCompromiso_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByElaboradorContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByElaboradorContaining(String elaborador) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByElaboradorContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByElaboradorContaining(String elaborador, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByCuentaPagarContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByCuentaPagarContaining(String cuentaPagar) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByCuentaPagarContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByCuentaPagarContaining(String cuentaPagar, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByUnidadOrg
	 *
	 */
	public Set<Solicitud> findSolicitudByUnidadOrg(String unidadOrg_1) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByUnidadOrg
	 *
	 */
	public Set<Solicitud> findSolicitudByUnidadOrg(String unidadOrg_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByFondoContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByFondoContaining(String fondo) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByFondoContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByFondoContaining(String fondo, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByClaveBeneficiario
	 *
	 */
	public Set<Solicitud> findSolicitudByClaveBeneficiario(String claveBeneficiario_1) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByClaveBeneficiario
	 *
	 */
	public Set<Solicitud> findSolicitudByClaveBeneficiario(String claveBeneficiario_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByFechaSolicitudAfter
	 *
	 */
	public Set<Solicitud> findSolicitudByFechaSolicitudAfter(java.util.Calendar fechaSolicitud_1) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByFechaSolicitudAfter
	 *
	 */
	public Set<Solicitud> findSolicitudByFechaSolicitudAfter(Calendar fechaSolicitud_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByElaborador
	 *
	 */
	public Set<Solicitud> findSolicitudByElaborador(String elaborador_1) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByElaborador
	 *
	 */
	public Set<Solicitud> findSolicitudByElaborador(String elaborador_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByFechaSolicitudBefore
	 *
	 */
	public Set<Solicitud> findSolicitudByFechaSolicitudBefore(java.util.Calendar fechaSolicitud_2) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByFechaSolicitudBefore
	 *
	 */
	public Set<Solicitud> findSolicitudByFechaSolicitudBefore(Calendar fechaSolicitud_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByFolioVentanillaContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByFolioVentanillaContaining(String folioVentanilla_1) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByFolioVentanillaContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByFolioVentanillaContaining(String folioVentanilla_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByCuentaPagar
	 *
	 */
	public Set<Solicitud> findSolicitudByCuentaPagar(String cuentaPagar_1) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByCuentaPagar
	 *
	 */
	public Set<Solicitud> findSolicitudByCuentaPagar(String cuentaPagar_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByFolioSdrContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByFolioSdrContaining(String folioSdr_1) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByFolioSdrContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByFolioSdrContaining(String folioSdr_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByRfcProveedor
	 *
	 */
	public Set<Solicitud> findSolicitudByRfcProveedor(String rfcProveedor_1) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByRfcProveedor
	 *
	 */
	public Set<Solicitud> findSolicitudByRfcProveedor(String rfcProveedor_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByNCbancaria
	 *
	 */
	public Set<Solicitud> findSolicitudByNCbancaria(String NCbancaria_1) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByNCbancaria
	 *
	 */
	public Set<Solicitud> findSolicitudByNCbancaria(String NCbancaria_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByCicloContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByCicloContaining(String ciclo) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByCicloContaining
	 *
	 */
	public Set<Solicitud> findSolicitudByCicloContaining(String ciclo, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByAutorizador
	 *
	 */
	public Set<Solicitud> findSolicitudByAutorizador(String autorizador_1) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByAutorizador
	 *
	 */
	public Set<Solicitud> findSolicitudByAutorizador(String autorizador_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByIdSolicitud
	 *
	 */
	public Solicitud findSolicitudByIdSolicitud(Integer idSolicitud_1) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByIdSolicitud
	 *
	 */
	public Solicitud findSolicitudByIdSolicitud(Integer idSolicitud_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByCiclo
	 *
	 */
	public Set<Solicitud> findSolicitudByCiclo(String ciclo_1) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByCiclo
	 *
	 */
	public Set<Solicitud> findSolicitudByCiclo(String ciclo_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByFondo
	 *
	 */
	public Set<Solicitud> findSolicitudByFondo(String fondo_1) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByFondo
	 *
	 */
	public Set<Solicitud> findSolicitudByFondo(String fondo_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByCheque
	 *
	 */
	public Set<Solicitud> findSolicitudByCheque(String cheque_1) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByCheque
	 *
	 */
	public Set<Solicitud> findSolicitudByCheque(String cheque_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByIdTipoTramite
	 *
	 */
	public Set<Solicitud> findSolicitudByIdTipoTramite(Integer idTipoTramite) throws DataAccessException;

	/**
	 * JPQL Query - findSolicitudByIdTipoTramite
	 *
	 */
	public Set<Solicitud> findSolicitudByIdTipoTramite(Integer idTipoTramite, int startResult, int maxRows) throws DataAccessException;

}
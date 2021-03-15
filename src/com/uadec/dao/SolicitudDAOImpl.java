
package com.uadec.dao;

import com.uadec.domain.Solicitud;

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
 * DAO to manage Solicitud entities.
 * 
 */
@Repository("SolicitudDAO")

@Transactional
public class SolicitudDAOImpl extends AbstractJpaDao<Solicitud> implements SolicitudDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Solicitud.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql
	 *
	 */
	@PersistenceContext(unitName = "mysql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new SolicitudDAOImpl
	 *
	 */
	public SolicitudDAOImpl() {
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
	 * JPQL Query - findSolicitudByUnidadOrgContaining
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByUnidadOrgContaining(String unidadOrg) throws DataAccessException {

		return findSolicitudByUnidadOrgContaining(unidadOrg, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByUnidadOrgContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByUnidadOrgContaining(String unidadOrg, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByUnidadOrgContaining", startResult, maxRows, unidadOrg);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByClaveBeneficiarioContaining
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByClaveBeneficiarioContaining(String claveBeneficiario) throws DataAccessException {

		return findSolicitudByClaveBeneficiarioContaining(claveBeneficiario, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByClaveBeneficiarioContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByClaveBeneficiarioContaining(String claveBeneficiario, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByClaveBeneficiarioContaining", startResult, maxRows, claveBeneficiario);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByFolioSdr
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByFolioSdr(String folioSdr) throws DataAccessException {

		return findSolicitudByFolioSdr(folioSdr, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByFolioSdr
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByFolioSdr(String folioSdr, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByFolioSdr", startResult, maxRows, folioSdr);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByAutorizadorContaining
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByAutorizadorContaining(String autorizador) throws DataAccessException {

		return findSolicitudByAutorizadorContaining(autorizador, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByAutorizadorContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByAutorizadorContaining(String autorizador, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByAutorizadorContaining", startResult, maxRows, autorizador);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByRfcProveedorContaining
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByRfcProveedorContaining(String rfcProveedor) throws DataAccessException {

		return findSolicitudByRfcProveedorContaining(rfcProveedor, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByRfcProveedorContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByRfcProveedorContaining(String rfcProveedor, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByRfcProveedorContaining", startResult, maxRows, rfcProveedor);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByFolioVentanilla
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByFolioVentanilla(String folioVentanilla) throws DataAccessException {

		return findSolicitudByFolioVentanilla(folioVentanilla, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByFolioVentanilla
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByFolioVentanilla(String folioVentanilla, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByFolioVentanilla", startResult, maxRows, folioVentanilla);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByNCompromisoContaining
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByNCompromisoContaining(String NCompromiso) throws DataAccessException {

		return findSolicitudByNCompromisoContaining(NCompromiso, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByNCompromisoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByNCompromisoContaining(String NCompromiso, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByNCompromisoContaining", startResult, maxRows, NCompromiso);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByChequeContaining
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByChequeContaining(String cheque) throws DataAccessException {

		return findSolicitudByChequeContaining(cheque, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByChequeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByChequeContaining(String cheque, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByChequeContaining", startResult, maxRows, cheque);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByNCbancariaContaining
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByNCbancariaContaining(String NCbancaria) throws DataAccessException {

		return findSolicitudByNCbancariaContaining(NCbancaria, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByNCbancariaContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByNCbancariaContaining(String NCbancaria, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByNCbancariaContaining", startResult, maxRows, NCbancaria);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByPrimaryKey
	 *
	 */
	@Transactional
	public Solicitud findSolicitudByPrimaryKey(Integer idSolicitud) throws DataAccessException {

		return findSolicitudByPrimaryKey(idSolicitud, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByPrimaryKey
	 *
	 */

	@Transactional
	public Solicitud findSolicitudByPrimaryKey(Integer idSolicitud, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findSolicitudByPrimaryKey", startResult, maxRows, idSolicitud);
			return (com.uadec.domain.Solicitud) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllSolicituds
	 *
	 */
	@Transactional
	public Set<Solicitud> findAllSolicituds() throws DataAccessException {

		return findAllSolicituds(-1, -1);
	}

	/**
	 * JPQL Query - findAllSolicituds
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findAllSolicituds(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllSolicituds", startResult, maxRows);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByContrato
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByContrato(String contrato) throws DataAccessException {

		return findSolicitudByContrato(contrato, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByContrato
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByContrato(String contrato, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByContrato", startResult, maxRows, contrato);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByFechaSolicitud
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByFechaSolicitud(java.util.Calendar fechaSolicitud) throws DataAccessException {

		return findSolicitudByFechaSolicitud(fechaSolicitud, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByFechaSolicitud
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByFechaSolicitud(java.util.Calendar fechaSolicitud, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByFechaSolicitud", startResult, maxRows, fechaSolicitud);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByImporte
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByImporte(java.math.BigDecimal importe) throws DataAccessException {

		return findSolicitudByImporte(importe, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByImporte
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByImporte(java.math.BigDecimal importe, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByImporte", startResult, maxRows, importe);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByContratoContaining
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByContratoContaining(String contrato) throws DataAccessException {

		return findSolicitudByContratoContaining(contrato, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByContratoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByContratoContaining(String contrato, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByContratoContaining", startResult, maxRows, contrato);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByNCompromiso
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByNCompromiso(String NCompromiso) throws DataAccessException {

		return findSolicitudByNCompromiso(NCompromiso, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByNCompromiso
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByNCompromiso(String NCompromiso, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByNCompromiso", startResult, maxRows, NCompromiso);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByElaboradorContaining
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByElaboradorContaining(String elaborador) throws DataAccessException {

		return findSolicitudByElaboradorContaining(elaborador, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByElaboradorContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByElaboradorContaining(String elaborador, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByElaboradorContaining", startResult, maxRows, elaborador);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByCuentaPagarContaining
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByCuentaPagarContaining(String cuentaPagar) throws DataAccessException {

		return findSolicitudByCuentaPagarContaining(cuentaPagar, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByCuentaPagarContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByCuentaPagarContaining(String cuentaPagar, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByCuentaPagarContaining", startResult, maxRows, cuentaPagar);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByUnidadOrg
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByUnidadOrg(String unidadOrg) throws DataAccessException {

		return findSolicitudByUnidadOrg(unidadOrg, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByUnidadOrg
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByUnidadOrg(String unidadOrg, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByUnidadOrg", startResult, maxRows, unidadOrg);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByFondoContaining
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByFondoContaining(String fondo) throws DataAccessException {

		return findSolicitudByFondoContaining(fondo, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByFondoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByFondoContaining(String fondo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByFondoContaining", startResult, maxRows, fondo);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByClaveBeneficiario
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByClaveBeneficiario(String claveBeneficiario) throws DataAccessException {

		return findSolicitudByClaveBeneficiario(claveBeneficiario, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByClaveBeneficiario
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByClaveBeneficiario(String claveBeneficiario, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByClaveBeneficiario", startResult, maxRows, claveBeneficiario);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByFechaSolicitudAfter
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByFechaSolicitudAfter(java.util.Calendar fechaSolicitud) throws DataAccessException {

		return findSolicitudByFechaSolicitudAfter(fechaSolicitud, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByFechaSolicitudAfter
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByFechaSolicitudAfter(java.util.Calendar fechaSolicitud, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByFechaSolicitudAfter", startResult, maxRows, fechaSolicitud);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByElaborador
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByElaborador(String elaborador) throws DataAccessException {

		return findSolicitudByElaborador(elaborador, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByElaborador
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByElaborador(String elaborador, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByElaborador", startResult, maxRows, elaborador);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByFechaSolicitudBefore
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByFechaSolicitudBefore(java.util.Calendar fechaSolicitud) throws DataAccessException {

		return findSolicitudByFechaSolicitudBefore(fechaSolicitud, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByFechaSolicitudBefore
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByFechaSolicitudBefore(java.util.Calendar fechaSolicitud, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByFechaSolicitudBefore", startResult, maxRows, fechaSolicitud);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByFolioVentanillaContaining
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByFolioVentanillaContaining(String folioVentanilla) throws DataAccessException {

		return findSolicitudByFolioVentanillaContaining(folioVentanilla, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByFolioVentanillaContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByFolioVentanillaContaining(String folioVentanilla, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByFolioVentanillaContaining", startResult, maxRows, folioVentanilla);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByCuentaPagar
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByCuentaPagar(String cuentaPagar) throws DataAccessException {

		return findSolicitudByCuentaPagar(cuentaPagar, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByCuentaPagar
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByCuentaPagar(String cuentaPagar, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByCuentaPagar", startResult, maxRows, cuentaPagar);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByFolioSdrContaining
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByFolioSdrContaining(String folioSdr) throws DataAccessException {

		return findSolicitudByFolioSdrContaining(folioSdr, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByFolioSdrContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByFolioSdrContaining(String folioSdr, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByFolioSdrContaining", startResult, maxRows, folioSdr);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByRfcProveedor
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByRfcProveedor(String rfcProveedor) throws DataAccessException {

		return findSolicitudByRfcProveedor(rfcProveedor, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByRfcProveedor
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByRfcProveedor(String rfcProveedor, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByRfcProveedor", startResult, maxRows, rfcProveedor);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByNCbancaria
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByNCbancaria(String NCbancaria) throws DataAccessException {

		return findSolicitudByNCbancaria(NCbancaria, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByNCbancaria
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByNCbancaria(String NCbancaria, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByNCbancaria", startResult, maxRows, NCbancaria);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByCicloContaining
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByCicloContaining(String ciclo) throws DataAccessException {

		return findSolicitudByCicloContaining(ciclo, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByCicloContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByCicloContaining(String ciclo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByCicloContaining", startResult, maxRows, ciclo);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByAutorizador
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByAutorizador(String autorizador) throws DataAccessException {

		return findSolicitudByAutorizador(autorizador, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByAutorizador
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByAutorizador(String autorizador, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByAutorizador", startResult, maxRows, autorizador);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByIdSolicitud
	 *
	 */
	@Transactional
	public Solicitud findSolicitudByIdSolicitud(Integer idSolicitud) throws DataAccessException {

		return findSolicitudByIdSolicitud(idSolicitud, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByIdSolicitud
	 *
	 */

	@Transactional
	public Solicitud findSolicitudByIdSolicitud(Integer idSolicitud, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findSolicitudByIdSolicitud", startResult, maxRows, idSolicitud);
			return (com.uadec.domain.Solicitud) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findSolicitudByCiclo
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByCiclo(String ciclo) throws DataAccessException {

		return findSolicitudByCiclo(ciclo, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByCiclo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByCiclo(String ciclo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByCiclo", startResult, maxRows, ciclo);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByFondo
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByFondo(String fondo) throws DataAccessException {

		return findSolicitudByFondo(fondo, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByFondo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByFondo(String fondo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByFondo", startResult, maxRows, fondo);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByCheque
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByCheque(String cheque) throws DataAccessException {

		return findSolicitudByCheque(cheque, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByCheque
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByCheque(String cheque, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByCheque", startResult, maxRows, cheque);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * JPQL Query - findSolicitudByIdTipoTramite
	 *
	 */
	@Transactional
	public Set<Solicitud> findSolicitudByIdTipoTramite(Integer idTipoTramite) throws DataAccessException {

		return findSolicitudByIdTipoTramite(idTipoTramite, -1, -1);
	}

	/**
	 * JPQL Query - findSolicitudByIdTipoTramite
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Solicitud> findSolicitudByIdTipoTramite(Integer idTipoTramite, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSolicitudByIdTipoTramite", startResult, maxRows, idTipoTramite);
		return new LinkedHashSet<Solicitud>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Solicitud entity) {
		return true;
	}
}

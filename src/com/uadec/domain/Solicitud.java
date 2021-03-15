
package com.uadec.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.math.BigDecimal;

import java.util.Calendar;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllSolicituds", query = "select mySolicitud from Solicitud mySolicitud"),
		@NamedQuery(name = "findSolicitudByAutorizador", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.autorizador = ?1"),
		@NamedQuery(name = "findSolicitudByAutorizadorContaining", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.autorizador like ?1"),
		@NamedQuery(name = "findSolicitudByCheque", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.cheque = ?1"),
		@NamedQuery(name = "findSolicitudByChequeContaining", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.cheque like ?1"),
		@NamedQuery(name = "findSolicitudByCiclo", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.ciclo = ?1"),
		@NamedQuery(name = "findSolicitudByCicloContaining", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.ciclo like ?1"),
		@NamedQuery(name = "findSolicitudByClaveBeneficiario", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.claveBeneficiario = ?1"),
		@NamedQuery(name = "findSolicitudByClaveBeneficiarioContaining", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.claveBeneficiario like ?1"),
		@NamedQuery(name = "findSolicitudByContrato", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.contrato = ?1"),
		@NamedQuery(name = "findSolicitudByContratoContaining", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.contrato like ?1"),
		@NamedQuery(name = "findSolicitudByCuentaPagar", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.cuentaPagar = ?1"),
		@NamedQuery(name = "findSolicitudByCuentaPagarContaining", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.cuentaPagar like ?1"),
		@NamedQuery(name = "findSolicitudByElaborador", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.elaborador = ?1"),
		@NamedQuery(name = "findSolicitudByElaboradorContaining", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.elaborador like ?1"),
		@NamedQuery(name = "findSolicitudByFechaSolicitud", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.fechaSolicitud = ?1"),
		@NamedQuery(name = "findSolicitudByFechaSolicitudAfter", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.fechaSolicitud > ?1"),
		@NamedQuery(name = "findSolicitudByFechaSolicitudBefore", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.fechaSolicitud < ?1"),
		@NamedQuery(name = "findSolicitudByFolioSdr", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.folioSdr = ?1"),
		@NamedQuery(name = "findSolicitudByFolioSdrContaining", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.folioSdr like ?1"),
		@NamedQuery(name = "findSolicitudByFolioVentanilla", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.folioVentanilla = ?1"),
		@NamedQuery(name = "findSolicitudByFolioVentanillaContaining", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.folioVentanilla like ?1"),
		@NamedQuery(name = "findSolicitudByFondo", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.fondo = ?1"),
		@NamedQuery(name = "findSolicitudByFondoContaining", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.fondo like ?1"),
		@NamedQuery(name = "findSolicitudByIdSolicitud", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.idSolicitud = ?1"),
		@NamedQuery(name = "findSolicitudByIdTipoTramite", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.idTipoTramite = ?1"),
		@NamedQuery(name = "findSolicitudByImporte", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.importe = ?1"),
		@NamedQuery(name = "findSolicitudByNCbancaria", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.NCbancaria = ?1"),
		@NamedQuery(name = "findSolicitudByNCbancariaContaining", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.NCbancaria like ?1"),
		@NamedQuery(name = "findSolicitudByNCompromiso", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.NCompromiso = ?1"),
		@NamedQuery(name = "findSolicitudByNCompromisoContaining", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.NCompromiso like ?1"),
		@NamedQuery(name = "findSolicitudByPrimaryKey", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.idSolicitud = ?1"),
		@NamedQuery(name = "findSolicitudByRfcProveedor", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.rfcProveedor = ?1"),
		@NamedQuery(name = "findSolicitudByRfcProveedorContaining", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.rfcProveedor like ?1"),
		@NamedQuery(name = "findSolicitudByUnidadOrg", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.unidadOrg = ?1"),
		@NamedQuery(name = "findSolicitudByUnidadOrgContaining", query = "select mySolicitud from Solicitud mySolicitud where mySolicitud.unidadOrg like ?1") })

@Table(catalog = "DB2ADMIN", name = "SOLICITUD")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "zUadec/com/uadec/domain", name = "Solicitud")

public class Solicitud implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "ID_SOLICITUD", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer idSolicitud;
	/**
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "FECHA_SOLICITUD")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar fechaSolicitud;
	/**
	 */

	@Column(name = "FONDO", length = 20)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String fondo;
	/**
	 */

	@Column(name = "N_CBANCARIA", length = 20)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String NCbancaria;
	/**
	 */

	@Column(name = "UNIDAD_ORG", length = 20)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String unidadOrg;
	/**
	 */

	@Column(name = "IMPORTE", scale = 2, precision = 17)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal importe;
	/**
	 */

	@Column(name = "AUTORIZADOR", length = 100)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String autorizador;
	/**
	 */

	@Column(name = "ELABORADOR", length = 100)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String elaborador;
	/**
	 */

	@Column(name = "CONTRATO", length = 20)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String contrato;
	/**
	 */

	@Column(name = "RFC_PROVEEDOR", length = 30)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String rfcProveedor;
	/**
	 */

	@Column(name = "CHEQUE", length = 20)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String cheque;
	/**
	 */

	@Column(name = "ID_TIPO_TRAMITE", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer idTipoTramite;
	/**
	 */

	@Column(name = "CUENTA_PAGAR", length = 20, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String cuentaPagar;
	/**
	 */

	@Column(name = "CICLO", length = 4, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String ciclo;
	/**
	 */

	@Column(name = "FOLIO_VENTANILLA", length = 20)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String folioVentanilla;
	/**
	 */

	@Column(name = "FOLIO_SDR", length = 20)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String folioSdr;
	/**
	 */

	@Column(name = "N_COMPROMISO", length = 20)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String NCompromiso;
	/**
	 */

	@Column(name = "CLAVE_BENEFICIARIO", length = 20)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String claveBeneficiario;

	/**
	 */
	public void setIdSolicitud(Integer idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

	/**
	 */
	public Integer getIdSolicitud() {
		return this.idSolicitud;
	}

	/**
	 */
	public void setFechaSolicitud(Calendar fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	/**
	 */
	public Calendar getFechaSolicitud() {
		return this.fechaSolicitud;
	}

	/**
	 */
	public void setFondo(String fondo) {
		this.fondo = fondo;
	}

	/**
	 */
	public String getFondo() {
		return this.fondo;
	}

	/**
	 */
	public void setNCbancaria(String NCbancaria) {
		this.NCbancaria = NCbancaria;
	}

	/**
	 */
	public String getNCbancaria() {
		return this.NCbancaria;
	}

	/**
	 */
	public void setUnidadOrg(String unidadOrg) {
		this.unidadOrg = unidadOrg;
	}

	/**
	 */
	public String getUnidadOrg() {
		return this.unidadOrg;
	}

	/**
	 */
	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

	/**
	 */
	public BigDecimal getImporte() {
		return this.importe;
	}

	/**
	 */
	public void setAutorizador(String autorizador) {
		this.autorizador = autorizador;
	}

	/**
	 */
	public String getAutorizador() {
		return this.autorizador;
	}

	/**
	 */
	public void setElaborador(String elaborador) {
		this.elaborador = elaborador;
	}

	/**
	 */
	public String getElaborador() {
		return this.elaborador;
	}

	/**
	 */
	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	/**
	 */
	public String getContrato() {
		return this.contrato;
	}

	/**
	 */
	public void setRfcProveedor(String rfcProveedor) {
		this.rfcProveedor = rfcProveedor;
	}

	/**
	 */
	public String getRfcProveedor() {
		return this.rfcProveedor;
	}

	/**
	 */
	public void setCheque(String cheque) {
		this.cheque = cheque;
	}

	/**
	 */
	public String getCheque() {
		return this.cheque;
	}

	/**
	 */
	public void setIdTipoTramite(Integer idTipoTramite) {
		this.idTipoTramite = idTipoTramite;
	}

	/**
	 */
	public Integer getIdTipoTramite() {
		return this.idTipoTramite;
	}

	/**
	 */
	public void setCuentaPagar(String cuentaPagar) {
		this.cuentaPagar = cuentaPagar;
	}

	/**
	 */
	public String getCuentaPagar() {
		return this.cuentaPagar;
	}

	/**
	 */
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	/**
	 */
	public String getCiclo() {
		return this.ciclo;
	}

	/**
	 */
	public void setFolioVentanilla(String folioVentanilla) {
		this.folioVentanilla = folioVentanilla;
	}

	/**
	 */
	public String getFolioVentanilla() {
		return this.folioVentanilla;
	}

	/**
	 */
	public void setFolioSdr(String folioSdr) {
		this.folioSdr = folioSdr;
	}

	/**
	 */
	public String getFolioSdr() {
		return this.folioSdr;
	}

	/**
	 */
	public void setNCompromiso(String NCompromiso) {
		this.NCompromiso = NCompromiso;
	}

	/**
	 */
	public String getNCompromiso() {
		return this.NCompromiso;
	}

	/**
	 */
	public void setClaveBeneficiario(String claveBeneficiario) {
		this.claveBeneficiario = claveBeneficiario;
	}

	/**
	 */
	public String getClaveBeneficiario() {
		return this.claveBeneficiario;
	}

	/**
	 */
	public Solicitud() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Solicitud that) {
		setIdSolicitud(that.getIdSolicitud());
		setFechaSolicitud(that.getFechaSolicitud());
		setFondo(that.getFondo());
		setNCbancaria(that.getNCbancaria());
		setUnidadOrg(that.getUnidadOrg());
		setImporte(that.getImporte());
		setAutorizador(that.getAutorizador());
		setElaborador(that.getElaborador());
		setContrato(that.getContrato());
		setRfcProveedor(that.getRfcProveedor());
		setCheque(that.getCheque());
		setIdTipoTramite(that.getIdTipoTramite());
		setCuentaPagar(that.getCuentaPagar());
		setCiclo(that.getCiclo());
		setFolioVentanilla(that.getFolioVentanilla());
		setFolioSdr(that.getFolioSdr());
		setNCompromiso(that.getNCompromiso());
		setClaveBeneficiario(that.getClaveBeneficiario());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("idSolicitud=[").append(idSolicitud).append("] ");
		buffer.append("fechaSolicitud=[").append(fechaSolicitud).append("] ");
		buffer.append("fondo=[").append(fondo).append("] ");
		buffer.append("NCbancaria=[").append(NCbancaria).append("] ");
		buffer.append("unidadOrg=[").append(unidadOrg).append("] ");
		buffer.append("importe=[").append(importe).append("] ");
		buffer.append("autorizador=[").append(autorizador).append("] ");
		buffer.append("elaborador=[").append(elaborador).append("] ");
		buffer.append("contrato=[").append(contrato).append("] ");
		buffer.append("rfcProveedor=[").append(rfcProveedor).append("] ");
		buffer.append("cheque=[").append(cheque).append("] ");
		buffer.append("idTipoTramite=[").append(idTipoTramite).append("] ");
		buffer.append("cuentaPagar=[").append(cuentaPagar).append("] ");
		buffer.append("ciclo=[").append(ciclo).append("] ");
		buffer.append("folioVentanilla=[").append(folioVentanilla).append("] ");
		buffer.append("folioSdr=[").append(folioSdr).append("] ");
		buffer.append("NCompromiso=[").append(NCompromiso).append("] ");
		buffer.append("claveBeneficiario=[").append(claveBeneficiario).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((idSolicitud == null) ? 0 : idSolicitud.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Solicitud))
			return false;
		Solicitud equalCheck = (Solicitud) obj;
		if ((idSolicitud == null && equalCheck.idSolicitud != null) || (idSolicitud != null && equalCheck.idSolicitud == null))
			return false;
		if (idSolicitud != null && !idSolicitud.equals(equalCheck.idSolicitud))
			return false;
		return true;
	}
}

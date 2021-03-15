
package com.uadec.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllDetalleCuentass", query = "select myDetalleCuentas from DetalleCuentas myDetalleCuentas"),
		@NamedQuery(name = "findDetalleCuentasByCiclo", query = "select myDetalleCuentas from DetalleCuentas myDetalleCuentas where myDetalleCuentas.ciclo = ?1"),
		@NamedQuery(name = "findDetalleCuentasByCicloContaining", query = "select myDetalleCuentas from DetalleCuentas myDetalleCuentas where myDetalleCuentas.ciclo like ?1"),
		@NamedQuery(name = "findDetalleCuentasByCuentaPagar", query = "select myDetalleCuentas from DetalleCuentas myDetalleCuentas where myDetalleCuentas.cuentaPagar = ?1"),
		@NamedQuery(name = "findDetalleCuentasByCuentaPagarContaining", query = "select myDetalleCuentas from DetalleCuentas myDetalleCuentas where myDetalleCuentas.cuentaPagar like ?1"),
		@NamedQuery(name = "findDetalleCuentasByIdDetalleCuentas", query = "select myDetalleCuentas from DetalleCuentas myDetalleCuentas where myDetalleCuentas.idDetalleCuentas = ?1"),
		@NamedQuery(name = "findDetalleCuentasByIdTipoCuenta", query = "select myDetalleCuentas from DetalleCuentas myDetalleCuentas where myDetalleCuentas.idTipoCuenta = ?1"),
		@NamedQuery(name = "findDetalleCuentasByNumero", query = "select myDetalleCuentas from DetalleCuentas myDetalleCuentas where myDetalleCuentas.numero = ?1"),
		@NamedQuery(name = "findDetalleCuentasByNumeroContaining", query = "select myDetalleCuentas from DetalleCuentas myDetalleCuentas where myDetalleCuentas.numero like ?1"),
		@NamedQuery(name = "findDetalleCuentasByPrimaryKey", query = "select myDetalleCuentas from DetalleCuentas myDetalleCuentas where myDetalleCuentas.idDetalleCuentas = ?1") })

@Table(catalog = "DB2ADMIN", name = "DETALLE_CUENTAS")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "zUadec/com/uadec/domain", name = "DetalleCuentas")

public class DetalleCuentas implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "ID_DETALLE_CUENTAS", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer idDetalleCuentas;
	/**
	 */

	@Column(name = "NUMERO", length = 20)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String numero;
	/**
	 */

	@Column(name = "CICLO", length = 20)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String ciclo;
	/**
	 */

	@Column(name = "CUENTA_PAGAR", length = 20)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String cuentaPagar;
	/**
	 */

	@Column(name = "ID_TIPO_CUENTA", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer idTipoCuenta;

	/**
	 */
	public void setIdDetalleCuentas(Integer idDetalleCuentas) {
		this.idDetalleCuentas = idDetalleCuentas;
	}

	/**
	 */
	public Integer getIdDetalleCuentas() {
		return this.idDetalleCuentas;
	}

	/**
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 */
	public String getNumero() {
		return this.numero;
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
	public void setIdTipoCuenta(Integer idTipoCuenta) {
		this.idTipoCuenta = idTipoCuenta;
	}

	/**
	 */
	public Integer getIdTipoCuenta() {
		return this.idTipoCuenta;
	}

	/**
	 */
	public DetalleCuentas() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(DetalleCuentas that) {
		setIdDetalleCuentas(that.getIdDetalleCuentas());
		setNumero(that.getNumero());
		setCiclo(that.getCiclo());
		setCuentaPagar(that.getCuentaPagar());
		setIdTipoCuenta(that.getIdTipoCuenta());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("idDetalleCuentas=[").append(idDetalleCuentas).append("] ");
		buffer.append("numero=[").append(numero).append("] ");
		buffer.append("ciclo=[").append(ciclo).append("] ");
		buffer.append("cuentaPagar=[").append(cuentaPagar).append("] ");
		buffer.append("idTipoCuenta=[").append(idTipoCuenta).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((idDetalleCuentas == null) ? 0 : idDetalleCuentas.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof DetalleCuentas))
			return false;
		DetalleCuentas equalCheck = (DetalleCuentas) obj;
		if ((idDetalleCuentas == null && equalCheck.idDetalleCuentas != null) || (idDetalleCuentas != null && equalCheck.idDetalleCuentas == null))
			return false;
		if (idDetalleCuentas != null && !idDetalleCuentas.equals(equalCheck.idDetalleCuentas))
			return false;
		return true;
	}
}


package com.uadec.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

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
		@NamedQuery(name = "findAllBitacoras", query = "select myBitacora from Bitacora myBitacora"),
		@NamedQuery(name = "findBitacoraByAccion", query = "select myBitacora from Bitacora myBitacora where myBitacora.accion = ?1"),
		@NamedQuery(name = "findBitacoraByAccionContaining", query = "select myBitacora from Bitacora myBitacora where myBitacora.accion like ?1"),
		@NamedQuery(name = "findBitacoraByDetalle", query = "select myBitacora from Bitacora myBitacora where myBitacora.detalle = ?1"),
		@NamedQuery(name = "findBitacoraByDetalleContaining", query = "select myBitacora from Bitacora myBitacora where myBitacora.detalle like ?1"),
		@NamedQuery(name = "findBitacoraByFechaHora", query = "select myBitacora from Bitacora myBitacora where myBitacora.fechaHora = ?1"),
		@NamedQuery(name = "findBitacoraByIdBitacora", query = "select myBitacora from Bitacora myBitacora where myBitacora.idBitacora = ?1"),
		@NamedQuery(name = "findBitacoraByIdUsuario", query = "select myBitacora from Bitacora myBitacora where myBitacora.idUsuario = ?1"),
		@NamedQuery(name = "findBitacoraByIp", query = "select myBitacora from Bitacora myBitacora where myBitacora.ip = ?1"),
		@NamedQuery(name = "findBitacoraByIpContaining", query = "select myBitacora from Bitacora myBitacora where myBitacora.ip like ?1"),
		@NamedQuery(name = "findBitacoraByModulo", query = "select myBitacora from Bitacora myBitacora where myBitacora.modulo = ?1"),
		@NamedQuery(name = "findBitacoraByModuloContaining", query = "select myBitacora from Bitacora myBitacora where myBitacora.modulo like ?1"),
		@NamedQuery(name = "findBitacoraByPrimaryKey", query = "select myBitacora from Bitacora myBitacora where myBitacora.idBitacora = ?1") })

@Table(catalog = "DB2ADMIN", name = "BITACORA")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "zUadec/com/uadec/domain", name = "Bitacora")

public class Bitacora implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "ID_BITACORA", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer idBitacora;
	/**
	 */

	@Column(name = "ID_USUARIO", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer idUsuario;
	/**
	 */

	@Column(name = "MODULO", length = 50)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String modulo;
	/**
	 */

	@Column(name = "ACCION", length = 15)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String accion;
	/**
	 */

	@Column(name = "IP", length = 15)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String ip;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHA_HORA", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar fechaHora;
	/**
	 */

	@Column(name = "DETALLE", length = 250)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String detalle;

	/**
	 */
	public void setIdBitacora(Integer idBitacora) {
		this.idBitacora = idBitacora;
	}

	/**
	 */
	public Integer getIdBitacora() {
		return this.idBitacora;
	}

	/**
	 */
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 */
	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	/**
	 */
	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	/**
	 */
	public String getModulo() {
		return this.modulo;
	}

	/**
	 */
	public void setAccion(String accion) {
		this.accion = accion;
	}

	/**
	 */
	public String getAccion() {
		return this.accion;
	}

	/**
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 */
	public String getIp() {
		return this.ip;
	}

	/**
	 */
	public void setFechaHora(Calendar fechaHora) {
		this.fechaHora = fechaHora;
	}

	/**
	 */
	public Calendar getFechaHora() {
		return this.fechaHora;
	}

	/**
	 */
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	/**
	 */
	public String getDetalle() {
		return this.detalle;
	}

	/**
	 */
	public Bitacora() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Bitacora that) {
		setIdBitacora(that.getIdBitacora());
		setIdUsuario(that.getIdUsuario());
		setModulo(that.getModulo());
		setAccion(that.getAccion());
		setIp(that.getIp());
		setFechaHora(that.getFechaHora());
		setDetalle(that.getDetalle());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("idBitacora=[").append(idBitacora).append("] ");
		buffer.append("idUsuario=[").append(idUsuario).append("] ");
		buffer.append("modulo=[").append(modulo).append("] ");
		buffer.append("accion=[").append(accion).append("] ");
		buffer.append("ip=[").append(ip).append("] ");
		buffer.append("fechaHora=[").append(fechaHora).append("] ");
		buffer.append("detalle=[").append(detalle).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((idBitacora == null) ? 0 : idBitacora.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Bitacora))
			return false;
		Bitacora equalCheck = (Bitacora) obj;
		if ((idBitacora == null && equalCheck.idBitacora != null) || (idBitacora != null && equalCheck.idBitacora == null))
			return false;
		if (idBitacora != null && !idBitacora.equals(equalCheck.idBitacora))
			return false;
		return true;
	}
}

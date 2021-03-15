
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
		@NamedQuery(name = "findAllCatTipoCuentas", query = "select myCatTipoCuenta from CatTipoCuenta myCatTipoCuenta"),
		@NamedQuery(name = "findCatTipoCuentaByDescripcion", query = "select myCatTipoCuenta from CatTipoCuenta myCatTipoCuenta where myCatTipoCuenta.descripcion = ?1"),
		@NamedQuery(name = "findCatTipoCuentaByDescripcionContaining", query = "select myCatTipoCuenta from CatTipoCuenta myCatTipoCuenta where myCatTipoCuenta.descripcion like ?1"),
		@NamedQuery(name = "findCatTipoCuentaByIdTipoCuenta", query = "select myCatTipoCuenta from CatTipoCuenta myCatTipoCuenta where myCatTipoCuenta.idTipoCuenta = ?1"),
		@NamedQuery(name = "findCatTipoCuentaByPrimaryKey", query = "select myCatTipoCuenta from CatTipoCuenta myCatTipoCuenta where myCatTipoCuenta.idTipoCuenta = ?1") })

@Table(catalog = "DB2ADMIN", name = "CAT_TIPO_CUENTA")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "zUadec/com/uadec/domain", name = "CatTipoCuenta")

public class CatTipoCuenta implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "ID_TIPO_CUENTA", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer idTipoCuenta;
	/**
	 */

	@Column(name = "DESCRIPCION", length = 20)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String descripcion;

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
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 */
	public String getDescripcion() {
		return this.descripcion;
	}

	/**
	 */
	public CatTipoCuenta() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(CatTipoCuenta that) {
		setIdTipoCuenta(that.getIdTipoCuenta());
		setDescripcion(that.getDescripcion());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("idTipoCuenta=[").append(idTipoCuenta).append("] ");
		buffer.append("descripcion=[").append(descripcion).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((idTipoCuenta == null) ? 0 : idTipoCuenta.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof CatTipoCuenta))
			return false;
		CatTipoCuenta equalCheck = (CatTipoCuenta) obj;
		if ((idTipoCuenta == null && equalCheck.idTipoCuenta != null) || (idTipoCuenta != null && equalCheck.idTipoCuenta == null))
			return false;
		if (idTipoCuenta != null && !idTipoCuenta.equals(equalCheck.idTipoCuenta))
			return false;
		return true;
	}
}


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
		@NamedQuery(name = "findAllRols", query = "select myRol from Rol myRol"),
		@NamedQuery(name = "findRolByIdRol", query = "select myRol from Rol myRol where myRol.idRol = ?1"),
		@NamedQuery(name = "findRolByNombreRol", query = "select myRol from Rol myRol where myRol.nombreRol = ?1"),
		@NamedQuery(name = "findRolByNombreRolContaining", query = "select myRol from Rol myRol where myRol.nombreRol like ?1"),
		@NamedQuery(name = "findRolByPrimaryKey", query = "select myRol from Rol myRol where myRol.idRol = ?1") })

@Table(catalog = "DB2ADMIN", name = "ROL")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "zUadec/com/uadec/domain", name = "Rol")

public class Rol implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "ID_ROL", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer idRol;
	/**
	 */

	@Column(name = "NOMBRE_ROL", length = 20)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String nombreRol;

	/**
	 */
	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	/**
	 */
	public Integer getIdRol() {
		return this.idRol;
	}

	/**
	 */
	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}

	/**
	 */
	public String getNombreRol() {
		return this.nombreRol;
	}

	/**
	 */
	public Rol() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Rol that) {
		setIdRol(that.getIdRol());
		setNombreRol(that.getNombreRol());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("idRol=[").append(idRol).append("] ");
		buffer.append("nombreRol=[").append(nombreRol).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((idRol == null) ? 0 : idRol.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Rol))
			return false;
		Rol equalCheck = (Rol) obj;
		if ((idRol == null && equalCheck.idRol != null) || (idRol != null && equalCheck.idRol == null))
			return false;
		if (idRol != null && !idRol.equals(equalCheck.idRol))
			return false;
		return true;
	}
}

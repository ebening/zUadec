
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
		@NamedQuery(name = "findAllCatTipoTramites", query = "select myCatTipoTramite from CatTipoTramite myCatTipoTramite"),
		@NamedQuery(name = "findCatTipoTramiteByDescripcion", query = "select myCatTipoTramite from CatTipoTramite myCatTipoTramite where myCatTipoTramite.descripcion = ?1"),
		@NamedQuery(name = "findCatTipoTramiteByDescripcionContaining", query = "select myCatTipoTramite from CatTipoTramite myCatTipoTramite where myCatTipoTramite.descripcion like ?1"),
		@NamedQuery(name = "findCatTipoTramiteByIdTipoTramite", query = "select myCatTipoTramite from CatTipoTramite myCatTipoTramite where myCatTipoTramite.idTipoTramite = ?1"),
		@NamedQuery(name = "findCatTipoTramiteByPrimaryKey", query = "select myCatTipoTramite from CatTipoTramite myCatTipoTramite where myCatTipoTramite.idTipoTramite = ?1") })

@Table(catalog = "DB2ADMIN", name = "CAT_TIPO_TRAMITE")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "zUadec/com/uadec/domain", name = "CatTipoTramite")

public class CatTipoTramite implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "ID_TIPO_TRAMITE", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer idTipoTramite;
	/**
	 */

	@Column(name = "DESCRIPCION", length = 100)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String descripcion;

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
	public CatTipoTramite() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(CatTipoTramite that) {
		setIdTipoTramite(that.getIdTipoTramite());
		setDescripcion(that.getDescripcion());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("idTipoTramite=[").append(idTipoTramite).append("] ");
		buffer.append("descripcion=[").append(descripcion).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((idTipoTramite == null) ? 0 : idTipoTramite.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof CatTipoTramite))
			return false;
		CatTipoTramite equalCheck = (CatTipoTramite) obj;
		if ((idTipoTramite == null && equalCheck.idTipoTramite != null) || (idTipoTramite != null && equalCheck.idTipoTramite == null))
			return false;
		if (idTipoTramite != null && !idTipoTramite.equals(equalCheck.idTipoTramite))
			return false;
		return true;
	}
}

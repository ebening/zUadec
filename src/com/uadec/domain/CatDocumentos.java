
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
		@NamedQuery(name = "findAllCatDocumentoss", query = "select myCatDocumentos from CatDocumentos myCatDocumentos"),
		@NamedQuery(name = "findCatDocumentosByDescripcion", query = "select myCatDocumentos from CatDocumentos myCatDocumentos where myCatDocumentos.descripcion = ?1"),
		@NamedQuery(name = "findCatDocumentosByDescripcionContaining", query = "select myCatDocumentos from CatDocumentos myCatDocumentos where myCatDocumentos.descripcion like ?1"),
		@NamedQuery(name = "findCatDocumentosByIdDocumento", query = "select myCatDocumentos from CatDocumentos myCatDocumentos where myCatDocumentos.idDocumento = ?1"),
		@NamedQuery(name = "findCatDocumentosByPrimaryKey", query = "select myCatDocumentos from CatDocumentos myCatDocumentos where myCatDocumentos.idDocumento = ?1") })

@Table(catalog = "DB2ADMIN", name = "CAT_DOCUMENTOS")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "zUadec/com/uadec/domain", name = "CatDocumentos")

public class CatDocumentos implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "ID_DOCUMENTO", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer idDocumento;
	/**
	 */

	@Column(name = "DESCRIPCION", length = 100)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String descripcion;

	/**
	 */
	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	/**
	 */
	public Integer getIdDocumento() {
		return this.idDocumento;
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
	public CatDocumentos() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(CatDocumentos that) {
		setIdDocumento(that.getIdDocumento());
		setDescripcion(that.getDescripcion());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("idDocumento=[").append(idDocumento).append("] ");
		buffer.append("descripcion=[").append(descripcion).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((idDocumento == null) ? 0 : idDocumento.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof CatDocumentos))
			return false;
		CatDocumentos equalCheck = (CatDocumentos) obj;
		if ((idDocumento == null && equalCheck.idDocumento != null) || (idDocumento != null && equalCheck.idDocumento == null))
			return false;
		if (idDocumento != null && !idDocumento.equals(equalCheck.idDocumento))
			return false;
		return true;
	}
}

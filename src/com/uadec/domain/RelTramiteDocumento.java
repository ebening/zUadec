
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
		@NamedQuery(name = "findAllRelTramiteDocumentos", query = "select myRelTramiteDocumento from RelTramiteDocumento myRelTramiteDocumento"),
		@NamedQuery(name = "findRelTramiteDocumentoByIdDocumento", query = "select myRelTramiteDocumento from RelTramiteDocumento myRelTramiteDocumento where myRelTramiteDocumento.idDocumento = ?1"),
		@NamedQuery(name = "findRelTramiteDocumentoByIdTipoTramite", query = "select myRelTramiteDocumento from RelTramiteDocumento myRelTramiteDocumento where myRelTramiteDocumento.idTipoTramite = ?1"),
		@NamedQuery(name = "findRelTramiteDocumentoByIdTramiteDoc", query = "select myRelTramiteDocumento from RelTramiteDocumento myRelTramiteDocumento where myRelTramiteDocumento.idTramiteDoc = ?1"),
		@NamedQuery(name = "findRelTramiteDocumentoByPrimaryKey", query = "select myRelTramiteDocumento from RelTramiteDocumento myRelTramiteDocumento where myRelTramiteDocumento.idTramiteDoc = ?1") })

@Table(catalog = "DB2ADMIN", name = "REL_TRAMITE_DOCUMENTO")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "zUadec/com/uadec/domain", name = "RelTramiteDocumento")

public class RelTramiteDocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "ID_TRAMITE_DOC", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer idTramiteDoc;
	/**
	 */

	@Column(name = "ID_TIPO_TRAMITE", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer idTipoTramite;
	/**
	 */

	@Column(name = "ID_DOCUMENTO", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer idDocumento;

	/**
	 */
	public void setIdTramiteDoc(Integer idTramiteDoc) {
		this.idTramiteDoc = idTramiteDoc;
	}

	/**
	 */
	public Integer getIdTramiteDoc() {
		return this.idTramiteDoc;
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
	public RelTramiteDocumento() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(RelTramiteDocumento that) {
		setIdTramiteDoc(that.getIdTramiteDoc());
		setIdTipoTramite(that.getIdTipoTramite());
		setIdDocumento(that.getIdDocumento());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("idTramiteDoc=[").append(idTramiteDoc).append("] ");
		buffer.append("idTipoTramite=[").append(idTipoTramite).append("] ");
		buffer.append("idDocumento=[").append(idDocumento).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((idTramiteDoc == null) ? 0 : idTramiteDoc.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof RelTramiteDocumento))
			return false;
		RelTramiteDocumento equalCheck = (RelTramiteDocumento) obj;
		if ((idTramiteDoc == null && equalCheck.idTramiteDoc != null) || (idTramiteDoc != null && equalCheck.idTramiteDoc == null))
			return false;
		if (idTramiteDoc != null && !idTramiteDoc.equals(equalCheck.idTramiteDoc))
			return false;
		return true;
	}
}

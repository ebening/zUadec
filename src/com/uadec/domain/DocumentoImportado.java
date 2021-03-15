
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
		@NamedQuery(name = "findAllDocumentoImportados", query = "select myDocumentoImportado from DocumentoImportado myDocumentoImportado"),
		@NamedQuery(name = "findDocumentoImportadoByIdDocumento", query = "select myDocumentoImportado from DocumentoImportado myDocumentoImportado where myDocumentoImportado.idDocumento = ?1"),
		@NamedQuery(name = "findDocumentoImportadoByIdDocumentoImportado", query = "select myDocumentoImportado from DocumentoImportado myDocumentoImportado where myDocumentoImportado.idDocumentoImportado = ?1"),
		@NamedQuery(name = "findDocumentoImportadoByIdSolicitud", query = "select myDocumentoImportado from DocumentoImportado myDocumentoImportado where myDocumentoImportado.idSolicitud = ?1"),
		@NamedQuery(name = "findDocumentoImportadoByIdUsuario", query = "select myDocumentoImportado from DocumentoImportado myDocumentoImportado where myDocumentoImportado.idUsuario = ?1"),
		@NamedQuery(name = "findDocumentoImportadoByNombredoc", query = "select myDocumentoImportado from DocumentoImportado myDocumentoImportado where myDocumentoImportado.nombredoc = ?1"),
		@NamedQuery(name = "findDocumentoImportadoByNombredocContaining", query = "select myDocumentoImportado from DocumentoImportado myDocumentoImportado where myDocumentoImportado.nombredoc like ?1"),
		@NamedQuery(name = "findDocumentoImportadoByPid", query = "select myDocumentoImportado from DocumentoImportado myDocumentoImportado where myDocumentoImportado.pid = ?1"),
		@NamedQuery(name = "findDocumentoImportadoByPidContaining", query = "select myDocumentoImportado from DocumentoImportado myDocumentoImportado where myDocumentoImportado.pid like ?1"),
		@NamedQuery(name = "findDocumentoImportadoByPrimaryKey", query = "select myDocumentoImportado from DocumentoImportado myDocumentoImportado where myDocumentoImportado.idDocumentoImportado = ?1") })

@Table(catalog = "DB2ADMIN", name = "DOCUMENTO_IMPORTADO")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "zUadec/com/uadec/domain", name = "DocumentoImportado")

public class DocumentoImportado implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "ID_DOCUMENTO_IMPORTADO", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer idDocumentoImportado;
	/**
	 */

	@Column(name = "NOMBREDOC", length = 20)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String nombredoc;
	/**
	 */

	@Column(name = "ID_SOLICITUD")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer idSolicitud;
	/**
	 */

	@Column(name = "ID_DOCUMENTO")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer idDocumento;
	/**
	 */

	@Column(name = "ID_USUARIO")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer idUsuario;
	/**
	 */

	@Column(name = "PID", length = 50)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String pid;

	/**
	 */
	public void setIdDocumentoImportado(Integer idDocumentoImportado) {
		this.idDocumentoImportado = idDocumentoImportado;
	}

	/**
	 */
	public Integer getIdDocumentoImportado() {
		return this.idDocumentoImportado;
	}

	/**
	 */
	public void setNombredoc(String nombredoc) {
		this.nombredoc = nombredoc;
	}

	/**
	 */
	public String getNombredoc() {
		return this.nombredoc;
	}

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
	public void setPid(String pid) {
		this.pid = pid;
	}

	/**
	 */
	public String getPid() {
		return this.pid;
	}

	/**
	 */
	public DocumentoImportado() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(DocumentoImportado that) {
		setIdDocumentoImportado(that.getIdDocumentoImportado());
		setNombredoc(that.getNombredoc());
		setIdSolicitud(that.getIdSolicitud());
		setIdDocumento(that.getIdDocumento());
		setIdUsuario(that.getIdUsuario());
		setPid(that.getPid());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("idDocumentoImportado=[").append(idDocumentoImportado).append("] ");
		buffer.append("nombredoc=[").append(nombredoc).append("] ");
		buffer.append("idSolicitud=[").append(idSolicitud).append("] ");
		buffer.append("idDocumento=[").append(idDocumento).append("] ");
		buffer.append("idUsuario=[").append(idUsuario).append("] ");
		buffer.append("pid=[").append(pid).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((idDocumentoImportado == null) ? 0 : idDocumentoImportado.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof DocumentoImportado))
			return false;
		DocumentoImportado equalCheck = (DocumentoImportado) obj;
		if ((idDocumentoImportado == null && equalCheck.idDocumentoImportado != null) || (idDocumentoImportado != null && equalCheck.idDocumentoImportado == null))
			return false;
		if (idDocumentoImportado != null && !idDocumentoImportado.equals(equalCheck.idDocumentoImportado))
			return false;
		return true;
	}
}

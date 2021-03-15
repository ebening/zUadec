
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
		@NamedQuery(name = "findAllUsuarios", query = "select myUsuario from Usuario myUsuario"),
		@NamedQuery(name = "findUsuarioByApellidoMaterno", query = "select myUsuario from Usuario myUsuario where myUsuario.apellidoMaterno = ?1"),
		@NamedQuery(name = "findUsuarioByApellidoMaternoContaining", query = "select myUsuario from Usuario myUsuario where myUsuario.apellidoMaterno like ?1"),
		@NamedQuery(name = "findUsuarioByApellidoPaterno", query = "select myUsuario from Usuario myUsuario where myUsuario.apellidoPaterno = ?1"),
		@NamedQuery(name = "findUsuarioByApellidoPaternoContaining", query = "select myUsuario from Usuario myUsuario where myUsuario.apellidoPaterno like ?1"),
		@NamedQuery(name = "findUsuarioByIdRol", query = "select myUsuario from Usuario myUsuario where myUsuario.idRol = ?1"),
		@NamedQuery(name = "findUsuarioByIdUsuario", query = "select myUsuario from Usuario myUsuario where myUsuario.idUsuario = ?1"),
		@NamedQuery(name = "findUsuarioByLogin", query = "select myUsuario from Usuario myUsuario where myUsuario.login = ?1"),
		@NamedQuery(name = "findUsuarioByLoginContaining", query = "select myUsuario from Usuario myUsuario where myUsuario.login like ?1"),
		@NamedQuery(name = "findUsuarioByNombre", query = "select myUsuario from Usuario myUsuario where myUsuario.nombre = ?1"),
		@NamedQuery(name = "findUsuarioByNombreContaining", query = "select myUsuario from Usuario myUsuario where myUsuario.nombre like ?1"),
		@NamedQuery(name = "findUsuarioByPassword", query = "select myUsuario from Usuario myUsuario where myUsuario.password = ?1"),
		@NamedQuery(name = "findUsuarioByPasswordContaining", query = "select myUsuario from Usuario myUsuario where myUsuario.password like ?1"),
		@NamedQuery(name = "findUsuarioByPrimaryKey", query = "select myUsuario from Usuario myUsuario where myUsuario.idUsuario = ?1") })

@Table(catalog = "DB2ADMIN", name = "USUARIO")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "zUadec/com/uadec/domain", name = "Usuario")

public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "ID_USUARIO", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer idUsuario;
	/**
	 */

	@Column(name = "APELLIDO_PATERNO", length = 50)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String apellidoPaterno;
	/**
	 */

	@Column(name = "NOMBRE", length = 50)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String nombre;
	/**
	 */

	@Column(name = "LOGIN", length = 20)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String login;
	/**
	 */

	@Column(name = "APELLIDO_MATERNO", length = 50)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String apellidoMaterno;
	/**
	 */

	@Column(name = "PASSWORD", length = 20)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String password;
	/**
	 */

	@Column(name = "ID_ROL", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer idRol;

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
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	/**
	 */
	public String getApellidoPaterno() {
		return this.apellidoPaterno;
	}

	/**
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 */
	public String getLogin() {
		return this.login;
	}

	/**
	 */
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	/**
	 */
	public String getApellidoMaterno() {
		return this.apellidoMaterno;
	}

	/**
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 */
	public String getPassword() {
		return this.password;
	}

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
	public Usuario() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Usuario that) {
		setIdUsuario(that.getIdUsuario());
		setApellidoPaterno(that.getApellidoPaterno());
		setNombre(that.getNombre());
		setLogin(that.getLogin());
		setApellidoMaterno(that.getApellidoMaterno());
		setPassword(that.getPassword());
		setIdRol(that.getIdRol());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("idUsuario=[").append(idUsuario).append("] ");
		buffer.append("apellidoPaterno=[").append(apellidoPaterno).append("] ");
		buffer.append("nombre=[").append(nombre).append("] ");
		buffer.append("login=[").append(login).append("] ");
		buffer.append("apellidoMaterno=[").append(apellidoMaterno).append("] ");
		buffer.append("password=[").append(password).append("] ");
		buffer.append("idRol=[").append(idRol).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((idUsuario == null) ? 0 : idUsuario.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Usuario))
			return false;
		Usuario equalCheck = (Usuario) obj;
		if ((idUsuario == null && equalCheck.idUsuario != null) || (idUsuario != null && equalCheck.idUsuario == null))
			return false;
		if (idUsuario != null && !idUsuario.equals(equalCheck.idUsuario))
			return false;
		return true;
	}
}

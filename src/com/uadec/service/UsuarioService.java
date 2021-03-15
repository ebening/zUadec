
package com.uadec.service;

import com.uadec.domain.Usuario;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Usuario entities
 * 
 */
public interface UsuarioService {

	/**
	* Return all Usuario entity
	* 
	 */
	public List<Usuario> findAllUsuarios(Integer startResult, Integer maxRows);

	/**
	 */
	public Usuario findUsuarioByPrimaryKey(Integer idUsuario);

	/**
	* Delete an existing Usuario entity
	* 
	 */
	public void deleteUsuario(Usuario usuario);

	/**
	* Return a count of all Usuario entity
	* 
	 */
	public Integer countUsuarios();

	/**
	* Load an existing Usuario entity
	* 
	 */
	public Set<Usuario> loadUsuarios();

	/**
	* Save an existing Usuario entity
	* 
	 */
	public void saveUsuario(Usuario usuario_1);
}
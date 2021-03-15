package com.uadec.service;

import com.uadec.dao.UsuarioDAO;

import com.uadec.domain.Usuario;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Usuario entities
 * 
 */

@Service("UsuarioService")

@Transactional
public class UsuarioServiceImpl implements UsuarioService {

	/**
	 * DAO injected by Spring that manages Usuario entities
	 * 
	 */
	@Autowired
	private UsuarioDAO usuarioDAO;

	/**
	 * Instantiates a new UsuarioServiceImpl.
	 *
	 */
	public UsuarioServiceImpl() {
	}

	/**
	 * Return all Usuario entity
	 * 
	 */
	@Transactional
	public List<Usuario> findAllUsuarios(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Usuario>(usuarioDAO.findAllUsuarios(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public Usuario findUsuarioByPrimaryKey(Integer idUsuario) {
		return usuarioDAO.findUsuarioByPrimaryKey(idUsuario);
	}

	/**
	 * Delete an existing Usuario entity
	 * 
	 */
	@Transactional
	public void deleteUsuario(Usuario usuario) {
		usuarioDAO.remove(usuario);
		usuarioDAO.flush();
	}

	/**
	 * Return a count of all Usuario entity
	 * 
	 */
	@Transactional
	public Integer countUsuarios() {
		return ((Long) usuarioDAO.createQuerySingleResult("select count(o) from Usuario o").getSingleResult()).intValue();
	}

	/**
	 * Load an existing Usuario entity
	 * 
	 */
	@Transactional
	public Set<Usuario> loadUsuarios() {
		return usuarioDAO.findAllUsuarios();
	}

	/**
	 * Save an existing Usuario entity
	 * 
	 */
	@Transactional
	public void saveUsuario(Usuario usuario) {
		Usuario existingUsuario = usuarioDAO.findUsuarioByPrimaryKey(usuario.getIdUsuario());

		if (existingUsuario != null) {
			if (existingUsuario != usuario) {
				existingUsuario.setIdUsuario(usuario.getIdUsuario());
				existingUsuario.setApellidoPaterno(usuario.getApellidoPaterno());
				existingUsuario.setNombre(usuario.getNombre());
				existingUsuario.setLogin(usuario.getLogin());
				existingUsuario.setApellidoMaterno(usuario.getApellidoMaterno());
				existingUsuario.setPassword(usuario.getPassword());
				existingUsuario.setIdRol(usuario.getIdRol());
			}
			usuario = usuarioDAO.store(existingUsuario);
		} else {
			usuario = usuarioDAO.store(usuario);
		}
		usuarioDAO.flush();
	}
}

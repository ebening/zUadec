package com.uadec.web.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.uadec.dao.UsuarioDAO;
import com.uadec.domain.Usuario;
import com.uadec.service.UsuarioService;

/**
 * Spring Rest controller that handles CRUD requests for Usuario entities
 * 
 */

@Controller("UsuarioRestController")

public class UsuarioRestController {

	/**
	 * DAO injected by Spring that manages Usuario entities
	 * 
	 */
	@Autowired
	private UsuarioDAO usuarioDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Usuario entities
	 * 
	 */
	@Autowired
	private UsuarioService usuarioService;

	/**
	 * Show all Usuario entities
	 * 
	 */
	@RequestMapping(value = "/Usuario", method = RequestMethod.GET)
	public List<Usuario> listUsuarios() {
		return new java.util.ArrayList<Usuario>(usuarioService.loadUsuarios());
	}

	/**
	* Save an existing Usuario entity
	* 
	*/
	@RequestMapping(value = "/Usuario", method = RequestMethod.PUT)
	public Usuario saveUsuario(@ModelAttribute Usuario usuario) {
		usuarioService.saveUsuario(usuario);
		return usuarioDAO.findUsuarioByPrimaryKey(usuario.getIdUsuario());
	}

	/**
	* Register custom, context-specific property editors
	* 
	*/
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	* Select an existing Usuario entity
	* 
	*/
	@RequestMapping(value = "/Usuario/{usuario_idUsuario}", method = RequestMethod.GET)
	public Usuario loadUsuario(@PathVariable Integer usuario_idUsuario) {
		return usuarioDAO.findUsuarioByPrimaryKey(usuario_idUsuario);
	}

	/**
	* Create a new Usuario entity
	* 
	*/
	@RequestMapping(value = "/Usuario", method = RequestMethod.POST)
	public Usuario newUsuario(@ModelAttribute Usuario usuario) {
		usuarioService.saveUsuario(usuario);
		return usuarioDAO.findUsuarioByPrimaryKey(usuario.getIdUsuario());
	}

	/**
	* Delete an existing Usuario entity
	* 
	*/
	@RequestMapping(value = "/Usuario/{usuario_idUsuario}", method = RequestMethod.DELETE)
	public void deleteUsuario(@PathVariable Integer usuario_idUsuario) {
		Usuario usuario = usuarioDAO.findUsuarioByPrimaryKey(usuario_idUsuario);
		usuarioService.deleteUsuario(usuario);
	}
}
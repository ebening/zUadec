package com.uadec.web;

import com.uadec.dao.UsuarioDAO;

import com.uadec.domain.Usuario;

import com.uadec.service.UsuarioService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Usuario entities
 * 
 */

@Controller("UsuarioController")

public class UsuarioController {

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
	 * Create a new Usuario entity
	 * 
	 */
	@RequestMapping("/newUsuario")
	public ModelAndView newUsuario() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usuario", new Usuario());
		mav.addObject("newFlag", true);
		mav.setViewName("usuario/editUsuario.jsp");

		return mav;
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
	*/
	@RequestMapping("/usuarioController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Select the Usuario entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteUsuario")
	public ModelAndView confirmDeleteUsuario(@RequestParam Integer idUsuarioKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usuario", usuarioDAO.findUsuarioByPrimaryKey(idUsuarioKey));
		mav.setViewName("usuario/deleteUsuario.jsp");

		return mav;
	}

	/**
	* Edit an existing Usuario entity
	* 
	*/
	@RequestMapping("/editUsuario")
	public ModelAndView editUsuario(@RequestParam Integer idUsuarioKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usuario", usuarioDAO.findUsuarioByPrimaryKey(idUsuarioKey));
		mav.setViewName("usuario/editUsuario.jsp");

		return mav;
	}

	/**
	* Delete an existing Usuario entity
	* 
	*/
	@RequestMapping("/deleteUsuario")
	public String deleteUsuario(@RequestParam Integer idUsuarioKey) {
		Usuario usuario = usuarioDAO.findUsuarioByPrimaryKey(idUsuarioKey);
		usuarioService.deleteUsuario(usuario);
		return "forward:/indexUsuario";
	}

	/**
	* Select an existing Usuario entity
	* 
	*/
	@RequestMapping("/selectUsuario")
	public ModelAndView selectUsuario(@RequestParam Integer idUsuarioKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usuario", usuarioDAO.findUsuarioByPrimaryKey(idUsuarioKey));
		mav.setViewName("usuario/viewUsuario.jsp");

		return mav;
	}

	/**
	* Save an existing Usuario entity
	* 
	*/
	@RequestMapping("/saveUsuario")
	public String saveUsuario(@ModelAttribute Usuario usuario) {
		usuarioService.saveUsuario(usuario);
		return "forward:/indexUsuario";
	}

	/**
	* Entry point to show all Usuario entities
	* 
	*/
	public String indexUsuario() {
		return "redirect:/indexUsuario";
	}

	/**
	* Show all Usuario entities
	* 
	*/
	@RequestMapping("/indexUsuario")
	public ModelAndView listUsuarios() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usuarios", usuarioService.loadUsuarios());

		mav.setViewName("usuario/listUsuarios.jsp");

		return mav;
	}
}
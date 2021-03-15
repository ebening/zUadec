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

import com.uadec.dao.RolDAO;
import com.uadec.domain.Rol;
import com.uadec.service.RolService;

/**
 * Spring Rest controller that handles CRUD requests for Rol entities
 * 
 */

@Controller("RolRestController")

public class RolRestController {

	/**
	 * DAO injected by Spring that manages Rol entities
	 * 
	 */
	@Autowired
	private RolDAO rolDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Rol entities
	 * 
	 */
	@Autowired
	private RolService rolService;

	/**
	 * Create a new Rol entity
	 * 
	 */
	@RequestMapping(value = "/Rol", method = RequestMethod.POST)
	public Rol newRol(@ModelAttribute Rol rol) {
		rolService.saveRol(rol);
		return rolDAO.findRolByPrimaryKey(rol.getIdRol());
	}

	/**
	* Show all Rol entities
	* 
	*/
	@RequestMapping(value = "/Rol", method = RequestMethod.GET)
	public List<Rol> listRols() {
		return new java.util.ArrayList<Rol>(rolService.loadRols());
	}

	/**
	* Delete an existing Rol entity
	* 
	*/
	@RequestMapping(value = "/Rol/{rol_idRol}", method = RequestMethod.DELETE)
	public void deleteRol(@PathVariable Integer rol_idRol) {
		Rol rol = rolDAO.findRolByPrimaryKey(rol_idRol);
		rolService.deleteRol(rol);
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
	* Save an existing Rol entity
	* 
	*/
	@RequestMapping(value = "/Rol", method = RequestMethod.PUT)
	public Rol saveRol(@ModelAttribute Rol rol) {
		rolService.saveRol(rol);
		return rolDAO.findRolByPrimaryKey(rol.getIdRol());
	}

	/**
	* Select an existing Rol entity
	* 
	*/
	@RequestMapping(value = "/Rol/{rol_idRol}", method = RequestMethod.GET)
	public Rol loadRol(@PathVariable Integer rol_idRol) {
		return rolDAO.findRolByPrimaryKey(rol_idRol);
	}
}
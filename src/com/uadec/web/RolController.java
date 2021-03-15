package com.uadec.web;

import com.uadec.dao.RolDAO;

import com.uadec.domain.Rol;

import com.uadec.service.RolService;

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
 * Spring MVC controller that handles CRUD requests for Rol entities
 * 
 */

@Controller("RolController")

public class RolController {

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
	 * Delete an existing Rol entity
	 * 
	 */
	@RequestMapping("/deleteRol")
	public String deleteRol(@RequestParam Integer idRolKey) {
		Rol rol = rolDAO.findRolByPrimaryKey(idRolKey);
		rolService.deleteRol(rol);
		return "forward:/indexRol";
	}

	/**
	* Create a new Rol entity
	* 
	*/
	@RequestMapping("/newRol")
	public ModelAndView newRol() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rol", new Rol());
		mav.addObject("newFlag", true);
		mav.setViewName("rol/editRol.jsp");

		return mav;
	}

	/**
	* Select an existing Rol entity
	* 
	*/
	@RequestMapping("/selectRol")
	public ModelAndView selectRol(@RequestParam Integer idRolKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rol", rolDAO.findRolByPrimaryKey(idRolKey));
		mav.setViewName("rol/viewRol.jsp");

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
	* Show all Rol entities
	* 
	*/
	@RequestMapping("/indexRol")
	public ModelAndView listRols() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rols", rolService.loadRols());

		mav.setViewName("rol/listRols.jsp");

		return mav;
	}

	/**
	* Select the Rol entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRol")
	public ModelAndView confirmDeleteRol(@RequestParam Integer idRolKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rol", rolDAO.findRolByPrimaryKey(idRolKey));
		mav.setViewName("rol/deleteRol.jsp");

		return mav;
	}

	/**
	* Entry point to show all Rol entities
	* 
	*/
	public String indexRol() {
		return "redirect:/indexRol";
	}

	/**
	* Edit an existing Rol entity
	* 
	*/
	@RequestMapping("/editRol")
	public ModelAndView editRol(@RequestParam Integer idRolKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rol", rolDAO.findRolByPrimaryKey(idRolKey));
		mav.setViewName("rol/editRol.jsp");

		return mav;
	}

	/**
	* Save an existing Rol entity
	* 
	*/
	@RequestMapping("/saveRol")
	public String saveRol(@ModelAttribute Rol rol) {
		rolService.saveRol(rol);
		return "forward:/indexRol";
	}

	/**
	*/
	@RequestMapping("/rolController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}
}
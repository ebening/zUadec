package com.uadec.web;

import com.uadec.dao.DetalleCuentasDAO;

import com.uadec.domain.DetalleCuentas;

import com.uadec.service.DetalleCuentasService;

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
 * Spring MVC controller that handles CRUD requests for DetalleCuentas entities
 * 
 */

@Controller("DetalleCuentasController")

public class DetalleCuentasController {

	/**
	 * DAO injected by Spring that manages DetalleCuentas entities
	 * 
	 */
	@Autowired
	private DetalleCuentasDAO detalleCuentasDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for DetalleCuentas entities
	 * 
	 */
	@Autowired
	private DetalleCuentasService detalleCuentasService;

	/**
	 */
	@RequestMapping("/detallecuentasController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Show all DetalleCuentas entities
	* 
	*/
	@RequestMapping("/indexDetalleCuentas")
	public ModelAndView listDetalleCuentass() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("detallecuentass", detalleCuentasService.loadDetalleCuentass());

		mav.setViewName("detallecuentas/listDetalleCuentass.jsp");

		return mav;
	}

	/**
	* Select an existing DetalleCuentas entity
	* 
	*/
	@RequestMapping("/selectDetalleCuentas")
	public ModelAndView selectDetalleCuentas(@RequestParam Integer idDetalleCuentasKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("detallecuentas", detalleCuentasDAO.findDetalleCuentasByPrimaryKey(idDetalleCuentasKey));
		mav.setViewName("detallecuentas/viewDetalleCuentas.jsp");

		return mav;
	}

	/**
	* Edit an existing DetalleCuentas entity
	* 
	*/
	@RequestMapping("/editDetalleCuentas")
	public ModelAndView editDetalleCuentas(@RequestParam Integer idDetalleCuentasKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("detallecuentas", detalleCuentasDAO.findDetalleCuentasByPrimaryKey(idDetalleCuentasKey));
		mav.setViewName("detallecuentas/editDetalleCuentas.jsp");

		return mav;
	}

	/**
	* Select the DetalleCuentas entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteDetalleCuentas")
	public ModelAndView confirmDeleteDetalleCuentas(@RequestParam Integer idDetalleCuentasKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("detallecuentas", detalleCuentasDAO.findDetalleCuentasByPrimaryKey(idDetalleCuentasKey));
		mav.setViewName("detallecuentas/deleteDetalleCuentas.jsp");

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
	* Entry point to show all DetalleCuentas entities
	* 
	*/
	public String indexDetalleCuentas() {
		return "redirect:/indexDetalleCuentas";
	}

	/**
	* Delete an existing DetalleCuentas entity
	* 
	*/
	@RequestMapping("/deleteDetalleCuentas")
	public String deleteDetalleCuentas(@RequestParam Integer idDetalleCuentasKey) {
		DetalleCuentas detallecuentas = detalleCuentasDAO.findDetalleCuentasByPrimaryKey(idDetalleCuentasKey);
		detalleCuentasService.deleteDetalleCuentas(detallecuentas);
		return "forward:/indexDetalleCuentas";
	}

	/**
	* Save an existing DetalleCuentas entity
	* 
	*/
	@RequestMapping("/saveDetalleCuentas")
	public String saveDetalleCuentas(@ModelAttribute DetalleCuentas detallecuentas) {
		detalleCuentasService.saveDetalleCuentas(detallecuentas);
		return "forward:/indexDetalleCuentas";
	}

	/**
	* Create a new DetalleCuentas entity
	* 
	*/
	@RequestMapping("/newDetalleCuentas")
	public ModelAndView newDetalleCuentas() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("detallecuentas", new DetalleCuentas());
		mav.addObject("newFlag", true);
		mav.setViewName("detallecuentas/editDetalleCuentas.jsp");

		return mav;
	}
}
package com.uadec.web;

import com.uadec.dao.SolicitudDAO;

import com.uadec.domain.Solicitud;

import com.uadec.service.SolicitudService;

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
 * Spring MVC controller that handles CRUD requests for Solicitud entities
 * 
 */

@Controller("SolicitudController")

public class SolicitudController {

	/**
	 * DAO injected by Spring that manages Solicitud entities
	 * 
	 */
	@Autowired
	private SolicitudDAO solicitudDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Solicitud entities
	 * 
	 */
	@Autowired
	private SolicitudService solicitudService;

	/**
	 * Entry point to show all Solicitud entities
	 * 
	 */
	public String indexSolicitud() {
		return "redirect:/indexSolicitud";
	}

	/**
	* Save an existing Solicitud entity
	* 
	*/
	@RequestMapping("/saveSolicitud")
	public String saveSolicitud(@ModelAttribute Solicitud solicitud) {
		solicitudService.saveSolicitud(solicitud);
		return "forward:/indexSolicitud";
	}

	/**
	* Show all Solicitud entities
	* 
	*/
	@RequestMapping("/indexSolicitud")
	public ModelAndView listSolicituds() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("solicituds", solicitudService.loadSolicituds());

		mav.setViewName("solicitud/listSolicituds.jsp");

		return mav;
	}

	/**
	* Create a new Solicitud entity
	* 
	*/
	@RequestMapping("/newSolicitud")
	public ModelAndView newSolicitud() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("solicitud", new Solicitud());
		mav.addObject("newFlag", true);
		mav.setViewName("solicitud/editSolicitud.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/solicitudController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
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
	* Edit an existing Solicitud entity
	* 
	*/
	@RequestMapping("/editSolicitud")
	public ModelAndView editSolicitud(@RequestParam Integer idSolicitudKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("solicitud", solicitudDAO.findSolicitudByPrimaryKey(idSolicitudKey));
		mav.setViewName("solicitud/editSolicitud.jsp");

		return mav;
	}

	/**
	* Select an existing Solicitud entity
	* 
	*/
	@RequestMapping("/selectSolicitud")
	public ModelAndView selectSolicitud(@RequestParam Integer idSolicitudKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("solicitud", solicitudDAO.findSolicitudByPrimaryKey(idSolicitudKey));
		mav.setViewName("solicitud/viewSolicitud.jsp");

		return mav;
	}

	/**
	* Select the Solicitud entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteSolicitud")
	public ModelAndView confirmDeleteSolicitud(@RequestParam Integer idSolicitudKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("solicitud", solicitudDAO.findSolicitudByPrimaryKey(idSolicitudKey));
		mav.setViewName("solicitud/deleteSolicitud.jsp");

		return mav;
	}

	/**
	* Delete an existing Solicitud entity
	* 
	*/
	@RequestMapping("/deleteSolicitud")
	public String deleteSolicitud(@RequestParam Integer idSolicitudKey) {
		Solicitud solicitud = solicitudDAO.findSolicitudByPrimaryKey(idSolicitudKey);
		solicitudService.deleteSolicitud(solicitud);
		return "forward:/indexSolicitud";
	}
}
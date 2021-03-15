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

import com.uadec.dao.SolicitudDAO;
import com.uadec.domain.Solicitud;
import com.uadec.service.SolicitudService;

/**
 * Spring Rest controller that handles CRUD requests for Solicitud entities
 * 
 */

@Controller("SolicitudRestController")

public class SolicitudRestController {

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
	 * Create a new Solicitud entity
	 * 
	 */
	@RequestMapping(value = "/Solicitud", method = RequestMethod.POST)
	public Solicitud newSolicitud(@ModelAttribute Solicitud solicitud) {
		solicitudService.saveSolicitud(solicitud);
		return solicitudDAO.findSolicitudByPrimaryKey(solicitud.getIdSolicitud());
	}

	/**
	* Select an existing Solicitud entity
	* 
	*/
	@RequestMapping(value = "/Solicitud/{solicitud_idSolicitud}", method = RequestMethod.GET)
	public Solicitud loadSolicitud(@PathVariable Integer solicitud_idSolicitud) {
		return solicitudDAO.findSolicitudByPrimaryKey(solicitud_idSolicitud);
	}

	/**
	* Show all Solicitud entities
	* 
	*/
	@RequestMapping(value = "/Solicitud", method = RequestMethod.GET)
	public List<Solicitud> listSolicituds() {
		return new java.util.ArrayList<Solicitud>(solicitudService.loadSolicituds());
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
	* Save an existing Solicitud entity
	* 
	*/
	@RequestMapping(value = "/Solicitud", method = RequestMethod.PUT)
	public Solicitud saveSolicitud(@ModelAttribute Solicitud solicitud) {
		solicitudService.saveSolicitud(solicitud);
		return solicitudDAO.findSolicitudByPrimaryKey(solicitud.getIdSolicitud());
	}

	/**
	* Delete an existing Solicitud entity
	* 
	*/
	@RequestMapping(value = "/Solicitud/{solicitud_idSolicitud}", method = RequestMethod.DELETE)
	public void deleteSolicitud(@PathVariable Integer solicitud_idSolicitud) {
		Solicitud solicitud = solicitudDAO.findSolicitudByPrimaryKey(solicitud_idSolicitud);
		solicitudService.deleteSolicitud(solicitud);
	}
}
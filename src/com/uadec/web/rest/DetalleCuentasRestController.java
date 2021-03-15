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

import com.uadec.dao.DetalleCuentasDAO;
import com.uadec.domain.DetalleCuentas;
import com.uadec.service.DetalleCuentasService;

/**
 * Spring Rest controller that handles CRUD requests for DetalleCuentas entities
 * 
 */

@Controller("DetalleCuentasRestController")

public class DetalleCuentasRestController {

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
	* Save an existing DetalleCuentas entity
	* 
	*/
	@RequestMapping(value = "/DetalleCuentas", method = RequestMethod.PUT)
	public DetalleCuentas saveDetalleCuentas(@ModelAttribute DetalleCuentas detallecuentas) {
		detalleCuentasService.saveDetalleCuentas(detallecuentas);
		return detalleCuentasDAO.findDetalleCuentasByPrimaryKey(detallecuentas.getIdDetalleCuentas());
	}

	/**
	* Select an existing DetalleCuentas entity
	* 
	*/
	@RequestMapping(value = "/DetalleCuentas/{detallecuentas_idDetalleCuentas}", method = RequestMethod.GET)
	public DetalleCuentas loadDetalleCuentas(@PathVariable Integer detallecuentas_idDetalleCuentas) {
		return detalleCuentasDAO.findDetalleCuentasByPrimaryKey(detallecuentas_idDetalleCuentas);
	}

	/**
	* Create a new DetalleCuentas entity
	* 
	*/
	@RequestMapping(value = "/DetalleCuentas", method = RequestMethod.POST)
	public DetalleCuentas newDetalleCuentas(@ModelAttribute DetalleCuentas detallecuentas) {
		detalleCuentasService.saveDetalleCuentas(detallecuentas);
		return detalleCuentasDAO.findDetalleCuentasByPrimaryKey(detallecuentas.getIdDetalleCuentas());
	}

	/**
	* Show all DetalleCuentas entities
	* 
	*/
	@RequestMapping(value = "/DetalleCuentas", method = RequestMethod.GET)
	public List<DetalleCuentas> listDetalleCuentass() {
		return new java.util.ArrayList<DetalleCuentas>(detalleCuentasService.loadDetalleCuentass());
	}

	/**
	* Delete an existing DetalleCuentas entity
	* 
	*/
	@RequestMapping(value = "/DetalleCuentas/{detallecuentas_idDetalleCuentas}", method = RequestMethod.DELETE)
	public void deleteDetalleCuentas(@PathVariable Integer detallecuentas_idDetalleCuentas) {
		DetalleCuentas detallecuentas = detalleCuentasDAO.findDetalleCuentasByPrimaryKey(detallecuentas_idDetalleCuentas);
		detalleCuentasService.deleteDetalleCuentas(detallecuentas);
	}
}
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

import com.uadec.dao.BitacoraDAO;
import com.uadec.domain.Bitacora;
import com.uadec.service.BitacoraService;

/**
 * Spring Rest controller that handles CRUD requests for Bitacora entities
 * 
 */

@Controller("BitacoraRestController")

public class BitacoraRestController {

	/**
	 * DAO injected by Spring that manages Bitacora entities
	 * 
	 */
	@Autowired
	private BitacoraDAO bitacoraDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Bitacora entities
	 * 
	 */
	@Autowired
	private BitacoraService bitacoraService;

	/**
	 * Select an existing Bitacora entity
	 * 
	 */
	@RequestMapping(value = "/Bitacora/{bitacora_idBitacora}", method = RequestMethod.GET)
	public Bitacora loadBitacora(@PathVariable Integer bitacora_idBitacora) {
		return bitacoraDAO.findBitacoraByPrimaryKey(bitacora_idBitacora);
	}

	/**
	* Create a new Bitacora entity
	* 
	*/
	@RequestMapping(value = "/Bitacora", method = RequestMethod.POST)
	public Bitacora newBitacora(@ModelAttribute Bitacora bitacora) {
		bitacoraService.saveBitacora(bitacora);
		return bitacoraDAO.findBitacoraByPrimaryKey(bitacora.getIdBitacora());
	}

	/**
	* Show all Bitacora entities
	* 
	*/
	@RequestMapping(value = "/Bitacora", method = RequestMethod.GET)
	public List<Bitacora> listBitacoras() {
		return new java.util.ArrayList<Bitacora>(bitacoraService.loadBitacoras());
	}

	/**
	* Delete an existing Bitacora entity
	* 
	*/
	@RequestMapping(value = "/Bitacora/{bitacora_idBitacora}", method = RequestMethod.DELETE)
	public void deleteBitacora(@PathVariable Integer bitacora_idBitacora) {
		Bitacora bitacora = bitacoraDAO.findBitacoraByPrimaryKey(bitacora_idBitacora);
		bitacoraService.deleteBitacora(bitacora);
	}

	/**
	* Save an existing Bitacora entity
	* 
	*/
	@RequestMapping(value = "/Bitacora", method = RequestMethod.PUT)
	public Bitacora saveBitacora(@ModelAttribute Bitacora bitacora) {
		bitacoraService.saveBitacora(bitacora);
		return bitacoraDAO.findBitacoraByPrimaryKey(bitacora.getIdBitacora());
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
}
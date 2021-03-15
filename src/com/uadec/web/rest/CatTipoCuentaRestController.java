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

import com.uadec.dao.CatTipoCuentaDAO;
import com.uadec.domain.CatTipoCuenta;
import com.uadec.service.CatTipoCuentaService;

/**
 * Spring Rest controller that handles CRUD requests for CatTipoCuenta entities
 * 
 */

@Controller("CatTipoCuentaRestController")

public class CatTipoCuentaRestController {

	/**
	 * DAO injected by Spring that manages CatTipoCuenta entities
	 * 
	 */
	@Autowired
	private CatTipoCuentaDAO catTipoCuentaDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for CatTipoCuenta entities
	 * 
	 */
	@Autowired
	private CatTipoCuentaService catTipoCuentaService;

	/**
	 * Show all CatTipoCuenta entities
	 * 
	 */
	@RequestMapping(value = "/CatTipoCuenta", method = RequestMethod.GET)
	public List<CatTipoCuenta> listCatTipoCuentas() {
		return new java.util.ArrayList<CatTipoCuenta>(catTipoCuentaService.loadCatTipoCuentas());
	}

	/**
	* Select an existing CatTipoCuenta entity
	* 
	*/
	@RequestMapping(value = "/CatTipoCuenta/{cattipocuenta_idTipoCuenta}", method = RequestMethod.GET)
	public CatTipoCuenta loadCatTipoCuenta(@PathVariable Integer cattipocuenta_idTipoCuenta) {
		return catTipoCuentaDAO.findCatTipoCuentaByPrimaryKey(cattipocuenta_idTipoCuenta);
	}

	/**
	* Save an existing CatTipoCuenta entity
	* 
	*/
	@RequestMapping(value = "/CatTipoCuenta", method = RequestMethod.PUT)
	public CatTipoCuenta saveCatTipoCuenta(@ModelAttribute CatTipoCuenta cattipocuenta) {
		catTipoCuentaService.saveCatTipoCuenta(cattipocuenta);
		return catTipoCuentaDAO.findCatTipoCuentaByPrimaryKey(cattipocuenta.getIdTipoCuenta());
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
	* Create a new CatTipoCuenta entity
	* 
	*/
	@RequestMapping(value = "/CatTipoCuenta", method = RequestMethod.POST)
	public CatTipoCuenta newCatTipoCuenta(@ModelAttribute CatTipoCuenta cattipocuenta) {
		catTipoCuentaService.saveCatTipoCuenta(cattipocuenta);
		return catTipoCuentaDAO.findCatTipoCuentaByPrimaryKey(cattipocuenta.getIdTipoCuenta());
	}

	/**
	* Delete an existing CatTipoCuenta entity
	* 
	*/
	@RequestMapping(value = "/CatTipoCuenta/{cattipocuenta_idTipoCuenta}", method = RequestMethod.DELETE)
	public void deleteCatTipoCuenta(@PathVariable Integer cattipocuenta_idTipoCuenta) {
		CatTipoCuenta cattipocuenta = catTipoCuentaDAO.findCatTipoCuentaByPrimaryKey(cattipocuenta_idTipoCuenta);
		catTipoCuentaService.deleteCatTipoCuenta(cattipocuenta);
	}
}
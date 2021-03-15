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

import com.uadec.dao.CatTipoTramiteDAO;
import com.uadec.domain.CatTipoTramite;
import com.uadec.service.CatTipoTramiteService;

/**
 * Spring Rest controller that handles CRUD requests for CatTipoTramite entities
 * 
 */

@Controller("CatTipoTramiteRestController")

public class CatTipoTramiteRestController {

	/**
	 * DAO injected by Spring that manages CatTipoTramite entities
	 * 
	 */
	@Autowired
	private CatTipoTramiteDAO catTipoTramiteDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for CatTipoTramite entities
	 * 
	 */
	@Autowired
	private CatTipoTramiteService catTipoTramiteService;

	/**
	 * Create a new CatTipoTramite entity
	 * 
	 */
	@RequestMapping(value = "/CatTipoTramite", method = RequestMethod.POST)
	public CatTipoTramite newCatTipoTramite(@ModelAttribute CatTipoTramite cattipotramite) {
		catTipoTramiteService.saveCatTipoTramite(cattipotramite);
		return catTipoTramiteDAO.findCatTipoTramiteByPrimaryKey(cattipotramite.getIdTipoTramite());
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
	* Show all CatTipoTramite entities
	* 
	*/
	@RequestMapping(value = "/CatTipoTramite", method = RequestMethod.GET)
	public List<CatTipoTramite> listCatTipoTramites() {
		return new java.util.ArrayList<CatTipoTramite>(catTipoTramiteService.loadCatTipoTramites());
	}

	/**
	* Delete an existing CatTipoTramite entity
	* 
	*/
	@RequestMapping(value = "/CatTipoTramite/{cattipotramite_idTipoTramite}", method = RequestMethod.DELETE)
	public void deleteCatTipoTramite(@PathVariable Integer cattipotramite_idTipoTramite) {
		CatTipoTramite cattipotramite = catTipoTramiteDAO.findCatTipoTramiteByPrimaryKey(cattipotramite_idTipoTramite);
		catTipoTramiteService.deleteCatTipoTramite(cattipotramite);
	}

	/**
	* Select an existing CatTipoTramite entity
	* 
	*/
	@RequestMapping(value = "/CatTipoTramite/{cattipotramite_idTipoTramite}", method = RequestMethod.GET)
	public CatTipoTramite loadCatTipoTramite(@PathVariable Integer cattipotramite_idTipoTramite) {
		return catTipoTramiteDAO.findCatTipoTramiteByPrimaryKey(cattipotramite_idTipoTramite);
	}

	/**
	* Save an existing CatTipoTramite entity
	* 
	*/
	@RequestMapping(value = "/CatTipoTramite", method = RequestMethod.PUT)
	public CatTipoTramite saveCatTipoTramite(@ModelAttribute CatTipoTramite cattipotramite) {
		catTipoTramiteService.saveCatTipoTramite(cattipotramite);
		return catTipoTramiteDAO.findCatTipoTramiteByPrimaryKey(cattipotramite.getIdTipoTramite());
	}
}
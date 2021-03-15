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

import com.uadec.dao.CatDocumentosDAO;
import com.uadec.domain.CatDocumentos;
import com.uadec.service.CatDocumentosService;

/**
 * Spring Rest controller that handles CRUD requests for CatDocumentos entities
 * 
 */

@Controller("CatDocumentosRestController")

public class CatDocumentosRestController {

	/**
	 * DAO injected by Spring that manages CatDocumentos entities
	 * 
	 */
	@Autowired
	private CatDocumentosDAO catDocumentosDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for CatDocumentos entities
	 * 
	 */
	@Autowired
	private CatDocumentosService catDocumentosService;

	/**
	 * Select an existing CatDocumentos entity
	 * 
	 */
	@RequestMapping(value = "/CatDocumentos/{catdocumentos_idDocumento}", method = RequestMethod.GET)
	public CatDocumentos loadCatDocumentos(@PathVariable Integer catdocumentos_idDocumento) {
		return catDocumentosDAO.findCatDocumentosByPrimaryKey(catdocumentos_idDocumento);
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
	* Show all CatDocumentos entities
	* 
	*/
	@RequestMapping(value = "/CatDocumentos", method = RequestMethod.GET)
	public List<CatDocumentos> listCatDocumentoss() {
		return new java.util.ArrayList<CatDocumentos>(catDocumentosService.loadCatDocumentoss());
	}

	/**
	* Save an existing CatDocumentos entity
	* 
	*/
	@RequestMapping(value = "/CatDocumentos", method = RequestMethod.PUT)
	public CatDocumentos saveCatDocumentos(@ModelAttribute CatDocumentos catdocumentos) {
		catDocumentosService.saveCatDocumentos(catdocumentos);
		return catDocumentosDAO.findCatDocumentosByPrimaryKey(catdocumentos.getIdDocumento());
	}

	/**
	* Create a new CatDocumentos entity
	* 
	*/
	@RequestMapping(value = "/CatDocumentos", method = RequestMethod.POST)
	public CatDocumentos newCatDocumentos(@ModelAttribute CatDocumentos catdocumentos) {
		catDocumentosService.saveCatDocumentos(catdocumentos);
		return catDocumentosDAO.findCatDocumentosByPrimaryKey(catdocumentos.getIdDocumento());
	}

	/**
	* Delete an existing CatDocumentos entity
	* 
	*/
	@RequestMapping(value = "/CatDocumentos/{catdocumentos_idDocumento}", method = RequestMethod.DELETE)
	public void deleteCatDocumentos(@PathVariable Integer catdocumentos_idDocumento) {
		CatDocumentos catdocumentos = catDocumentosDAO.findCatDocumentosByPrimaryKey(catdocumentos_idDocumento);
		catDocumentosService.deleteCatDocumentos(catdocumentos);
	}
}
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

import com.uadec.dao.RelTramiteDocumentoDAO;
import com.uadec.domain.RelTramiteDocumento;
import com.uadec.service.RelTramiteDocumentoService;

/**
 * Spring Rest controller that handles CRUD requests for RelTramiteDocumento entities
 * 
 */

@Controller("RelTramiteDocumentoRestController")

public class RelTramiteDocumentoRestController {

	/**
	 * DAO injected by Spring that manages RelTramiteDocumento entities
	 * 
	 */
	@Autowired
	private RelTramiteDocumentoDAO relTramiteDocumentoDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for RelTramiteDocumento entities
	 * 
	 */
	@Autowired
	private RelTramiteDocumentoService relTramiteDocumentoService;

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
	* Save an existing RelTramiteDocumento entity
	* 
	*/
	@RequestMapping(value = "/RelTramiteDocumento", method = RequestMethod.PUT)
	public RelTramiteDocumento saveRelTramiteDocumento(@ModelAttribute RelTramiteDocumento reltramitedocumento) {
		relTramiteDocumentoService.saveRelTramiteDocumento(reltramitedocumento);
		return relTramiteDocumentoDAO.findRelTramiteDocumentoByPrimaryKey(reltramitedocumento.getIdTramiteDoc());
	}

	/**
	* Show all RelTramiteDocumento entities
	* 
	*/
	@RequestMapping(value = "/RelTramiteDocumento", method = RequestMethod.GET)
	public List<RelTramiteDocumento> listRelTramiteDocumentos() {
		return new java.util.ArrayList<RelTramiteDocumento>(relTramiteDocumentoService.loadRelTramiteDocumentos());
	}

	/**
	* Delete an existing RelTramiteDocumento entity
	* 
	*/
	@RequestMapping(value = "/RelTramiteDocumento/{reltramitedocumento_idTramiteDoc}", method = RequestMethod.DELETE)
	public void deleteRelTramiteDocumento(@PathVariable Integer reltramitedocumento_idTramiteDoc) {
		RelTramiteDocumento reltramitedocumento = relTramiteDocumentoDAO.findRelTramiteDocumentoByPrimaryKey(reltramitedocumento_idTramiteDoc);
		relTramiteDocumentoService.deleteRelTramiteDocumento(reltramitedocumento);
	}

	/**
	* Select an existing RelTramiteDocumento entity
	* 
	*/
	@RequestMapping(value = "/RelTramiteDocumento/{reltramitedocumento_idTramiteDoc}", method = RequestMethod.GET)
	public RelTramiteDocumento loadRelTramiteDocumento(@PathVariable Integer reltramitedocumento_idTramiteDoc) {
		return relTramiteDocumentoDAO.findRelTramiteDocumentoByPrimaryKey(reltramitedocumento_idTramiteDoc);
	}

	/**
	* Create a new RelTramiteDocumento entity
	* 
	*/
	@RequestMapping(value = "/RelTramiteDocumento", method = RequestMethod.POST)
	public RelTramiteDocumento newRelTramiteDocumento(@ModelAttribute RelTramiteDocumento reltramitedocumento) {
		relTramiteDocumentoService.saveRelTramiteDocumento(reltramitedocumento);
		return relTramiteDocumentoDAO.findRelTramiteDocumentoByPrimaryKey(reltramitedocumento.getIdTramiteDoc());
	}
}
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

import com.uadec.dao.DocumentoImportadoDAO;
import com.uadec.domain.DocumentoImportado;
import com.uadec.service.DocumentoImportadoService;

/**
 * Spring Rest controller that handles CRUD requests for DocumentoImportado entities
 * 
 */

@Controller("DocumentoImportadoRestController")

public class DocumentoImportadoRestController {

	/**
	 * DAO injected by Spring that manages DocumentoImportado entities
	 * 
	 */
	@Autowired
	private DocumentoImportadoDAO documentoImportadoDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for DocumentoImportado entities
	 * 
	 */
	@Autowired
	private DocumentoImportadoService documentoImportadoService;

	/**
	 * Save an existing DocumentoImportado entity
	 * 
	 */
	@RequestMapping(value = "/DocumentoImportado", method = RequestMethod.PUT)
	public DocumentoImportado saveDocumentoImportado(@ModelAttribute DocumentoImportado documentoimportado) {
		documentoImportadoService.saveDocumentoImportado(documentoimportado);
		return documentoImportadoDAO.findDocumentoImportadoByPrimaryKey(documentoimportado.getIdDocumentoImportado());
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
	* Show all DocumentoImportado entities
	* 
	*/
	@RequestMapping(value = "/DocumentoImportado", method = RequestMethod.GET)
	public List<DocumentoImportado> listDocumentoImportados() {
		return new java.util.ArrayList<DocumentoImportado>(documentoImportadoService.loadDocumentoImportados());
	}

	/**
	* Create a new DocumentoImportado entity
	* 
	*/
	@RequestMapping(value = "/DocumentoImportado", method = RequestMethod.POST)
	public DocumentoImportado newDocumentoImportado(@ModelAttribute DocumentoImportado documentoimportado) {
		documentoImportadoService.saveDocumentoImportado(documentoimportado);
		return documentoImportadoDAO.findDocumentoImportadoByPrimaryKey(documentoimportado.getIdDocumentoImportado());
	}

	/**
	* Select an existing DocumentoImportado entity
	* 
	*/
	@RequestMapping(value = "/DocumentoImportado/{documentoimportado_idDocumentoImportado}", method = RequestMethod.GET)
	public DocumentoImportado loadDocumentoImportado(@PathVariable Integer documentoimportado_idDocumentoImportado) {
		return documentoImportadoDAO.findDocumentoImportadoByPrimaryKey(documentoimportado_idDocumentoImportado);
	}

	/**
	* Delete an existing DocumentoImportado entity
	* 
	*/
	@RequestMapping(value = "/DocumentoImportado/{documentoimportado_idDocumentoImportado}", method = RequestMethod.DELETE)
	public void deleteDocumentoImportado(@PathVariable Integer documentoimportado_idDocumentoImportado) {
		DocumentoImportado documentoimportado = documentoImportadoDAO.findDocumentoImportadoByPrimaryKey(documentoimportado_idDocumentoImportado);
		documentoImportadoService.deleteDocumentoImportado(documentoimportado);
	}
}
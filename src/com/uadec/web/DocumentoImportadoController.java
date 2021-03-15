package com.uadec.web;

import com.uadec.dao.DocumentoImportadoDAO;

import com.uadec.domain.DocumentoImportado;

import com.uadec.service.DocumentoImportadoService;

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
 * Spring MVC controller that handles CRUD requests for DocumentoImportado entities
 * 
 */

@Controller("DocumentoImportadoController")

public class DocumentoImportadoController {

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
	 * Delete an existing DocumentoImportado entity
	 * 
	 */
	@RequestMapping("/deleteDocumentoImportado")
	public String deleteDocumentoImportado(@RequestParam Integer idDocumentoImportadoKey) {
		DocumentoImportado documentoimportado = documentoImportadoDAO.findDocumentoImportadoByPrimaryKey(idDocumentoImportadoKey);
		documentoImportadoService.deleteDocumentoImportado(documentoimportado);
		return "forward:/indexDocumentoImportado";
	}

	/**
	* Entry point to show all DocumentoImportado entities
	* 
	*/
	public String indexDocumentoImportado() {
		return "redirect:/indexDocumentoImportado";
	}

	/**
	* Edit an existing DocumentoImportado entity
	* 
	*/
	@RequestMapping("/editDocumentoImportado")
	public ModelAndView editDocumentoImportado(@RequestParam Integer idDocumentoImportadoKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("documentoimportado", documentoImportadoDAO.findDocumentoImportadoByPrimaryKey(idDocumentoImportadoKey));
		mav.setViewName("documentoimportado/editDocumentoImportado.jsp");

		return mav;
	}

	/**
	* Select the DocumentoImportado entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteDocumentoImportado")
	public ModelAndView confirmDeleteDocumentoImportado(@RequestParam Integer idDocumentoImportadoKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("documentoimportado", documentoImportadoDAO.findDocumentoImportadoByPrimaryKey(idDocumentoImportadoKey));
		mav.setViewName("documentoimportado/deleteDocumentoImportado.jsp");

		return mav;
	}

	/**
	* Show all DocumentoImportado entities
	* 
	*/
	@RequestMapping("/indexDocumentoImportado")
	public ModelAndView listDocumentoImportados() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("documentoimportados", documentoImportadoService.loadDocumentoImportados());

		mav.setViewName("documentoimportado/listDocumentoImportados.jsp");

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
	*/
	@RequestMapping("/documentoimportadoController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Save an existing DocumentoImportado entity
	* 
	*/
	@RequestMapping("/saveDocumentoImportado")
	public String saveDocumentoImportado(@ModelAttribute DocumentoImportado documentoimportado) {
		documentoImportadoService.saveDocumentoImportado(documentoimportado);
		return "forward:/indexDocumentoImportado";
	}

	/**
	* Select an existing DocumentoImportado entity
	* 
	*/
	@RequestMapping("/selectDocumentoImportado")
	public ModelAndView selectDocumentoImportado(@RequestParam Integer idDocumentoImportadoKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("documentoimportado", documentoImportadoDAO.findDocumentoImportadoByPrimaryKey(idDocumentoImportadoKey));
		mav.setViewName("documentoimportado/viewDocumentoImportado.jsp");

		return mav;
	}

	/**
	* Create a new DocumentoImportado entity
	* 
	*/
	@RequestMapping("/newDocumentoImportado")
	public ModelAndView newDocumentoImportado() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("documentoimportado", new DocumentoImportado());
		mav.addObject("newFlag", true);
		mav.setViewName("documentoimportado/editDocumentoImportado.jsp");

		return mav;
	}
}
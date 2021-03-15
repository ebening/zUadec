package com.uadec.web;

import com.uadec.dao.RelTramiteDocumentoDAO;

import com.uadec.domain.RelTramiteDocumento;

import com.uadec.service.RelTramiteDocumentoService;

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
 * Spring MVC controller that handles CRUD requests for RelTramiteDocumento entities
 * 
 */

@Controller("RelTramiteDocumentoController")

public class RelTramiteDocumentoController {

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
	 */
	@RequestMapping("/reltramitedocumentoController/binary.action")
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
	* Edit an existing RelTramiteDocumento entity
	* 
	*/
	@RequestMapping("/editRelTramiteDocumento")
	public ModelAndView editRelTramiteDocumento(@RequestParam Integer idTramiteDocKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("reltramitedocumento", relTramiteDocumentoDAO.findRelTramiteDocumentoByPrimaryKey(idTramiteDocKey));
		mav.setViewName("reltramitedocumento/editRelTramiteDocumento.jsp");

		return mav;
	}

	/**
	* Create a new RelTramiteDocumento entity
	* 
	*/
	@RequestMapping("/newRelTramiteDocumento")
	public ModelAndView newRelTramiteDocumento() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("reltramitedocumento", new RelTramiteDocumento());
		mav.addObject("newFlag", true);
		mav.setViewName("reltramitedocumento/editRelTramiteDocumento.jsp");

		return mav;
	}

	/**
	* Entry point to show all RelTramiteDocumento entities
	* 
	*/
	public String indexRelTramiteDocumento() {
		return "redirect:/indexRelTramiteDocumento";
	}

	/**
	* Delete an existing RelTramiteDocumento entity
	* 
	*/
	@RequestMapping("/deleteRelTramiteDocumento")
	public String deleteRelTramiteDocumento(@RequestParam Integer idTramiteDocKey) {
		RelTramiteDocumento reltramitedocumento = relTramiteDocumentoDAO.findRelTramiteDocumentoByPrimaryKey(idTramiteDocKey);
		relTramiteDocumentoService.deleteRelTramiteDocumento(reltramitedocumento);
		return "forward:/indexRelTramiteDocumento";
	}

	/**
	* Show all RelTramiteDocumento entities
	* 
	*/
	@RequestMapping("/indexRelTramiteDocumento")
	public ModelAndView listRelTramiteDocumentos() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("reltramitedocumentos", relTramiteDocumentoService.loadRelTramiteDocumentos());

		mav.setViewName("reltramitedocumento/listRelTramiteDocumentos.jsp");

		return mav;
	}

	/**
	* Select an existing RelTramiteDocumento entity
	* 
	*/
	@RequestMapping("/selectRelTramiteDocumento")
	public ModelAndView selectRelTramiteDocumento(@RequestParam Integer idTramiteDocKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("reltramitedocumento", relTramiteDocumentoDAO.findRelTramiteDocumentoByPrimaryKey(idTramiteDocKey));
		mav.setViewName("reltramitedocumento/viewRelTramiteDocumento.jsp");

		return mav;
	}

	/**
	* Select the RelTramiteDocumento entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRelTramiteDocumento")
	public ModelAndView confirmDeleteRelTramiteDocumento(@RequestParam Integer idTramiteDocKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("reltramitedocumento", relTramiteDocumentoDAO.findRelTramiteDocumentoByPrimaryKey(idTramiteDocKey));
		mav.setViewName("reltramitedocumento/deleteRelTramiteDocumento.jsp");

		return mav;
	}

	/**
	* Save an existing RelTramiteDocumento entity
	* 
	*/
	@RequestMapping("/saveRelTramiteDocumento")
	public String saveRelTramiteDocumento(@ModelAttribute RelTramiteDocumento reltramitedocumento) {
		relTramiteDocumentoService.saveRelTramiteDocumento(reltramitedocumento);
		return "forward:/indexRelTramiteDocumento";
	}
}
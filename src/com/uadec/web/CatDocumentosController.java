package com.uadec.web;

import com.uadec.dao.CatDocumentosDAO;

import com.uadec.domain.CatDocumentos;

import com.uadec.service.CatDocumentosService;

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
 * Spring MVC controller that handles CRUD requests for CatDocumentos entities
 * 
 */

@Controller("CatDocumentosController")

public class CatDocumentosController {

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
	 * Delete an existing CatDocumentos entity
	 * 
	 */
	@RequestMapping("/deleteCatDocumentos")
	public String deleteCatDocumentos(@RequestParam Integer idDocumentoKey) {
		CatDocumentos catdocumentos = catDocumentosDAO.findCatDocumentosByPrimaryKey(idDocumentoKey);
		catDocumentosService.deleteCatDocumentos(catdocumentos);
		return "forward:/indexCatDocumentos";
	}

	/**
	* Entry point to show all CatDocumentos entities
	* 
	*/
	public String indexCatDocumentos() {
		return "redirect:/indexCatDocumentos";
	}

	/**
	*/
	@RequestMapping("/catdocumentosController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Create a new CatDocumentos entity
	* 
	*/
	@RequestMapping("/newCatDocumentos")
	public ModelAndView newCatDocumentos() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("catdocumentos", new CatDocumentos());
		mav.addObject("newFlag", true);
		mav.setViewName("catdocumentos/editCatDocumentos.jsp");

		return mav;
	}

	/**
	* Edit an existing CatDocumentos entity
	* 
	*/
	@RequestMapping("/editCatDocumentos")
	public ModelAndView editCatDocumentos(@RequestParam Integer idDocumentoKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("catdocumentos", catDocumentosDAO.findCatDocumentosByPrimaryKey(idDocumentoKey));
		mav.setViewName("catdocumentos/editCatDocumentos.jsp");

		return mav;
	}

	/**
	* Select the CatDocumentos entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteCatDocumentos")
	public ModelAndView confirmDeleteCatDocumentos(@RequestParam Integer idDocumentoKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("catdocumentos", catDocumentosDAO.findCatDocumentosByPrimaryKey(idDocumentoKey));
		mav.setViewName("catdocumentos/deleteCatDocumentos.jsp");

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
	* Select an existing CatDocumentos entity
	* 
	*/
	@RequestMapping("/selectCatDocumentos")
	public ModelAndView selectCatDocumentos(@RequestParam Integer idDocumentoKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("catdocumentos", catDocumentosDAO.findCatDocumentosByPrimaryKey(idDocumentoKey));
		mav.setViewName("catdocumentos/viewCatDocumentos.jsp");

		return mav;
	}

	/**
	* Save an existing CatDocumentos entity
	* 
	*/
	@RequestMapping("/saveCatDocumentos")
	public String saveCatDocumentos(@ModelAttribute CatDocumentos catdocumentos) {
		catDocumentosService.saveCatDocumentos(catdocumentos);
		return "forward:/indexCatDocumentos";
	}

	/**
	* Show all CatDocumentos entities
	* 
	*/
	@RequestMapping("/indexCatDocumentos")
	public ModelAndView listCatDocumentoss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("catdocumentoss", catDocumentosService.loadCatDocumentoss());

		mav.setViewName("catdocumentos/listCatDocumentoss.jsp");

		return mav;
	}
}
package com.uadec.web;

import com.uadec.dao.CatTipoTramiteDAO;

import com.uadec.domain.CatTipoTramite;

import com.uadec.service.CatTipoTramiteService;

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
 * Spring MVC controller that handles CRUD requests for CatTipoTramite entities
 * 
 */

@Controller("CatTipoTramiteController")

public class CatTipoTramiteController {

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
	 * Edit an existing CatTipoTramite entity
	 * 
	 */
	@RequestMapping("/editCatTipoTramite")
	public ModelAndView editCatTipoTramite(@RequestParam Integer idTipoTramiteKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cattipotramite", catTipoTramiteDAO.findCatTipoTramiteByPrimaryKey(idTipoTramiteKey));
		mav.setViewName("cattipotramite/editCatTipoTramite.jsp");

		return mav;
	}

	/**
	* Save an existing CatTipoTramite entity
	* 
	*/
	@RequestMapping("/saveCatTipoTramite")
	public String saveCatTipoTramite(@ModelAttribute CatTipoTramite cattipotramite) {
		catTipoTramiteService.saveCatTipoTramite(cattipotramite);
		return "forward:/indexCatTipoTramite";
	}

	/**
	* Select the CatTipoTramite entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteCatTipoTramite")
	public ModelAndView confirmDeleteCatTipoTramite(@RequestParam Integer idTipoTramiteKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cattipotramite", catTipoTramiteDAO.findCatTipoTramiteByPrimaryKey(idTipoTramiteKey));
		mav.setViewName("cattipotramite/deleteCatTipoTramite.jsp");

		return mav;
	}

	/**
	* Delete an existing CatTipoTramite entity
	* 
	*/
	@RequestMapping("/deleteCatTipoTramite")
	public String deleteCatTipoTramite(@RequestParam Integer idTipoTramiteKey) {
		CatTipoTramite cattipotramite = catTipoTramiteDAO.findCatTipoTramiteByPrimaryKey(idTipoTramiteKey);
		catTipoTramiteService.deleteCatTipoTramite(cattipotramite);
		return "forward:/indexCatTipoTramite";
	}

	/**
	*/
	@RequestMapping("/cattipotramiteController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Create a new CatTipoTramite entity
	* 
	*/
	@RequestMapping("/newCatTipoTramite")
	public ModelAndView newCatTipoTramite() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cattipotramite", new CatTipoTramite());
		mav.addObject("newFlag", true);
		mav.setViewName("cattipotramite/editCatTipoTramite.jsp");

		return mav;
	}

	/**
	* Entry point to show all CatTipoTramite entities
	* 
	*/
	public String indexCatTipoTramite() {
		return "redirect:/indexCatTipoTramite";
	}

	/**
	* Select an existing CatTipoTramite entity
	* 
	*/
	@RequestMapping("/selectCatTipoTramite")
	public ModelAndView selectCatTipoTramite(@RequestParam Integer idTipoTramiteKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cattipotramite", catTipoTramiteDAO.findCatTipoTramiteByPrimaryKey(idTipoTramiteKey));
		mav.setViewName("cattipotramite/viewCatTipoTramite.jsp");

		return mav;
	}

	/**
	* Show all CatTipoTramite entities
	* 
	*/
	@RequestMapping("/indexCatTipoTramite")
	public ModelAndView listCatTipoTramites() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cattipotramites", catTipoTramiteService.loadCatTipoTramites());

		mav.setViewName("cattipotramite/listCatTipoTramites.jsp");

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
}
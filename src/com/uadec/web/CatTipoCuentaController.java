package com.uadec.web;

import com.uadec.dao.CatTipoCuentaDAO;

import com.uadec.domain.CatTipoCuenta;

import com.uadec.service.CatTipoCuentaService;

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
 * Spring MVC controller that handles CRUD requests for CatTipoCuenta entities
 * 
 */

@Controller("CatTipoCuentaController")

public class CatTipoCuentaController {

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
	 * Edit an existing CatTipoCuenta entity
	 * 
	 */
	@RequestMapping("/editCatTipoCuenta")
	public ModelAndView editCatTipoCuenta(@RequestParam Integer idTipoCuentaKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cattipocuenta", catTipoCuentaDAO.findCatTipoCuentaByPrimaryKey(idTipoCuentaKey));
		mav.setViewName("cattipocuenta/editCatTipoCuenta.jsp");

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
	@RequestMapping("/cattipocuentaController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Create a new CatTipoCuenta entity
	* 
	*/
	@RequestMapping("/newCatTipoCuenta")
	public ModelAndView newCatTipoCuenta() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cattipocuenta", new CatTipoCuenta());
		mav.addObject("newFlag", true);
		mav.setViewName("cattipocuenta/editCatTipoCuenta.jsp");

		return mav;
	}

	/**
	* Show all CatTipoCuenta entities
	* 
	*/
	@RequestMapping("/indexCatTipoCuenta")
	public ModelAndView listCatTipoCuentas() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cattipocuentas", catTipoCuentaService.loadCatTipoCuentas());

		mav.setViewName("cattipocuenta/listCatTipoCuentas.jsp");

		return mav;
	}

	/**
	* Save an existing CatTipoCuenta entity
	* 
	*/
	@RequestMapping("/saveCatTipoCuenta")
	public String saveCatTipoCuenta(@ModelAttribute CatTipoCuenta cattipocuenta) {
		catTipoCuentaService.saveCatTipoCuenta(cattipocuenta);
		return "forward:/indexCatTipoCuenta";
	}

	/**
	* Delete an existing CatTipoCuenta entity
	* 
	*/
	@RequestMapping("/deleteCatTipoCuenta")
	public String deleteCatTipoCuenta(@RequestParam Integer idTipoCuentaKey) {
		CatTipoCuenta cattipocuenta = catTipoCuentaDAO.findCatTipoCuentaByPrimaryKey(idTipoCuentaKey);
		catTipoCuentaService.deleteCatTipoCuenta(cattipocuenta);
		return "forward:/indexCatTipoCuenta";
	}

	/**
	* Select an existing CatTipoCuenta entity
	* 
	*/
	@RequestMapping("/selectCatTipoCuenta")
	public ModelAndView selectCatTipoCuenta(@RequestParam Integer idTipoCuentaKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cattipocuenta", catTipoCuentaDAO.findCatTipoCuentaByPrimaryKey(idTipoCuentaKey));
		mav.setViewName("cattipocuenta/viewCatTipoCuenta.jsp");

		return mav;
	}

	/**
	* Select the CatTipoCuenta entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteCatTipoCuenta")
	public ModelAndView confirmDeleteCatTipoCuenta(@RequestParam Integer idTipoCuentaKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cattipocuenta", catTipoCuentaDAO.findCatTipoCuentaByPrimaryKey(idTipoCuentaKey));
		mav.setViewName("cattipocuenta/deleteCatTipoCuenta.jsp");

		return mav;
	}

	/**
	* Entry point to show all CatTipoCuenta entities
	* 
	*/
	public String indexCatTipoCuenta() {
		return "redirect:/indexCatTipoCuenta";
	}
}
package com.uadec.web;

import com.uadec.dao.BitacoraDAO;

import com.uadec.domain.Bitacora;

import com.uadec.service.BitacoraService;

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
 * Spring MVC controller that handles CRUD requests for Bitacora entities
 * 
 */

@Controller("BitacoraController")

public class BitacoraController {

	/**
	 * DAO injected by Spring that manages Bitacora entities
	 * 
	 */
	@Autowired
	private BitacoraDAO bitacoraDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Bitacora entities
	 * 
	 */
	@Autowired
	private BitacoraService bitacoraService;

	/**
	 * Show all Bitacora entities
	 * 
	 */
	@RequestMapping("/indexBitacora")
	public ModelAndView listBitacoras() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bitacoras", bitacoraService.loadBitacoras());

		mav.setViewName("bitacora/listBitacoras.jsp");

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
	@RequestMapping("/bitacoraController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Delete an existing Bitacora entity
	* 
	*/
	@RequestMapping("/deleteBitacora")
	public String deleteBitacora(@RequestParam Integer idBitacoraKey) {
		Bitacora bitacora = bitacoraDAO.findBitacoraByPrimaryKey(idBitacoraKey);
		bitacoraService.deleteBitacora(bitacora);
		return "forward:/indexBitacora";
	}

	/**
	* Select the Bitacora entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteBitacora")
	public ModelAndView confirmDeleteBitacora(@RequestParam Integer idBitacoraKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bitacora", bitacoraDAO.findBitacoraByPrimaryKey(idBitacoraKey));
		mav.setViewName("bitacora/deleteBitacora.jsp");

		return mav;
	}

	/**
	* Select an existing Bitacora entity
	* 
	*/
	@RequestMapping("/selectBitacora")
	public ModelAndView selectBitacora(@RequestParam Integer idBitacoraKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bitacora", bitacoraDAO.findBitacoraByPrimaryKey(idBitacoraKey));
		mav.setViewName("bitacora/viewBitacora.jsp");

		return mav;
	}

	/**
	* Entry point to show all Bitacora entities
	* 
	*/
	public String indexBitacora() {
		return "redirect:/indexBitacora";
	}

	/**
	* Create a new Bitacora entity
	* 
	*/
	@RequestMapping("/newBitacora")
	public ModelAndView newBitacora() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bitacora", new Bitacora());
		mav.addObject("newFlag", true);
		mav.setViewName("bitacora/editBitacora.jsp");

		return mav;
	}

	/**
	* Edit an existing Bitacora entity
	* 
	*/
	@RequestMapping("/editBitacora")
	public ModelAndView editBitacora(@RequestParam Integer idBitacoraKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bitacora", bitacoraDAO.findBitacoraByPrimaryKey(idBitacoraKey));
		mav.setViewName("bitacora/editBitacora.jsp");

		return mav;
	}

	/**
	* Save an existing Bitacora entity
	* 
	*/
	@RequestMapping("/saveBitacora")
	public String saveBitacora(@ModelAttribute Bitacora bitacora) {
		bitacoraService.saveBitacora(bitacora);
		return "forward:/indexBitacora";
	}
}
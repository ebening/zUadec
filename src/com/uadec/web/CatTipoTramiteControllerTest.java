
package com.uadec.web;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Unit test for the <code>CatTipoTramiteController</code> controller.
 *
 * @see com.uadec.web.CatTipoTramiteController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/zUadec-security-context.xml",
		"file:./resources/zUadec-service-context.xml",
		"file:./resources/zUadec-dao-context.xml",
		"file:./resources/zUadec-web-context.xml" })
public class CatTipoTramiteControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexCatTipoTramite()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexCatTipoTramite() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexCatTipoTramite");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatTipoTramiteController controller = (CatTipoTramiteController) context.getBean("CatTipoTramiteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCatTipoTramite()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCatTipoTramite() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCatTipoTramite");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatTipoTramiteController controller = (CatTipoTramiteController) context.getBean("CatTipoTramiteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCatTipoTramite()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCatTipoTramite() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCatTipoTramite");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatTipoTramiteController controller = (CatTipoTramiteController) context.getBean("CatTipoTramiteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCatTipoTramite()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCatTipoTramite() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCatTipoTramite");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatTipoTramiteController controller = (CatTipoTramiteController) context.getBean("CatTipoTramiteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCatTipoTramite()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCatTipoTramite() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCatTipoTramite");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatTipoTramiteController controller = (CatTipoTramiteController) context.getBean("CatTipoTramiteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCatTipoTramite()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCatTipoTramite() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCatTipoTramite");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatTipoTramiteController controller = (CatTipoTramiteController) context.getBean("CatTipoTramiteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCatTipoTramite()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCatTipoTramite() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCatTipoTramite");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatTipoTramiteController controller = (CatTipoTramiteController) context.getBean("CatTipoTramiteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>cattipotramiteControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetcattipotramiteControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/cattipotramiteController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatTipoTramiteController controller = (CatTipoTramiteController) context.getBean("CatTipoTramiteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Autowired to set the Spring application context.
	 *
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Returns a mock HttpServletRequest object.
	 *
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 *
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}
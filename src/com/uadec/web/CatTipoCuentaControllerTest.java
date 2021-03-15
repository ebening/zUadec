
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
 * Unit test for the <code>CatTipoCuentaController</code> controller.
 *
 * @see com.uadec.web.CatTipoCuentaController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/zUadec-security-context.xml",
		"file:./resources/zUadec-service-context.xml",
		"file:./resources/zUadec-dao-context.xml",
		"file:./resources/zUadec-web-context.xml" })
public class CatTipoCuentaControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexCatTipoCuenta()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexCatTipoCuenta() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexCatTipoCuenta");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatTipoCuentaController controller = (CatTipoCuentaController) context.getBean("CatTipoCuentaController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCatTipoCuenta()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCatTipoCuenta() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCatTipoCuenta");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatTipoCuentaController controller = (CatTipoCuentaController) context.getBean("CatTipoCuentaController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCatTipoCuenta()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCatTipoCuenta() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCatTipoCuenta");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatTipoCuentaController controller = (CatTipoCuentaController) context.getBean("CatTipoCuentaController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCatTipoCuenta()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCatTipoCuenta() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCatTipoCuenta");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatTipoCuentaController controller = (CatTipoCuentaController) context.getBean("CatTipoCuentaController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCatTipoCuenta()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCatTipoCuenta() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCatTipoCuenta");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatTipoCuentaController controller = (CatTipoCuentaController) context.getBean("CatTipoCuentaController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCatTipoCuenta()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCatTipoCuenta() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCatTipoCuenta");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatTipoCuentaController controller = (CatTipoCuentaController) context.getBean("CatTipoCuentaController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCatTipoCuenta()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCatTipoCuenta() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCatTipoCuenta");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatTipoCuentaController controller = (CatTipoCuentaController) context.getBean("CatTipoCuentaController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>cattipocuentaControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetcattipocuentaControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/cattipocuentaController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatTipoCuentaController controller = (CatTipoCuentaController) context.getBean("CatTipoCuentaController");

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
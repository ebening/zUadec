
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
 * Unit test for the <code>DetalleCuentasController</code> controller.
 *
 * @see com.uadec.web.DetalleCuentasController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/zUadec-security-context.xml",
		"file:./resources/zUadec-service-context.xml",
		"file:./resources/zUadec-dao-context.xml",
		"file:./resources/zUadec-web-context.xml" })
public class DetalleCuentasControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexDetalleCuentas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexDetalleCuentas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexDetalleCuentas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DetalleCuentasController controller = (DetalleCuentasController) context.getBean("DetalleCuentasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectDetalleCuentas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectDetalleCuentas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectDetalleCuentas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DetalleCuentasController controller = (DetalleCuentasController) context.getBean("DetalleCuentasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editDetalleCuentas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditDetalleCuentas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editDetalleCuentas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DetalleCuentasController controller = (DetalleCuentasController) context.getBean("DetalleCuentasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveDetalleCuentas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveDetalleCuentas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveDetalleCuentas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DetalleCuentasController controller = (DetalleCuentasController) context.getBean("DetalleCuentasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newDetalleCuentas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewDetalleCuentas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newDetalleCuentas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DetalleCuentasController controller = (DetalleCuentasController) context.getBean("DetalleCuentasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteDetalleCuentas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteDetalleCuentas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteDetalleCuentas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DetalleCuentasController controller = (DetalleCuentasController) context.getBean("DetalleCuentasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteDetalleCuentas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteDetalleCuentas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteDetalleCuentas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DetalleCuentasController controller = (DetalleCuentasController) context.getBean("DetalleCuentasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>detallecuentasControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdetallecuentasControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/detallecuentasController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DetalleCuentasController controller = (DetalleCuentasController) context.getBean("DetalleCuentasController");

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
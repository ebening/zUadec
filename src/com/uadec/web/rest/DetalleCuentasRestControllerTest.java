
package com.uadec.web.rest;

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
 * Unit test for the <code>DetalleCuentasRestController</code> controller.
 *
 * @see com.uadec.web.rest.DetalleCuentasRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/zUadec-security-context.xml",
		"file:./resources/zUadec-service-context.xml",
		"file:./resources/zUadec-dao-context.xml",
		"file:./resources/zUadec-web-context.xml" })
public class DetalleCuentasRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>DetalleCuentas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetDetalleCuentas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/DetalleCuentas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DetalleCuentasRestController controller = (DetalleCuentasRestController) context.getBean("DetalleCuentasRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>DetalleCuentasdetallecuentas_idDetalleCuentas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetDetalleCuentasdetallecuentas_idDetalleCuentas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/DetalleCuentas/{detallecuentas_idDetalleCuentas}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DetalleCuentasRestController controller = (DetalleCuentasRestController) context.getBean("DetalleCuentasRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>DetalleCuentas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutDetalleCuentas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/DetalleCuentas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DetalleCuentasRestController controller = (DetalleCuentasRestController) context.getBean("DetalleCuentasRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>DetalleCuentas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostDetalleCuentas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/DetalleCuentas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DetalleCuentasRestController controller = (DetalleCuentasRestController) context.getBean("DetalleCuentasRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>DetalleCuentasdetallecuentas_idDetalleCuentas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteDetalleCuentasdetallecuentas_idDetalleCuentas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/DetalleCuentas/{detallecuentas_idDetalleCuentas}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DetalleCuentasRestController controller = (DetalleCuentasRestController) context.getBean("DetalleCuentasRestController");

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
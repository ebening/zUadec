
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
 * Unit test for the <code>BitacoraController</code> controller.
 *
 * @see com.uadec.web.BitacoraController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/zUadec-security-context.xml",
		"file:./resources/zUadec-service-context.xml",
		"file:./resources/zUadec-dao-context.xml",
		"file:./resources/zUadec-web-context.xml" })
public class BitacoraControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexBitacora()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexBitacora() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexBitacora");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BitacoraController controller = (BitacoraController) context.getBean("BitacoraController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectBitacora()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectBitacora() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectBitacora");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BitacoraController controller = (BitacoraController) context.getBean("BitacoraController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editBitacora()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditBitacora() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editBitacora");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BitacoraController controller = (BitacoraController) context.getBean("BitacoraController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveBitacora()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveBitacora() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveBitacora");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BitacoraController controller = (BitacoraController) context.getBean("BitacoraController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newBitacora()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewBitacora() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newBitacora");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BitacoraController controller = (BitacoraController) context.getBean("BitacoraController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteBitacora()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteBitacora() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteBitacora");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BitacoraController controller = (BitacoraController) context.getBean("BitacoraController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteBitacora()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteBitacora() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteBitacora");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BitacoraController controller = (BitacoraController) context.getBean("BitacoraController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>bitacoraControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetbitacoraControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/bitacoraController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BitacoraController controller = (BitacoraController) context.getBean("BitacoraController");

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
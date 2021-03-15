
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
 * Unit test for the <code>SolicitudController</code> controller.
 *
 * @see com.uadec.web.SolicitudController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/zUadec-security-context.xml",
		"file:./resources/zUadec-service-context.xml",
		"file:./resources/zUadec-dao-context.xml",
		"file:./resources/zUadec-web-context.xml" })
public class SolicitudControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexSolicitud()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexSolicitud() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexSolicitud");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SolicitudController controller = (SolicitudController) context.getBean("SolicitudController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectSolicitud()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectSolicitud() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectSolicitud");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SolicitudController controller = (SolicitudController) context.getBean("SolicitudController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editSolicitud()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditSolicitud() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editSolicitud");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SolicitudController controller = (SolicitudController) context.getBean("SolicitudController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveSolicitud()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveSolicitud() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveSolicitud");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SolicitudController controller = (SolicitudController) context.getBean("SolicitudController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newSolicitud()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewSolicitud() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newSolicitud");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SolicitudController controller = (SolicitudController) context.getBean("SolicitudController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteSolicitud()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteSolicitud() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteSolicitud");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SolicitudController controller = (SolicitudController) context.getBean("SolicitudController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteSolicitud()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteSolicitud() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteSolicitud");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SolicitudController controller = (SolicitudController) context.getBean("SolicitudController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>solicitudControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsolicitudControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/solicitudController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SolicitudController controller = (SolicitudController) context.getBean("SolicitudController");

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
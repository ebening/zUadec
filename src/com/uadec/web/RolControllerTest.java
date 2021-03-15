
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
 * Unit test for the <code>RolController</code> controller.
 *
 * @see com.uadec.web.RolController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/zUadec-security-context.xml",
		"file:./resources/zUadec-service-context.xml",
		"file:./resources/zUadec-dao-context.xml",
		"file:./resources/zUadec-web-context.xml" })
public class RolControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexRol()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexRol() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexRol");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RolController controller = (RolController) context.getBean("RolController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRol()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRol() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRol");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RolController controller = (RolController) context.getBean("RolController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRol()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRol() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRol");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RolController controller = (RolController) context.getBean("RolController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRol()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRol() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRol");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RolController controller = (RolController) context.getBean("RolController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRol()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRol() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRol");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RolController controller = (RolController) context.getBean("RolController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRol()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRol() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRol");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RolController controller = (RolController) context.getBean("RolController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRol()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRol() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRol");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RolController controller = (RolController) context.getBean("RolController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>rolControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetrolControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/rolController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RolController controller = (RolController) context.getBean("RolController");

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
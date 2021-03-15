
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
 * Unit test for the <code>UsuarioController</code> controller.
 *
 * @see com.uadec.web.UsuarioController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/zUadec-security-context.xml",
		"file:./resources/zUadec-service-context.xml",
		"file:./resources/zUadec-dao-context.xml",
		"file:./resources/zUadec-web-context.xml" })
public class UsuarioControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexUsuario()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexUsuario() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexUsuario");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsuarioController controller = (UsuarioController) context.getBean("UsuarioController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsuario()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsuario() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsuario");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsuarioController controller = (UsuarioController) context.getBean("UsuarioController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUsuario()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsuario() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsuario");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsuarioController controller = (UsuarioController) context.getBean("UsuarioController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsuario()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsuario() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsuario");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsuarioController controller = (UsuarioController) context.getBean("UsuarioController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsuario()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsuario() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsuario");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsuarioController controller = (UsuarioController) context.getBean("UsuarioController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsuario()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsuario() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsuario");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsuarioController controller = (UsuarioController) context.getBean("UsuarioController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsuario()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsuario() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsuario");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsuarioController controller = (UsuarioController) context.getBean("UsuarioController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>usuarioControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetusuarioControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/usuarioController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsuarioController controller = (UsuarioController) context.getBean("UsuarioController");

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
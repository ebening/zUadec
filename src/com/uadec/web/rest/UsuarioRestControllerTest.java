
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
 * Unit test for the <code>UsuarioRestController</code> controller.
 *
 * @see com.uadec.web.rest.UsuarioRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/zUadec-security-context.xml",
		"file:./resources/zUadec-service-context.xml",
		"file:./resources/zUadec-dao-context.xml",
		"file:./resources/zUadec-web-context.xml" })
public class UsuarioRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Usuario()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUsuario() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Usuario");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsuarioRestController controller = (UsuarioRestController) context.getBean("UsuarioRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usuariousuario_idUsuario()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUsuariousuario_idUsuario() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Usuario/{usuario_idUsuario}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsuarioRestController controller = (UsuarioRestController) context.getBean("UsuarioRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usuario()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutUsuario() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Usuario");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsuarioRestController controller = (UsuarioRestController) context.getBean("UsuarioRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usuario()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostUsuario() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Usuario");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsuarioRestController controller = (UsuarioRestController) context.getBean("UsuarioRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usuariousuario_idUsuario()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteUsuariousuario_idUsuario() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Usuario/{usuario_idUsuario}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsuarioRestController controller = (UsuarioRestController) context.getBean("UsuarioRestController");

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
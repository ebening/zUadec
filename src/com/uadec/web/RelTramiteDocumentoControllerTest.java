
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
 * Unit test for the <code>RelTramiteDocumentoController</code> controller.
 *
 * @see com.uadec.web.RelTramiteDocumentoController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/zUadec-security-context.xml",
		"file:./resources/zUadec-service-context.xml",
		"file:./resources/zUadec-dao-context.xml",
		"file:./resources/zUadec-web-context.xml" })
public class RelTramiteDocumentoControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexRelTramiteDocumento()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexRelTramiteDocumento() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexRelTramiteDocumento");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RelTramiteDocumentoController controller = (RelTramiteDocumentoController) context.getBean("RelTramiteDocumentoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRelTramiteDocumento()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRelTramiteDocumento() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRelTramiteDocumento");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RelTramiteDocumentoController controller = (RelTramiteDocumentoController) context.getBean("RelTramiteDocumentoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRelTramiteDocumento()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRelTramiteDocumento() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRelTramiteDocumento");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RelTramiteDocumentoController controller = (RelTramiteDocumentoController) context.getBean("RelTramiteDocumentoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRelTramiteDocumento()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRelTramiteDocumento() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRelTramiteDocumento");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RelTramiteDocumentoController controller = (RelTramiteDocumentoController) context.getBean("RelTramiteDocumentoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRelTramiteDocumento()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRelTramiteDocumento() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRelTramiteDocumento");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RelTramiteDocumentoController controller = (RelTramiteDocumentoController) context.getBean("RelTramiteDocumentoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRelTramiteDocumento()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRelTramiteDocumento() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRelTramiteDocumento");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RelTramiteDocumentoController controller = (RelTramiteDocumentoController) context.getBean("RelTramiteDocumentoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRelTramiteDocumento()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRelTramiteDocumento() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRelTramiteDocumento");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RelTramiteDocumentoController controller = (RelTramiteDocumentoController) context.getBean("RelTramiteDocumentoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>reltramitedocumentoControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetreltramitedocumentoControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/reltramitedocumentoController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RelTramiteDocumentoController controller = (RelTramiteDocumentoController) context.getBean("RelTramiteDocumentoController");

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
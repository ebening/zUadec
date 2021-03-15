
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
 * Unit test for the <code>DocumentoImportadoController</code> controller.
 *
 * @see com.uadec.web.DocumentoImportadoController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/zUadec-security-context.xml",
		"file:./resources/zUadec-service-context.xml",
		"file:./resources/zUadec-dao-context.xml",
		"file:./resources/zUadec-web-context.xml" })
public class DocumentoImportadoControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexDocumentoImportado()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexDocumentoImportado() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexDocumentoImportado");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DocumentoImportadoController controller = (DocumentoImportadoController) context.getBean("DocumentoImportadoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectDocumentoImportado()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectDocumentoImportado() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectDocumentoImportado");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DocumentoImportadoController controller = (DocumentoImportadoController) context.getBean("DocumentoImportadoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editDocumentoImportado()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditDocumentoImportado() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editDocumentoImportado");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DocumentoImportadoController controller = (DocumentoImportadoController) context.getBean("DocumentoImportadoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveDocumentoImportado()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveDocumentoImportado() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveDocumentoImportado");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DocumentoImportadoController controller = (DocumentoImportadoController) context.getBean("DocumentoImportadoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newDocumentoImportado()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewDocumentoImportado() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newDocumentoImportado");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DocumentoImportadoController controller = (DocumentoImportadoController) context.getBean("DocumentoImportadoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteDocumentoImportado()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteDocumentoImportado() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteDocumentoImportado");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DocumentoImportadoController controller = (DocumentoImportadoController) context.getBean("DocumentoImportadoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteDocumentoImportado()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteDocumentoImportado() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteDocumentoImportado");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DocumentoImportadoController controller = (DocumentoImportadoController) context.getBean("DocumentoImportadoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>documentoimportadoControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdocumentoimportadoControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/documentoimportadoController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DocumentoImportadoController controller = (DocumentoImportadoController) context.getBean("DocumentoImportadoController");

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
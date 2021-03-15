
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
 * Unit test for the <code>CatDocumentosController</code> controller.
 *
 * @see com.uadec.web.CatDocumentosController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/zUadec-security-context.xml",
		"file:./resources/zUadec-service-context.xml",
		"file:./resources/zUadec-dao-context.xml",
		"file:./resources/zUadec-web-context.xml" })
public class CatDocumentosControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexCatDocumentos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexCatDocumentos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexCatDocumentos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatDocumentosController controller = (CatDocumentosController) context.getBean("CatDocumentosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCatDocumentos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCatDocumentos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCatDocumentos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatDocumentosController controller = (CatDocumentosController) context.getBean("CatDocumentosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCatDocumentos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCatDocumentos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCatDocumentos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatDocumentosController controller = (CatDocumentosController) context.getBean("CatDocumentosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCatDocumentos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCatDocumentos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCatDocumentos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatDocumentosController controller = (CatDocumentosController) context.getBean("CatDocumentosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCatDocumentos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCatDocumentos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCatDocumentos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatDocumentosController controller = (CatDocumentosController) context.getBean("CatDocumentosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCatDocumentos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCatDocumentos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCatDocumentos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatDocumentosController controller = (CatDocumentosController) context.getBean("CatDocumentosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCatDocumentos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCatDocumentos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCatDocumentos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatDocumentosController controller = (CatDocumentosController) context.getBean("CatDocumentosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>catdocumentosControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetcatdocumentosControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/catdocumentosController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatDocumentosController controller = (CatDocumentosController) context.getBean("CatDocumentosController");

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
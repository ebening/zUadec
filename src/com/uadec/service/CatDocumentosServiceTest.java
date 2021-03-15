
package com.uadec.service;

import com.uadec.domain.CatDocumentos;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./resources/zUadec-security-context.xml",
		"file:./resources/zUadec-service-context.xml",
		"file:./resources/zUadec-dao-context.xml",
		"file:./resources/zUadec-web-context.xml" })
@Transactional
public class CatDocumentosServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected CatDocumentosService service;

	/**
	 * Instantiates a new CatDocumentosServiceTest.
	 *
	 */
	public CatDocumentosServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findCatDocumentosByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findCatDocumentosByPrimaryKey 
		Integer idDocumento = 0;
		CatDocumentos response = null;
		response = service.findCatDocumentosByPrimaryKey(idDocumento);
		// TODO: JUnit - Add assertions to test outputs of operation: findCatDocumentosByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Delete an existing CatDocumentos entity
	* 
	 */
	@Test
	public void deleteCatDocumentos() {
		// TODO: JUnit - Populate test inputs for operation: deleteCatDocumentos 
		CatDocumentos catdocumentos = new com.uadec.domain.CatDocumentos();
		service.deleteCatDocumentos(catdocumentos);
	}

	/**
	 * Operation Unit Test
	* Load an existing CatDocumentos entity
	* 
	 */
	@Test
	public void loadCatDocumentoss() {
		Set<CatDocumentos> response = null;
		response = service.loadCatDocumentoss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadCatDocumentoss
	}

	/**
	 * Operation Unit Test
	* Save an existing CatDocumentos entity
	* 
	 */
	@Test
	public void saveCatDocumentos() {
		// TODO: JUnit - Populate test inputs for operation: saveCatDocumentos 
		CatDocumentos catdocumentos_1 = new com.uadec.domain.CatDocumentos();
		service.saveCatDocumentos(catdocumentos_1);
	}

	/**
	 * Operation Unit Test
	* Return all CatDocumentos entity
	* 
	 */
	@Test
	public void findAllCatDocumentoss() {
		// TODO: JUnit - Populate test inputs for operation: findAllCatDocumentoss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<CatDocumentos> response = null;
		response = service.findAllCatDocumentoss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllCatDocumentoss
	}

	/**
	 * Operation Unit Test
	* Return a count of all CatDocumentos entity
	* 
	 */
	@Test
	public void countCatDocumentoss() {
		Integer response = null;
		response = service.countCatDocumentoss();
		// TODO: JUnit - Add assertions to test outputs of operation: countCatDocumentoss
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
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}

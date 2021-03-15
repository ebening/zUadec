
package com.uadec.service;

import com.uadec.domain.RelTramiteDocumento;

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
public class RelTramiteDocumentoServiceTest {

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
	protected RelTramiteDocumentoService service;

	/**
	 * Instantiates a new RelTramiteDocumentoServiceTest.
	 *
	 */
	public RelTramiteDocumentoServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Return all RelTramiteDocumento entity
	* 
	 */
	@Test
	public void findAllRelTramiteDocumentos() {
		// TODO: JUnit - Populate test inputs for operation: findAllRelTramiteDocumentos 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<RelTramiteDocumento> response = null;
		response = service.findAllRelTramiteDocumentos(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRelTramiteDocumentos
	}

	/**
	 * Operation Unit Test
	* Return a count of all RelTramiteDocumento entity
	* 
	 */
	@Test
	public void countRelTramiteDocumentos() {
		Integer response = null;
		response = service.countRelTramiteDocumentos();
		// TODO: JUnit - Add assertions to test outputs of operation: countRelTramiteDocumentos
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRelTramiteDocumentoByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRelTramiteDocumentoByPrimaryKey 
		Integer idTramiteDoc = 0;
		RelTramiteDocumento response = null;
		response = service.findRelTramiteDocumentoByPrimaryKey(idTramiteDoc);
		// TODO: JUnit - Add assertions to test outputs of operation: findRelTramiteDocumentoByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Load an existing RelTramiteDocumento entity
	* 
	 */
	@Test
	public void loadRelTramiteDocumentos() {
		Set<RelTramiteDocumento> response = null;
		response = service.loadRelTramiteDocumentos();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRelTramiteDocumentos
	}

	/**
	 * Operation Unit Test
	* Save an existing RelTramiteDocumento entity
	* 
	 */
	@Test
	public void saveRelTramiteDocumento() {
		// TODO: JUnit - Populate test inputs for operation: saveRelTramiteDocumento 
		RelTramiteDocumento reltramitedocumento = new com.uadec.domain.RelTramiteDocumento();
		service.saveRelTramiteDocumento(reltramitedocumento);
	}

	/**
	 * Operation Unit Test
	* Delete an existing RelTramiteDocumento entity
	* 
	 */
	@Test
	public void deleteRelTramiteDocumento() {
		// TODO: JUnit - Populate test inputs for operation: deleteRelTramiteDocumento 
		RelTramiteDocumento reltramitedocumento_1 = new com.uadec.domain.RelTramiteDocumento();
		service.deleteRelTramiteDocumento(reltramitedocumento_1);
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

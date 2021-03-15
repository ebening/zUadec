
package com.uadec.service;

import com.uadec.domain.DocumentoImportado;

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
public class DocumentoImportadoServiceTest {

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
	protected DocumentoImportadoService service;

	/**
	 * Instantiates a new DocumentoImportadoServiceTest.
	 *
	 */
	public DocumentoImportadoServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Return a count of all DocumentoImportado entity
	* 
	 */
	@Test
	public void countDocumentoImportados() {
		Integer response = null;
		response = service.countDocumentoImportados();
		// TODO: JUnit - Add assertions to test outputs of operation: countDocumentoImportados
	}

	/**
	 * Operation Unit Test
	* Delete an existing DocumentoImportado entity
	* 
	 */
	@Test
	public void deleteDocumentoImportado() {
		// TODO: JUnit - Populate test inputs for operation: deleteDocumentoImportado 
		DocumentoImportado documentoimportado = new com.uadec.domain.DocumentoImportado();
		service.deleteDocumentoImportado(documentoimportado);
	}

	/**
	 * Operation Unit Test
	* Load an existing DocumentoImportado entity
	* 
	 */
	@Test
	public void loadDocumentoImportados() {
		Set<DocumentoImportado> response = null;
		response = service.loadDocumentoImportados();
		// TODO: JUnit - Add assertions to test outputs of operation: loadDocumentoImportados
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findDocumentoImportadoByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findDocumentoImportadoByPrimaryKey 
		Integer idDocumentoImportado = 0;
		DocumentoImportado response = null;
		response = service.findDocumentoImportadoByPrimaryKey(idDocumentoImportado);
		// TODO: JUnit - Add assertions to test outputs of operation: findDocumentoImportadoByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Return all DocumentoImportado entity
	* 
	 */
	@Test
	public void findAllDocumentoImportados() {
		// TODO: JUnit - Populate test inputs for operation: findAllDocumentoImportados 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<DocumentoImportado> response = null;
		response = service.findAllDocumentoImportados(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllDocumentoImportados
	}

	/**
	 * Operation Unit Test
	* Save an existing DocumentoImportado entity
	* 
	 */
	@Test
	public void saveDocumentoImportado() {
		// TODO: JUnit - Populate test inputs for operation: saveDocumentoImportado 
		DocumentoImportado documentoimportado_1 = new com.uadec.domain.DocumentoImportado();
		service.saveDocumentoImportado(documentoimportado_1);
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

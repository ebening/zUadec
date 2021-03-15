
package com.uadec.service;

import com.uadec.domain.Bitacora;

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
public class BitacoraServiceTest {

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
	protected BitacoraService service;

	/**
	 * Instantiates a new BitacoraServiceTest.
	 *
	 */
	public BitacoraServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Return all Bitacora entity
	* 
	 */
	@Test
	public void findAllBitacoras() {
		// TODO: JUnit - Populate test inputs for operation: findAllBitacoras 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Bitacora> response = null;
		response = service.findAllBitacoras(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllBitacoras
	}

	/**
	 * Operation Unit Test
	* Load an existing Bitacora entity
	* 
	 */
	@Test
	public void loadBitacoras() {
		Set<Bitacora> response = null;
		response = service.loadBitacoras();
		// TODO: JUnit - Add assertions to test outputs of operation: loadBitacoras
	}

	/**
	 * Operation Unit Test
	* Return a count of all Bitacora entity
	* 
	 */
	@Test
	public void countBitacoras() {
		Integer response = null;
		response = service.countBitacoras();
		// TODO: JUnit - Add assertions to test outputs of operation: countBitacoras
	}

	/**
	 * Operation Unit Test
	* Delete an existing Bitacora entity
	* 
	 */
	@Test
	public void deleteBitacora() {
		// TODO: JUnit - Populate test inputs for operation: deleteBitacora 
		Bitacora bitacora = new com.uadec.domain.Bitacora();
		service.deleteBitacora(bitacora);
	}

	/**
	 * Operation Unit Test
	* Save an existing Bitacora entity
	* 
	 */
	@Test
	public void saveBitacora() {
		// TODO: JUnit - Populate test inputs for operation: saveBitacora 
		Bitacora bitacora_1 = new com.uadec.domain.Bitacora();
		service.saveBitacora(bitacora_1);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findBitacoraByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findBitacoraByPrimaryKey 
		Integer idBitacora = 0;
		Bitacora response = null;
		response = service.findBitacoraByPrimaryKey(idBitacora);
		// TODO: JUnit - Add assertions to test outputs of operation: findBitacoraByPrimaryKey
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

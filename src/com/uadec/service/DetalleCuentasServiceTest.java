
package com.uadec.service;

import com.uadec.domain.DetalleCuentas;

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
public class DetalleCuentasServiceTest {

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
	protected DetalleCuentasService service;

	/**
	 * Instantiates a new DetalleCuentasServiceTest.
	 *
	 */
	public DetalleCuentasServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Return all DetalleCuentas entity
	* 
	 */
	@Test
	public void findAllDetalleCuentass() {
		// TODO: JUnit - Populate test inputs for operation: findAllDetalleCuentass 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<DetalleCuentas> response = null;
		response = service.findAllDetalleCuentass(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllDetalleCuentass
	}

	/**
	 * Operation Unit Test
	* Load an existing DetalleCuentas entity
	* 
	 */
	@Test
	public void loadDetalleCuentass() {
		Set<DetalleCuentas> response = null;
		response = service.loadDetalleCuentass();
		// TODO: JUnit - Add assertions to test outputs of operation: loadDetalleCuentass
	}

	/**
	 * Operation Unit Test
	* Save an existing DetalleCuentas entity
	* 
	 */
	@Test
	public void saveDetalleCuentas() {
		// TODO: JUnit - Populate test inputs for operation: saveDetalleCuentas 
		DetalleCuentas detallecuentas = new com.uadec.domain.DetalleCuentas();
		service.saveDetalleCuentas(detallecuentas);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findDetalleCuentasByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findDetalleCuentasByPrimaryKey 
		Integer idDetalleCuentas = 0;
		DetalleCuentas response = null;
		response = service.findDetalleCuentasByPrimaryKey(idDetalleCuentas);
		// TODO: JUnit - Add assertions to test outputs of operation: findDetalleCuentasByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Delete an existing DetalleCuentas entity
	* 
	 */
	@Test
	public void deleteDetalleCuentas() {
		// TODO: JUnit - Populate test inputs for operation: deleteDetalleCuentas 
		DetalleCuentas detallecuentas_1 = new com.uadec.domain.DetalleCuentas();
		service.deleteDetalleCuentas(detallecuentas_1);
	}

	/**
	 * Operation Unit Test
	* Return a count of all DetalleCuentas entity
	* 
	 */
	@Test
	public void countDetalleCuentass() {
		Integer response = null;
		response = service.countDetalleCuentass();
		// TODO: JUnit - Add assertions to test outputs of operation: countDetalleCuentass
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

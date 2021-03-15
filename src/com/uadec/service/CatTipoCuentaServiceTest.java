
package com.uadec.service;

import com.uadec.domain.CatTipoCuenta;

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
public class CatTipoCuentaServiceTest {

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
	protected CatTipoCuentaService service;

	/**
	 * Instantiates a new CatTipoCuentaServiceTest.
	 *
	 */
	public CatTipoCuentaServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Load an existing CatTipoCuenta entity
	* 
	 */
	@Test
	public void loadCatTipoCuentas() {
		Set<CatTipoCuenta> response = null;
		response = service.loadCatTipoCuentas();
		// TODO: JUnit - Add assertions to test outputs of operation: loadCatTipoCuentas
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findCatTipoCuentaByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findCatTipoCuentaByPrimaryKey 
		Integer idTipoCuenta = 0;
		CatTipoCuenta response = null;
		response = service.findCatTipoCuentaByPrimaryKey(idTipoCuenta);
		// TODO: JUnit - Add assertions to test outputs of operation: findCatTipoCuentaByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Delete an existing CatTipoCuenta entity
	* 
	 */
	@Test
	public void deleteCatTipoCuenta() {
		// TODO: JUnit - Populate test inputs for operation: deleteCatTipoCuenta 
		CatTipoCuenta cattipocuenta = new com.uadec.domain.CatTipoCuenta();
		service.deleteCatTipoCuenta(cattipocuenta);
	}

	/**
	 * Operation Unit Test
	* Save an existing CatTipoCuenta entity
	* 
	 */
	@Test
	public void saveCatTipoCuenta() {
		// TODO: JUnit - Populate test inputs for operation: saveCatTipoCuenta 
		CatTipoCuenta cattipocuenta_1 = new com.uadec.domain.CatTipoCuenta();
		service.saveCatTipoCuenta(cattipocuenta_1);
	}

	/**
	 * Operation Unit Test
	* Return a count of all CatTipoCuenta entity
	* 
	 */
	@Test
	public void countCatTipoCuentas() {
		Integer response = null;
		response = service.countCatTipoCuentas();
		// TODO: JUnit - Add assertions to test outputs of operation: countCatTipoCuentas
	}

	/**
	 * Operation Unit Test
	* Return all CatTipoCuenta entity
	* 
	 */
	@Test
	public void findAllCatTipoCuentas() {
		// TODO: JUnit - Populate test inputs for operation: findAllCatTipoCuentas 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<CatTipoCuenta> response = null;
		response = service.findAllCatTipoCuentas(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllCatTipoCuentas
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

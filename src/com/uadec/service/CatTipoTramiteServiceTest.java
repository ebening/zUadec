
package com.uadec.service;

import com.uadec.domain.CatTipoTramite;

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
public class CatTipoTramiteServiceTest {

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
	protected CatTipoTramiteService service;

	/**
	 * Instantiates a new CatTipoTramiteServiceTest.
	 *
	 */
	public CatTipoTramiteServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Return all CatTipoTramite entity
	* 
	 */
	@Test
	public void findAllCatTipoTramites() {
		// TODO: JUnit - Populate test inputs for operation: findAllCatTipoTramites 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<CatTipoTramite> response = null;
		response = service.findAllCatTipoTramites(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllCatTipoTramites
	}

	/**
	 * Operation Unit Test
	* Load an existing CatTipoTramite entity
	* 
	 */
	@Test
	public void loadCatTipoTramites() {
		Set<CatTipoTramite> response = null;
		response = service.loadCatTipoTramites();
		// TODO: JUnit - Add assertions to test outputs of operation: loadCatTipoTramites
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findCatTipoTramiteByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findCatTipoTramiteByPrimaryKey 
		Integer idTipoTramite = 0;
		CatTipoTramite response = null;
		response = service.findCatTipoTramiteByPrimaryKey(idTipoTramite);
		// TODO: JUnit - Add assertions to test outputs of operation: findCatTipoTramiteByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Delete an existing CatTipoTramite entity
	* 
	 */
	@Test
	public void deleteCatTipoTramite() {
		// TODO: JUnit - Populate test inputs for operation: deleteCatTipoTramite 
		CatTipoTramite cattipotramite = new com.uadec.domain.CatTipoTramite();
		service.deleteCatTipoTramite(cattipotramite);
	}

	/**
	 * Operation Unit Test
	* Return a count of all CatTipoTramite entity
	* 
	 */
	@Test
	public void countCatTipoTramites() {
		Integer response = null;
		response = service.countCatTipoTramites();
		// TODO: JUnit - Add assertions to test outputs of operation: countCatTipoTramites
	}

	/**
	 * Operation Unit Test
	* Save an existing CatTipoTramite entity
	* 
	 */
	@Test
	public void saveCatTipoTramite() {
		// TODO: JUnit - Populate test inputs for operation: saveCatTipoTramite 
		CatTipoTramite cattipotramite_1 = new com.uadec.domain.CatTipoTramite();
		service.saveCatTipoTramite(cattipotramite_1);
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

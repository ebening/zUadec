
package com.uadec.service;

import com.uadec.domain.Solicitud;

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
public class SolicitudServiceTest {

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
	protected SolicitudService service;

	/**
	 * Instantiates a new SolicitudServiceTest.
	 *
	 */
	public SolicitudServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Save an existing Solicitud entity
	* 
	 */
	@Test
	public void saveSolicitud() {
		// TODO: JUnit - Populate test inputs for operation: saveSolicitud 
		Solicitud solicitud = new com.uadec.domain.Solicitud();
		service.saveSolicitud(solicitud);
	}

	/**
	 * Operation Unit Test
	* Return a count of all Solicitud entity
	* 
	 */
	@Test
	public void countSolicituds() {
		Integer response = null;
		response = service.countSolicituds();
		// TODO: JUnit - Add assertions to test outputs of operation: countSolicituds
	}

	/**
	 * Operation Unit Test
	* Delete an existing Solicitud entity
	* 
	 */
	@Test
	public void deleteSolicitud() {
		// TODO: JUnit - Populate test inputs for operation: deleteSolicitud 
		Solicitud solicitud_1 = new com.uadec.domain.Solicitud();
		service.deleteSolicitud(solicitud_1);
	}

	/**
	 * Operation Unit Test
	* Load an existing Solicitud entity
	* 
	 */
	@Test
	public void loadSolicituds() {
		Set<Solicitud> response = null;
		response = service.loadSolicituds();
		// TODO: JUnit - Add assertions to test outputs of operation: loadSolicituds
	}

	/**
	 * Operation Unit Test
	* Return all Solicitud entity
	* 
	 */
	@Test
	public void findAllSolicituds() {
		// TODO: JUnit - Populate test inputs for operation: findAllSolicituds 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Solicitud> response = null;
		response = service.findAllSolicituds(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllSolicituds
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findSolicitudByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findSolicitudByPrimaryKey 
		Integer idSolicitud = 0;
		Solicitud response = null;
		response = service.findSolicitudByPrimaryKey(idSolicitud);
		// TODO: JUnit - Add assertions to test outputs of operation: findSolicitudByPrimaryKey
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

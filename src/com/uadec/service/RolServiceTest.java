
package com.uadec.service;

import com.uadec.domain.Rol;

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
public class RolServiceTest {

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
	protected RolService service;

	/**
	 * Instantiates a new RolServiceTest.
	 *
	 */
	public RolServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRolByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRolByPrimaryKey 
		Integer idRol = 0;
		Rol response = null;
		response = service.findRolByPrimaryKey(idRol);
		// TODO: JUnit - Add assertions to test outputs of operation: findRolByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Save an existing Rol entity
	* 
	 */
	@Test
	public void saveRol() {
		// TODO: JUnit - Populate test inputs for operation: saveRol 
		Rol rol = new com.uadec.domain.Rol();
		service.saveRol(rol);
	}

	/**
	 * Operation Unit Test
	* Load an existing Rol entity
	* 
	 */
	@Test
	public void loadRols() {
		Set<Rol> response = null;
		response = service.loadRols();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRols
	}

	/**
	 * Operation Unit Test
	* Delete an existing Rol entity
	* 
	 */
	@Test
	public void deleteRol() {
		// TODO: JUnit - Populate test inputs for operation: deleteRol 
		Rol rol_1 = new com.uadec.domain.Rol();
		service.deleteRol(rol_1);
	}

	/**
	 * Operation Unit Test
	* Return all Rol entity
	* 
	 */
	@Test
	public void findAllRols() {
		// TODO: JUnit - Populate test inputs for operation: findAllRols 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Rol> response = null;
		response = service.findAllRols(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRols
	}

	/**
	 * Operation Unit Test
	* Return a count of all Rol entity
	* 
	 */
	@Test
	public void countRols() {
		Integer response = null;
		response = service.countRols();
		// TODO: JUnit - Add assertions to test outputs of operation: countRols
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

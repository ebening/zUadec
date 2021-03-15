
package com.uadec.service;

import com.uadec.domain.Usuario;

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
public class UsuarioServiceTest {

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
	protected UsuarioService service;

	/**
	 * Instantiates a new UsuarioServiceTest.
	 *
	 */
	public UsuarioServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Return all Usuario entity
	* 
	 */
	@Test
	public void findAllUsuarios() {
		// TODO: JUnit - Populate test inputs for operation: findAllUsuarios 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Usuario> response = null;
		response = service.findAllUsuarios(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllUsuarios
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findUsuarioByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findUsuarioByPrimaryKey 
		Integer idUsuario = 0;
		Usuario response = null;
		response = service.findUsuarioByPrimaryKey(idUsuario);
		// TODO: JUnit - Add assertions to test outputs of operation: findUsuarioByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Delete an existing Usuario entity
	* 
	 */
	@Test
	public void deleteUsuario() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsuario 
		Usuario usuario = new com.uadec.domain.Usuario();
		service.deleteUsuario(usuario);
	}

	/**
	 * Operation Unit Test
	* Return a count of all Usuario entity
	* 
	 */
	@Test
	public void countUsuarios() {
		Integer response = null;
		response = service.countUsuarios();
		// TODO: JUnit - Add assertions to test outputs of operation: countUsuarios
	}

	/**
	 * Operation Unit Test
	* Load an existing Usuario entity
	* 
	 */
	@Test
	public void loadUsuarios() {
		Set<Usuario> response = null;
		response = service.loadUsuarios();
		// TODO: JUnit - Add assertions to test outputs of operation: loadUsuarios
	}

	/**
	 * Operation Unit Test
	* Save an existing Usuario entity
	* 
	 */
	@Test
	public void saveUsuario() {
		// TODO: JUnit - Populate test inputs for operation: saveUsuario 
		Usuario usuario_1 = new com.uadec.domain.Usuario();
		service.saveUsuario(usuario_1);
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

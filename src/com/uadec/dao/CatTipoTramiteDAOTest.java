
package com.uadec.dao;

import com.uadec.domain.CatTipoTramite;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.annotation.Rollback;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

/**
 * Class used to test the basic Data Store Functionality
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@Transactional
@ContextConfiguration(locations = {
		"file:./resources/zUadec-security-context.xml",
		"file:./resources/zUadec-service-context.xml",
		"file:./resources/zUadec-dao-context.xml",
		"file:./resources/zUadec-web-context.xml" })
public class CatTipoTramiteDAOTest {
	/**
	 * The DAO being tested, injected by Spring
	 *
	 */
	private CatTipoTramiteDAO dataStore;

	/**
	 * Instantiates a new CatTipoTramiteDAOTest.
	 *
	 */
	public CatTipoTramiteDAOTest() {
	}

	/**
	* Method to test CatTipoTramite domain object.
	*
	*/
	@Rollback(false)
	@Test
	public void CatTipoTramite() {
		CatTipoTramite instance = new CatTipoTramite();

		// Test create				
		// TODO: Populate instance for create.  The store will fail if the primary key fields are blank.				

		// store the object
		dataStore.store(instance);

		// Test update
		// TODO: Modify non-key domain object values for update

		// update the object
		dataStore.store(instance);

		// Test delete
		dataStore.remove(instance);

	}

	/**
	 * Method to allow Spring to inject the DAO that will be tested
	 *
	*/
	@Autowired
	public void setDataStore(CatTipoTramiteDAO dataStore) {
		this.dataStore = dataStore;
	}
}

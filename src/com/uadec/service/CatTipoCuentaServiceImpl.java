package com.uadec.service;

import com.uadec.dao.CatTipoCuentaDAO;

import com.uadec.domain.CatTipoCuenta;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for CatTipoCuenta entities
 * 
 */

@Service("CatTipoCuentaService")

@Transactional
public class CatTipoCuentaServiceImpl implements CatTipoCuentaService {

	/**
	 * DAO injected by Spring that manages CatTipoCuenta entities
	 * 
	 */
	@Autowired
	private CatTipoCuentaDAO catTipoCuentaDAO;

	/**
	 * Instantiates a new CatTipoCuentaServiceImpl.
	 *
	 */
	public CatTipoCuentaServiceImpl() {
	}

	/**
	 * Load an existing CatTipoCuenta entity
	 * 
	 */
	@Transactional
	public Set<CatTipoCuenta> loadCatTipoCuentas() {
		return catTipoCuentaDAO.findAllCatTipoCuentas();
	}

	/**
	 */
	@Transactional
	public CatTipoCuenta findCatTipoCuentaByPrimaryKey(Integer idTipoCuenta) {
		return catTipoCuentaDAO.findCatTipoCuentaByPrimaryKey(idTipoCuenta);
	}

	/**
	 * Delete an existing CatTipoCuenta entity
	 * 
	 */
	@Transactional
	public void deleteCatTipoCuenta(CatTipoCuenta cattipocuenta) {
		catTipoCuentaDAO.remove(cattipocuenta);
		catTipoCuentaDAO.flush();
	}

	/**
	 * Save an existing CatTipoCuenta entity
	 * 
	 */
	@Transactional
	public void saveCatTipoCuenta(CatTipoCuenta cattipocuenta) {
		CatTipoCuenta existingCatTipoCuenta = catTipoCuentaDAO.findCatTipoCuentaByPrimaryKey(cattipocuenta.getIdTipoCuenta());

		if (existingCatTipoCuenta != null) {
			if (existingCatTipoCuenta != cattipocuenta) {
				existingCatTipoCuenta.setIdTipoCuenta(cattipocuenta.getIdTipoCuenta());
				existingCatTipoCuenta.setDescripcion(cattipocuenta.getDescripcion());
			}
			cattipocuenta = catTipoCuentaDAO.store(existingCatTipoCuenta);
		} else {
			cattipocuenta = catTipoCuentaDAO.store(cattipocuenta);
		}
		catTipoCuentaDAO.flush();
	}

	/**
	 * Return a count of all CatTipoCuenta entity
	 * 
	 */
	@Transactional
	public Integer countCatTipoCuentas() {
		return ((Long) catTipoCuentaDAO.createQuerySingleResult("select count(o) from CatTipoCuenta o").getSingleResult()).intValue();
	}

	/**
	 * Return all CatTipoCuenta entity
	 * 
	 */
	@Transactional
	public List<CatTipoCuenta> findAllCatTipoCuentas(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<CatTipoCuenta>(catTipoCuentaDAO.findAllCatTipoCuentas(startResult, maxRows));
	}
}

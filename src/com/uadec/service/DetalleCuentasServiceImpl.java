package com.uadec.service;

import com.uadec.dao.DetalleCuentasDAO;

import com.uadec.domain.DetalleCuentas;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for DetalleCuentas entities
 * 
 */

@Service("DetalleCuentasService")

@Transactional
public class DetalleCuentasServiceImpl implements DetalleCuentasService {

	/**
	 * DAO injected by Spring that manages DetalleCuentas entities
	 * 
	 */
	@Autowired
	private DetalleCuentasDAO detalleCuentasDAO;

	/**
	 * Instantiates a new DetalleCuentasServiceImpl.
	 *
	 */
	public DetalleCuentasServiceImpl() {
	}

	/**
	 * Return all DetalleCuentas entity
	 * 
	 */
	@Transactional
	public List<DetalleCuentas> findAllDetalleCuentass(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<DetalleCuentas>(detalleCuentasDAO.findAllDetalleCuentass(startResult, maxRows));
	}

	/**
	 * Load an existing DetalleCuentas entity
	 * 
	 */
	@Transactional
	public Set<DetalleCuentas> loadDetalleCuentass() {
		return detalleCuentasDAO.findAllDetalleCuentass();
	}

	/**
	 * Save an existing DetalleCuentas entity
	 * 
	 */
	@Transactional
	public void saveDetalleCuentas(DetalleCuentas detallecuentas) {
		DetalleCuentas existingDetalleCuentas = detalleCuentasDAO.findDetalleCuentasByPrimaryKey(detallecuentas.getIdDetalleCuentas());

		if (existingDetalleCuentas != null) {
			if (existingDetalleCuentas != detallecuentas) {
				existingDetalleCuentas.setIdDetalleCuentas(detallecuentas.getIdDetalleCuentas());
				existingDetalleCuentas.setNumero(detallecuentas.getNumero());
				existingDetalleCuentas.setCiclo(detallecuentas.getCiclo());
				existingDetalleCuentas.setCuentaPagar(detallecuentas.getCuentaPagar());
				existingDetalleCuentas.setIdTipoCuenta(detallecuentas.getIdTipoCuenta());
			}
			detallecuentas = detalleCuentasDAO.store(existingDetalleCuentas);
		} else {
			detallecuentas = detalleCuentasDAO.store(detallecuentas);
		}
		detalleCuentasDAO.flush();
	}

	/**
	 */
	@Transactional
	public DetalleCuentas findDetalleCuentasByPrimaryKey(Integer idDetalleCuentas) {
		return detalleCuentasDAO.findDetalleCuentasByPrimaryKey(idDetalleCuentas);
	}

	/**
	 * Delete an existing DetalleCuentas entity
	 * 
	 */
	@Transactional
	public void deleteDetalleCuentas(DetalleCuentas detallecuentas) {
		detalleCuentasDAO.remove(detallecuentas);
		detalleCuentasDAO.flush();
	}

	/**
	 * Return a count of all DetalleCuentas entity
	 * 
	 */
	@Transactional
	public Integer countDetalleCuentass() {
		return ((Long) detalleCuentasDAO.createQuerySingleResult("select count(o) from DetalleCuentas o").getSingleResult()).intValue();
	}
}

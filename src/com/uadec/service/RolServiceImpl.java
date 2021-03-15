package com.uadec.service;

import com.uadec.dao.RolDAO;

import com.uadec.domain.Rol;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Rol entities
 * 
 */

@Service("RolService")

@Transactional
public class RolServiceImpl implements RolService {

	/**
	 * DAO injected by Spring that manages Rol entities
	 * 
	 */
	@Autowired
	private RolDAO rolDAO;

	/**
	 * Instantiates a new RolServiceImpl.
	 *
	 */
	public RolServiceImpl() {
	}

	/**
	 */
	@Transactional
	public Rol findRolByPrimaryKey(Integer idRol) {
		return rolDAO.findRolByPrimaryKey(idRol);
	}

	/**
	 * Save an existing Rol entity
	 * 
	 */
	@Transactional
	public void saveRol(Rol rol) {
		Rol existingRol = rolDAO.findRolByPrimaryKey(rol.getIdRol());

		if (existingRol != null) {
			if (existingRol != rol) {
				existingRol.setIdRol(rol.getIdRol());
				existingRol.setNombreRol(rol.getNombreRol());
			}
			rol = rolDAO.store(existingRol);
		} else {
			rol = rolDAO.store(rol);
		}
		rolDAO.flush();
	}

	/**
	 * Load an existing Rol entity
	 * 
	 */
	@Transactional
	public Set<Rol> loadRols() {
		return rolDAO.findAllRols();
	}

	/**
	 * Delete an existing Rol entity
	 * 
	 */
	@Transactional
	public void deleteRol(Rol rol) {
		rolDAO.remove(rol);
		rolDAO.flush();
	}

	/**
	 * Return all Rol entity
	 * 
	 */
	@Transactional
	public List<Rol> findAllRols(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Rol>(rolDAO.findAllRols(startResult, maxRows));
	}

	/**
	 * Return a count of all Rol entity
	 * 
	 */
	@Transactional
	public Integer countRols() {
		return ((Long) rolDAO.createQuerySingleResult("select count(o) from Rol o").getSingleResult()).intValue();
	}
}

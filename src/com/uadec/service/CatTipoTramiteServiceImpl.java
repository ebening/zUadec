package com.uadec.service;

import com.uadec.dao.CatTipoTramiteDAO;

import com.uadec.domain.CatTipoTramite;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for CatTipoTramite entities
 * 
 */

@Service("CatTipoTramiteService")

@Transactional
public class CatTipoTramiteServiceImpl implements CatTipoTramiteService {

	/**
	 * DAO injected by Spring that manages CatTipoTramite entities
	 * 
	 */
	@Autowired
	private CatTipoTramiteDAO catTipoTramiteDAO;

	/**
	 * Instantiates a new CatTipoTramiteServiceImpl.
	 *
	 */
	public CatTipoTramiteServiceImpl() {
	}

	/**
	 * Return all CatTipoTramite entity
	 * 
	 */
	@Transactional
	public List<CatTipoTramite> findAllCatTipoTramites(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<CatTipoTramite>(catTipoTramiteDAO.findAllCatTipoTramites(startResult, maxRows));
	}

	/**
	 * Load an existing CatTipoTramite entity
	 * 
	 */
	@Transactional
	public Set<CatTipoTramite> loadCatTipoTramites() {
		return catTipoTramiteDAO.findAllCatTipoTramites();
	}

	/**
	 */
	@Transactional
	public CatTipoTramite findCatTipoTramiteByPrimaryKey(Integer idTipoTramite) {
		return catTipoTramiteDAO.findCatTipoTramiteByPrimaryKey(idTipoTramite);
	}

	/**
	 * Delete an existing CatTipoTramite entity
	 * 
	 */
	@Transactional
	public void deleteCatTipoTramite(CatTipoTramite cattipotramite) {
		catTipoTramiteDAO.remove(cattipotramite);
		catTipoTramiteDAO.flush();
	}

	/**
	 * Return a count of all CatTipoTramite entity
	 * 
	 */
	@Transactional
	public Integer countCatTipoTramites() {
		return ((Long) catTipoTramiteDAO.createQuerySingleResult("select count(o) from CatTipoTramite o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing CatTipoTramite entity
	 * 
	 */
	@Transactional
	public void saveCatTipoTramite(CatTipoTramite cattipotramite) {
		CatTipoTramite existingCatTipoTramite = catTipoTramiteDAO.findCatTipoTramiteByPrimaryKey(cattipotramite.getIdTipoTramite());

		if (existingCatTipoTramite != null) {
			if (existingCatTipoTramite != cattipotramite) {
				existingCatTipoTramite.setIdTipoTramite(cattipotramite.getIdTipoTramite());
				existingCatTipoTramite.setDescripcion(cattipotramite.getDescripcion());
			}
			cattipotramite = catTipoTramiteDAO.store(existingCatTipoTramite);
		} else {
			cattipotramite = catTipoTramiteDAO.store(cattipotramite);
		}
		catTipoTramiteDAO.flush();
	}
}

package com.uadec.service;

import com.uadec.dao.CatDocumentosDAO;

import com.uadec.domain.CatDocumentos;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for CatDocumentos entities
 * 
 */

@Service("CatDocumentosService")

@Transactional
public class CatDocumentosServiceImpl implements CatDocumentosService {

	/**
	 * DAO injected by Spring that manages CatDocumentos entities
	 * 
	 */
	@Autowired
	private CatDocumentosDAO catDocumentosDAO;

	/**
	 * Instantiates a new CatDocumentosServiceImpl.
	 *
	 */
	public CatDocumentosServiceImpl() {
	}

	/**
	 */
	@Transactional
	public CatDocumentos findCatDocumentosByPrimaryKey(Integer idDocumento) {
		return catDocumentosDAO.findCatDocumentosByPrimaryKey(idDocumento);
	}

	/**
	 * Delete an existing CatDocumentos entity
	 * 
	 */
	@Transactional
	public void deleteCatDocumentos(CatDocumentos catdocumentos) {
		catDocumentosDAO.remove(catdocumentos);
		catDocumentosDAO.flush();
	}

	/**
	 * Load an existing CatDocumentos entity
	 * 
	 */
	@Transactional
	public Set<CatDocumentos> loadCatDocumentoss() {
		return catDocumentosDAO.findAllCatDocumentoss();
	}

	/**
	 * Save an existing CatDocumentos entity
	 * 
	 */
	@Transactional
	public void saveCatDocumentos(CatDocumentos catdocumentos) {
		CatDocumentos existingCatDocumentos = catDocumentosDAO.findCatDocumentosByPrimaryKey(catdocumentos.getIdDocumento());

		if (existingCatDocumentos != null) {
			if (existingCatDocumentos != catdocumentos) {
				existingCatDocumentos.setIdDocumento(catdocumentos.getIdDocumento());
				existingCatDocumentos.setDescripcion(catdocumentos.getDescripcion());
			}
			catdocumentos = catDocumentosDAO.store(existingCatDocumentos);
		} else {
			catdocumentos = catDocumentosDAO.store(catdocumentos);
		}
		catDocumentosDAO.flush();
	}

	/**
	 * Return all CatDocumentos entity
	 * 
	 */
	@Transactional
	public List<CatDocumentos> findAllCatDocumentoss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<CatDocumentos>(catDocumentosDAO.findAllCatDocumentoss(startResult, maxRows));
	}

	/**
	 * Return a count of all CatDocumentos entity
	 * 
	 */
	@Transactional
	public Integer countCatDocumentoss() {
		return ((Long) catDocumentosDAO.createQuerySingleResult("select count(o) from CatDocumentos o").getSingleResult()).intValue();
	}
}

package com.uadec.service;

import com.uadec.dao.RelTramiteDocumentoDAO;

import com.uadec.domain.RelTramiteDocumento;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for RelTramiteDocumento entities
 * 
 */

@Service("RelTramiteDocumentoService")

@Transactional
public class RelTramiteDocumentoServiceImpl implements RelTramiteDocumentoService {

	/**
	 * DAO injected by Spring that manages RelTramiteDocumento entities
	 * 
	 */
	@Autowired
	private RelTramiteDocumentoDAO relTramiteDocumentoDAO;

	/**
	 * Instantiates a new RelTramiteDocumentoServiceImpl.
	 *
	 */
	public RelTramiteDocumentoServiceImpl() {
	}

	/**
	 * Return all RelTramiteDocumento entity
	 * 
	 */
	@Transactional
	public List<RelTramiteDocumento> findAllRelTramiteDocumentos(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<RelTramiteDocumento>(relTramiteDocumentoDAO.findAllRelTramiteDocumentos(startResult, maxRows));
	}

	/**
	 * Return a count of all RelTramiteDocumento entity
	 * 
	 */
	@Transactional
	public Integer countRelTramiteDocumentos() {
		return ((Long) relTramiteDocumentoDAO.createQuerySingleResult("select count(o) from RelTramiteDocumento o").getSingleResult()).intValue();
	}

	/**
	 */
	@Transactional
	public RelTramiteDocumento findRelTramiteDocumentoByPrimaryKey(Integer idTramiteDoc) {
		return relTramiteDocumentoDAO.findRelTramiteDocumentoByPrimaryKey(idTramiteDoc);
	}

	/**
	 * Load an existing RelTramiteDocumento entity
	 * 
	 */
	@Transactional
	public Set<RelTramiteDocumento> loadRelTramiteDocumentos() {
		return relTramiteDocumentoDAO.findAllRelTramiteDocumentos();
	}

	/**
	 * Save an existing RelTramiteDocumento entity
	 * 
	 */
	@Transactional
	public void saveRelTramiteDocumento(RelTramiteDocumento reltramitedocumento) {
		RelTramiteDocumento existingRelTramiteDocumento = relTramiteDocumentoDAO.findRelTramiteDocumentoByPrimaryKey(reltramitedocumento.getIdTramiteDoc());

		if (existingRelTramiteDocumento != null) {
			if (existingRelTramiteDocumento != reltramitedocumento) {
				existingRelTramiteDocumento.setIdTramiteDoc(reltramitedocumento.getIdTramiteDoc());
				existingRelTramiteDocumento.setIdTipoTramite(reltramitedocumento.getIdTipoTramite());
				existingRelTramiteDocumento.setIdDocumento(reltramitedocumento.getIdDocumento());
			}
			reltramitedocumento = relTramiteDocumentoDAO.store(existingRelTramiteDocumento);
		} else {
			reltramitedocumento = relTramiteDocumentoDAO.store(reltramitedocumento);
		}
		relTramiteDocumentoDAO.flush();
	}

	/**
	 * Delete an existing RelTramiteDocumento entity
	 * 
	 */
	@Transactional
	public void deleteRelTramiteDocumento(RelTramiteDocumento reltramitedocumento) {
		relTramiteDocumentoDAO.remove(reltramitedocumento);
		relTramiteDocumentoDAO.flush();
	}
}

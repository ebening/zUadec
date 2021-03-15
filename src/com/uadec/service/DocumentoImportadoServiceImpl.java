package com.uadec.service;

import com.uadec.dao.DocumentoImportadoDAO;

import com.uadec.domain.DocumentoImportado;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for DocumentoImportado entities
 * 
 */

@Service("DocumentoImportadoService")

@Transactional
public class DocumentoImportadoServiceImpl implements DocumentoImportadoService {

	/**
	 * DAO injected by Spring that manages DocumentoImportado entities
	 * 
	 */
	@Autowired
	private DocumentoImportadoDAO documentoImportadoDAO;

	/**
	 * Instantiates a new DocumentoImportadoServiceImpl.
	 *
	 */
	public DocumentoImportadoServiceImpl() {
	}

	/**
	 * Return a count of all DocumentoImportado entity
	 * 
	 */
	@Transactional
	public Integer countDocumentoImportados() {
		return ((Long) documentoImportadoDAO.createQuerySingleResult("select count(o) from DocumentoImportado o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing DocumentoImportado entity
	 * 
	 */
	@Transactional
	public void deleteDocumentoImportado(DocumentoImportado documentoimportado) {
		documentoImportadoDAO.remove(documentoimportado);
		documentoImportadoDAO.flush();
	}

	/**
	 * Load an existing DocumentoImportado entity
	 * 
	 */
	@Transactional
	public Set<DocumentoImportado> loadDocumentoImportados() {
		return documentoImportadoDAO.findAllDocumentoImportados();
	}

	/**
	 */
	@Transactional
	public DocumentoImportado findDocumentoImportadoByPrimaryKey(Integer idDocumentoImportado) {
		return documentoImportadoDAO.findDocumentoImportadoByPrimaryKey(idDocumentoImportado);
	}

	/**
	 * Return all DocumentoImportado entity
	 * 
	 */
	@Transactional
	public List<DocumentoImportado> findAllDocumentoImportados(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<DocumentoImportado>(documentoImportadoDAO.findAllDocumentoImportados(startResult, maxRows));
	}

	/**
	 * Save an existing DocumentoImportado entity
	 * 
	 */
	@Transactional
	public void saveDocumentoImportado(DocumentoImportado documentoimportado) {
		DocumentoImportado existingDocumentoImportado = documentoImportadoDAO.findDocumentoImportadoByPrimaryKey(documentoimportado.getIdDocumentoImportado());

		if (existingDocumentoImportado != null) {
			if (existingDocumentoImportado != documentoimportado) {
				existingDocumentoImportado.setIdDocumentoImportado(documentoimportado.getIdDocumentoImportado());
				existingDocumentoImportado.setNombredoc(documentoimportado.getNombredoc());
				existingDocumentoImportado.setIdSolicitud(documentoimportado.getIdSolicitud());
				existingDocumentoImportado.setIdDocumento(documentoimportado.getIdDocumento());
				existingDocumentoImportado.setIdUsuario(documentoimportado.getIdUsuario());
				existingDocumentoImportado.setPid(documentoimportado.getPid());
			}
			documentoimportado = documentoImportadoDAO.store(existingDocumentoImportado);
		} else {
			documentoimportado = documentoImportadoDAO.store(documentoimportado);
		}
		documentoImportadoDAO.flush();
	}
}

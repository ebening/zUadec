
package com.uadec.service;

import com.uadec.domain.DocumentoImportado;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for DocumentoImportado entities
 * 
 */
public interface DocumentoImportadoService {

	/**
	* Return a count of all DocumentoImportado entity
	* 
	 */
	public Integer countDocumentoImportados();

	/**
	* Delete an existing DocumentoImportado entity
	* 
	 */
	public void deleteDocumentoImportado(DocumentoImportado documentoimportado);

	/**
	* Load an existing DocumentoImportado entity
	* 
	 */
	public Set<DocumentoImportado> loadDocumentoImportados();

	/**
	 */
	public DocumentoImportado findDocumentoImportadoByPrimaryKey(Integer idDocumentoImportado);

	/**
	* Return all DocumentoImportado entity
	* 
	 */
	public List<DocumentoImportado> findAllDocumentoImportados(Integer startResult, Integer maxRows);

	/**
	* Save an existing DocumentoImportado entity
	* 
	 */
	public void saveDocumentoImportado(DocumentoImportado documentoimportado_1);
}
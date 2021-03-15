
package com.uadec.service;

import com.uadec.domain.CatDocumentos;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for CatDocumentos entities
 * 
 */
public interface CatDocumentosService {

	/**
	 */
	public CatDocumentos findCatDocumentosByPrimaryKey(Integer idDocumento);

	/**
	* Delete an existing CatDocumentos entity
	* 
	 */
	public void deleteCatDocumentos(CatDocumentos catdocumentos);

	/**
	* Load an existing CatDocumentos entity
	* 
	 */
	public Set<CatDocumentos> loadCatDocumentoss();

	/**
	* Save an existing CatDocumentos entity
	* 
	 */
	public void saveCatDocumentos(CatDocumentos catdocumentos_1);

	/**
	* Return all CatDocumentos entity
	* 
	 */
	public List<CatDocumentos> findAllCatDocumentoss(Integer startResult, Integer maxRows);

	/**
	* Return a count of all CatDocumentos entity
	* 
	 */
	public Integer countCatDocumentoss();
}
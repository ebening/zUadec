
package com.uadec.service;

import com.uadec.domain.RelTramiteDocumento;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for RelTramiteDocumento entities
 * 
 */
public interface RelTramiteDocumentoService {

	/**
	* Return all RelTramiteDocumento entity
	* 
	 */
	public List<RelTramiteDocumento> findAllRelTramiteDocumentos(Integer startResult, Integer maxRows);

	/**
	* Return a count of all RelTramiteDocumento entity
	* 
	 */
	public Integer countRelTramiteDocumentos();

	/**
	 */
	public RelTramiteDocumento findRelTramiteDocumentoByPrimaryKey(Integer idTramiteDoc);

	/**
	* Load an existing RelTramiteDocumento entity
	* 
	 */
	public Set<RelTramiteDocumento> loadRelTramiteDocumentos();

	/**
	* Save an existing RelTramiteDocumento entity
	* 
	 */
	public void saveRelTramiteDocumento(RelTramiteDocumento reltramitedocumento);

	/**
	* Delete an existing RelTramiteDocumento entity
	* 
	 */
	public void deleteRelTramiteDocumento(RelTramiteDocumento reltramitedocumento_1);
}
package com.uadec.service;

import com.uadec.dao.SolicitudDAO;

import com.uadec.domain.Solicitud;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Solicitud entities
 * 
 */

@Service("SolicitudService")

@Transactional
public class SolicitudServiceImpl implements SolicitudService {

	/**
	 * DAO injected by Spring that manages Solicitud entities
	 * 
	 */
	@Autowired
	private SolicitudDAO solicitudDAO;

	/**
	 * Instantiates a new SolicitudServiceImpl.
	 *
	 */
	public SolicitudServiceImpl() {
	}

	/**
	 * Save an existing Solicitud entity
	 * 
	 */
	@Transactional
	public void saveSolicitud(Solicitud solicitud) {
		Solicitud existingSolicitud = solicitudDAO.findSolicitudByPrimaryKey(solicitud.getIdSolicitud());

		if (existingSolicitud != null) {
			if (existingSolicitud != solicitud) {
				existingSolicitud.setIdSolicitud(solicitud.getIdSolicitud());
				existingSolicitud.setFechaSolicitud(solicitud.getFechaSolicitud());
				existingSolicitud.setFondo(solicitud.getFondo());
				existingSolicitud.setNCbancaria(solicitud.getNCbancaria());
				existingSolicitud.setUnidadOrg(solicitud.getUnidadOrg());
				existingSolicitud.setImporte(solicitud.getImporte());
				existingSolicitud.setAutorizador(solicitud.getAutorizador());
				existingSolicitud.setElaborador(solicitud.getElaborador());
				existingSolicitud.setContrato(solicitud.getContrato());
				existingSolicitud.setRfcProveedor(solicitud.getRfcProveedor());
				existingSolicitud.setCheque(solicitud.getCheque());
				existingSolicitud.setIdTipoTramite(solicitud.getIdTipoTramite());
				existingSolicitud.setCuentaPagar(solicitud.getCuentaPagar());
				existingSolicitud.setCiclo(solicitud.getCiclo());
				existingSolicitud.setFolioVentanilla(solicitud.getFolioVentanilla());
				existingSolicitud.setFolioSdr(solicitud.getFolioSdr());
				existingSolicitud.setNCompromiso(solicitud.getNCompromiso());
				existingSolicitud.setClaveBeneficiario(solicitud.getClaveBeneficiario());
			}
			solicitud = solicitudDAO.store(existingSolicitud);
		} else {
			solicitud = solicitudDAO.store(solicitud);
		}
		solicitudDAO.flush();
	}

	/**
	 * Return a count of all Solicitud entity
	 * 
	 */
	@Transactional
	public Integer countSolicituds() {
		return ((Long) solicitudDAO.createQuerySingleResult("select count(o) from Solicitud o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Solicitud entity
	 * 
	 */
	@Transactional
	public void deleteSolicitud(Solicitud solicitud) {
		solicitudDAO.remove(solicitud);
		solicitudDAO.flush();
	}

	/**
	 * Load an existing Solicitud entity
	 * 
	 */
	@Transactional
	public Set<Solicitud> loadSolicituds() {
		return solicitudDAO.findAllSolicituds();
	}

	/**
	 * Return all Solicitud entity
	 * 
	 */
	@Transactional
	public List<Solicitud> findAllSolicituds(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Solicitud>(solicitudDAO.findAllSolicituds(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public Solicitud findSolicitudByPrimaryKey(Integer idSolicitud) {
		return solicitudDAO.findSolicitudByPrimaryKey(idSolicitud);
	}
}

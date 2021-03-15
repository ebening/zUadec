package com.uadec.service;

import com.uadec.dao.BitacoraDAO;

import com.uadec.domain.Bitacora;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Bitacora entities
 * 
 */

@Service("BitacoraService")

@Transactional
public class BitacoraServiceImpl implements BitacoraService {

	/**
	 * DAO injected by Spring that manages Bitacora entities
	 * 
	 */
	@Autowired
	private BitacoraDAO bitacoraDAO;

	/**
	 * Instantiates a new BitacoraServiceImpl.
	 *
	 */
	public BitacoraServiceImpl() {
	}

	/**
	 * Return all Bitacora entity
	 * 
	 */
	@Transactional
	public List<Bitacora> findAllBitacoras(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Bitacora>(bitacoraDAO.findAllBitacoras(startResult, maxRows));
	}

	/**
	 * Load an existing Bitacora entity
	 * 
	 */
	@Transactional
	public Set<Bitacora> loadBitacoras() {
		return bitacoraDAO.findAllBitacoras();
	}

	/**
	 * Return a count of all Bitacora entity
	 * 
	 */
	@Transactional
	public Integer countBitacoras() {
		return ((Long) bitacoraDAO.createQuerySingleResult("select count(o) from Bitacora o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Bitacora entity
	 * 
	 */
	@Transactional
	public void deleteBitacora(Bitacora bitacora) {
		bitacoraDAO.remove(bitacora);
		bitacoraDAO.flush();
	}

	/**
	 * Save an existing Bitacora entity
	 * 
	 */
	@Transactional
	public void saveBitacora(Bitacora bitacora) {
		Bitacora existingBitacora = bitacoraDAO.findBitacoraByPrimaryKey(bitacora.getIdBitacora());

		if (existingBitacora != null) {
			if (existingBitacora != bitacora) {
				existingBitacora.setIdBitacora(bitacora.getIdBitacora());
				existingBitacora.setIdUsuario(bitacora.getIdUsuario());
				existingBitacora.setModulo(bitacora.getModulo());
				existingBitacora.setAccion(bitacora.getAccion());
				existingBitacora.setIp(bitacora.getIp());
				existingBitacora.setFechaHora(bitacora.getFechaHora());
				existingBitacora.setDetalle(bitacora.getDetalle());
			}
			bitacora = bitacoraDAO.store(existingBitacora);
		} else {
			bitacora = bitacoraDAO.store(bitacora);
		}
		bitacoraDAO.flush();
	}

	/**
	 */
	@Transactional
	public Bitacora findBitacoraByPrimaryKey(Integer idBitacora) {
		return bitacoraDAO.findBitacoraByPrimaryKey(idBitacora);
	}
}

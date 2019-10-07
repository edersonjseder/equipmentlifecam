package com.equipmentlifecam.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.equipmentlifecam.backend.domain.Speedlite;
import com.equipmentlifecam.backend.repositories.SpeedliteRepository;

@Service
public class SpeedliteService {
	
	@Autowired
	private SpeedliteRepository speedliteRepository;
	
	/**
	 * Gets all lens objects by brand
	 * 
	 * @param brand
	 * @return
	 */
	public List<Speedlite> findAllSpeedlitesByBrand(String brand) {
		
		List<Speedlite> speedliteByBrand = null;
		
		try {
			
			speedliteByBrand = speedliteRepository.findAllByBrand(brand);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return speedliteByBrand;
		
	}
	
	/**
	 * Gets all lens objects in a list
	 * 
	 * @return
	 */
	public List<Speedlite> findAll() {
		
		return speedliteRepository.findAll();
		
	}

}

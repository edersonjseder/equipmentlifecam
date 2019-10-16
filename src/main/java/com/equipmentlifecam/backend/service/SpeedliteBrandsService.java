package com.equipmentlifecam.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.equipmentlifecam.backend.domain.SpeedliteBrand;
import com.equipmentlifecam.backend.repositories.SpeedliteBrandRepository;

@Service
public class SpeedliteBrandsService {
	
	@Autowired
	private SpeedliteBrandRepository speedliteBrandRepository;

	/**
	 * Gets all speedlite brands objects in a list
	 * 
	 * @return
	 */
	public List<SpeedliteBrand> findAllSpeedliteBrands() {
		
		return speedliteBrandRepository.findAll();
		
	}
	
}

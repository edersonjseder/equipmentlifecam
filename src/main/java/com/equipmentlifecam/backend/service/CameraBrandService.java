package com.equipmentlifecam.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.equipmentlifecam.backend.domain.CameraBrand;
import com.equipmentlifecam.backend.repositories.CameraBrandRepository;

@Service
public class CameraBrandService {
	
	@Autowired
	private CameraBrandRepository cameraBrandRepository;
	
	/**
	 * Gets all camera brands objects in a list
	 * 
	 * @return
	 */
	public List<CameraBrand> findAllCameraBrands() {
		
		return cameraBrandRepository.findAll();
		
	}

}

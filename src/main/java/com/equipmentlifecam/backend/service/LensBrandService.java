package com.equipmentlifecam.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.equipmentlifecam.backend.domain.LensBrand;
import com.equipmentlifecam.backend.repositories.LensBrandRepository;

@Service
public class LensBrandService {
	
	@Autowired
	private LensBrandRepository lensBrandRepository;
	
	/**
	 * Gets all lens brands objects in a list
	 * 
	 * @return
	 */
	public List<LensBrand> findAllLensBrands() {
		
		return lensBrandRepository.findAll();
		
	}

}

package com.equipmentlifecam.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.equipmentlifecam.backend.domain.Lens;
import com.equipmentlifecam.backend.repositories.LensRepository;

@Service
public class LensService {
	
	@Autowired
	private LensRepository lensRepository;
	
	/**
	 * Gets all lens objects by brand
	 * 
	 * @param brand
	 * @return
	 */
	public List<Lens> findAllLensByBrand(String brand) {
		
		List<Lens> listLensByBrand = null;
		
		try {
			
			listLensByBrand = lensRepository.findAllByBrand(brand);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return listLensByBrand;
		
	}
	
	/**
	 * Gets all lens objects in a list
	 * 
	 * @return
	 */
	public List<Lens> findAll() {
		
		return lensRepository.findAll();
		
	}

}

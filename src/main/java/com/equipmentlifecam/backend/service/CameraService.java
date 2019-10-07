package com.equipmentlifecam.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.equipmentlifecam.backend.domain.Camera;
import com.equipmentlifecam.backend.repositories.CameraRepository;

@Service
public class CameraService {
	
	@Autowired
	private CameraRepository cameraRepository;
	
	/**
	 * Gets all camera objects by brand
	 * 
	 * @param brand
	 * @return
	 */
	public List<Camera> findAllCameraByBrand(String brand) {
		
		List<Camera> listCameraByBrand = null;
		
		try {
			
			listCameraByBrand = cameraRepository.findAllByBrand(brand);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return listCameraByBrand;
		
	}
	
	/**
	 * Gets all camera objects in a list
	 * 
	 * @return
	 */
	public List<Camera> findAll() {
		
		return cameraRepository.findAll();
		
	}

}

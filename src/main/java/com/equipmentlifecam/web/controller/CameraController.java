package com.equipmentlifecam.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.equipmentlifecam.backend.domain.Camera;
import com.equipmentlifecam.backend.service.CameraService;
import com.equipmentlifecam.exceptions.CameraNotFoundException;
import com.equipmentlifecam.utils.EquipmentConstants;
import com.equipmentlifecam.utils.PathConstants;

@RestController
@RequestMapping(path = PathConstants.PATH)
public class CameraController {
	
	@Autowired
	private CameraService cameraService;
	
	/**
	 * Get all cameras by brand
	 * 
	 * @param brand to be searched in database
	 * @return a list of cameras of the searched brand
	 * @throws CameraNotFoundException
	 */
	@GetMapping(path = PathConstants.CAMERA + PathConstants.BRAND + "/{brand}")
	public ResponseEntity<List<Camera>> getAllCamerasByBrand(@PathVariable(value = "brand") String brand) throws CameraNotFoundException {
		
		List<Camera> cameras = cameraService.findAllCameraByBrand(brand);
		
		if (cameras != null) {
			
			return new ResponseEntity<List<Camera>>(cameras, HttpStatus.OK);
			
		} else {
			
			throw new CameraNotFoundException(EquipmentConstants.MESSAGE_SEARCH_FAIL, brand);
			
		}
		
	}
	
	/**
	 * Get all brands
	 * 
	 * @return
	 */
	@GetMapping(path = PathConstants.CAMERA + PathConstants.ALL)
	public ResponseEntity<List<Camera>> getAll() {
		
		List<Camera> cameras = cameraService.findAll();
		
		if(cameras.isEmpty()){
			
			return new ResponseEntity<List<Camera>>(cameras, HttpStatus.NO_CONTENT);
			
		}
		
		return new ResponseEntity<List<Camera>>(cameras, HttpStatus.OK);
		
	}

}

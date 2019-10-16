package com.equipmentlifecam.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.equipmentlifecam.backend.domain.CameraBrand;
import com.equipmentlifecam.backend.service.CameraBrandService;
import com.equipmentlifecam.utils.PathConstants;

@RestController
@RequestMapping(path = PathConstants.PATH)
public class CameraBrandController {
	
	@Autowired
	private CameraBrandService cameraBrandService;
	
	/**
	 * Get all camera brands
	 * 
	 * @return
	 */
	@GetMapping(path = PathConstants.CAMERA_BRAND + PathConstants.ALL)
	public ResponseEntity<List<CameraBrand>> getAllCameraBrands() {
		
		List<CameraBrand> cameraBrands = cameraBrandService.findAllCameraBrands();
		
		if(cameraBrands.isEmpty()){
			
			return new ResponseEntity<List<CameraBrand>>(cameraBrands, HttpStatus.NO_CONTENT);
			
		}
		
		return new ResponseEntity<List<CameraBrand>>(cameraBrands, HttpStatus.OK);
		
	}

}

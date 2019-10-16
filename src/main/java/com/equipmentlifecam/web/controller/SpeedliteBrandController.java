package com.equipmentlifecam.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.equipmentlifecam.backend.domain.SpeedliteBrand;
import com.equipmentlifecam.backend.service.SpeedliteBrandsService;
import com.equipmentlifecam.utils.PathConstants;

@RestController
@RequestMapping(path = PathConstants.PATH)
public class SpeedliteBrandController {
	
	@Autowired
	private SpeedliteBrandsService speedliteBrandsService;
	
	/**
	 * Get all speedlite brands
	 * 
	 * @return
	 */
	@GetMapping(path = PathConstants.SPEEDLITE_BRAND + PathConstants.ALL)
	public ResponseEntity<List<SpeedliteBrand>> getAllSpeedliteBrands() {
		
		List<SpeedliteBrand> speedliteBrands = speedliteBrandsService.findAllSpeedliteBrands();
		
		if(speedliteBrands.isEmpty()){
			
			return new ResponseEntity<List<SpeedliteBrand>>(speedliteBrands, HttpStatus.NO_CONTENT);
			
		}
		
		return new ResponseEntity<List<SpeedliteBrand>>(speedliteBrands, HttpStatus.OK);
		
	}

}

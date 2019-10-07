package com.equipmentlifecam.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.equipmentlifecam.backend.domain.Speedlite;
import com.equipmentlifecam.backend.service.SpeedliteService;
import com.equipmentlifecam.exceptions.SpeedliteNotFoundException;
import com.equipmentlifecam.utils.EquipmentConstants;
import com.equipmentlifecam.utils.PathConstants;

@RestController
@RequestMapping(path = PathConstants.PATH)
public class SpeedliteController {
	
	@Autowired
	private SpeedliteService speedliteService;
	
	/**
	 * Get all speedlites by brand
	 * 
	 * @param brand to be searched in database
	 * @return a list of speedlites of the searched brand
	 * @throws SpeedliteNotFoundException
	 */
	@GetMapping(path = PathConstants.SPEEDLITE + PathConstants.BRAND + "/{brand}")
	public ResponseEntity<List<Speedlite>> getAllSpeedlitesByBrand(@PathVariable(value = "brand") String brand) throws SpeedliteNotFoundException {
		
		List<Speedlite> speedlites = speedliteService.findAllSpeedlitesByBrand(brand);
		
		if (speedlites != null) {
			
			return new ResponseEntity<List<Speedlite>>(speedlites, HttpStatus.OK);
			
		} else {
			
			throw new SpeedliteNotFoundException(EquipmentConstants.MESSAGE_SEARCH_FAIL, brand);
			
		}
		
	}
	
	/**
	 * Get all brands
	 * 
	 * @return
	 */
	@GetMapping(path = PathConstants.SPEEDLITE + PathConstants.ALL)
	public ResponseEntity<List<Speedlite>> getAll() {
		
		List<Speedlite> speedlites = speedliteService.findAll();
		
		if(speedlites.isEmpty()){
			
			return new ResponseEntity<List<Speedlite>>(speedlites, HttpStatus.NO_CONTENT);
			
		}
		
		return new ResponseEntity<List<Speedlite>>(speedlites, HttpStatus.OK);
		
	}

}

package com.equipmentlifecam.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.equipmentlifecam.backend.domain.Lens;
import com.equipmentlifecam.backend.service.LensService;
import com.equipmentlifecam.exceptions.CameraNotFoundException;
import com.equipmentlifecam.exceptions.LensNotFoundException;
import com.equipmentlifecam.utils.EquipmentConstants;
import com.equipmentlifecam.utils.PathConstants;

@RestController
@RequestMapping(path = PathConstants.PATH)
public class LensController {
	
	@Autowired
	private LensService lensService;

	/**
	 * Get all lens by brand
	 * 
	 * @param brand to be searched in database
	 * @return a list of lenses of the searched brand
	 * @throws CameraNotFoundException
	 */
	@GetMapping(path = PathConstants.LENS + PathConstants.BRAND + "/{brand}")
	public ResponseEntity<List<Lens>> getAllCamerasByBrand(@PathVariable(value = "brand") String brand) throws LensNotFoundException {
		
		List<Lens> lenses = lensService.findAllLensByBrand(brand);
		
		if (lenses != null) {
			
			return new ResponseEntity<List<Lens>>(lenses, HttpStatus.OK);
			
		} else {
			
			throw new LensNotFoundException(EquipmentConstants.MESSAGE_SEARCH_FAIL, brand);
			
		}
		
	}
	
	/**
	 * Get all brands
	 * 
	 * @return
	 */
	@GetMapping(path = PathConstants.LENS + PathConstants.ALL)
	public ResponseEntity<List<Lens>> getAll() {
		
		List<Lens> lenses = lensService.findAll();
		
		if(lenses.isEmpty()){
			
			return new ResponseEntity<List<Lens>>(lenses, HttpStatus.NO_CONTENT);
			
		}
		
		return new ResponseEntity<List<Lens>>(lenses, HttpStatus.OK);
		
	}

}

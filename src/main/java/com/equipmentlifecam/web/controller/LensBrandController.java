package com.equipmentlifecam.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.equipmentlifecam.backend.domain.LensBrand;
import com.equipmentlifecam.backend.service.LensBrandService;
import com.equipmentlifecam.utils.PathConstants;

@RestController
@RequestMapping(path = PathConstants.PATH)
public class LensBrandController {
	
	@Autowired
	private LensBrandService lensBrandService;
	
	/**
	 * Get all lens brands
	 * 
	 * @return
	 */
	@GetMapping(path = PathConstants.LENS_BRAND + PathConstants.ALL)
	public ResponseEntity<List<LensBrand>> getAllLensBrands() {
		
		List<LensBrand> lensBrands = lensBrandService.findAllLensBrands();
		
		if(lensBrands.isEmpty()){
			
			return new ResponseEntity<List<LensBrand>>(lensBrands, HttpStatus.NO_CONTENT);
			
		}
		
		return new ResponseEntity<List<LensBrand>>(lensBrands, HttpStatus.OK);
		
	}

}

package com.equipmentlifecam.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class SpeedliteBrandNotFoundException extends Exception {

	private static final long serialVersionUID = 2039897546885959662L;
	
	public SpeedliteBrandNotFoundException(String message, String speedliteBrand) {
		super(message + speedliteBrand);
	}

}

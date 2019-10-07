package com.equipmentlifecam.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class SpeedliteNotFoundException extends Exception {

	private static final long serialVersionUID = -3454859051811749013L;
	
	public SpeedliteNotFoundException(String message, String speedliteBrand) {
		super(message + speedliteBrand);
	}

}

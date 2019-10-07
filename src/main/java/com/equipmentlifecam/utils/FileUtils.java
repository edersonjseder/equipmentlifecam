package com.equipmentlifecam.utils;

import java.io.IOException;
import java.util.Properties;

public class FileUtils {
	
	public String getPathProperty(String key) {
		
		Properties prop = new Properties();
		String property = "";
		
		try {
		    //load a properties file from class path, inside static method
		    prop.load(getClass().getClassLoader().getResourceAsStream("application.properties"));

		    //get the property value and print it out
		    property = prop.getProperty(key);

		} 
		catch (IOException ex) {
		    ex.printStackTrace();
		}
		
		return property;
		
	}

}

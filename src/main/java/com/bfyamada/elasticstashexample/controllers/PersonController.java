package com.bfyamada.elasticstashexample.controllers;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	private static final Logger LOGGER = LogManager.getLogger(PersonController.class);
	                    
	@RequestMapping("/welcome/{name}")
	public String getName(@PathVariable("name") String name) {
		LOGGER.debug("Welcome "+ name);
		return "Welcome "+ name;
	}
	
	@RequestMapping("/auth/{name}")
	public String auth(@PathVariable("name") String name) {
		if(name.equals("Yamada")) {
			LOGGER.info("Access granted to Yamada");
			return "Access granted";
		}else {
			LOGGER.error(name + " has no access");
			return "Access denied";
		}
	}

}

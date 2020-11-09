package com.michel.lab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.michel.lab.model.Reponse;

@RestController
//@RequestMapping("/test/")
public class Api {
	
	@GetMapping("/api")
	public Reponse getReponse(@RequestParam (name ="id", required = false) String id) {
		
		boolean error = false;
		String authorisation = "none";
		String identifier = "invalid";
		
		
		if (id == null) {
			
			error = true;
			
		}else {
			
			if (id.isEmpty()) {
				
				error = true;
			}
			
			if(id.length() != 7) {
				
				error = true;
				id = "invalid";
			}
		}
		
		try {
		String hexNumber = id;
		int decimal = Integer.parseInt(hexNumber, 16);
		authorisation = "1";
		identifier = id;
				
		} catch (Exception e) {
			
			
			error = true;
		}
		
		Reponse reponse = new Reponse(authorisation, identifier,  error);
		return reponse;
	}

}

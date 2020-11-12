package com.michel.lab.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.michel.lab.TestUrlApplication;
import com.michel.lab.model.Reponse;

@RestController
//@RequestMapping("/test/")
public class Api {

	@GetMapping("/api")
	public Reponse getReponse(@RequestParam(name = "id", required = false) String id) {

		boolean error = false;
		String authorisation = "0";
		String identifier = "invalid";

		if (id == null) {

			error = true;

		} else {

			if (id.isEmpty()) {

				error = true;
			}

			if (id.length() < 1 || id.length() > 16) {

				error = true;
				id = "invalid";
			}
		}

		try {
			String hexNumber = id;
			long decimal = Long.parseLong(hexNumber, 16);
			Boolean droitAcces;

			if (TestUrlApplication.select) {

				authorisation = "1";
				droitAcces = true;

			} else {

				authorisation = "0";
				droitAcces = false;

			}
			identifier = id;

			List<String> copie = new ArrayList<String>();
			List<Boolean> copieDroits = new ArrayList<Boolean>();

			System.out.println("size liste originelle en entrée: " + TestUrlApplication.codes.size());
			copie = TestUrlApplication.codes;
			System.out.println("size liste copie en entrée: " + copie.size());
			copieDroits = TestUrlApplication.droits;
			
			
			copie.add(0, identifier);
			TestUrlApplication.codes = copie;
			
			copieDroits.add(0, droitAcces);
			TestUrlApplication.droits = copieDroits;
			
			if(TestUrlApplication.codes.size() == 11) {
				
				TestUrlApplication.codes.remove(10);
				TestUrlApplication.droits.remove(10);
			}

		}catch(

	Exception e)
	{

		error = true;
	}

	Reponse reponse = new Reponse(authorisation, identifier, error);return reponse;
}

}

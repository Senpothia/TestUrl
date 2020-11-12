package com.michel.lab.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.michel.lab.TestUrlApplication;
import com.michel.lab.model.Variable;

@Controller
@RequestMapping("/page")
public class PageController {
	
	
	
	@GetMapping("/")
	public String page(Model model) {
		
		boolean select = TestUrlApplication.isSelect();
		
		if (TestUrlApplication.select) {

			TestUrlApplication.auths = 1;

		}else {
			
			TestUrlApplication.auths = 0;
		}

		
		model.addAttribute("select", select);
		model.addAttribute("codes", TestUrlApplication.codes);
	
		return "page";
	}
	
	@PostMapping("/")
	public String sendJson(boolean select) {
		
		
		if (select) {
			
			TestUrlApplication.select = true;
			TestUrlApplication.auths = 1;
			
			
		}else {
			
			TestUrlApplication.select = false;
			TestUrlApplication.auths = 0;
			
		}
		
		System.out.println("Valeur select post: " + select);
		//return "ok";
		return "redirect:/page/";
	}
	
	@GetMapping("/effacer")
	public String effacer() {
		
		List<String> copie = new ArrayList<String>();
		copie = TestUrlApplication.codes;
		TestUrlApplication.codes.removeAll(copie);
		
		return "redirect:/page/";
		
	}
	

	

}

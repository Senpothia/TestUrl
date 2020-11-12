package com.michel.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestUrlApplication {
	
	public static Integer auths = 1;
	public static boolean select = true;
	public static List<String> codes = new ArrayList<String>();
	public static List<Boolean> droits = new ArrayList<Boolean>();
	
		

	public static Integer getAuths() {
		return auths;
	}



	public static void setAuths(Integer auths) {
		TestUrlApplication.auths = auths;
	}



	public static boolean isSelect() {
		return select;
	}



	public static void setSelect(boolean select) {
		TestUrlApplication.select = select;
	}

	

	public static List<String> getCodes() {
		return codes;
	}



	public static void setCodes(List<String> codes) {
		TestUrlApplication.codes = codes;
	}



	public static List<Boolean> getDroits() {
		return droits;
	}



	public static void setDroits(List<Boolean> droits) {
		TestUrlApplication.droits = droits;
	}



	public static void main(String[] args) {
		SpringApplication.run(TestUrlApplication.class, args);
		
		
	}

}

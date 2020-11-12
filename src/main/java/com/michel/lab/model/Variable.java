package com.michel.lab.model;

import org.springframework.stereotype.Component;

@Component
public class Variable {
	
	private boolean select = false;
	private Integer auth = 0;
	
	
	public Variable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Variable(boolean select, Integer auth) {
		super();
		this.select = select;
		this.auth = auth;
	}


	public boolean isSelect() {
		return select;
	}
	public void setSelect(boolean select) {
		this.select = select;
	}
	public Integer getAuth() {
		return auth;
	}
	public void setAuth(Integer auth) {
		this.auth = auth;
	}

	
}

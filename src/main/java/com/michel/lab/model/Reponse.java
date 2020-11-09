package com.michel.lab.model;

public class Reponse {
	
	
	String authorisation;
	String identifier;
	boolean error;
	
	public Reponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reponse(String authorisation, String identifier,  boolean error) {
		super();
		
		this.authorisation = authorisation;
		this.identifier = identifier;
		this.error = error;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getAuthorisation() {
		return authorisation;
	}

	public void setAuthorisation(String authorisation) {
		this.authorisation = authorisation;
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	
	
	

}

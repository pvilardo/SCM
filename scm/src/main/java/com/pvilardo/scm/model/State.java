package com.pvilardo.scm.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class State extends BaseAttributeClass {
	private Country country;
	public State (String code, String description, Country country){
		super(code, description);
		this.country=country;
	}
	public Country getCountry() {
		return country;
	}
	
}

package com.pvilardo.scm.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class City extends BaseAttributeClass {
	private State state;
	public City (String code, String description, State state){
		super(code, description);
		this.state=state;
	}
	public State getState() {
		return state;
	}
}

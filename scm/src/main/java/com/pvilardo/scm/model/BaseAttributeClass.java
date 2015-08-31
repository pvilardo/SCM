package com.pvilardo.scm.model;

public abstract class BaseAttributeClass {
	private String description;
	private String code;
	
	public BaseAttributeClass (String code, String description){
		this.code=code;
		this.description=description;
	}

	public String getDescription() {
		return description;
	}

	public String getCode() {
		return code;
	}
}

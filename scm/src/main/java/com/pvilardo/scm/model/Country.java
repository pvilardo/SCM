package com.pvilardo.scm.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Country extends BaseAttributeClass {
	public Country (String code, String description){
		super(code, description);
	}
}

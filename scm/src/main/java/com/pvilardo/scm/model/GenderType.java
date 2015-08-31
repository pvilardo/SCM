package com.pvilardo.scm.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class GenderType extends BaseAttributeClass{

	public GenderType (String code, String description){
		super(code, description);
	}
}

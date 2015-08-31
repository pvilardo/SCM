package com.pvilardo.scm.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CivilStatus extends BaseAttributeClass{

	public CivilStatus (String code, String description){
		super(code, description);
	}
}

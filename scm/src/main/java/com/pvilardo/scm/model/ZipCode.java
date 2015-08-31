package com.pvilardo.scm.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ZipCode extends BaseAttributeClass {
	public ZipCode (String code, String description){
		super(code, description);
	}
}

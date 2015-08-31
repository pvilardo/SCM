package com.pvilardo.scm.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class DocumentType extends BaseAttributeClass{

	public DocumentType (String code, String description){
		super(code, description);
	}
}

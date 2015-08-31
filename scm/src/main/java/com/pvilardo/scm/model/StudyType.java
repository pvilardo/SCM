package com.pvilardo.scm.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class StudyType extends BaseAttributeClass {

	public StudyType(String code, String description) {
		super(code, description);
	}

}

package com.pvilardo.scm.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CalendarStatusType extends BaseAttributeClass {

	public CalendarStatusType(String code, String description) {
		super(code, description);
	}

}

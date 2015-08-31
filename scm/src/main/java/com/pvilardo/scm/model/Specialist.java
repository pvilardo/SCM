package com.pvilardo.scm.model;

import java.util.Date;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Specialist extends Person {

	public Specialist(String firstName, String lastName, DocumentType docType,
			String docString, String email, String cellPhone, Date birthDate,
			GenderType gender, CivilStatus civilStatus, String occupation,
			Address address1, Address address2) {
		super(firstName, lastName, docType, docString, email, cellPhone, birthDate,
				gender, civilStatus, occupation, address1, address2);
	}

}

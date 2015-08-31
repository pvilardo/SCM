package com.pvilardo.scm.model;

import java.util.Date;
import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Patient extends Person {
	
	private List<StudyDocument> studyDocumentList;

	public Patient(String firstName, String lastName, DocumentType docType,
			String docString, String email, String cellPhone, Date birthDate,
			GenderType gender, CivilStatus civilStatus, String occupation,
			Address address1, Address address2) {
		super(firstName, lastName, docType, docString, email, cellPhone, birthDate,
				gender, civilStatus, occupation, address1, address2);
	}

	public List<StudyDocument> getStudyDocumentList() {
		return studyDocumentList;
	}

	
}

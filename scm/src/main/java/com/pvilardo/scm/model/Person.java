package com.pvilardo.scm.model;

import java.util.Date;

public abstract class Person {

	private String firstName;
	private String lastName;
	private DocumentType docType;
	private String docString;
	private String email;
	private String cellPhone;
	private Date birthDate;
	private GenderType gender;
	private CivilStatus civilStatus;
	private String occupation;
	private Address address1;
	private Address address2;
	
	public Person (	 String firstName,
			 String lastName,
			 DocumentType docType,
			 String docString,
			 String email,
			 String cellPhone,
			 Date birthDate,
			 GenderType gender,
			 CivilStatus civilStatus,
			 String occupation,
			 Address address1,
			 Address address2 ){
		 this.firstName=firstName;
		 this.lastName=lastName;
		 this.docType=docType;
		 this.docString=docString;
		 this.email=email;
		 this.cellPhone=cellPhone;
		 this.birthDate=birthDate;
		 this.gender=gender;
		 this.civilStatus=civilStatus;
		 this.occupation=occupation;
		 this.address1=address1;
		 this.address2=address2;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public DocumentType getDocType() {
		return docType;
	}

	public String getDocString() {
		return docString;
	}

	public String getEmail() {
		return email;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public GenderType getGender() {
		return gender;
	}

	public CivilStatus getCivilStatus() {
		return civilStatus;
	}

	public String getOccupation() {
		return occupation;
	}

	public Address getAddress1() {
		return address1;
	}

	public Address getAddress2() {
		return address2;
	}
}

package com.pvilardo.scm.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Calendar {

	private Date dateDay;
	private Integer dateHour;
	private Integer dateMinute;
	@DBRef
	private Specialist specialist;
	@DBRef
	private Patient patient;
	private CalendarStatusType dateStatus;
	private StudyType studyType;

	public Calendar (Date dateDay, Integer dateHour, Integer dateMinute
			, Specialist specialist, Patient patient, CalendarStatusType dateStatus
			,StudyType studyType){
		this.dateDay=dateDay;
		this.dateHour=dateHour;
		this.dateMinute=dateMinute;
		this.specialist=specialist;
		this.patient=patient;
		this.dateStatus=dateStatus;
		this.studyType=studyType;
	}

	public Date getDateDay() {
		return dateDay;
	}

	public Integer getDateHour() {
		return dateHour;
	}

	public Integer getDateMinute() {
		return dateMinute;
	}

	public Specialist getSpecialist() {
		return specialist;
	}

	public Patient getPatient() {
		return patient;
	}

	public CalendarStatusType getDateStatus() {
		return dateStatus;
	}

	public StudyType getStudyType() {
		return studyType;
	}
	
}

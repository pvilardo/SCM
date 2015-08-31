package com.pvilardo.scm.model;

import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class StudyDocument {

	  @Id
	  private String id;
	  
	  private String internalName;
	  
	  private String outputName;
	  
	  public StudyDocument (String internalName, String outputName){
		  this.internalName=internalName;
		  this.outputName= outputName;
	  }

	public String getId() {
		return id;
	}

	public String getInternalName() {
		return internalName;
	}

	public String getOutputName() {
		return outputName;
	}
}

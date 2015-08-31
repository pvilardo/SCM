package com.pvilardo.scm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.pvilardo.scm.model.Patient;



@Repository (value="Patient")
public interface PatientRepository extends MongoRepository<Patient, String>{

	    public Patient findByFirstName(String firstName);

}

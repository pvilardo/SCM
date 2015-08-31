package com.pvilardo.scm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.pvilardo.scm.model.Specialist;



@Repository (value="Specialist")
public interface SpecialisttRepository extends MongoRepository<Specialist, String>{

	    public Specialist findByFirstName(String firstName);

}

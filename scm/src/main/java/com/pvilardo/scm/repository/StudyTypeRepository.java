package com.pvilardo.scm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.pvilardo.scm.model.StudyType;




@Repository (value="StudyType")
public interface StudyTypeRepository extends MongoRepository<StudyType, String>{


}

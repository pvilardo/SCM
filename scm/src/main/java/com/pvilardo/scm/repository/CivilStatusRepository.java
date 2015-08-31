package com.pvilardo.scm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.pvilardo.scm.model.CivilStatus;




@Repository (value="CivilStatus")
public interface CivilStatusRepository extends MongoRepository<CivilStatus, String>{


}

package com.pvilardo.scm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.pvilardo.scm.model.State;




@Repository (value="State")
public interface StateRepository extends MongoRepository<State, String>{


}

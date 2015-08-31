package com.pvilardo.scm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.pvilardo.scm.model.City;




@Repository (value="City")
public interface CityRepository extends MongoRepository<City, String>{


}

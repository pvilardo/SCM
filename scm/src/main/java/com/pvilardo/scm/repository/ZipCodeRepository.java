package com.pvilardo.scm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.pvilardo.scm.model.ZipCode;




@Repository (value="ZipCode")
public interface ZipCodeRepository extends MongoRepository<ZipCode, String>{

	public ZipCode findByCode(String code);
	public ZipCode findByDescription(String description);
	
}

package com.pvilardo.scm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pvilardo.scm.model.User;



@Repository (value="User")
public interface UserRepository extends MongoRepository<User, String>{

	    public User findByUsername(String username);

}

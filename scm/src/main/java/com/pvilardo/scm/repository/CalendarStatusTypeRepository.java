package com.pvilardo.scm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.pvilardo.scm.model.CalendarStatusType;



@Repository (value="CalendarStatusType")
public interface CalendarStatusTypeRepository extends MongoRepository<CalendarStatusType, String>{


}

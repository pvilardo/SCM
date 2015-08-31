package com.pvilardo.scm.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pvilardo.scm.model.Calendar;
import com.pvilardo.scm.model.Specialist;



@Repository (value="Calendar")
public interface CalendarRepository extends MongoRepository<Calendar, String>{

	public List<Calendar> findCalendarBySpecialistAndDateDay (Specialist specialist, Date dateDay);
}

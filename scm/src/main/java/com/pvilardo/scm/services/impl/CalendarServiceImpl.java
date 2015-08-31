package com.pvilardo.scm.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pvilardo.scm.model.Calendar;
import com.pvilardo.scm.model.Specialist;
import com.pvilardo.scm.repository.CalendarRepository;
import com.pvilardo.scm.services.ICalendarService;

@Service
public class CalendarServiceImpl implements ICalendarService {

	@Autowired
	CalendarRepository calendarRepository;

	@Override
	public List<Calendar> getCalendarBySpecialistAndDay(Specialist specialist,
			Date dateDay) {
		
		return calendarRepository.findCalendarBySpecialistAndDateDay(specialist, dateDay);
	}
	
	 

}

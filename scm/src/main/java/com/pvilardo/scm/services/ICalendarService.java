package com.pvilardo.scm.services;

import java.util.Date;
import java.util.List;

import com.pvilardo.scm.model.Calendar;
import com.pvilardo.scm.model.Specialist;

public interface ICalendarService {

	public abstract List<Calendar> getCalendarBySpecialistAndDay(Specialist specialist,Date dateDay);
	
	}

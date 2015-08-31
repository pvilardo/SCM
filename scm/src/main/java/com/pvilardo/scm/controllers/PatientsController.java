package com.pvilardo.scm.controllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pvilardo.scm.services.IUserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class PatientsController {
	
	private static final Logger logger = LoggerFactory.getLogger(PatientsController.class);
	
	@Autowired
	IUserService userService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/patients", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		IUserService us = userService;

		logger.info("Welcome home! The client locale is {}.", locale);
		
		model.addAttribute("count", us.countAllUsers() );
		
		return "patients";
	}
	
}

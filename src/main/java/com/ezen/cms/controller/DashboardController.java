package com.ezen.cms.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {
	
	
	@RequestMapping(value = "dash", method = RequestMethod.GET)
	public String dashboard(Locale locale) {
		return "dashboard";
	}

}

package com.ezen.cms.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserDashboard {

	@RequestMapping(value = "userdash", method = RequestMethod.GET)
	public String userdashboard(Locale locale) {
		return "userdashboard";
	}
}

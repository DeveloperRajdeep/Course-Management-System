package com.ezen.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ezen.cms.model.Test;
import com.ezen.cms.service.TestService;

@Controller
public class TestController {
	
	/**
	 * @uml.property  name="testService"
	 * @uml.associationEnd  
	 */
	private TestService testService;
	/**
	 * @param testService
	 * @uml.property  name="testService"
	 */
	@Autowired(required=true)
	@Qualifier(value="testService")
	public void setTestService(TestService testService){
		this.testService = testService;
	}
	
	@RequestMapping(value="/test", method= RequestMethod.GET)
	public String getTest(Model model){
		model.addAttribute("test", new Test());
		model.addAttribute("listTest",testService.listTest());
		
		return "test";
	}
	
	@RequestMapping(value="/addTest", method= RequestMethod.POST)
	public String addTest(Model model, @ModelAttribute("test") Test t){
	model.addAttribute("listTest", testService.listTest());
//		model.addAttribute("test", Test t);
		
			this.testService.addTest(t);
		
			
		
		
		return "test";
	}

	 @RequestMapping(value="/test/{id}")
	    public String editPerson(@PathVariable("id") int id, Model model,@ModelAttribute("test") Test t){
	        model.addAttribute("test", this.testService.getupdatebyid(id));
//	        model.addAttribute("listTest",testService.listTest());
	       System.out.println(t.getId());
	       System.out.println(t.getMessage());
//	       this.testService.updateTest(t);
	        return "test";
	    }
	
}

package com.ezen.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ezen.cms.model.CourseMaster;
import com.ezen.cms.service.CourseMasterService;
import com.ezen.cms.service.DegreeMasterService;


@Controller
public class CourseMasterController {
	
	/**
	 * @uml.property  name="degreemasterService"
	 * @uml.associationEnd  
	 */
	private DegreeMasterService degreemasterService;
	/**
	 * @param degreemasterService
	 * @uml.property  name="degreemasterService"
	 */
	@Autowired(required=true)
	@Qualifier(value="degreemasterService")
	public void setDegreemasterService(DegreeMasterService degreemasterService) {
		this.degreemasterService = degreemasterService;
	}
	
	/**
	 * @uml.property  name="coursemasterService"
	 * @uml.associationEnd  
	 */
	private CourseMasterService coursemasterService;
	/**
	 * @param coursemasterService
	 * @uml.property  name="coursemasterService"
	 */
	@Autowired(required=true)
	@Qualifier(value="coursemasterService")
	public void setCoursemasterService(CourseMasterService coursemasterService) {
		this.coursemasterService = coursemasterService;
	}
	
	@RequestMapping(value="coursePage")
	public String coursePage(Model model){
	model.addAttribute("CourseMaste", new CourseMaster());
	model.addAttribute("listdegree",degreemasterService.listdegree());
			return "admin/course_master";
	}
	
	@RequestMapping(value="/adddmaster1", method= RequestMethod.POST)
	public String adddmaster1(Model model, @ModelAttribute("CourseMaste") CourseMaster ct){
		this.coursemasterService.addCourseMaster(ct);
			return "redirect: coursePage";
	}
	
	@RequestMapping(value="/viewCoursemaster", method= RequestMethod.GET)
	public String getStudent(Model model,@ModelAttribute("course")CourseMaster c){
		model.addAttribute("listCourseMaster",coursemasterService.listCourseMaster());
		model.addAttribute("listdegree",degreemasterService.listdegree());
		model.addAttribute("list_crse",new CourseMaster());
		return "admin/view_course_master";
	}
	
	@RequestMapping(value="/viewCoursemaster/{course_id}",method=RequestMethod.GET)
	public String editcour(Model model,@PathVariable("course_id")int course_id){
		model.addAttribute("listCourseMaster",coursemasterService.listCourseMaster());
		model.addAttribute("listdegree",degreemasterService.listdegree());
		model.addAttribute("list_crse",coursemasterService.getupdatebyid(course_id));
		return "admin/view_course_master";
		
	}
	
	@RequestMapping(value="/admin/Edit1",method=RequestMethod.POST)
	public String editcourse(Model model,@ModelAttribute("course") CourseMaster cc){
		this.coursemasterService.upCourseMaster(cc);
		return "redirect:/viewCoursemaster";
	}
}


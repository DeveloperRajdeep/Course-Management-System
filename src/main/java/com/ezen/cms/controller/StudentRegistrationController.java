package com.ezen.cms.controller;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ezen.cms.model.StudentRegistration;
import com.ezen.cms.service.CourseMasterService;
import com.ezen.cms.service.DegreeMasterService;
import com.ezen.cms.service.StudentRegistrationService;

@Controller
public class StudentRegistrationController {

	
	private StudentRegistrationService studentregistrationService;
	
	@Autowired(required=true)
	@Qualifier(value="studentregistrationService")
	public void setStudentregistrationService(StudentRegistrationService studentregistrationservice){
		this.studentregistrationService=studentregistrationservice;
	}
	
	
	private DegreeMasterService degreemasterService;
	
	@Autowired(required=true)
	@Qualifier(value="degreemasterService")
	public void setDegreemasterService(DegreeMasterService degreemasterService) {
		this.degreemasterService = degreemasterService;
	}
	
	
	private CourseMasterService coursemasterService;
	
	@Autowired(required=true)
	@Qualifier(value="coursemasterService")
	public void setCoursemasterService(CourseMasterService coursemasterService) {
		this.coursemasterService = coursemasterService;
	}
	
	@RequestMapping(value="studentregisterPage")
	public String studentregisterPage(Model model){
		model.addAttribute("studentregistration", new StudentRegistration());
		model.addAttribute("listStudentRegistration",studentregistrationService.listStudentRegistration());
		model.addAttribute("listdegree",degreemasterService.listdegree());
		model.addAttribute("listcourse",coursemasterService.listCourseMaster());
		return "applicant_registration";
		
	}
	
	@RequestMapping(value="/addnewstudent", method= RequestMethod.POST)
	public String addnewstudent(Model model,@ModelAttribute("studentregistration") StudentRegistration sr){
		int student_id=0;
		sr.setPayment_status(0);
		sr.setRole("student");
		student_id=this.studentregistrationService.addStudentRegistration(sr);
		StudentRegistration studentregistration=studentregistrationService.getStudentRegistrationByStudentId(student_id);
		
		int degree_id = 0;
		int course_id = 0;
		String current_year="";
		String str_enrollment_id="0";
		String str_degree_id="";
		String str_course_id="";
		String str_student_id="";
		
		if(studentregistration!=null){
			degree_id = studentregistration.getDegree_id();
			course_id = studentregistration.getCourse_id();
			current_year = studentregistration.getDate_time().split("/")[0];
			
			if(degree_id<10) str_degree_id = "0"+Integer.toString(degree_id);
			else str_degree_id = Integer.toString(degree_id);
			
			if(course_id<10) str_course_id = "0"+Integer.toString(course_id);
			else str_course_id = Integer.toString(course_id);
			
			if(student_id<10) str_student_id = "0"+Integer.toString(student_id);
			else str_student_id = Integer.toString(student_id);
			
			str_enrollment_id = current_year+str_degree_id+str_course_id+str_student_id;
			
			studentregistrationService.setEnrollmentId(str_enrollment_id, student_id);
			
		}
		
				
		
		return "redirect:studentregisterPage";
		
	}
	
	@RequestMapping(value="/viewapplicantregister",method=RequestMethod.GET)
	public String getStudent(Model model){
		model.addAttribute("listStudentRegistration",studentregistrationService.listStudentRegistration());
		model.addAttribute("listdegree",degreemasterService.listdegree());
		model.addAttribute("listcourse",coursemasterService.listCourseMaster());
		return "admin/view_applicant_registration";
		
	}
		
}

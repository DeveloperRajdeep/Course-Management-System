package com.ezen.cms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ezen.cms.model.StudentPersonalInfo;
import com.ezen.cms.model.StudentRegistration;
import com.ezen.cms.service.StudentBranchSelectionService;
import com.ezen.cms.service.StudentPersonalInfoService;
import com.ezen.cms.service.StudentRegistrationService;

@Controller
public class StudentPersonalInfoController {

	private StudentPersonalInfoService studentpersonalinfoservice;
	@Autowired(required=true)
	@Qualifier(value="studentpersonalinfoservice")
	public void setStudentpersonalinfoservice(StudentPersonalInfoService studentpersonalinfoservice) {
		this.studentpersonalinfoservice = studentpersonalinfoservice;
	}
	
	private StudentRegistrationService studentregistrationService;
	@Autowired(required=true)
	@Qualifier(value="studentregistrationService")
	public void setStudentregistrationService(StudentRegistrationService studentregistrationservice){
		this.studentregistrationService=studentregistrationservice;
	}

	private StudentBranchSelectionService studentbranchselectionService;
	@Autowired(required=true)
	@Qualifier(value="studentbranchselectionService")
	public void setStudentbranchselectionService(StudentBranchSelectionService studentbranchselectionService) {
		this.studentbranchselectionService = studentbranchselectionService;
	}
	
	
	@RequestMapping(value="studentpersonalinfoPage", method = RequestMethod.GET)
	public String studentpersonalinfoPage(Model model,HttpServletRequest request){
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("enrol_id")==null) return "redirect:user_login";
		
		model.addAttribute("StudentpInfo", new StudentPersonalInfo());
		
		String enrollment_id = "";
		enrollment_id = (String)session.getAttribute("enrol_id");
		StudentRegistration studentRegistration = studentregistrationService.getStudentRegistrationByEnrollId(enrollment_id);
		//model.addAttribute("studentRegistration", studentRegistration);
		
		StudentPersonalInfo studentpinfo;
		if(studentRegistration!=null){
			studentpinfo = studentpersonalinfoservice.getstudentpersonalinfobyStudentId(studentRegistration.getStudent_id());
		}
		else{
			studentpinfo = studentpersonalinfoservice.getstudentpersonalinfobyStudentId(0);
		}
				
		if(studentpinfo==null){
			studentpinfo = new StudentPersonalInfo();
		}
		
	    
		studentpinfo.setStudent_fname(studentRegistration.getS_first_name());
		studentpinfo.setStudent_mname(studentRegistration.getS_middle_name());
		studentpinfo.setStudent_lname(studentRegistration.getS_last_name());
		studentpinfo.setEmail_id(studentRegistration.getEmail_id());
		studentpinfo.setMobile_number(studentRegistration.getContact_number());
		
		
		model.addAttribute("enrollment_id",enrollment_id);
		
		
		model.addAttribute("studentpinfo",studentpinfo);
		
		
		
		
		//model.addAttribute("liststudentpinfo",studentpersonalinfoservice.listStudentPersonalInfo());
		return "registration";
		
	}
	
	
	


	@RequestMapping(value="/addstudentpinformation",method = RequestMethod.POST)
	public String addstudentpinformation(Model model,@ModelAttribute("studentpinfo") StudentPersonalInfo spi,HttpServletRequest request){
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("enrol_id")==null) return "redirect:user_login";
		
		String enrollment_id = "";
		enrollment_id = (String)session.getAttribute("enrol_id");
		StudentRegistration studentRegistration = studentregistrationService.getStudentRegistrationByEnrollId(enrollment_id);
		
		if(studentRegistration!=null){
			spi.setStudent_id(studentRegistration.getStudent_id());
		}
		else{
			spi.setStudent_id(0);
		}
		
		
		this.studentpersonalinfoservice.addStudentPersonalInfo(spi);
		return "redirect:/studentpersonalinfoPage";
		
	}
}

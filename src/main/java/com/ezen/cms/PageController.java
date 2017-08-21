package com.ezen.cms;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.ezen.cms.model.StudentRegistration;
import com.ezen.cms.service.StudentRegistrationService;
@Controller
public class PageController {

	/**
	 * @uml.property  name="studentregistrationService"
	 * @uml.associationEnd  
	 */
	private StudentRegistrationService studentregistrationService;
	/**
	 * @param studentregistrationservice
	 * @uml.property  name="studentregistrationService"
	 */
	@Autowired(required=true)
	@Qualifier(value="studentregistrationService")
	public void setStudentregistrationService(StudentRegistrationService studentregistrationservice){
		this.studentregistrationService=studentregistrationservice;
	}
	@RequestMapping(value = "registration", method = RequestMethod.GET)
	public String registration(Locale locale) {
		return "registration";
		}
	
	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String index(Locale locale) {
		return "admin/index";
		}
	
	
	
	@RequestMapping(value = "user_login", method = RequestMethod.GET)
	public String user_login(Locale locale,HttpServletRequest request) {
		HttpSession session=request.getSession();
		
		if(session.getAttribute("enrol_id")!=null) {
			return "redirect:studentpersonalinfoPage";
		}
		return "user_login";
		}
	
	
	
	@RequestMapping(value = "login_auth", method = RequestMethod.POST)
	public String login(Model model,@RequestParam("username")String enrolid,@RequestParam("password")String password, HttpServletRequest request) {
		
		HttpSession session=request.getSession();
		
		String admin = "admin";
		String student = "student";
		
		StudentRegistration stu = studentregistrationService.getenrolid(enrolid,password);
		
	/*	if(stu.getRole().equals(admin))
		{
			System.out.println("not working");
		return "redirect:index";
		}
		else*/
		
		if(stu==null){
			return "redirect:user_login";
		}
		
			if(stu.getRole().equals(student))
		{
				session.setAttribute("enrol_id", stu.getEnrollment_id());
				if(stu.getPayment_status()==1){
					System.out.println("working");
					return "redirect:studentpersonalinfoPage";
				}else{
					return "redirect:paymentPage";
				}
			
		}	
		else
			return "redirect:user_login";
			
			
		}//end of method login
	
	
	@RequestMapping(value="logout")
	public String logout(HttpServletRequest request){
		HttpSession session=request.getSession();
		session.invalidate();
		return "redirect:user_login";
	}
	
		
}

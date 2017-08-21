package com.ezen.cms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ezen.cms.model.CourseMaster;
import com.ezen.cms.model.FeesMaster;
import com.ezen.cms.model.PaymentInformation;
import com.ezen.cms.service.CourseMasterService;
import com.ezen.cms.service.FeesMasterService;
import com.ezen.cms.service.PaymentInformationService;
import com.ezen.cms.service.StudentRegistrationService;
import com.ezen.cms.model.StudentRegistration;
@Controller
public class PaymentInformationController {

	/**
	 * @uml.property  name="paymentinformationService"
	 * @uml.associationEnd  
	 */
	private PaymentInformationService paymentinformationService;
	/**
	 * @param paymentinformationService
	 * @uml.property  name="paymentinformationService"
	 */
	@Autowired(required=true)
	@Qualifier(value="paymentinformationService")
	public void setPaymentinformationService(PaymentInformationService paymentinformationService) {
		this.paymentinformationService = paymentinformationService;
	}
	
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
	
	
	/**
	 * @uml.property  name="coursemasterService"
	 * @uml.associationEnd  
	 */
	private CourseMasterService coursemasterService;
	@Autowired(required=true)
	@Qualifier(value="coursemasterService")
	public void setCourseMasterService(CourseMasterService coursemasterService){
		this.coursemasterService=coursemasterService;
	}
	
	/**
	 * @uml.property  name="feesmasterService"
	 * @uml.associationEnd  
	 */
	private FeesMasterService feesmasterService;
	/**
	 * @param feesmasterService
	 * @uml.property  name="feesmasterService"
	 */
	@Autowired(required=true)
	@Qualifier(value="feesmasterService")
	public void setFeesmasterService(FeesMasterService feesmasterService) {
		this.feesmasterService = feesmasterService;
	}
	
	
	
	@RequestMapping(value="paymentPage")
	public String paymentPage(Model model, HttpServletRequest request){
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("enrol_id")==null) return "redirect:user_login";
		
		model.addAttribute("PaymentInfo",new PaymentInformation());
		
		String enrollment_id = "";
		enrollment_id = (String)session.getAttribute("enrol_id");
		StudentRegistration studentRegistration = studentregistrationService.getStudentRegistrationByEnrollId(enrollment_id);
		//StudentRegistration studentRegistration = studentregistrationService.getStudentRegistrationByEnrollId(payment_status);
		FeesMaster feesmaster = feesmasterService.getFeesMasterbyCourseId(studentRegistration.getCourse_id());
		//model.addAttribute("listStudentRegistration",studentregistrationService.listStudentRegistration());
		model.addAttribute("studentRegistration", studentRegistration);
		model.addAttribute("feesmaster",feesmaster);
		//StudentRegistration sr = studentregistrationService.getStudentRegistrationByStudentId(16);
		String fname=studentRegistration.getS_first_name();
		String mname=studentRegistration.getS_middle_name();
		String lname=studentRegistration.getS_last_name();
		
		model.addAttribute("fullname", (fname+" "+mname+" "+lname));
		
		
		List<CourseMaster> courseMasterList = coursemasterService.listCourseMaster();
		
		for(CourseMaster cm: courseMasterList){
			if(cm.getCourse_id()==studentRegistration.getCourse_id()){
				model.addAttribute("coursename", cm.getCourse_name());
				break;
			}
		}
		
		//System.out.println("Student Full Name ..." +fname+mname+lname);
		return "payment_page";
		
	}
	
	@RequestMapping(value="/addpayment", method= RequestMethod.POST)
	public String addpayment(Model model,@ModelAttribute("PaymentInfo") PaymentInformation pii, HttpServletRequest request){
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("enrol_id")==null) return "redirect:user_login";
		
		String enrollment_id = "";
		enrollment_id = (String)session.getAttribute("enrol_id");
		StudentRegistration studentRegistration = studentregistrationService.getStudentRegistrationByEnrollId(enrollment_id);
		
		if(studentRegistration!=null){
			FeesMaster feesmaster = feesmasterService.getFeesMasterbyCourseId(studentRegistration.getCourse_id());
			pii.setStudent_id(studentRegistration.getStudent_id());
			if(feesmaster!=null){
				pii.setFee_id(feesmaster.getFee_id());
			}
			else{
				pii.setFee_id(0);
			}
		}else{
			pii.setStudent_id(0);
		}
		
		this.paymentinformationService.addPaymentInformation(pii);
		
		studentregistrationService.updatePaymentStatusStudentRegistrationByStudentId(studentRegistration.getStudent_id(), 1);
		
		return "redirect:logout";
	}
}

package com.ezen.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.ezen.cms.model.SeatDetails;
import com.ezen.cms.service.BranchMasterService;
import com.ezen.cms.service.CategoryMasterService;
import com.ezen.cms.service.CourseMasterService;
import com.ezen.cms.service.DegreeMasterService;
import com.ezen.cms.service.SeatDetailsService;

@Controller
public class SeatDetailsController {

	/**
	 * @uml.property  name="seatdetailsService"
	 * @uml.associationEnd  
	 */
	private SeatDetailsService seatdetailsService;
	/**
	 * @param seatdetailsservice
	 * @uml.property  name="seatdetailsService"
	 */
	@Autowired(required=true)
	@Qualifier(value="seatdetailsService")
	public void setSeatdetailsService(SeatDetailsService seatdetailsservice){
		this.seatdetailsService = seatdetailsservice;
	}
	
	
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
	
	/**
	 * @uml.property  name="branchmasterService"
	 * @uml.associationEnd  
	 */
	private BranchMasterService branchmasterService;
	/**
	 * @param branchmasterService
	 * @uml.property  name="branchmasterService"
	 */
	@Autowired(required=true)
	@Qualifier(value="branchmasterService")
	public void setBranchmasterService(BranchMasterService branchmasterService){
		this.branchmasterService = branchmasterService;
	}
	
	/**
	 * @uml.property  name="categorymasterService"
	 * @uml.associationEnd  
	 */
	private CategoryMasterService categorymasterService;
	@Autowired(required=true)
	@Qualifier(value="categorymasterService")
	public void CategorymasterService(CategoryMasterService categorymasterService){
		this.categorymasterService=categorymasterService;
	}
	
	@RequestMapping(value="seatdetailsPage")
	public String seatdetailsPage(Model model){
		model.addAttribute("seatdetail",new SeatDetails());
		model.addAttribute("listseatdetail",seatdetailsService.listSeatDetails());
		model.addAttribute("listbranch",branchmasterService.listBranchMaster());
		model.addAttribute("listdegree",degreemasterService.listdegree());
		model.addAttribute("listcourse",coursemasterService.listCourseMaster());
		model.addAttribute("listCategory",categorymasterService.listCategoryMaster());
		return "admin/seat_details";
		}
	
	@RequestMapping(value="/addmaster8", method= RequestMethod.POST)
	public String addmaster8(Model model, @ModelAttribute("seatdetail") SeatDetails sd){
		this.seatdetailsService.addSeatDetails(sd);
		return "redirect: seatdetailsPage";
	}
	
	@RequestMapping(value="/viewSeatdetails", method= RequestMethod.GET)
	public String getStudent(Model model){
		model.addAttribute("listSeatDetails",seatdetailsService.listSeatDetails());
		model.addAttribute("listbranch",branchmasterService.listBranchMaster());
		model.addAttribute("listdegree",degreemasterService.listdegree());
		model.addAttribute("listcourse",coursemasterService.listCourseMaster());
		model.addAttribute("listCategory",categorymasterService.listCategoryMaster());
		return "admin/view_seat_details";
	}
	
}

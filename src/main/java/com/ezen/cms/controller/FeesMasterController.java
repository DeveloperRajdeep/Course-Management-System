package com.ezen.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ezen.cms.model.BranchMaster;
import com.ezen.cms.model.FeesMaster;
import com.ezen.cms.service.CourseMasterService;
import com.ezen.cms.service.FeesMasterService;

@Controller
public class FeesMasterController {

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
	
	@RequestMapping(value="feesPage")
	public String feesPage(Model model){
		model.addAttribute("FeesMaste", new FeesMaster());
		model.addAttribute("listfees",feesmasterService.listFessmaster());
		model.addAttribute("listcourse",coursemasterService.listCourseMaster());
		return "admin/fees_master";
		
	}
	
	@RequestMapping(value="/addfees", method= RequestMethod.POST)
	public String addfees(Model model,@ModelAttribute("FeesMaste") FeesMaster fm){
		this.feesmasterService.addFeesMaster(fm);
		return "redirect: feesPage";
	}
	
	@RequestMapping(value="/viewFeesmaster", method= RequestMethod.GET)
	public String getStudent(Model model){
		model.addAttribute("listfees",feesmasterService.listFessmaster());
		model.addAttribute("listcourse",coursemasterService.listCourseMaster());
		model.addAttribute("list_fee",new FeesMaster());
		return "admin/view_fees_master";
		
	}
	
	@RequestMapping(value="/viewFeesmaster/{fee_id}",method= RequestMethod.GET)
	public String getbran(Model model,@PathVariable("fee_id")int fee_id){
		FeesMaster fm = feesmasterService.getupdatebyid(fee_id);
		model.addAttribute("listcourse",coursemasterService.listCourseMaster());
		model.addAttribute("list_fee",fm);
		return "admin/view_fees_master";
		}
	
	@RequestMapping(value="/admin/Edit9",method=RequestMethod.POST)
	public String editfees(Model model,@ModelAttribute("fees") FeesMaster fm){
		this.feesmasterService.upFeesMaster(fm);
		return "redirect:/viewFeesmaster";
		
	}
	
}

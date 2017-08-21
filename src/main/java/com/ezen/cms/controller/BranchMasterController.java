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
import com.ezen.cms.model.CourseMaster;
import com.ezen.cms.service.BranchMasterService;
import com.ezen.cms.service.CourseMasterService;
import com.ezen.cms.service.DegreeMasterService;

@Controller
public class BranchMasterController {

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
	
	@RequestMapping(value="branchPage")
	public String branchPage(Model model){
		model.addAttribute("BranchMaste", new BranchMaster());
		model.addAttribute("listbranch",branchmasterService.listBranchMaster());
		model.addAttribute("listdegree",degreemasterService.listdegree());
		model.addAttribute("listcourse",coursemasterService.listCourseMaster());
		return "admin/branch_master";
		}
	
	@RequestMapping(value="/adddmaster2", method= RequestMethod.POST)
	public String adddmaster2(Model model, @ModelAttribute("BranchMaste") BranchMaster bt){
		this.branchmasterService.addBranchMaster(bt);
			return "redirect: branchPage";
	}
	
	@RequestMapping(value="/viewBranchmaster", method= RequestMethod.GET)
	public String getStudent(Model model){
		model.addAttribute("listBranchMaster",branchmasterService.listBranchMaster());
		model.addAttribute("listdegree",degreemasterService.listdegree());
		model.addAttribute("listcourse",coursemasterService.listCourseMaster());
		model.addAttribute("list_brch",new BranchMaster());
		return "admin/view_branch_master";
	}
	
	@RequestMapping(value="/viewBranchmaster/{branch_id}",method= RequestMethod.GET)
	public String getbran(Model model,@PathVariable("branch_id")int branch_id){
		BranchMaster bm = branchmasterService.getupdatebyid(branch_id);
		model.addAttribute("listBranchMaster",branchmasterService.listBranchMaster());
		model.addAttribute("listdegree",degreemasterService.listdegree());
		model.addAttribute("listcourse",coursemasterService.listCourseMaster());
		model.addAttribute("list_brch",bm);
		return "admin/view_branch_master";
		}
	
	@RequestMapping(value="/admin/Edit2",method=RequestMethod.POST)
	public String editbranch(Model model,@ModelAttribute("branch") BranchMaster bb){
		this.branchmasterService.upBranchMaster(bb);
		return "redirect:/viewBranchmaster";
		
	}
}

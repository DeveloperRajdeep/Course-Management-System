package com.ezen.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ezen.cms.model.CutOffPercentage;
import com.ezen.cms.service.CategoryMasterService;
import com.ezen.cms.service.CourseMasterService;
import com.ezen.cms.service.CutOffPercentageService;

@Controller
public class CutOffPercentageController {

	/**
	 * @uml.property  name="cutoffpercentageService"
	 * @uml.associationEnd  
	 */
	private CutOffPercentageService cutoffpercentageService;
	/**
	 * @param cutoffpercentageService
	 * @uml.property  name="cutoffpercentageService"
	 */
	@Autowired(required=true)
	@Qualifier(value="cutoffpercentageService")
	public void setCutoffpercentageService( CutOffPercentageService cutoffpercentageService){
		this.cutoffpercentageService=cutoffpercentageService;
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
	 * @uml.property  name="categorymasterService"
	 * @uml.associationEnd  
	 */
	private CategoryMasterService categorymasterService;
	@Autowired(required=true)
	@Qualifier(value="categorymasterService")
	public void CategorymasterService(CategoryMasterService categorymasterService){
		this.categorymasterService=categorymasterService;
	}
	
	@RequestMapping(value="cutoffpercentagePage")
	public String cutoffpercentagePage(Model model){
		model.addAttribute("CoPer",new CutOffPercentage());
		model.addAttribute("listcourse",coursemasterService.listCourseMaster());
		model.addAttribute("listcategory",categorymasterService.listCategoryMaster());
		return "admin/cutoffpercentage";
	}
	
	@RequestMapping(value="/addmaster4", method=RequestMethod.POST)
	public String addmaster4(Model model,@ModelAttribute("CoPer") CutOffPercentage cop){
		this.cutoffpercentageService.addCutOffPercentage(cop);
		return "redirect: cutoffpercentagePage";
	}
	
	@RequestMapping(value="/viewCutoffpercentage", method=RequestMethod.GET)
	public String viewCutoffpercentage(Model model){
		model.addAttribute("listCutOffPercentage", cutoffpercentageService.listCutOffPercentage());
		model.addAttribute("listcourse",coursemasterService.listCourseMaster());
		model.addAttribute("listcategory",categorymasterService.listCategoryMaster());
		return "admin/view_cop";
	}
}

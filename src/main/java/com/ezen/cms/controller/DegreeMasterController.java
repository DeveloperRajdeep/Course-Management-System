package com.ezen.cms.controller;

import com.ezen.cms.service.DegreeMasterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ezen.cms.model.DegreeMaster;

@Controller
public class DegreeMasterController {
	
	private DegreeMasterService degreemasterService;
	@Autowired(required=true)
	@Qualifier(value="degreemasterService")

	public void setDegreemasterService(DegreeMasterService degreemasterService) {
		this.degreemasterService = degreemasterService;
	}
	
	
	@RequestMapping(value="degreePage")
	public String degreePage(Model model){
	model.addAttribute("DegreeMaste", new DegreeMaster());
			return "admin/degree_master";
	}
	
	@RequestMapping(value="/adddmaster", method= RequestMethod.POST)
	public String adddmaster(Model model, @ModelAttribute("DegreeMaste") DegreeMaster dt){
			this.degreemasterService.addDegreeMaster(dt);
			return "redirect: degreePage";
	}
	
	@RequestMapping(value="/viewDegreemaster", method=RequestMethod.GET)
	public String getStudent(Model model, @ModelAttribute("DegreeMaste") DegreeMaster dt){
		model.addAttribute("listDegreeMaster",degreemasterService.listDegreeMaster());
		model.addAttribute("list_dg",new DegreeMaster());
		return "admin/view_degree_master";
	}

	@RequestMapping(value="/viewDegreemaster/{degree_id}",method=RequestMethod.GET)
    public String editdeg(Model model,@PathVariable("degree_id")int degree_id)
    {
        model.addAttribute("listDegreeMaster",degreemasterService.listDegreeMaster());
        model.addAttribute("list_dg",degreemasterService.getupdatebyid(degree_id));
        return "admin/view_degree_master";
    }
	
	@RequestMapping(value="/admin/Edit",method=RequestMethod.POST)
	public String editdegree(Model model,@ModelAttribute("degree") DegreeMaster dd)
	{
		this.degreemasterService.upDegreeMaster(dd);
		//return "admin/view_degree_master";
		return "redirect:/viewDegreemaster";
		
	}
}

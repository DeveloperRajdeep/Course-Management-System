package com.ezen.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ezen.cms.model.CategoryMaster;
import com.ezen.cms.service.CategoryMasterService;

@Controller
public class CategoryMasterController {

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
	
	@RequestMapping(value="categoryPage")
	public String categoryPage(Model model){
		model.addAttribute("CategoryMaste", new CategoryMaster());
		return "admin/category_master";
		
	}
	
	@RequestMapping(value="/addmaster3", method= RequestMethod.POST)
	public String addmaster3(Model model, @ModelAttribute("CategoryMaste") CategoryMaster cmt){
		this.categorymasterService.addCategoryMaster(cmt);
		return "redirect: categoryPage";
		
	}
	
	@RequestMapping(value="/viewCategorymaster", method= RequestMethod.GET)
	public String getStudent(Model model, @ModelAttribute("CategoryMaste") CategoryMaster cmt){
		model.addAttribute("listCategoryMaster",categorymasterService.listCategoryMaster());
		model.addAttribute("list_catgry",new CategoryMaster());
		return "admin/view_category_master";
		}
	
	@RequestMapping(value="/viewCategorymaster/{category_id}",method=RequestMethod.GET)
	public String editcatgry(Model model,@PathVariable("category_id")int category_id){
		model.addAttribute("list_catgry",categorymasterService.getupdatebyid(category_id));
		return "admin/view_category_master";
		
	}
	
	@RequestMapping(value="/admin/Edit3",method=RequestMethod.POST)
	public String editcategory(Model model,@ModelAttribute("category") CategoryMaster cm){
		this.categorymasterService.upCategoryMaster(cm);
		return "redirect:/viewCategorymaster";
	}
	
}

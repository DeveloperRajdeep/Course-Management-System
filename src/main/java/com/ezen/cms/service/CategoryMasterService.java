package com.ezen.cms.service;

import java.util.List;

import com.ezen.cms.model.CategoryMaster;

public interface CategoryMasterService {

	public List<CategoryMaster> listCategoryMaster();
	public void addCategoryMaster(CategoryMaster cmt);
	public void updateCategoryMaster(int category);
	public CategoryMaster getupdatebyid(int category_id);
	public void upCategoryMaster(CategoryMaster cmt);
	
}

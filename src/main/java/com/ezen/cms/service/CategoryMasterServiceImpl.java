package com.ezen.cms.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ezen.cms.dao.CategoryMasterDao;
import com.ezen.cms.model.CategoryMaster;

public class CategoryMasterServiceImpl implements CategoryMasterService {

	/**
	 * @uml.property  name="categorymasterDao"
	 * @uml.associationEnd  
	 */
	private CategoryMasterDao categorymasterDao;
	public void setCategorymasDao(CategoryMasterDao categorymasterDao){
		this.categorymasterDao=categorymasterDao;
	}
	
	@Override
	@Transactional
	public List<CategoryMaster> listCategoryMaster() {
		// TODO Auto-generated method stub
		return this.categorymasterDao.listCategoryMaster();
	}

	@Override
	@Transactional
	public void addCategoryMaster(CategoryMaster cmt) {
		// TODO Auto-generated method stub
		this.categorymasterDao.addCategoryMaster(cmt);
	}

	@Override
	@Transactional
	public void updateCategoryMaster(int category_id) {
		// TODO Auto-generated method stub
		this.categorymasterDao.getupdatebyid(category_id);
	}

	@Override
	@Transactional
	public CategoryMaster getupdatebyid(int category_id) {
		// TODO Auto-generated method stub
		return this.categorymasterDao.getupdatebyid(category_id);
	}

	@Override
	@Transactional
	public void upCategoryMaster(CategoryMaster cmt) {
		// TODO Auto-generated method stub
		this.categorymasterDao.upCategoryMaster(cmt);
	}

}

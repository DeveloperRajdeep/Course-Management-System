package com.ezen.cms.dao;

import java.util.List;

import com.ezen.cms.model.Test;

public interface TestDao {

	public List<Test> listTest();
	public void deleteTestById(int id);
	public void updateTest(Test t);
	public void addTest(Test t);
	public Test getupdatebyid(int id);
	
}

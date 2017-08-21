package com.ezen.cms.service;

import java.util.List;

import com.ezen.cms.model.Test;

public interface TestService {
	public List<Test> listTest();
	public void addTest(Test t);
	public void deleteTestById(int id);
	public void updateTest(Test t);
	public Test getupdatebyid(int id);
}

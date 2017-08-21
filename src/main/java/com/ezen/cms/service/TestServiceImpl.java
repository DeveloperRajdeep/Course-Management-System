package com.ezen.cms.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ezen.cms.dao.TestDao;
import com.ezen.cms.model.Test;

@Service
public class TestServiceImpl implements TestService {

	/**
	 * @uml.property  name="testDao"
	 * @uml.associationEnd  
	 */
	private TestDao testDao;
	/**
	 * @param test
	 * @uml.property  name="testDao"
	 */
	public void setTestDao(TestDao test){
		this.testDao = test;
	}
	
	@Override
	@Transactional
	public List<Test> listTest() {
		// TODO Auto-generated method stub
		return this.testDao.listTest();
	}

	@Override
	@Transactional
	public void deleteTestById(int id) {
		// TODO Auto-generated method stub
		this.testDao.deleteTestById(id);

	}

	@Override
	@Transactional
	public void updateTest(Test t) {
		// TODO Auto-generated method stub
		this.testDao.updateTest(t);

	}

	@Override
	@Transactional
	public void addTest(Test t) {
		// TODO Auto-generated method stub
		this.testDao.addTest(t);
		
	}
	
	@Override
	@Transactional
	public Test getupdatebyid(int id){
		return this.testDao.getupdatebyid(id);
	}

}

package com.ezen.cms.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ezen.cms.dao.DegreeMasterDao;
import com.ezen.cms.model.DegreeMaster;

@Service
public class DegreeMasterServiceImpl implements DegreeMasterService {
	
	/**
	 * @uml.property  name="degreemasDao"
	 * @uml.associationEnd  
	 */
	private DegreeMasterDao degreemasDao;
	/**
	 * @param degreemasDao
	 * @uml.property  name="degreemasDao"
	 */
	public void setDegreemasDao(DegreeMasterDao degreemasDao) {
		this.degreemasDao = degreemasDao;
	}

	@Override
	@Transactional 
	public List<DegreeMaster> listDegreeMaster() {
		// TODO Auto-generated method stub
		return this.degreemasDao.listDegreeMaster();
	}
	@Override
	@Transactional
	public List<DegreeMaster> listdegree()
	{
		return this.degreemasDao.listdegree();
	}
	@Override
	@Transactional 
	public void addDegreeMaster(DegreeMaster dt) {
		// TODO Auto-generated method stub
		this.degreemasDao.addDegreeMaster(dt);
	}


	@Override
	@Transactional 
	public void updateDegreeMaster(int degree_id) {
		// TODO Auto-generated method stub
		this.degreemasDao.updateDegreeMaster(degree_id);
	}

	@Override
	@Transactional 
	public DegreeMaster getupdatebyid(int degree_id) {
		// TODO Auto-generated method stub
		return this.degreemasDao.getupdatebyid(degree_id);
	}

	@Override
	@Transactional 
	public void upDegreeMaster(DegreeMaster dt) {
		// TODO Auto-generated method stub
		this.degreemasDao.upDegreeMaster(dt);
	}
}

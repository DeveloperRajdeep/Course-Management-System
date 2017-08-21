package com.ezen.cms.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ezen.cms.dao.FeesMasterDao;
import com.ezen.cms.model.FeesMaster;

public class FeesMasterServiceImpl implements FeesMasterService {

	/**
	 * @uml.property  name="feesmasterDao"
	 * @uml.associationEnd  
	 */
	private FeesMasterDao feesmasterDao;
	/**
	 * @param feesmasterDao
	 * @uml.property  name="feesmasterDao"
	 */
	public void setFeesmasterDao(FeesMasterDao feesmasterDao) {
		this.feesmasterDao = feesmasterDao;
	}

	@Override
	@Transactional
	public List<FeesMaster> listFessmaster() {
		// TODO Auto-generated method stub
		return this.feesmasterDao.listFessmaster();
	}

	@Override
	@Transactional
	public void addFeesMaster(FeesMaster fm) {
		// TODO Auto-generated method stub
		this.feesmasterDao.addFeesMaster(fm);
	}

	@Override
	@Transactional
	public void updateFeesMaster(int fee_id) {
		// TODO Auto-generated method stub
		this.feesmasterDao.updateFeesMaster(fee_id);
	}

	@Override
	@Transactional
	public FeesMaster getupdatebyid(int fee_id) {
		// TODO Auto-generated method stub
		return this.feesmasterDao.getupdatebyid(fee_id);
	}

	@Override
	@Transactional
	public void upFeesMaster(FeesMaster fm) {
		// TODO Auto-generated method stub
		this.feesmasterDao.upFeesMaster(fm);
	}

	@Override
	public FeesMaster getFeesMasterbyCourseId(int course_id) {
		// TODO Auto-generated method stub
		return this.feesmasterDao.getFeesMasterbyCourseId(course_id);
	}

}

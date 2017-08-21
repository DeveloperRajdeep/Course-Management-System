package com.ezen.cms.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ezen.cms.dao.BranchMasterDao;
import com.ezen.cms.model.BranchMaster;

public class BranchMasterServiceImpl implements BranchMasterService {

	/**
	 * @uml.property  name="branchmasterDao"
	 * @uml.associationEnd  
	 */
	private BranchMasterDao branchmasterDao;
	public void setBranchmasDao(BranchMasterDao branchmasterDao){
		this.branchmasterDao =  branchmasterDao;
		}
	
	@Override
	@Transactional
	public List<BranchMaster> listBranchMaster() {
		// TODO Auto-generated method stub
		return this.branchmasterDao.listBranchMaster();
	}

	@Override
	@Transactional
	public void addBranchMaster(BranchMaster bt) {
		// TODO Auto-generated method stub
		this.branchmasterDao.addBranchMaster(bt);
	}

	@Override
	@Transactional
	public void updateBranchMaster(int branch_id) {
		// TODO Auto-generated method stub
		this.branchmasterDao.updateBranchMaster(branch_id);
	}

	@Override
	@Transactional
	public BranchMaster getupdatebyid(int branch_id) {
		// TODO Auto-generated method stub
		return this.branchmasterDao.getupdatebyid(branch_id);
	}

	@Override
	@Transactional
	public void upBranchMaster(BranchMaster bt) {
		// TODO Auto-generated method stub
		this.branchmasterDao.upBranchMaster(bt);
	}

}

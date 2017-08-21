package com.ezen.cms.service;

import java.util.List;

import com.ezen.cms.model.BranchMaster;

public interface BranchMasterService {

	public List<BranchMaster> listBranchMaster();
	public void addBranchMaster(BranchMaster bt);
	public void updateBranchMaster(int branch);
	public BranchMaster getupdatebyid(int branch_id);
	public void upBranchMaster(BranchMaster bt);
}

package com.ezen.cms.service;

import java.util.List;

import com.ezen.cms.model.FeesMaster;

public interface FeesMasterService {

	public List<FeesMaster> listFessmaster();
	public void addFeesMaster(FeesMaster fm);
	public void updateFeesMaster(int fee);
	public FeesMaster getupdatebyid(int fee_id);
	public void upFeesMaster(FeesMaster fm);
	public FeesMaster getFeesMasterbyCourseId(int course_id);
}

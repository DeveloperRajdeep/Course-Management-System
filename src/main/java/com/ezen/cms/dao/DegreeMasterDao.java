package com.ezen.cms.dao;

import java.util.List;

import com.ezen.cms.model.DegreeMaster;

public interface DegreeMasterDao {
	
	public List<DegreeMaster> listDegreeMaster();
	public void addDegreeMaster(DegreeMaster dt);
	public void updateDegreeMaster(int degree_id);
	public DegreeMaster getupdatebyid(int degree_id);
	public void upDegreeMaster(DegreeMaster dt);
	public List<DegreeMaster> listdegree();
}

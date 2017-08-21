package com.ezen.cms.dao;

import java.util.List;

import com.ezen.cms.model.CutOffPercentage;

public interface CutOffPercentageDao {

	public List<CutOffPercentage> listCutOffPercentage();
	public void addCutOffPercentage(CutOffPercentage cop);
	public void updateCutOffPercentage(int copercentage);
	public CutOffPercentage getupdatebyid(int cut_off_id);
	public void upCutOffPercentage(CutOffPercentage cop);
}

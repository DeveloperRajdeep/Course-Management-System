package com.ezen.cms.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ezen.cms.dao.CutOffPercentageDao;
import com.ezen.cms.model.CutOffPercentage;

public class CutOffPercentageServiceImpl implements CutOffPercentageService {

	/**
	 * @uml.property  name="cutoffpercentageDao"
	 * @uml.associationEnd  
	 */
	private CutOffPercentageDao cutoffpercentageDao;
	public void setCutoffperDao(CutOffPercentageDao cutoffpercentageDao){
		this.cutoffpercentageDao = cutoffpercentageDao;
	}
	
	@Override
	@Transactional
	public List<CutOffPercentage> listCutOffPercentage() {
		// TODO Auto-generated method stub
		return this.cutoffpercentageDao.listCutOffPercentage();
	}

	@Override
	@Transactional
	public void addCutOffPercentage(CutOffPercentage cop) {
		// TODO Auto-generated method stub
		this.cutoffpercentageDao.addCutOffPercentage(cop);
	}

	@Override
	@Transactional
	public void updateCutOffPercentage(int cut_off_id) {
		// TODO Auto-generated method stub
		this.cutoffpercentageDao.updateCutOffPercentage(cut_off_id);
	}

	@Override
	@Transactional
	public CutOffPercentage getupdatebyid(int cut_off_id) {
		// TODO Auto-generated method stub
		return this.cutoffpercentageDao.getupdatebyid(cut_off_id);
	}

	@Override
	@Transactional
	public void upCutOffPercentage(CutOffPercentage cop) {
		// TODO Auto-generated method stub
		this.cutoffpercentageDao.upCutOffPercentage(cop);
	}

}

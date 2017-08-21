package com.ezen.cms.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ezen.cms.dao.StudentAddressInfoDao;
import com.ezen.cms.model.StudentAddressInfo;

public class StudentAddressInfoServiceImpl implements StudentAddressInfoService {

	public StudentAddressInfoDao studentaddressinfoDao;
	public void setStudentaddressinfoDao(StudentAddressInfoDao studentaddressinfoDao) {
		this.studentaddressinfoDao = studentaddressinfoDao;
	}

	@Override
	@Transactional
	public List<StudentAddressInfo> listStudentAddressInfo() {
		// TODO Auto-generated method stub
		return this.studentaddressinfoDao.listStudentAddressInfo();
	}

	@Override
	@Transactional
	public void addStudentAddressInfo(StudentAddressInfo sai) {
		// TODO Auto-generated method stub
		this.studentaddressinfoDao.addStudentAddressInfo(sai);
	}

	@Override
	@Transactional
	public void updateStudentAddressInfo(int student) {
		// TODO Auto-generated method stub
		this.studentaddressinfoDao.updateStudentAddressInfo(student);
	}

	@Override
	@Transactional
	public StudentAddressInfo getupdatebyid(int student3_id) {
		// TODO Auto-generated method stub
		return this.studentaddressinfoDao.getupdatebyid(student3_id);
	}

	@Override
	@Transactional
	public void upStudentAddressInfo(StudentAddressInfo sai) {
		// TODO Auto-generated method stub
		this.studentaddressinfoDao.upStudentAddressInfo(sai);
	}

}

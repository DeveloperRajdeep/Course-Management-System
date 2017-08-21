package com.ezen.cms.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ezen.cms.dao.StudentParentsInfoDao;
import com.ezen.cms.model.StudentParentsInfo;

public class StudentParentsInfoServiceImpl implements StudentParentsInfoService {

	public StudentParentsInfoDao studentparentsinfoDao;
	public void setStudentparentsinfoDao(StudentParentsInfoDao studentparentsinfoDao) {
		this.studentparentsinfoDao = studentparentsinfoDao;
	}

	@Override
	@Transactional
	public List<StudentParentsInfo> listStudentParentsInfo() {
		// TODO Auto-generated method stub
		return this.studentparentsinfoDao.listStudentParentsInfo();
	}

	@Override
	@Transactional
	public void addStudentParentsInfo(StudentParentsInfo sppi) {
		// TODO Auto-generated method stub
		this.studentparentsinfoDao.addStudentParentsInfo(sppi);
	}

	@Override
	@Transactional
	public void updateStudentParentsInfo(int student) {
		// TODO Auto-generated method stub
		this.studentparentsinfoDao.updateStudentParentsInfo(student);
	}

	@Override
	@Transactional
	public StudentParentsInfo getupdatebyid(int student2_id) {
		// TODO Auto-generated method stub
		return this.studentparentsinfoDao.getupdatebyid(student2_id);
	}

	@Override
	@Transactional
	public void upStudentParentsInfo(StudentParentsInfo sppi) {
		// TODO Auto-generated method stub
		this.studentparentsinfoDao.upStudentParentsInfo(sppi);
	}

}

package com.ezen.cms.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ezen.cms.dao.StudentPersonalInfoDao;
import com.ezen.cms.model.StudentPersonalInfo;

public class StudentPersonalInfoServiceImpl implements StudentPersonalInfoService {

	private StudentPersonalInfoDao studentpersonalinfodao;
	public void setStudentpersonalinfodao(StudentPersonalInfoDao studentpersonalinfoDao) {
		this.studentpersonalinfodao = studentpersonalinfoDao;
	}

	@Override
	@Transactional
	public List<StudentPersonalInfo> listStudentPersonalInfo() {
		// TODO Auto-generated method stub
		return this.studentpersonalinfodao.listStudentPersonalInfo();
	}

	@Override
	@Transactional
	public void addStudentPersonalInfo(StudentPersonalInfo spi) {
		// TODO Auto-generated method stub
		this.studentpersonalinfodao.addStudentPersonalInfo(spi);

	}

	@Override
	@Transactional
	public void updateStudentPersonalInfo(int student_id) {
		// TODO Auto-generated method stub
		this.studentpersonalinfodao.updateStudentPersonalInfo(student_id);
	}

	@Override
	@Transactional
	public StudentPersonalInfo getupdateby(int student_id) {
		// TODO Auto-generated method stub
		return this.studentpersonalinfodao.getupdateby(student_id);
	}

	@Override
	@Transactional
	public void upStudentPersonalInfo(StudentPersonalInfo spi) {
		// TODO Auto-generated method stub
		this.studentpersonalinfodao.upStudentPersonalInfo(spi);
	}

	@Override
	public StudentPersonalInfo getstudentpersonalinfobyStudentId(int student_id) {
		// TODO Auto-generated method stub
		return this.studentpersonalinfodao.getstudentpersonalinfobyStudentId(student_id);
	}

}

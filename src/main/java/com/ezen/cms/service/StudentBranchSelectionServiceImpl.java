package com.ezen.cms.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ezen.cms.dao.StudentBranchSelectionDao;
import com.ezen.cms.model.StudentBranchSelection;

public class StudentBranchSelectionServiceImpl implements StudentBranchSelectionService {

	public StudentBranchSelectionDao studentbranchselectionDao;
	public void setStudentbranchselectionDao(StudentBranchSelectionDao studentbranchselectionDao) {
		this.studentbranchselectionDao = studentbranchselectionDao;
	}

	@Override
	@Transactional
	public List<StudentBranchSelection> listStudentBranchSelection() {
		// TODO Auto-generated method stub
		return this.studentbranchselectionDao.listStudentBranchSelection();
	}

	@Override
	@Transactional
	public void addStudentBranchSelection(StudentBranchSelection sbs) {
		// TODO Auto-generated method stub
		this.studentbranchselectionDao.addStudentBranchSelection(sbs);
	}

	@Override
	@Transactional
	public void updateStudentBranchSelection(int student) {
		// TODO Auto-generated method stub
		this.studentbranchselectionDao.updateStudentBranchSelection(student);
	}

	@Override
	@Transactional
	public StudentBranchSelection getupdatebyid(int student8_id) {
		// TODO Auto-generated method stub
		return this.getupdatebyid(student8_id);
	}

	@Override
	@Transactional
	public void upStudentBranchSelection(StudentBranchSelection sbs) {
		// TODO Auto-generated method stub
		this.studentbranchselectionDao.upStudentBranchSelection(sbs);
	}

}

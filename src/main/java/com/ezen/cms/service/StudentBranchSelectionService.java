package com.ezen.cms.service;

import java.util.List;

import com.ezen.cms.model.StudentBranchSelection;

public interface StudentBranchSelectionService {

	public List<StudentBranchSelection> listStudentBranchSelection();
	public void addStudentBranchSelection(StudentBranchSelection sbs);
	public void updateStudentBranchSelection(int student);
	public StudentBranchSelection getupdatebyid(int student8_id);
	public void upStudentBranchSelection(StudentBranchSelection sbs);
}

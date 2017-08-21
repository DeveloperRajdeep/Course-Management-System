package com.ezen.cms.service;

import java.util.List;

import com.ezen.cms.model.StudentParentsInfo;

public interface StudentParentsInfoService {

	public List<StudentParentsInfo> listStudentParentsInfo();
	public void addStudentParentsInfo(StudentParentsInfo sppi);
	public void updateStudentParentsInfo(int student);
	public StudentParentsInfo getupdatebyid(int student2_id);
	public void upStudentParentsInfo(StudentParentsInfo sppi);
}

package com.ezen.cms.service;

import java.util.List;

import com.ezen.cms.model.StudentPersonalInfo;

public interface StudentPersonalInfoService {

	public List<StudentPersonalInfo> listStudentPersonalInfo();
	public void addStudentPersonalInfo(StudentPersonalInfo spi);
	public void updateStudentPersonalInfo(int student);
	public StudentPersonalInfo getupdateby(int student_id);
	public void upStudentPersonalInfo(StudentPersonalInfo spi);
	public StudentPersonalInfo getstudentpersonalinfobyStudentId(int student_id);
}

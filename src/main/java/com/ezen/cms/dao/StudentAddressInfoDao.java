package com.ezen.cms.dao;

import java.util.List;

import com.ezen.cms.model.StudentAddressInfo;

public interface StudentAddressInfoDao {

	public List<StudentAddressInfo> listStudentAddressInfo();
	public void addStudentAddressInfo(StudentAddressInfo sai);
	public void updateStudentAddressInfo(int student);
	public StudentAddressInfo getupdatebyid(int student3_id);
	public void upStudentAddressInfo(StudentAddressInfo sai);
}

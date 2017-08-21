package com.ezen.cms.service;

import java.math.BigInteger;
import java.util.List;
import com.ezen.cms.model.StudentRegistration;

public interface StudentRegistrationService {

	public List<StudentRegistration> listStudentRegistration();
	public int addStudentRegistration(StudentRegistration sr);
	public void updateStudentRegistration(StudentRegistration studentRegistration);
	public StudentRegistration getupdatebyid(int student_id);
	public void upStudentRegistration(StudentRegistration sr);
	public StudentRegistration getStudentRegistrationByStudentId(int student_id);
	public void setEnrollmentId(String enrollment_id, int student_id);
	public StudentRegistration getenrolid(String enrollment_id,String password);
	public StudentRegistration getStudentRegistrationByEnrollId(String enroll_id);
	public StudentRegistration updatePaymentStatusStudentRegistrationByStudentId(int student_id, int status);
}

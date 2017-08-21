package com.ezen.cms.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ezen.cms.dao.StudentRegistrationDao;
import com.ezen.cms.model.StudentRegistration;

public class StudentRegistrationServiceImpl implements StudentRegistrationService {

	/**
	 * @uml.property  name="studentregistrationdao"
	 * @uml.associationEnd  
	 */
	private StudentRegistrationDao studentregistrationdao;
	/**
	 * @param studentregistrationdao
	 * @uml.property  name="studentregistrationdao"
	 */
	public void setStudentregistrationdao(StudentRegistrationDao studentregistrationdao){
		this.studentregistrationdao=studentregistrationdao;
	}
	
	@Override
	@Transactional
	public List<StudentRegistration> listStudentRegistration() {
		// TODO Auto-generated method stub
		return this.studentregistrationdao.listStudentRegistration();
	}

	@Override
	@Transactional
	public int addStudentRegistration(StudentRegistration sr) {
		// TODO Auto-generated method stub
		return this.studentregistrationdao.addStudentRegistration(sr);
	}

	@Override
	@Transactional
	public void updateStudentRegistration(StudentRegistration studentRegistration) {
		// TODO Auto-generated method stub
		this.studentregistrationdao.updateStudentRegistration(studentRegistration);
	}

	@Override
	@Transactional
	public StudentRegistration getupdatebyid(int student_id) {
		// TODO Auto-generated method stub
		return this.studentregistrationdao.getupdatebyid(student_id);
	}

	@Override
	@Transactional
	public void upStudentRegistration(StudentRegistration sr) {
		// TODO Auto-generated method stub
		this.studentregistrationdao.upStudentRegistration(sr);
	}

	@Override
	@Transactional
	public StudentRegistration getStudentRegistrationByStudentId(int student_id) {
		return studentregistrationdao.getStudentRegistrationByStudentId(student_id);
	}

	@Override
	@Transactional
	public void setEnrollmentId(String enrollment_id, int student_id) {
		studentregistrationdao.setEnrollmentId(enrollment_id, student_id);
		
	}

	@Override
	public StudentRegistration getenrolid(String enrollment_id,String password) {
		// TODO Auto-generated method stub
		return this.studentregistrationdao.getenrolid(enrollment_id,password);
	}

	@Override
	public StudentRegistration getStudentRegistrationByEnrollId(String enroll_id) {
		return this.studentregistrationdao.getStudentRegistrationByEnrollId(enroll_id);
	}

	@Override
	public StudentRegistration updatePaymentStatusStudentRegistrationByStudentId(int student_id, int status) {
		// TODO Auto-generated method stub
		return this.studentregistrationdao.updatePaymentStatusStudentRegistrationByStudentId(student_id,status);
	}

}

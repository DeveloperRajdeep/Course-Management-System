package com.ezen.cms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ezen.cms.model.StudentAddressInfo;

public class StudentAddressInfoDaoImpl implements StudentAddressInfoDao {

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<StudentAddressInfo> listStudentAddressInfo() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<StudentAddressInfo> studentaddressinfoList = session.createQuery("From StudentAddressInfo").list();
		return studentaddressinfoList;
	}

	@Override
	public void addStudentAddressInfo(StudentAddressInfo sai) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		System.out.println("Data are Added");
		session.save(sai);
		session.flush();
	}

	@Override
	public void updateStudentAddressInfo(int student_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.createQuery("update from StudentAddressInfo set s_status='N' where student_id="+student_id);
		System.out.println("Data are updated succesfully");
	}

	@Override
	public StudentAddressInfo getupdatebyid(int student3_id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		StudentAddressInfo sai = (StudentAddressInfo) session.load("StudentAddressInfo.class", new Integer(student3_id));
		return sai;
	}

	@Override
	public void upStudentAddressInfo(StudentAddressInfo sai) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Data are Added");
		session.update(sai);
	}

}

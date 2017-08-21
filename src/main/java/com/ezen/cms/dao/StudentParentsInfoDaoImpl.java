package com.ezen.cms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ezen.cms.model.StudentParentsInfo;

public class StudentParentsInfoDaoImpl implements StudentParentsInfoDao {

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<StudentParentsInfo> listStudentParentsInfo() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<StudentParentsInfo> studentparentsinfoList=session.createQuery("From StudentParentsInfo").list();
		return studentparentsinfoList;
	}

	@Override
	public void addStudentParentsInfo(StudentParentsInfo sppi) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		System.out.println("Data are Added");
		session.save(sppi);
		session.flush();

	}

	@Override
	public void updateStudentParentsInfo(int student_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.createQuery("update from StudentParentsInfo set s_status='N' where student_id="+student_id);
		System.out.println("Data are updated succesfully");
	}

	@Override
	public StudentParentsInfo getupdatebyid(int student2_id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		StudentParentsInfo sppi = (StudentParentsInfo) session.load("StudentParentsInfo.class", new Integer(student2_id));
		return sppi;
	}

	@Override
	public void upStudentParentsInfo(StudentParentsInfo sppi) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Data are Added");
		session.update(sppi);
	}

}

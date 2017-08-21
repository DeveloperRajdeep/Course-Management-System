package com.ezen.cms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ezen.cms.model.StudentPersonalInfo;
import com.ezen.cms.model.StudentRegistration;

public class StudentPersonalInfoDaoImpl implements StudentPersonalInfoDao {

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<StudentPersonalInfo> listStudentPersonalInfo() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<StudentPersonalInfo> studentpersonalinfoList=session.createQuery("FROM StudentPersonalInfo").list(); 
		return studentpersonalinfoList;
	}

	@Override
	public void addStudentPersonalInfo(StudentPersonalInfo spi) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		System.out.println("Data are Added");
		//session.persist(spi);
		session.save(spi);
		session.flush();
	}

	@Override
	public void updateStudentPersonalInfo(int student_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.createQuery("update from StudentPersonalInfo set s_status='N' where student_id="+student_id);
		System.out.println("Data are updated succesfully");
	}

	@Override
	public StudentPersonalInfo getupdateby(int student_id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		StudentPersonalInfo spi = (StudentPersonalInfo) session.load(StudentPersonalInfo.class, new Integer(student_id));
		return spi;
	}

	@Override
	public void upStudentPersonalInfo(StudentPersonalInfo spi) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Data are Added");
		session.update(spi);
	}
	@SuppressWarnings("unchecked")
	@Override
	public StudentPersonalInfo getstudentpersonalinfobyStudentId(int student_id) {
		Session session=this.sessionFactory.openSession();
		List<StudentPersonalInfo> srl = session.createQuery("from StudentPersonalInfo where student_id="+student_id).list();
		session.close();
		if(srl.size()>0) return srl.get(0);
		else return null;
	}


}

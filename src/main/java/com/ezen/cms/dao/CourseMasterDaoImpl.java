package com.ezen.cms.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ezen.cms.model.CourseMaster;


public class CourseMasterDaoImpl implements CourseMasterDao {
	//@AutowiredSessionFactory sessionfactory;
	/**
	 * @uml.property  name="sessionFactory"
	 * @uml.associationEnd  
	 */
	private SessionFactory sessionFactory;
	/**
	 * @param sf
	 * @uml.property  name="sessionFactory"
	 */
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
		sessionFactory.openSession();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CourseMaster> listCourseMaster() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		List<CourseMaster> coursemasterList=session.createQuery("FROM CourseMaster").list();
		return coursemasterList;
	}
	

	@Override
	public void addCourseMaster(CourseMaster ct) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Data are Added");
		session.persist(ct);
	}

	@Override
	public void updateCourseMaster(int course_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.createQuery("update from CourseMaster set course_status='N' where course_id="+course_id);
		System.out.println("Data are updated succesfully");

	}

	@Override
	public CourseMaster getupdatebyid(int course_id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		CourseMaster ct = (CourseMaster) session.load(CourseMaster.class, new Integer(course_id));
		System.out.println("Successfully Loaded");
		return ct;
	}

	@Override
	public void upCourseMaster(CourseMaster ct) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Data are Added");
		session.update(ct);
	}

}

package com.ezen.cms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ezen.cms.model.Test;

public class TestDaoImpl implements TestDao {
	/**
	 * @uml.property  name="sessionfactory"
	 * @uml.associationEnd  readOnly="true"
	 */
	@Autowired
	SessionFactory sessionfactory;
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
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Test> listTest() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		List<Test> testList = session.createQuery("FROM Test").list();
		return testList;
	}

	@Override
	public void deleteTestById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.createSQLQuery("delete from test where id="+id).executeUpdate();

	}

	@Override
	public void updateTest(Test t) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		System.out.println("here2");
		session.update(t);

	}

	@Override
	public void addTest(Test t) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("here");
		session.persist(t);
		
	}
	
	@Override
	public Test getupdatebyid(int id){
		
		Session session = this.sessionFactory.getCurrentSession();
		Test t = (Test) session.load(Test.class, new Integer(id));
		
		System.out.println("message"+  t.getMessage());
		System.out.println("Successfully Loaded");
		return t;
	}

}

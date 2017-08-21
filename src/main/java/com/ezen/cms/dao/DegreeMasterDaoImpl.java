package com.ezen.cms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ezen.cms.model.DegreeMaster;

public class DegreeMasterDaoImpl implements DegreeMasterDao {
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
		sessionFactory.openSession();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DegreeMaster> listDegreeMaster() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		List<DegreeMaster> degreemasterList=session.createQuery("FROM DegreeMaster").list();
		return degreemasterList;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<DegreeMaster> listdegree()
	{
		Session session = sessionFactory.getCurrentSession();
		List<DegreeMaster> listdeg = session.createQuery("From DegreeMaster").list();
		return listdeg;
	}

	@Override
	public void addDegreeMaster(DegreeMaster dt) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Data are Added");
		session.persist(dt);

	}

	@Override
	public void updateDegreeMaster(int degree_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.createQuery("update from DegreeMaster set degree_status='N' where degree_id="+degree_id);
		System.out.println("Data are updated succesfully");

	}

	@Override
	public DegreeMaster getupdatebyid(int degree_id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		DegreeMaster dt = (DegreeMaster) session.load(DegreeMaster.class, new Integer(degree_id));
		System.out.println("Successfully Loaded");
		return dt;
	}
	@Override
	public void upDegreeMaster(DegreeMaster dt) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Data are Added");
		session.update(dt);

	}
}

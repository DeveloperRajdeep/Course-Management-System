package com.ezen.cms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ezen.cms.model.FeesMaster;

public class FeesMasterDaoImpl implements FeesMasterDao {

	/**
	 * @uml.property  name="sessionFactory"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="com.ezen.cms.model.FeesMaster"
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
	public List<FeesMaster> listFessmaster() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		List<FeesMaster> feesmasterList=session.createQuery("From FeesMaster").list();
		return feesmasterList;
	}

	@Override
	public void addFeesMaster(FeesMaster fm) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Data are Added");
		session.persist(fm);

	}

	@Override
	public void updateFeesMaster(int fee_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.createQuery("update from FeesMaster set status='N' where fee_id="+fee_id);
		System.out.println("Data are updated succesfully");
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public FeesMaster getupdatebyid(int fee_id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		List<FeesMaster> fml=session.createQuery("from FeesMaster where fee_id="+fee_id).list();
		if(fml.size()>0) return fml.get(0);
		else return null;
		
		//return null;
	}

	@Override
	public void upFeesMaster(FeesMaster fm) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Data are Added");
		session.update(fm);
	}

	@SuppressWarnings("unchecked")
	@Override
	public FeesMaster getFeesMasterbyCourseId(int course_id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		List<FeesMaster> fml=session.createQuery("from FeesMaster where course_id="+course_id).list();
		if(fml.size()>0) return fml.get(0);
		else return null;
	}

}

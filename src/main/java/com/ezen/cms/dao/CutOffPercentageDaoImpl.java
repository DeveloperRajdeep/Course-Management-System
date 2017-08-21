package com.ezen.cms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ezen.cms.model.CutOffPercentage;

public class CutOffPercentageDaoImpl implements CutOffPercentageDao {

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
	public List<CutOffPercentage> listCutOffPercentage() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<CutOffPercentage>cutoffpercentageList=session.createQuery("FROM CutOffPercentage").list();
		return cutoffpercentageList;
	}

	@Override
	public void addCutOffPercentage(CutOffPercentage cop) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Data are Added");
		session.persist(cop);
	}

	@Override
	public void updateCutOffPercentage(int cut_off_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.createQuery("update from CutOffPercentage set status='N' where cut_off_id="+cut_off_id);
		System.out.println("Data are updated succesfully");
	}

	@Override
	public CutOffPercentage getupdatebyid(int cut_off_id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		CutOffPercentage cop=(CutOffPercentage) session.load(CutOffPercentage.class, new Integer(cut_off_id));
		System.out.println("Successfully Loaded");
		return cop;
	}

	@Override
	public void upCutOffPercentage(CutOffPercentage cop) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Data are Added");
		session.update(cop);
	}

}

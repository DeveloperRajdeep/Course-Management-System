package com.ezen.cms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ezen.cms.model.BranchMaster;


public class BranchMasterDaoImpl implements BranchMasterDao {
//	@Autowired
//	SessionFactory sessionfactory;
	/**
	 * @uml.property  name="sessionFactory"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="com.ezen.cms.model.BranchMaster"
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
	public List<BranchMaster> listBranchMaster() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<BranchMaster> branchmasterList=session.createQuery("FROM BranchMaster").list();
		return branchmasterList;
	}

	@Override
	public void addBranchMaster(BranchMaster bt) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Data are Added");
		session.persist(bt);
	}

	@Override
	public void updateBranchMaster(int branch_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.createQuery("update from BranchMaster set branch_status='N' where branch_id="+branch_id);
		System.out.println("Data are updated succesfully");
	}

	@SuppressWarnings("unchecked")
	@Override
	public BranchMaster getupdatebyid(int branch_id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		//BranchMaster bt = (BranchMaster) session.load(BranchMaster.class, new Integer(branch_id));
		List<BranchMaster> bml = session.createQuery("from BranchMaster where branch_id="+branch_id).list();
		
		if(bml.size()>0) return bml.get(0);
		else return null;
		
		//return bt;
	}

	@Override
	public void upBranchMaster(BranchMaster bt) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Data are Added");
		session.update(bt);
	}

}

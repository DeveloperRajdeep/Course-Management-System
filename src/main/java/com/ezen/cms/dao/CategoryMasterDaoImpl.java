package com.ezen.cms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ezen.cms.model.CategoryMaster;

public class CategoryMasterDaoImpl implements CategoryMasterDao {
	
	//@Autowired
	//SessionFactory sessionfactory;
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
	public List<CategoryMaster> listCategoryMaster() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List <CategoryMaster>categorymasterList=session.createQuery("FROM CategoryMaster").list();
		return categorymasterList;
	}

	@Override
	public void addCategoryMaster(CategoryMaster cmt) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Data are Added");
		session.persist(cmt);
	}

	@Override
	public void updateCategoryMaster(int category_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.createQuery("update from CategoryMaster set category_status='inactive' where category_id="+category_id);
		System.out.println("Data are updated succesfully");

	}

	@Override
	public CategoryMaster getupdatebyid(int category_id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		CategoryMaster cmt=(CategoryMaster) session.load(CategoryMaster.class, new Integer(category_id));
		System.out.println("Successfully Loaded");
		return cmt;
	}

	@Override
	public void upCategoryMaster(CategoryMaster cmt) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Data are Added");
		session.update(cmt);
	}

}

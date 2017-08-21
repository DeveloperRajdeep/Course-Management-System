package com.ezen.cms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ezen.cms.model.StudentBranchSelection;

public class StudentBranchSelectionDaoImpl implements StudentBranchSelectionDao {

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<StudentBranchSelection> listStudentBranchSelection() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<StudentBranchSelection> studentbranchselectionList=session.createQuery("From StudentBranchSelection").list();
		return studentbranchselectionList;
	}

	@Override
	public void addStudentBranchSelection(StudentBranchSelection sbs) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		System.out.println("Data are Added");
		session.save(sbs);
		session.flush();

	}

	@Override
	public void updateStudentBranchSelection(int student_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.createQuery("update from StudentBranchSelection set s_status='N' where student_id="+student_id);
		System.out.println("Data are updated succesfully");
	}

	@Override
	public StudentBranchSelection getupdatebyid(int student8_id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		StudentBranchSelection sbs = (StudentBranchSelection) session.load("StudentBranchSelection.class",new Integer(student8_id) );
		return sbs;
	}

	@Override
	public void upStudentBranchSelection(StudentBranchSelection sbs) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Data are Added");
		session.update(sbs);
	}

}

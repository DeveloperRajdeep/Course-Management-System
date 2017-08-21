package com.ezen.cms.dao;

import java.math.BigInteger;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.ezen.cms.model.StudentRegistration;


public class StudentRegistrationDaoImpl implements StudentRegistrationDao {

	
	/**
	 * @uml.property  name="sessionFactory"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="com.ezen.cms.model.StudentRegistration"
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
	public List<StudentRegistration> listStudentRegistration() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<StudentRegistration> studentregistrationList=session.createQuery("From StudentRegistration").list();
		return studentregistrationList;
	}

	@Override
	public int addStudentRegistration(StudentRegistration sr) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Data are Added");
		session.persist(sr);
		//session.close();
		return sr.getStudent_id();
	}

	@Override
	public void updateStudentRegistration(StudentRegistration studentRegistration) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		//session.createQuery("update from StudentRegistration set status='N' where student_id="+student_id);
		session.update(studentRegistration);
		System.out.println("Data are updated succesfully");
	}

	@Override
	public StudentRegistration getupdatebyid(int student_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		StudentRegistration sr=(StudentRegistration) session.load(StudentRegistration.class, new Integer(student_id));
		System.out.println("Successfully Loaded");
		return sr ;
	}

	@Override
	public void upStudentRegistration(StudentRegistration sr) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Data are Added");
		session.update(sr);
	}

	@SuppressWarnings("unchecked")
	@Override
	public StudentRegistration getStudentRegistrationByStudentId(int student_id) {
		// TODO Auto-generated method stub
		Session session=this.sessionFactory.openSession();
		List<StudentRegistration> srl = session.createQuery("from StudentRegistration where student_id="+student_id).list();
		session.close();
		if(srl.size()>0) return srl.get(0);
		else return null;
	}

	@Override
	public void setEnrollmentId(String enrollment_id, int student_id) {
		Session session=this.sessionFactory.getCurrentSession();
		session.createQuery("update StudentRegistration set enrollment_id='"+enrollment_id+"' where student_id="+student_id).executeUpdate();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public StudentRegistration getenrolid(String enrollment_id,String password) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		List<StudentRegistration> lisen = session.createQuery("From StudentRegistration where enrollment_id = '"+enrollment_id+"' and password='"+password+"'").list();
		if(lisen.size()>0) return lisen.get(0);
		else return null;
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public StudentRegistration getStudentRegistrationByEnrollId(String enroll_id) {
		Session session = this.sessionFactory.openSession();
		List<StudentRegistration> lisen = session.createQuery("From StudentRegistration where enrollment_id = '"+enroll_id+"' ").list();
		if(lisen.size()>0) return lisen.get(0);
		else return null;
	}

	@Override
	@SuppressWarnings("unchecked")
	public StudentRegistration updatePaymentStatusStudentRegistrationByStudentId(int student_id,int status) {
		Session session = this.sessionFactory.openSession();
		session.createQuery("update StudentRegistration set payment_status="+status+" where student_id = "+student_id).executeUpdate();
		return null;
	}

}

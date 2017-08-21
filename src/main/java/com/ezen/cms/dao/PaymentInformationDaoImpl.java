package com.ezen.cms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.ezen.cms.model.PaymentInformation;

public class PaymentInformationDaoImpl implements PaymentInformationDao {

	/**
	 * @uml.property  name="sessionFactory"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="com.ezen.cms.model.PaymentInformation"
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
	public List<PaymentInformation> listPaymentInformation() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<PaymentInformation> paymentinformationList=session.createQuery("From PaymentInformation").list();
		return paymentinformationList;
	}

	@Override
	public void addPaymentInformation(PaymentInformation pi) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Data are Added");
		session.persist(pi);
	}

	@Override
	public void updatePaymentInformation(int payment_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.createQuery("update from PaymentInformation set status='N' where payment_id="+payment_id);
		System.out.println("Data are updated succesfully");
		
	}
	@SuppressWarnings("unchecked")
	@Override
	public PaymentInformation getupdatebyid(int payment_id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		List<PaymentInformation> pit = session.createQuery("from PaymentInformation where payment_id="+payment_id).list();
		
		if(pit.size()>0) return pit.get(0);
		else return null;
	}

	@Override
	public void upPaymentInformation(PaymentInformation pi) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Data are Added");
		session.update(pi);
	}

}

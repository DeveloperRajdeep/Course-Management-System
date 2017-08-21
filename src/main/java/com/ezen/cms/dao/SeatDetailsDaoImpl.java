package com.ezen.cms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ezen.cms.model.SeatDetails;

public class SeatDetailsDaoImpl implements SeatDetailsDao {

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
	public List<SeatDetails> listSeatDetails() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<SeatDetails> seatdetailsList=session.createQuery("FROM SeatDetails").list();
		return seatdetailsList;
	}

	@Override
	public void addSeatDetails(SeatDetails sd) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Data are Added");
		session.persist(sd);

	}

	@Override
	public void updateSeatDetails(int seat_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.createQuery("update from SeatDetails set status='N' where seat_id="+seat_id);
		System.out.println("Data are updated succesfully");
		
	}

	@Override
	public SeatDetails getupdatebyid(int seat_id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		SeatDetails sd=(SeatDetails) session.load(SeatDetails.class, new Integer(seat_id));
		System.out.println("Successfully Loaded");
		return sd;
	}

	@Override
	public void upSeatDetails(SeatDetails sd) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Data are Added");
		session.update(sd);
	}

}

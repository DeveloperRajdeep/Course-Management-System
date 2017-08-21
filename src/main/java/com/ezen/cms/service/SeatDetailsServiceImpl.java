package com.ezen.cms.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ezen.cms.dao.SeatDetailsDao;
import com.ezen.cms.model.SeatDetails;

public class SeatDetailsServiceImpl implements SeatDetailsService {
	
	/**
	 * @uml.property  name="seatdetailsdao"
	 * @uml.associationEnd  
	 */
	private SeatDetailsDao seatdetailsdao;
	/**
	 * @param seatdetailsdao
	 * @uml.property  name="seatdetailsdao"
	 */
	public void setSeatdetailsdao(SeatDetailsDao seatdetailsdao) {
		this.seatdetailsdao = seatdetailsdao;
	}

	@Override
	@Transactional
	public List<SeatDetails> listSeatDetails() {
		// TODO Auto-generated method stub
		return this.seatdetailsdao.listSeatDetails();
	}

	@Override
	@Transactional
	public void addSeatDetails(SeatDetails sd) {
		// TODO Auto-generated method stub
		this.seatdetailsdao.addSeatDetails(sd);

	}

	@Override
	@Transactional
	public void updateSeatDetails(int seat_id) {
		// TODO Auto-generated method stub
		this.seatdetailsdao.updateSeatDetails(seat_id);

	}

	@Override
	@Transactional
	public SeatDetails getupdatebyid(int seat_id) {
		// TODO Auto-generated method stub
		return this.seatdetailsdao.getupdatebyid(seat_id);
	}

	@Override
	@Transactional
	public void upSeatDetails(SeatDetails sd) {
		// TODO Auto-generated method stub
		this.seatdetailsdao.upSeatDetails(sd);
	}

}

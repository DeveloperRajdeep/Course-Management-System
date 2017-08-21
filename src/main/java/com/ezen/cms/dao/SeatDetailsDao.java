package com.ezen.cms.dao;

import java.util.List;

import com.ezen.cms.model.SeatDetails;

public interface SeatDetailsDao {

	public List<SeatDetails> listSeatDetails();
	public void addSeatDetails(SeatDetails sd);
	public void updateSeatDetails(int seat);
	public SeatDetails getupdatebyid(int seat_id);
	public void upSeatDetails(SeatDetails sd);
	
}

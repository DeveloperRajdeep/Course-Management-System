package com.ezen.cms.service;

import java.util.List;

import com.ezen.cms.model.SeatDetails;

public interface SeatDetailsService {
	
	public List<SeatDetails> listSeatDetails();
	public void addSeatDetails(SeatDetails sd);
	public void updateSeatDetails(int seat);
	public SeatDetails getupdatebyid(int seat_id);
	public void upSeatDetails(SeatDetails sd);
	
	}

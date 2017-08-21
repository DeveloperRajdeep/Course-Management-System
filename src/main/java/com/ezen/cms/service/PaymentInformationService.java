package com.ezen.cms.service;

import java.util.List;

import com.ezen.cms.model.PaymentInformation;

public interface PaymentInformationService {

	public List<PaymentInformation> listPaymentInformation();
	public void addPaymentInformation(PaymentInformation pi);
	public void updatePaymentInformation(int payment_id);
	public PaymentInformation getupdatebyid(int payment_id);
	public void upPaymentInformation(PaymentInformation pi);
}

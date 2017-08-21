package com.ezen.cms.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ezen.cms.dao.PaymentInformationDao;
import com.ezen.cms.model.PaymentInformation;

public class PaymentInformationServiceImpl implements PaymentInformationService {

	/**
	 * @uml.property  name="paymentinformationDao"
	 * @uml.associationEnd  
	 */
	private PaymentInformationDao paymentinformationDao;
	/**
	 * @param paymentinformationDao
	 * @uml.property  name="paymentinformationDao"
	 */
	public void setPaymentinformationDao(PaymentInformationDao paymentinformationDao) {
		this.paymentinformationDao = paymentinformationDao;
	}

	@Override
	@Transactional
	public List<PaymentInformation> listPaymentInformation() {
		// TODO Auto-generated method stub
		return this.paymentinformationDao.listPaymentInformation();
	}

	@Override
	@Transactional
	public void addPaymentInformation(PaymentInformation pi) {
		// TODO Auto-generated method stub
		this.paymentinformationDao.addPaymentInformation(pi);
	}

	@Override
	@Transactional
	public void updatePaymentInformation(int payment_id) {
		// TODO Auto-generated method stub
		this.paymentinformationDao.updatePaymentInformation(payment_id);
	}

	@Override
	@Transactional
	public PaymentInformation getupdatebyid(int payment_id) {
		// TODO Auto-generated method stub
		return this.paymentinformationDao.getupdatebyid(payment_id);
	}

	@Override
	@Transactional
	public void upPaymentInformation(PaymentInformation pi) {
		// TODO Auto-generated method stub
		this.paymentinformationDao.upPaymentInformation(pi);
	}

}

package com.ezen.cms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment_information")
public class PaymentInformation {

	/**
	 * @uml.property  name="payment_id"
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int payment_id;
	/**
	 * @uml.property  name="student_id"
	 */
	private int student_id;
	/**
	 * @uml.property  name="card_name"
	 */
	private String card_name;
	/**
	 * @uml.property  name="card_number"
	 */
	private int card_number;
	/**
	 * @uml.property  name="fee_id"
	 */
	private int fee_id;
	/**
	 * @uml.property  name="status"
	 */
	private String status;
	/**
	 * @uml.property  name="date_time"
	 */
	private String date_time;
	/**
	 * @uml.property  name="transaction_id"
	 */
	private String transaction_id;
	/**
	 * @return
	 * @uml.property  name="payment_id"
	 */
	public int getPayment_id() {
		return payment_id;
	}
	/**
	 * @param payment_id
	 * @uml.property  name="payment_id"
	 */
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}
	/**
	 * @return
	 * @uml.property  name="student_id"
	 */
	public int getStudent_id() {
		return student_id;
	}
	/**
	 * @param student_id
	 * @uml.property  name="student_id"
	 */
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	/**
	 * @return
	 * @uml.property  name="card_name"
	 */
	public String getCard_name() {
		return card_name;
	}
	/**
	 * @param card_name
	 * @uml.property  name="card_name"
	 */
	public void setCard_name(String card_name) {
		this.card_name = card_name;
	}
	/**
	 * @return
	 * @uml.property  name="card_number"
	 */
	public int getCard_number() {
		return card_number;
	}
	/**
	 * @param card_number
	 * @uml.property  name="card_number"
	 */
	public void setCard_number(int card_number) {
		this.card_number = card_number;
	}
	/**
	 * @return
	 * @uml.property  name="fee_id"
	 */
	public int getFee_id() {
		return fee_id;
	}
	/**
	 * @param fee_id
	 * @uml.property  name="fee_id"
	 */
	public void setFee_id(int fee_id) {
		this.fee_id = fee_id;
	}
	/**
	 * @return
	 * @uml.property  name="status"
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status
	 * @uml.property  name="status"
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return
	 * @uml.property  name="date_time"
	 */
	public String getDate_time() {
		return date_time;
	}
	/**
	 * @param date_time
	 * @uml.property  name="date_time"
	 */
	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}
	/**
	 * @return
	 * @uml.property  name="transaction_id"
	 */
	public String getTransaction_id() {
		return transaction_id;
	}
	/**
	 * @param transaction_id
	 * @uml.property  name="transaction_id"
	 */
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
}

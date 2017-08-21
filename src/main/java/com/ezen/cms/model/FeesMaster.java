package com.ezen.cms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fess_master")
public class FeesMaster {
	
	/**
	 * @uml.property  name="fee_id"
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int fee_id;
	/**
	 * @uml.property  name="course_id"
	 */
	private int course_id;
	/**
	 * @uml.property  name="fee_amount"
	 */
	private int fee_amount;
	/**
	 * @uml.property  name="fee_type"
	 */
	private String fee_type;
	/**
	 * @uml.property  name="fee_status"
	 */
	private String fee_status;
	/**
	 * @uml.property  name="session"
	 */
	private String session;
	/**
	 * @uml.property  name="date_time"
	 */
	private String date_time;
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
	 * @uml.property  name="course_id"
	 */
	public int getCourse_id() {
		return course_id;
	}
	/**
	 * @param course_id
	 * @uml.property  name="course_id"
	 */
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	/**
	 * @return
	 * @uml.property  name="fee_amount"
	 */
	public int getFee_amount() {
		return fee_amount;
	}
	/**
	 * @param fee_amount
	 * @uml.property  name="fee_amount"
	 */
	public void setFee_amount(int fee_amount) {
		this.fee_amount = fee_amount;
	}
	/**
	 * @return
	 * @uml.property  name="fee_type"
	 */
	public String getFee_type() {
		return fee_type;
	}
	/**
	 * @param fee_type
	 * @uml.property  name="fee_type"
	 */
	public void setFee_type(String fee_type) {
		this.fee_type = fee_type;
	}
	/**
	 * @return
	 * @uml.property  name="fee_status"
	 */
	public String getFee_status() {
		return fee_status;
	}
	/**
	 * @param fee_status
	 * @uml.property  name="fee_status"
	 */
	public void setFee_status(String fee_status) {
		this.fee_status = fee_status;
	}
	/**
	 * @return
	 * @uml.property  name="session"
	 */
	public String getSession() {
		return session;
	}
	/**
	 * @param session
	 * @uml.property  name="session"
	 */
	public void setSession(String session) {
		this.session = session;
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
	
}

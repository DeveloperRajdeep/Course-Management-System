package com.ezen.cms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="seat_details")
public class SeatDetails {
	
	/**
	 * @uml.property  name="seat_id"
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int seat_id;
	/**
	 * @uml.property  name="degree_id"
	 */
	private int degree_id;
	/**
	 * @uml.property  name="course_id"
	 */
	private int course_id;
	/**
	 * @uml.property  name="branch_id"
	 */
	private int branch_id;
	/**
	 * @uml.property  name="category_id"
	 */
	private int category_id;
	/**
	 * @uml.property  name="session_s"
	 */
	private String session_s;
	/**
	 * @uml.property  name="total_seats"
	 */
	private int total_seats;
	/**
	 * @uml.property  name="seats_alloted"
	 */
	private int seats_alloted;
	/**
	 * @uml.property  name="quota"
	 */
	private String quota;
	/**
	 * @uml.property  name="status"
	 */
	private String status;
	/**
	 * @uml.property  name="date_time"
	 */
	private String date_time;
	/**
	 * @return
	 * @uml.property  name="seat_id"
	 */
	public int getSeat_id() {
		return seat_id;
	}
	/**
	 * @param seat_id
	 * @uml.property  name="seat_id"
	 */
	public void setSeat_id(int seat_id) {
		this.seat_id = seat_id;
	}
	/**
	 * @return
	 * @uml.property  name="degree_id"
	 */
	public int getDegree_id() {
		return degree_id;
	}
	/**
	 * @param degree_id
	 * @uml.property  name="degree_id"
	 */
	public void setDegree_id(int degree_id) {
		this.degree_id = degree_id;
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
	 * @uml.property  name="branch_id"
	 */
	public int getBranch_id() {
		return branch_id;
	}
	/**
	 * @param branch_id
	 * @uml.property  name="branch_id"
	 */
	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}
	/**
	 * @return
	 * @uml.property  name="category_id"
	 */
	public int getCategory_id() {
		return category_id;
	}
	/**
	 * @param category_id
	 * @uml.property  name="category_id"
	 */
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	
	/**
	 * @return
	 * @uml.property  name="session_s"
	 */
	public String getSession_s() {
		return session_s;
	}
	/**
	 * @param session_s
	 * @uml.property  name="session_s"
	 */
	public void setSession_s(String session_s) {
		this.session_s = session_s;
	}
	/**
	 * @return
	 * @uml.property  name="total_seats"
	 */
	public int getTotal_seats() {
		return total_seats;
	}
	/**
	 * @param total_seats
	 * @uml.property  name="total_seats"
	 */
	public void setTotal_seats(int total_seats) {
		this.total_seats = total_seats;
	}
	/**
	 * @return
	 * @uml.property  name="seats_alloted"
	 */
	public int getSeats_alloted() {
		return seats_alloted;
	}
	/**
	 * @param seats_alloted
	 * @uml.property  name="seats_alloted"
	 */
	public void setSeats_alloted(int seats_alloted) {
		this.seats_alloted = seats_alloted;
	}
	/**
	 * @return
	 * @uml.property  name="quota"
	 */
	public String getQuota() {
		return quota;
	}
	/**
	 * @param quota
	 * @uml.property  name="quota"
	 */
	public void setQuota(String quota) {
		this.quota = quota;
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
	
	
	
	}

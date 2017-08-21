package com.ezen.cms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="branch_master")
public class BranchMaster {

	/**
	 * @uml.property  name="branch_id"
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int branch_id;
	/**
	 * @uml.property  name="degree_id"
	 */
	private int degree_id;
	/**
	 * @uml.property  name="course_id"
	 */
	private int course_id;
	/**
	 * @uml.property  name="branch_name"
	 */
	private String branch_name;
	/**
	 * @uml.property  name="branch_code"
	 */
	private String branch_code;
	/**
	 * @uml.property  name="branch_status"
	 */
	private String branch_status;
	/**
	 * @uml.property  name="date_time"
	 */
	private String date_time;
	
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
	 * @uml.property  name="branch_name"
	 */
	public String getBranch_name() {
		return branch_name;
	}
	/**
	 * @param branch_name
	 * @uml.property  name="branch_name"
	 */
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	/**
	 * @return
	 * @uml.property  name="branch_code"
	 */
	public String getBranch_code() {
		return branch_code;
	}
	/**
	 * @param branch_code
	 * @uml.property  name="branch_code"
	 */
	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}
	/**
	 * @return
	 * @uml.property  name="branch_status"
	 */
	public String getBranch_status() {
		return branch_status;
	}
	/**
	 * @param branch_status
	 * @uml.property  name="branch_status"
	 */
	public void setBranch_status(String branch_status) {
		this.branch_status = branch_status;
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

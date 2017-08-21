package com.ezen.cms.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="course_master")
public class CourseMaster {
	/**
	 * @uml.property  name="course_id"
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int course_id;
	/**
	 * @uml.property  name="course_name"
	 */
	private String course_name;
	/**
	 * @uml.property  name="course_code"
	 */
	@Column(name="course_code")
	private String course_code;
	/**
	 * @uml.property  name="course_status"
	 */
	@Column(name="course_status")
	private String course_status;
	/**
	 * @uml.property  name="date_time"
	 */
	@Column(name="date_time")
	private String date_time;
	
	/**
	 * @uml.property  name="degree_id"
	 */
	private int degree_id;
	
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
	 * @uml.property  name="course_name"
	 */
	public String getCourse_name() {
		return course_name;
	}
	/**
	 * @param course_name
	 * @uml.property  name="course_name"
	 */
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	/**
	 * @return
	 * @uml.property  name="course_code"
	 */
	public String getCourse_code() {
		return course_code;
	}
	/**
	 * @param course_code
	 * @uml.property  name="course_code"
	 */
	public void setCourse_code(String course_code) {
		this.course_code = course_code;
	}
	/**
	 * @return
	 * @uml.property  name="course_status"
	 */
	public String getCourse_status() {
		return course_status;
	}
	/**
	 * @param course_status
	 * @uml.property  name="course_status"
	 */
	public void setCourse_status(String course_status) {
		this.course_status = course_status;
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
	
	}

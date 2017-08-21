package com.ezen.cms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cut_off_percentage")
public class CutOffPercentage {

	/**
	 * @uml.property  name="cut_off_id"
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cut_off_id;
	/**
	 * @uml.property  name="course_id"
	 */
	private int course_id;
	/**
	 * @uml.property  name="category_id"
	 */
	private int category_id;
	/**
	 * @uml.property  name="marks"
	 */
	private int marks;
	/**
	 * @uml.property  name="session"
	 */
	private String session;
	/**
	 * @uml.property  name="status"
	 */
	private String status;
	/**
	 * @uml.property  name="created_by"
	 */
	private String created_by;
	/**
	 * @uml.property  name="date_time"
	 */
	private String date_time;
	
	/**
	 * @return
	 * @uml.property  name="cut_off_id"
	 */
	public int getCut_off_id() {
		return cut_off_id;
	}
	/**
	 * @param cut_off_id
	 * @uml.property  name="cut_off_id"
	 */
	public void setCut_off_id(int cut_off_id) {
		this.cut_off_id = cut_off_id;
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
	 * @uml.property  name="marks"
	 */
	public int getMarks() {
		return marks;
	}
	/**
	 * @param marks
	 * @uml.property  name="marks"
	 */
	public void setMarks(int marks) {
		this.marks = marks;
	}
	/**
	 * @return
	 * @uml.property  name="created_by"
	 */
	public String getCreated_by() {
		return created_by;
	}
	/**
	 * @param created_by
	 * @uml.property  name="created_by"
	 */
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	
	
}

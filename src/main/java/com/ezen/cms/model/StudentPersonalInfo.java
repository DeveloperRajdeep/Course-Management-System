package com.ezen.cms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="student_personal_info")
public class StudentPersonalInfo {
	
	/**
	 * @uml.property  name="student1_id"
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int student1_id;
	/**
	 * @uml.property  name="student_id"
	 */
	private int student_id;
	/**
	 * @uml.property  name="student_fname"
	 */
	private String student_fname;
	/**
	 * @uml.property  name="student_mname"
	 */
	private String student_mname;
	/**
	 * @uml.property  name="student_lname"
	 */
	private String student_lname;
	//@Temporal(TemporalType.DATE)
	/**
	 * @uml.property  name="dob"
	 */
	private Date dob;
	/**
	 * @uml.property  name="email_id"
	 */
	private String email_id;
	/**
	 * @uml.property  name="mobile_number"
	 */
	private String mobile_number;
	/**
	 * @uml.property  name="gender"
	 */
	private String gender;
	/**
	 * @uml.property  name="religion"
	 */
	private String religion;
	/**
	 * @uml.property  name="caste"
	 */
	private String caste;
	/**
	 * @uml.property  name="nationality"
	 */
	private String nationality;
	/**
	 * @uml.property  name="blood_group"
	 */
	private String blood_group;
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
	 * @uml.property  name="student1_id"
	 */
	public int getStudent1_id() {
		return student1_id;
	}
	/**
	 * @param student1_id
	 * @uml.property  name="student1_id"
	 */
	public void setStudent1_id(int student1_id) {
		this.student1_id = student1_id;
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
	 * @uml.property  name="student_fname"
	 */
	public String getStudent_fname() {
		return student_fname;
	}
	/**
	 * @param student_fname
	 * @uml.property  name="student_fname"
	 */
	public void setStudent_fname(String student_fname) {
		this.student_fname = student_fname;
	}
	/**
	 * @return
	 * @uml.property  name="student_mname"
	 */
	public String getStudent_mname() {
		return student_mname;
	}
	/**
	 * @param student_mname
	 * @uml.property  name="student_mname"
	 */
	public void setStudent_mname(String student_mname) {
		this.student_mname = student_mname;
	}
	/**
	 * @return
	 * @uml.property  name="student_lname"
	 */
	public String getStudent_lname() {
		return student_lname;
	}
	/**
	 * @param student_lname
	 * @uml.property  name="student_lname"
	 */
	public void setStudent_lname(String student_lname) {
		this.student_lname = student_lname;
	}
	/**
	 * @return
	 * @uml.property  name="dob"
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @param dob
	 * @uml.property  name="dob"
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	/**
	 * @return
	 * @uml.property  name="email_id"
	 */
	public String getEmail_id() {
		return email_id;
	}
	/**
	 * @param email_id
	 * @uml.property  name="email_id"
	 */
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	/**
	 * @return
	 * @uml.property  name="mobile_number"
	 */
	public String getMobile_number() {
		return mobile_number;
	}
	/**
	 * @param mobile_number
	 * @uml.property  name="mobile_number"
	 */
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	/**
	 * @return
	 * @uml.property  name="gender"
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender
	 * @uml.property  name="gender"
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return
	 * @uml.property  name="religion"
	 */
	public String getReligion() {
		return religion;
	}
	/**
	 * @param religion
	 * @uml.property  name="religion"
	 */
	public void setReligion(String religion) {
		this.religion = religion;
	}
	/**
	 * @return
	 * @uml.property  name="caste"
	 */
	public String getCaste() {
		return caste;
	}
	/**
	 * @param caste
	 * @uml.property  name="caste"
	 */
	public void setCaste(String caste) {
		this.caste = caste;
	}
	/**
	 * @return
	 * @uml.property  name="nationality"
	 */
	public String getNationality() {
		return nationality;
	}
	/**
	 * @param nationality
	 * @uml.property  name="nationality"
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	/**
	 * @return
	 * @uml.property  name="blood_group"
	 */
	public String getBlood_group() {
		return blood_group;
	}
	/**
	 * @param blood_group
	 * @uml.property  name="blood_group"
	 */
	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
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

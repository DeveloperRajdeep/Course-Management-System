package com.ezen.cms.model;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_registration")
public class StudentRegistration {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int student_id;
	private String s_first_name;
	private String s_middle_name;
	private String s_last_name;
	private int degree_id;
	private int course_id;
	private String contact_number;
	private String email_id;
	private String password;
	private String status;
	private String date_time;
	private String enrollment_id;
	private int payment_status;
	private String role;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getS_first_name() {
		return s_first_name;
	}
	public void setS_first_name(String s_first_name) {
		this.s_first_name = s_first_name;
	}
	public String getS_middle_name() {
		return s_middle_name;
	}
	public void setS_middle_name(String s_middle_name) {
		this.s_middle_name = s_middle_name;
	}
	public String getS_last_name() {
		return s_last_name;
	}
	public void setS_last_name(String s_last_name) {
		this.s_last_name = s_last_name;
	}
	public int getDegree_id() {
		return degree_id;
	}
	public void setDegree_id(int degree_id) {
		this.degree_id = degree_id;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getContact_number() {
		return contact_number;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDate_time() {
		return date_time;
	}
	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}
	public String getEnrollment_id() {
		return enrollment_id;
	}
	public void setEnrollment_id(String enrollment_id) {
		this.enrollment_id = enrollment_id;
	}
	public int getPayment_status() {
		return payment_status;
	}
	public void setPayment_status(int payment_status) {
		this.payment_status = payment_status;
	}
	
}

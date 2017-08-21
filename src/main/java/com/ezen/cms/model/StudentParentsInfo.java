package com.ezen.cms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_parents_info")
public class StudentParentsInfo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int student2_id;
	private int student_id;
	private String father_fname;
	private String father_mname;
	private String father_lname;
	private String father_email;
	private String father_contact_no;
	private String mother_fname;
	private String mother_mname;
	private String mother_lname;
	private String mother_email;
	private String mother_contact_no;
	private String status;
	private String date_time;
	public int getStudent2_id() {
		return student2_id;
	}
	public void setStudent2_id(int student2_id) {
		this.student2_id = student2_id;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getFather_fname() {
		return father_fname;
	}
	public void setFather_fname(String father_fname) {
		this.father_fname = father_fname;
	}
	public String getFather_mname() {
		return father_mname;
	}
	public void setFather_mname(String father_mname) {
		this.father_mname = father_mname;
	}
	public String getFather_lname() {
		return father_lname;
	}
	public void setFather_lname(String father_lname) {
		this.father_lname = father_lname;
	}
	public String getFather_email() {
		return father_email;
	}
	public void setFather_email(String father_email) {
		this.father_email = father_email;
	}
	public String getFather_contact_no() {
		return father_contact_no;
	}
	public void setFather_contact_no(String father_contact_no) {
		this.father_contact_no = father_contact_no;
	}
	public String getMother_fname() {
		return mother_fname;
	}
	public void setMother_fname(String mother_fname) {
		this.mother_fname = mother_fname;
	}
	public String getMother_mname() {
		return mother_mname;
	}
	public void setMother_mname(String mother_mname) {
		this.mother_mname = mother_mname;
	}
	public String getMother_lname() {
		return mother_lname;
	}
	public void setMother_lname(String mother_lname) {
		this.mother_lname = mother_lname;
	}
	public String getMother_email() {
		return mother_email;
	}
	public void setMother_email(String mother_email) {
		this.mother_email = mother_email;
	}
	public String getMother_contact_no() {
		return mother_contact_no;
	}
	public void setMother_contact_no(String mother_contact_no) {
		this.mother_contact_no = mother_contact_no;
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
	
	
}

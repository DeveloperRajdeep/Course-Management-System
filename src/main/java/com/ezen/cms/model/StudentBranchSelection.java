package com.ezen.cms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_branch_selection")
public class StudentBranchSelection {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int student8_id;
	private int student_id;
	private int branch_id;
	private String status;
	private String date_time;
	private String priority;
	
	public int getStudent8_id() {
		return student8_id;
	}
	public void setStudent8_id(int student8_id) {
		this.student8_id = student8_id;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	
	public int getBranch_id() {
		return branch_id;
	}
	
	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
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
	
	public String getPriority() {
		return priority;
	}
	
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
}

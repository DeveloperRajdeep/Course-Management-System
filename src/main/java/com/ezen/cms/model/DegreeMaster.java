package com.ezen.cms.model;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="degree_master")
public class DegreeMaster {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int degree_id;
	private String degree_name;
	private String degree_code;
	private String degree_status;
	private String date_time;
	public String getDegree_name() {
		return degree_name;
	}
	public void setDegree_name(String degree_name) {
		this.degree_name = degree_name;
	}
	public String getDegree_code() {
		return degree_code;
	}
	public void setDegree_code(String degree_code) {
		this.degree_code = degree_code;
	}
	public String getDegree_status() {
		return degree_status;
	}
	public void setDegree_status(String degree_status) {
		this.degree_status = degree_status;
	}
	public int getDegree_id() {
		return degree_id;
	}
	public void setDegree_id(int degree_id) {
		this.degree_id = degree_id;
	}
	public String getDate_time() {
		return date_time;
	}
	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}
}
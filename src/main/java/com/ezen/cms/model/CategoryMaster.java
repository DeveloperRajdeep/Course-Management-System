package com.ezen.cms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category_master")
public class CategoryMaster {

	/**
	 * @uml.property  name="category_id"
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int category_id;
	/**
	 * @uml.property  name="category_name"
	 */
	private String category_name;
	/**
	 * @uml.property  name="category_abbr"
	 */
	private String category_abbr;
	/**
	 * @uml.property  name="category_status"
	 */
	private String category_status;
	/**
	 * @uml.property  name="management_quota"
	 */
	private String management_quota;
	/**
	 * @uml.property  name="date_time"
	 */
	private String date_time;
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
	 * @uml.property  name="category_name"
	 */
	public String getCategory_name() {
		return category_name;
	}
	/**
	 * @param category_name
	 * @uml.property  name="category_name"
	 */
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	/**
	 * @return
	 * @uml.property  name="category_abbr"
	 */
	public String getCategory_abbr() {
		return category_abbr;
	}
	/**
	 * @param category_abbr
	 * @uml.property  name="category_abbr"
	 */
	public void setCategory_abbr(String category_abbr) {
		this.category_abbr = category_abbr;
	}
	/**
	 * @return
	 * @uml.property  name="category_status"
	 */
	public String getCategory_status() {
		return category_status;
	}
	/**
	 * @param category_status
	 * @uml.property  name="category_status"
	 */
	public void setCategory_status(String category_status) {
		this.category_status = category_status;
	}
	/**
	 * @return
	 * @uml.property  name="management_quota"
	 */
	public String getManagement_quota() {
		return management_quota;
	}
	/**
	 * @param management_quota
	 * @uml.property  name="management_quota"
	 */
	public void setManagement_quota(String management_quota) {
		this.management_quota = management_quota;
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

package com.ezen.cms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_address_information")
public class StudentAddressInfo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int student3_id;
	public int student_id;
	public String permanent_address;
	public String state;
	public String district;
	public String town_or_city;
	public String street_byelane;
	public String police_station;
	public String post_office;
	public String pincode;
	public String communication_address;
	public String ca_state;
	public String ca_district;
	public String ca_town_city;
	public String ca_street_byelane;
	public String ca_police_station;
	public String ca_post_office;
	public String ca_pincode;
	public String status;
	public String date_time;
	public int getStudent3_id() {
		return student3_id;
	}
	public void setStudent3_id(int student3_id) {
		this.student3_id = student3_id;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getPermanent_address() {
		return permanent_address;
	}
	public void setPermanent_address(String permanent_address) {
		this.permanent_address = permanent_address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getTown_or_city() {
		return town_or_city;
	}
	public void setTown_or_city(String town_or_city) {
		this.town_or_city = town_or_city;
	}
	public String getStreet_byelane() {
		return street_byelane;
	}
	public void setStreet_byelane(String street_byelane) {
		this.street_byelane = street_byelane;
	}
	public String getPolice_station() {
		return police_station;
	}
	public void setPolice_station(String police_station) {
		this.police_station = police_station;
	}
	public String getPost_office() {
		return post_office;
	}
	public void setPost_office(String post_office) {
		this.post_office = post_office;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCommunication_address() {
		return communication_address;
	}
	public void setCommunication_address(String communication_address) {
		this.communication_address = communication_address;
	}
	public String getCa_state() {
		return ca_state;
	}
	public void setCa_state(String ca_state) {
		this.ca_state = ca_state;
	}
	public String getCa_district() {
		return ca_district;
	}
	public void setCa_district(String ca_district) {
		this.ca_district = ca_district;
	}
	public String getCa_town_city() {
		return ca_town_city;
	}
	public void setCa_town_city(String ca_town_city) {
		this.ca_town_city = ca_town_city;
	}
	public String getCa_street_byelane() {
		return ca_street_byelane;
	}
	public void setCa_street_byelane(String ca_street_byelane) {
		this.ca_street_byelane = ca_street_byelane;
	}
	public String getCa_police_station() {
		return ca_police_station;
	}
	public void setCa_police_station(String ca_police_station) {
		this.ca_police_station = ca_police_station;
	}
	public String getCa_post_office() {
		return ca_post_office;
	}
	public void setCa_post_office(String ca_post_office) {
		this.ca_post_office = ca_post_office;
	}
	public String getCa_pincode() {
		return ca_pincode;
	}
	public void setCa_pincode(String ca_pincode) {
		this.ca_pincode = ca_pincode;
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

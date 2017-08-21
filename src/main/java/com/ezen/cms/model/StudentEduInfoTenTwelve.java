package com.ezen.cms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_educational_info_class10_12")
public class StudentEduInfoTenTwelve {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int student4_id;
	public int student_id;
	public String schoolname_location;
	public String school_board;
	public int school_passing_year;
	public String school_percentage_or_cgpa;
	public String collegename_location;
	public String college_board;
	public int college_passing_year;
	public String college_percentage_or_cgpa;
	public String status;
	public String date_time;
	public int getStudent4_id() {
		return student4_id;
	}
	public void setStudent4_id(int student4_id) {
		this.student4_id = student4_id;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getSchoolname_location() {
		return schoolname_location;
	}
	public void setSchoolname_location(String schoolname_location) {
		this.schoolname_location = schoolname_location;
	}
	public String getSchool_board() {
		return school_board;
	}
	public void setSchool_board(String school_board) {
		this.school_board = school_board;
	}
	public int getSchool_passing_year() {
		return school_passing_year;
	}
	public void setSchool_passing_year(int school_passing_year) {
		this.school_passing_year = school_passing_year;
	}
	public String getSchool_percentage_or_cgpa() {
		return school_percentage_or_cgpa;
	}
	public void setSchool_percentage_or_cgpa(String school_percentage_or_cgpa) {
		this.school_percentage_or_cgpa = school_percentage_or_cgpa;
	}
	public String getCollegename_location() {
		return collegename_location;
	}
	public void setCollegename_location(String collegename_location) {
		this.collegename_location = collegename_location;
	}
	public String getCollege_board() {
		return college_board;
	}
	public void setCollege_board(String college_board) {
		this.college_board = college_board;
	}
	public int getCollege_passing_year() {
		return college_passing_year;
	}
	public void setCollege_passing_year(int college_passing_year) {
		this.college_passing_year = college_passing_year;
	}
	public String getCollege_percentage_or_cgpa() {
		return college_percentage_or_cgpa;
	}
	public void setCollege_percentage_or_cgpa(String college_percentage_or_cgpa) {
		this.college_percentage_or_cgpa = college_percentage_or_cgpa;
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

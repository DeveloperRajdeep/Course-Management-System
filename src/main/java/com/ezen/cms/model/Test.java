package com.ezen.cms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="test")
public class Test {
	/**
	 * @uml.property  name="id"
	 */
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	/**
	 * @uml.property  name="message"
	 */
	private String message;
	/**
	 * @return
	 * @uml.property  name="id"
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id
	 * @uml.property  name="id"
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return
	 * @uml.property  name="message"
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message
	 * @uml.property  name="message"
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}

package com.sachin.messanger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	private long id;
	private String message;
	private Date created;
	private String auhor;
	
	public Message() {
		
	}

	public Message(long id, String message, String auhor) {
		this.id = id;
		this.message = message;
		this.created = new Date();
		this.auhor = auhor;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getAuhor() {
		return auhor;
	}

	public void setAuhor(String auhor) {
		this.auhor = auhor;
	}
	
	
}

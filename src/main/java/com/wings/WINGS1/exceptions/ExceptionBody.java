package com.wings.WINGS1.exceptions;

import java.util.Date;

public class ExceptionBody {

	private Date date;
	private String message;
	private String Description;

	public ExceptionBody(Date date, String message, String description) {
		super();
		this.date = date;
		this.message = message;
		Description = description;
	}

	public ExceptionBody() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

}

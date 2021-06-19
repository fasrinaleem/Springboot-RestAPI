package com.springboot.app.exception_handler;

import java.util.Date;

public class EmployeeExceptionsResponse {

	private String errorMessage, description;
	private Date dateAndTime;
	public EmployeeExceptionsResponse(String errorMessage, String description, Date dateAndTime) {
		super();
		this.errorMessage = errorMessage;
		this.description = description;
		this.dateAndTime = dateAndTime;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateAndTime() {
		return dateAndTime;
	}
	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	
	
}

package com.comelec.contents;

import java.util.Date;

public class Order {
/* cette classe reppresente la  commande */
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStatus() {
		return Status;
	}
	
	public void setStatus(String status) {
		Status = status;
	}

	public Date getDateCreate() {
		return DateCreate;
	}
	public void setDateCreate(Date dateCreate) {
		DateCreate = dateCreate;
	}
	private long id ;
	private String Status;
	private Date DateCreate ;
}

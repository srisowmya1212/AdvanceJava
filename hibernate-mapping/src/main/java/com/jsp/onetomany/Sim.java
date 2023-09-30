package com.jsp.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sim {
	@Id
	private int id;
	private  String serviceProviderName;
	private int type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getServiceProviderName() {
		return serviceProviderName;
	}
	public void setServiceProviderName(String serviceProviderName) {
		this.serviceProviderName = serviceProviderName;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	

}

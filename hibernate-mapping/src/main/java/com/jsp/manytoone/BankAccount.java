package com.jsp.manytoone;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class BankAccount {
	@Id
	private int id;
	private String bName;
	private long accnum;
	@ManyToOne
	private Person1 person1;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public long getAccnum() {
		return accnum;
	}
	public void setAccnum(long accnum) {
		this.accnum = accnum;
	}
	public Person1 getPerson1() {
		return person1;
	}
	public void setPerson1(Person1 person1) {
		this.person1 = person1;
	}
	
	

}

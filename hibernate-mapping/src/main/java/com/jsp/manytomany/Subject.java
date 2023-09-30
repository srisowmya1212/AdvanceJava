package com.jsp.manytomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Subject {
	@Id
	private int id;
	private String subname1;
	private String subname2;
	@ManyToMany
	@JoinTable
	private Student student;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubname1() {
		return subname1;
	}
	public void setSubname1(String subname1) {
		this.subname1 = subname1;
	}
	public String getSubname2() {
		return subname2;
	}
	public void setSubname2(String subname2) {
		this.subname2 = subname2;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}

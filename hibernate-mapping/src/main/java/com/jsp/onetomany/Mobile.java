package com.jsp.onetomany;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity

public class Mobile {
	@Id
	private int id;
	private String name;
	private int ram;
	
	@OneToMany
	private List<Sim> list;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public List<Sim> getList() {
		return list;
	}
	public void setList(List<Sim> list) {
		this.list = list;
	}
	
	

}

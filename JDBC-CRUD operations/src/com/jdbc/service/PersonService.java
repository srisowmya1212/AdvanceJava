package com.jdbc.service;

import java.util.List;

import com.jdbc.dao.PersonDao;
import com.jdbc.dto.PersonDto;

public class PersonService {
	PersonDao dao=new PersonDao();
	public int createTableService() {
		return dao.createTable();// as create table return type is int
		
	}
	public int insertService(int id,String name,int age,String email,String password){
		return  dao.insertValues(id,name,age,email,password);
		
	}
	public List<PersonDto> getAllService(){
		return dao.getAll();
	}
	public PersonDto getByIdService(int id) {
		return dao.getById(id);
	}
	public void updateService() {
		dao.Update();
	}
	public void deleteService(int id) {
		dao.deleteById(id);
	}

}

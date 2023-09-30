package com.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.HospitalDao;
import com.jsp.dto.Hospital;

@Component
public class HospitalService {
	@Autowired
	HospitalDao dao;
	
	public Hospital saveService(Hospital hospital) {
		return dao.save(hospital);
		
	}
	public Hospital deleteService(int id) {
		return dao.delete(id);
	}
	public Hospital updateService(Hospital hospital) {
		return dao.update(hospital);
	}
	public List<Hospital> getAllService(){
		return dao.getAll();
	}
	public Hospital getByIdService(int id) {
		return dao.getById(id);
	}

}

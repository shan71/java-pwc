package com.demo.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo.spring.dao.EmpDao;

//@Component
@Service
public class EmpService {

	
	private EmpDao dao;
	
	@Autowired
	public EmpService(EmpDao dao) {
		this.dao = dao;
	}

	/*
	 * public void setDao(EmpDao dao) { this.dao = dao; }
	 */
	

	public String registerEmp(String name) {
		String response = dao.save(name);
		return response;
	}

	
}

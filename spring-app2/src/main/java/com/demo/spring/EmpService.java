package com.demo.spring;

import com.demo.spring.dao.EmpDao;

public class EmpService {

	private EmpDao dao;
	
	public String registerEmp(String name) {
		String response=dao.save(name);
		return response;
	}
}

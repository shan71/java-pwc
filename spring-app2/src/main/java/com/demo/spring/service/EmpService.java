package com.demo.spring.service;

import com.demo.spring.dao.EmpDao;

public class EmpService {

	private EmpDao dao;
	
	  public void setDao(EmpDao dao) { this.dao = dao; }
	 


	public String registerEmp(String name) {
		String response=dao.save(name);
		return response;
	}
}

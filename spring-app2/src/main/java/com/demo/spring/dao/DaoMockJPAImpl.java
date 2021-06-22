package com.demo.spring.dao;

public class DaoMockJPAImpl implements EmpDao {

	@Override
	public String save(String empName) {
		
		return "JPA: Emp saved with name "+empName;
	}

}

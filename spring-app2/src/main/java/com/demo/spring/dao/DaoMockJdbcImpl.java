package com.demo.spring.dao;

public class DaoMockJdbcImpl implements EmpDao {

	@Override
	public String save(String empName) {
		
		return "JDBC: Emp saved with name "+empName;
	}

}

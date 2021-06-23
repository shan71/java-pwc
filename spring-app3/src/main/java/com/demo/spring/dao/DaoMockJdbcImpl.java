package com.demo.spring.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class DaoMockJdbcImpl implements EmpDao {

	@Override
	public String save(String empName) {
		
		return "JDBC: Emp saved with name "+empName;
	}

}

package com.demo.rest;

import java.util.List;

import com.demo.rest.entity.Emp;

public interface EmpDao {
	public Emp findById(int id) throws EmpNotFoundException;;

	public List<Emp> listAll();

	public String save(Emp e);

	public String delete(int id);

	public String update(Emp e);
}

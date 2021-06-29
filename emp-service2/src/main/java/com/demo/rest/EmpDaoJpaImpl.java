package com.demo.rest;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.demo.rest.entity.Emp;

public class EmpDaoJpaImpl implements EmpDao {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ex1");;

	public EmpDaoJpaImpl() {

	}

	@Override
	public Emp findById(int id) throws EmpNotFoundException {
		EntityManager em = emf.createEntityManager();
		Emp emp = em.find(Emp.class, id);
		if (emp != null) {
			return emp;
		} else {
			throw new EmpNotFoundException("Emp not found..");
		}

	}

	@Override
	public List<Emp> listAll() {
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("select e from Emp e");
		return query.getResultList();
	}

	@Override
	public String save(Emp e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(Emp e) {
		// TODO Auto-generated method stub
		return null;
	}

}

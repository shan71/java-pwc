package com.demo.rest;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.ws.rs.WebApplicationException;

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
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		String message = "";
		try {
			Emp emp = em.find(Emp.class, e.getEmpId());
			if (emp == null) {
				tx.begin();
				em.persist(e);
				tx.commit();
				message = "emp saved";
			} else {
				message = "Emp already exists";
			}
		} catch (Exception ex) {
			tx.rollback();
			ex.printStackTrace();
		}
		return message;
	}

	@Override
	public String delete(int id) throws EmpNotFoundException {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		String message = "";
		try {
			Emp emp = em.find(Emp.class, id);
			if (emp != null) {
				try {
					tx.begin();
					em.remove(emp);
					tx.commit();
					message = "emp deleted";
					return message;
				} catch (Exception e) {
					tx.rollback();
					e.printStackTrace();
				}
				return message;
			} else {
				throw new EmpNotFoundException("Emp Does not");
			}
		} catch (EmpNotFoundException ex) {
			throw ex;
		}

	}

	@Override
	public String update(Emp e) throws EmpNotFoundException {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		String message = "";
		try {
			Emp emp = em.find(Emp.class, e.getEmpId());
			if (emp!= null) {
				tx.begin();
				em.merge(e);
				tx.commit();
				message = "emp updated";
			} else {
				message = "Emp Not found to be updated";
			}
		} catch (Exception ex) {
			tx.rollback();
			ex.printStackTrace();
		}
		return message;
	}

}

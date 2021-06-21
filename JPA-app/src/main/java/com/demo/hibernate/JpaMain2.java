package com.demo.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain2 {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ex1");

		EntityManager em=emf.createEntityManager();
		System.out.println(em.getClass().getName());
		
		EntityTransaction tx= em.getTransaction();
		
		try {
			tx.begin();
			Employee emp1= em.find(Employee.class, 201);
			System.out.println(emp1.getEmpId()+" "+emp1.getName());
			
			emp1.setSalary(80000);
			em.persist(emp1);
			
			em.remove(emp1);
			
			tx.commit();
			
		}catch(Exception ex) {
			tx.rollback();
			ex.printStackTrace();
			
		}finally {
			em.close();
			emf.close();
		}
	}

}

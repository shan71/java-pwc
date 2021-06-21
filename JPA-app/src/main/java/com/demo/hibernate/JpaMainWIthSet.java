package com.demo.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMainWIthSet {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ex1");

		EntityManager em=emf.createEntityManager();
		EntityTransaction tx= em.getTransaction();
		
		try {
			tx.begin();
			
			Employee e= new Employee(203, "John", "Bangalore", 98000);
			em.persist(e);
			
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

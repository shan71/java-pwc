package com.demo.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMainInsert {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ex1");

		EntityManager em=emf.createEntityManager();
		EntityTransaction tx= em.getTransaction();
		
		try {
			tx.begin();
			
			Employee e= new Employee(123, "Kiran", "Bangalore", 90000);
			
			Address address=new Address("112",890001);
			e.setAddress(address);
			
			e.getChildren().add("Mary");
			e.getChildren().add("Terry");
			e.getChildren().add("Luke");
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

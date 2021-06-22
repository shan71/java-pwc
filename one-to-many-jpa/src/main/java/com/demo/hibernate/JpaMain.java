package com.demo.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ex1");

		EntityManager em=emf.createEntityManager();
		EntityTransaction tx= em.getTransaction();
		
		try {
			tx.begin();
			Dept dept=em.find(Dept.class,10 );
			
			Emp emp1= new Emp(301,"Ananth","London",56000);
			Emp emp2= new Emp(302,"Kiran","London",56000);
			Emp emp3= new Emp(303,"Juni","London",56000);
			
			emp1.setDept(dept);
			emp2.setDept(dept);
			emp3.setDept(dept);
			
			em.persist(emp1);
			em.persist(emp2);
			em.persist(emp3);
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

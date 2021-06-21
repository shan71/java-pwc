package com.demo.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HIbernateMain1 {

	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure(); // this method reads hibernate.cfg.xml from classpath
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();

		try {
			
			Employee e= new Employee(202, "Karan", "Bangalore", 58000);
			session.save(e);
			 //session.persist(e);
		
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
			sf.close();
		}

	}

}

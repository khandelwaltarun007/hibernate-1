/**
 * 
 */
package com.hibernate1;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;



/**
 * @author g002ax
 *
 */
public class Test {
	final static Logger logger = Logger.getLogger(Test.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Employee employee = new Employee();
		employee.setFirstName("Harsh");
		employee.setLastName("Khandelwal");
		
		session.persist(employee);
		tx.commit();
		session.close();
		logger.info("Saved Successfully.");

	}

}

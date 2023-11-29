package com.hexaware.casemapping;

import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;

	import com.hexaware.casemapping.entity.User;
	import com.hexaware.casemapping.entity.Invoice;

	/**
	 * Hello world!
	 *
	i
	 */
	public class OneToOne{
		

		public static void main(String[] args) {

			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

			Session session = sessionFactory.openSession();

			Transaction tx = session.beginTransaction();

			Invoice invoice = new Invoice(10, "Hema" , 20);

			  User user = new User(20,"Javeed",invoice);

			  session.persist(user);


			
			tx.commit();

		}
	
}



package com.hexaware.Mapping;


	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;

	import com.hexaware.Mapping.entity.Address;
	import com.hexaware.Mapping.entity.Student;

	/**
	 * Hello world!
	 *
	 */
	public class OneToOne{
		public static void main(String[] args) {

			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

			Session session = sessionFactory.openSession();

			Transaction tx = session.beginTransaction();


			  Address address = new Address(512,"Hyd","Telangana");

			  Student student = new Student(102,"Javeed",address);

			  session.persist(student);


			/*
			 * Student student = new Student(103, "Ashwin");
			 * 
			 * Address address = new Address(54, "Banglore", "KA", student);
			 * 
			 * session.persist(address);
			 */

			tx.commit();

		}
	
}

package com.hexaware.casemapping;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.casemapping.entity.Users;

import com.hexaware.casemapping.entity.Healthcare;

public class ManyToMany {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Healthcare healthcare1 = new Healthcare();
        healthcare1.setHealthcareId(101);
        healthcare1.setHealthcareName("Javeed");
        healthcare1.setAmount(1000);
        
        Healthcare healthcare2 = new Healthcare();
        healthcare2.setHealthcareId(102);
        healthcare2.setHealthcareName("Rajat");
        healthcare2.setAmount(1500);
        
        Healthcare healthcare3 = new Healthcare();
        healthcare3.setHealthcareId(105);
        healthcare3.setHealthcareName("Kasi");
        healthcare3.setAmount(2000);
        
        
        

			session.persist(user1);
			session.persist(user2);

			tx.commit();

			sessionFactory.close();


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

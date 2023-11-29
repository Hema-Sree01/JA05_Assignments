package com.hexaware.casemapping;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.casemapping.entity.InsuranceCompany;
import com.hexaware.casemapping.entity.Plans;

public class OneToMany{

		public static void main(String[] args) {

			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

			Session session = sessionFactory.openSession();

			Transaction tx = session.beginTransaction();
			
			
		Plans p1 = new Plans();
		p1.setPlan_id(101);
		p1.setPlan_name("IIC");
		p1.setAmount(10000);	
			
		Plans p2 = new Plans();
		p2.setPlan_id(105);
		p2.setPlan_name("INH");
		p2.setAmount(20000);
			
		Plans p3 = new Plans();	
		p3.setPlan_id(106);
		p3.setPlan_name("IBG");
		p3.setAmount(40000);
			
		Set<Plans> planSet = new HashSet<Plans>();
			
		planSet.add(p1);
		planSet.add(p2);
		planSet.add(p3);
		
		
		
		InsuranceCompany ins = new InsuranceCompany();
		ins.setCompanyId(10);
		ins.setCompanyname("LIC");
		ins.setPlans(planSet);
		session.save(ins);

		tx.commit();

		sessionFactory.close();
			
		}	
			
}
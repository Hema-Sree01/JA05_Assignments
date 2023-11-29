package com.hexaware.Mapping;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.Mapping.entity.Departmentt;
import com.hexaware.Mapping.entity.Employeee;

public class OneToMany_ManyToOne {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Employeee e1 = new Employeee();
		e1.setEid(101);
		e1.setEname("King");
		e1.setSalary(40000);

		Employeee e2 = new Employeee();
		e2.setEid(102);
		e2.setEname("Smith");
		e2.setSalary(60000);

		Employeee e3 = new Employeee();
		e3.setEid(103);
		e3.setEname("Ford");
		e3.setSalary(50000);

		Departmentt deptt = new Departmentt();

		deptt.setDepartmentId(20);
		deptt.setDepartmentNam("Testing");

		// add all employee to collection set , using addEmployee(employee)

		deptt.addEmployee(e1);
		deptt.addEmployee(e2);
		deptt.addEmployee(e3);

		session.persist(deptt);

		tx.commit();

	}

}
package com.hexaware.Mapping.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
	public class Employee {

		@Id
		private int eid;
		private String ename;
		private double salary;
		
		
		
		public Employee() {
			super();
		}



		public Employee(int eid, String ename, double salary) {
			super();
			this.eid = eid;
			this.ename = ename;
			this.salary = salary;
		}



		public int getEid() {
			return eid;
		}



		public void setEid(int eid) {
			this.eid = eid;
		}



		public String getEname() {
			return ename;
		}



		public void setEname(String ename) {
			this.ename = ename;
		}



		public double getSalary() {
			return salary;
		}



		public void setSalary(double salary) {
			this.salary = salary;
		}


		// setter,getter,construtors


	}


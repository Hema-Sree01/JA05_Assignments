package com.hexaware.Mapping.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
	public class Department {

		@Id
		private int departmentId;
		private String departmentNam;

		@OneToMany(cascade = CascadeType.ALL)
		@JoinColumn(name="dno")   // dno is FK in Employee child table
		private Set<Employee> employees = new HashSet<Employee>(); // always initialize collection type properties to avoid

		public Department() {
			super();
		}

		public Department(int departmentId, String departmentNam, Set<Employee> employees) {
			super();
			this.departmentId = departmentId;
			this.departmentNam = departmentNam;
			this.employees = employees;
		}

		public int getDepartmentId() {
			return departmentId;
		}

		public void setDepartmentId(int departmentId) {
			this.departmentId = departmentId;
		}

		public String getDepartmentNam() {
			return departmentNam;
		}

		public void setDepartmentNam(String departmentNam) {
			this.departmentNam = departmentNam;
		}

		public Set<Employee> getEmployees() {
			return employees;
		}

		public void setEmployees(Set<Employee> employees) {
			this.employees = employees;
		}

	// setter,getter,construtors
																// NullPointerExp


	}


package com.hexaware.Mapping.entity;




	import java.util.HashSet;
	import java.util.Set;

	import javax.persistence.CascadeType;
	import javax.persistence.Entity;
	import javax.persistence.Id;

	import javax.persistence.OneToMany;

	@Entity
	public class Departmentt {

		@Id
		private int departmentId;
		private String departmentNam;

		@OneToMany(cascade = CascadeType.ALL, mappedBy = "department")

		private Set<Employeee> employees = new HashSet<Employeee>(); // always initialize collection type properties to avoid
																	// NullPointerExp

		
	   								
	public Departmentt() {
		super();
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
	public Set<Employeee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employeee> employees) {
		this.employees = employees;
	}
	public Departmentt(int departmentId,
	String departmentNam,
   Set<Employeee> employees) {
		super();
this.departmentId = departmentId;
																		this.departmentNam = departmentNam;
																		this.employees = employees;
																	}
																	public void addEmployee(Employeee e1) {
																		// TODO Auto-generated method stub
																		
																	}
	}


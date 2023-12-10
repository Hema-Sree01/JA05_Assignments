package com.hexaware.casemapping.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class InsuranceCompany{

	@Id
	private int companyId;
	private String companyname;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="PlanId")  
	private Set<Plans> plans = new HashSet<Plans>();

	public InsuranceCompany() {
		super();
	}

	public InsuranceCompany(int companyId, String companyname, Set<Plans> plans) {
		super();
		this.companyId = companyId;
		this.companyname = companyname;
		this.plans = plans;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public Set<Plans> getPlans() {
		return plans;
	}

	public void setPlans(Set<Plans> plans) {
		this.plans = plans;
	}

// setter,getter,construtors
															// NullPointerExp


}

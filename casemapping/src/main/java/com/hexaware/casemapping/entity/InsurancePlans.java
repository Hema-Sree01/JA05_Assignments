package com.hexaware.casemapping.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;




	@Entity
	public class InsurancePlans {
		@Id
		private int PlanId;
		private String planname;

		@OneToMany(cascade = CascadeType.ALL)
		@JoinColumn(name="PlanId")  
		private Set<InsuranceCompany> insurancecompany= new HashSet<InsuranceCompany>();
        
		public InsurancePlans() {
			super();
		}

		public InsurancePlans(int planId, String planname, Set<InsuranceCompany> insurancecompany) {
			super();
			PlanId = planId;
			this.planname = planname;
			this.insurancecompany = insurancecompany;
		}

		public int getPlanId() {
			return PlanId;
		}

		public void setPlanId(int planId) {
			PlanId = planId;
		}

		public String getPlanname() {
			return planname;
		}

		public void setPlanname(String planname) {
			this.planname = planname;
		}

		public Set<InsuranceCompany> getInsurancecompany() {
			return insurancecompany;
		}

		public void setInsurancecompany(Set<InsuranceCompany> insurancecompany) {
			this.insurancecompany = insurancecompany;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

package com.hexaware.casemapping.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
	public class Plans {

		@Id
		private int plan_id;
		private String plan_name;
		private double amount;
		
		public Plans() {
			super();
		}
		public Plans(int plan_id, String plan_name, double amount) {
			super();
			this.plan_id = plan_id;
			this.plan_name = plan_name;
			this.amount = amount;
		}
		public int getPlan_id() {
			return plan_id;
		}
		public void setPlan_id(int plan_id) {
			this.plan_id = plan_id;
		}
		public String getPlan_name() {
			return plan_name;
		}
		public void setPlan_name(String plan_name) {
			this.plan_name = plan_name;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}


		// setter,getter,construtors


	}



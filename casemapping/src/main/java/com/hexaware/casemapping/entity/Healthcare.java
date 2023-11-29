package com.hexaware.casemapping.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Healthcare_Master")
public class Healthcare {


	@Id
	private  int healthcareId;
	private String healthcareName;
	private double amount;

	@ManyToMany(mappedBy = "healthcare", fetch = FetchType.LAZY)
	Set<Users>  users  = new  HashSet<Users>();
	

	public int getHealthcareId() {
		return healthcareId;
	}

	public void setHealthcareId(int healthcareId) {
		this.healthcareId = healthcareId;
	}

	public String getHealthcareName() {
		return healthcareName;
	}

	public void setHealthcareName(String healthcareName) {
		this.healthcareName = healthcareName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Set<Users> getUsers() {
		return users;
	}

	public void setUsers(Set<Users> users) {
		this.users = users;
	}





}

package com.hexaware.casemapping.entity;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import com.hexaware.casemapping.entity.Healthcare;

@Entity
@Table(name="Users_Master")
public class Users{


	@Id
	private int userId;

	@Temporal(TemporalType.DATE)
	private  Date  illDate;

	@ManyToMany(cascade = CascadeType.ALL)

	@JoinTable(name="healthcares_users", joinColumns = {@JoinColumn(name="user_id")} , inverseJoinColumns = {@JoinColumn(name="healthcare_id")})
	private  Set<Healthcare>  healthcare = new HashSet<Healthcare>();

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getDate() {
		return illDate;
	}

	public void setDate(Date date) {
		illDate = date;
	}

	
	public Set<Healthcare> getHealthcare() {
		return healthcare;
	}

	public void setHealthcare(Set<Healthcare> healthcare) {
		this.healthcare = healthcare;
	}
    public void addprovider(Healthcare healthcare) {
		
		this.getHealthcare().gethealthcare(healthcare);
		}

	Set<Healthcare> set =	getHealthcare();

	set.add(healthcares);
	
}

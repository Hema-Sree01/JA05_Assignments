package com.hexaware.casemapping.entity;


	import java.io.Serializable;

	import javax.persistence.CascadeType;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.OneToOne;

	@Entity
	public class User implements Serializable {

	 private static final long serialVersionUID = 1L;

		@Id
		private int userId;
		private String userName;

		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "invoiceId")  // FK
		private Invoice invoice;

		public User() {
			super();
		}

		public User(int userId, String userName, Invoice invoice) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.invoice = invoice;
		}

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Invoice getInvoice() {
			return invoice;
		}

		public void setInvoice(Invoice invoice) {
			this.invoice = invoice;
		}

		
		}
		
		
		

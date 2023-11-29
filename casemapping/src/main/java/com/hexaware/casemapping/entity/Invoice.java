package com.hexaware.casemapping.entity;


	import java.io.Serializable;

	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.OneToOne;

	@Entity
	public class Invoice implements Serializable{


		private static final long serialVersionUID = 1L;




		@Id
		private int invoiceId;
		private String name  ;
		private int amount;

		@OneToOne(mappedBy = "invoice")
		private User user;

		public Invoice(int i, String string, int k) {
			super();
		}

		public Invoice(int invoiceId, String name, int amount, User user) {
			super();
			this.invoiceId = invoiceId;
			this.name = name;
			this.amount = amount;
			this.user = user;
		}

		public int getInvoiceId() {
			return invoiceId;
		}

		public void setInvoiceId(int invoiceId) {
			this.invoiceId = invoiceId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAmount() {
			return amount;
		}

		public void setAmount(int amount) {
			this.amount = amount;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

}

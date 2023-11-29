package com.hdfc.service;

public interface ibank {
 
	public static final String IFSC = "HDFC123" ; //all variables are public static final
	
	public abstract void deposit();
	public abstract void withdraw(); //all methods are public abstract
}

package com.curd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcdemo {

	public static void main(String[] args) {


			try {
			Class.forName("com.mysql.cj.jdbc.Driver");

Connection conn =	
DriverManager.getConnection("jdbc:mysql://localhost:3306/db_student","root","Hema@1406");

			Statement stmt = conn.createStatement();

			String query = " insert into employee values(501,'Hema',50000) ";

				int count =	 stmt.executeUpdate(query);

			System.out.println(count +" No. of records affected");

					conn.close();

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	}

}
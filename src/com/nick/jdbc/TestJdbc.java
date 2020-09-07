package com.nick.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/hb-03-one-to-many?useSSL=false&serverTimezone=UTC";
		String user = "hbstudent";
		String password = "hbstudent";
		
		try {
			System.out.println("Connecting to DB: "+ url);
			Connection myCon = DriverManager.getConnection(url, user, password);
			System.out.println("Connection success!!");
			myCon.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

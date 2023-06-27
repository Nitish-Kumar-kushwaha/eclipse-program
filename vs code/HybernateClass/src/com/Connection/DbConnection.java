package com.Connection;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class DbConnection {
	
	public static Connection GetConnection() {
		Connection con = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ZaggleDb","root","Nitish@1813");
			
		}catch(Exception ex) {
			System.out.println(ex);
			
		}
		
		return con;
		
	}

}

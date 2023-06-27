package com.studentPack;

import java.sql.*;

public class DbConnection {
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ZaggleDb", "root",
                    "Nitish@1813");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("something happen to connection");
            e.printStackTrace();
        }
        return con;
        
    }
    
}

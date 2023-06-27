package com.studentPack;

import java.sql.*;

public class StudentOperations {

    Connection conObj = null;

    public StudentOperations() {
        conObj = DbConnection.getConnection();
    }

    public int AddStudents(String name, String cources, float fees) {

        int res = 0;
        try {
            PreparedStatement ps = conObj.prepareStatement("Insert into Student(stname, cources,fees) values(?,?,?)");
            ps.setString(1, name);
            ps.setString(2, cources);
            ps.setFloat(3, fees);

            res = ps.executeUpdate();

            // if (res >= 0) {
            // System.out.println("value is updated");
            // } else {
            // System.out.println("nothing is updated");
            // }
            return res;
        } catch (Exception e) {
            // TODO: handle exception
            res = 0;
            return res;
        }

    }

    public void searchViaRollNo(int rollno) {
        try {
            PreparedStatement ps = conObj.prepareStatement("Select * from Student where rollno =?");
            ps.setFloat(1, rollno);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}

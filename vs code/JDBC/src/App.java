import java.sql.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Student name : ");
        // String name = sc.next();
        // System.out.println("Cources name : ");
        // String cource = sc.next();
        // System.out.println("Cource fee");
        // float fees = sc.nextFloat();



        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/ZaggleDb", "root",
                    "Nitish@1813");

            // PreparedStatement ps = conObj
            //         .prepareStatement("Insert into Student(stdname , cources, fees) values(?,?,?)");

            // ps.setString(1, name);
            // ps.setString(2, cource);
            // ps.setFloat(3, fees);

            // int res = ps.executeUpdate();
            // if (res >= 1) {
            //     System.out.println("value updated");
            // }
            // else{
            //     System.out.println("value not inserted");
            // }


            PreparedStatement ps = conObj.prepareStatement("Select * from Student");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("rollNo") + " |" + rs.getString("stdname") + " | " + rs.getString("cources") + " | " + rs.getFloat("fees"));
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("something went wront in jdbc connection");
            e.printStackTrace();
        }
    }
}

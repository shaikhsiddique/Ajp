/*
    Question: Develop a program to create an employee table in a database having two columns "emp_id" and "emp_name".
*/

import java.sql.*;

public class prac18b {
    public static void main(String[] args) {
        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/your_database"; // Replace with your database details
        String username = "root"; // Replace with your database username
        String password = "password"; // Replace with your database password

        // SQL query to create the employee table
        String createTableSQL = "CREATE TABLE employee ("
                + "emp_id INT PRIMARY KEY, "
                + "emp_name VARCHAR(100))";

        // Establishing connection, creating table and handling exceptions
        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement()) {
            
            // Executing the SQL query to create the table
            stmt.executeUpdate(createTableSQL);
            System.out.println("Employee table created successfully!");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

/*<applet code="prac18b.class" width="400" height="300"></applet>*/

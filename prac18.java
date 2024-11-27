/*
    Question: Write a program to create a Student Table in the database and insert a record in the Student table.
*/

import java.sql.*;

public class prac18 {
    public static void main(String[] args) {
        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/your_database"; // Replace with your database details
        String username = "root"; // Replace with your database username
        String password = "password"; // Replace with your database password

        // SQL query to create the Student table
        String createTableSQL = "CREATE TABLE student ("
                + "student_id INT PRIMARY KEY, "
                + "student_name VARCHAR(100), "
                + "student_age INT, "
                + "student_grade VARCHAR(10))";

        // SQL query to insert a record into the Student table
        String insertRecordSQL = "INSERT INTO student (student_id, student_name, student_age, student_grade) "
                + "VALUES (1, 'John Doe', 20, 'A')";

        // Establishing connection, creating table, and inserting a record
        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement()) {

            // Creating the table
            stmt.executeUpdate(createTableSQL);
            System.out.println("Student table created successfully!");

            // Inserting a record into the table
            stmt.executeUpdate(insertRecordSQL);
            System.out.println("Record inserted into Student table successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

/*<applet code="prac18.class" width="400" height="300"></applet>*/

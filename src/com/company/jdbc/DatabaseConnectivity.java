package com.company.jdbc;

import java.sql.*;
import java.sql.Connection;
import java.util.Scanner;

public class DatabaseConnectivity {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/Students";

    static final String USER = "root";
    static final String PSWD = "MyLife18992@3595";


    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName(JDBC_DRIVER);
            // Open a connection
            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection(DB_URL, USER, PSWD);

            // Execute a query
            System.out.println("Creating statement...");
            statement = connection.createStatement();
            String sql;
            sql = "SELECT id, first, last, branch, age FROM Students";
            statement.executeUpdate("CREATE TABLE Vidyarthi ( id INTEGER , first VARCHAR(256),  " +
                    "last VARCHAR(256), branch VARCHAR(256), age INTEGER)");
            statement.executeUpdate("INSERT INTO Vidyarthi VALUES(1,'Sanket','Bhosale', 'Electronics & Telecommunication', 24)");

            ResultSet rs = statement.executeQuery(sql);

            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                String first = rs.getString("first");
                String last = rs.getString("last");
                String branch = rs.getString("branch");

                System.out.print("ID: " + id);
                System.out.print(", Age: " + age);
                System.out.print(", First Name: " + first);
                System.out.print(", Last Name: " + last);
                System.out.println(", Branch: " + branch);
            }
            // Clean-up environment
            rs.close();
            statement.close();
            connection.close();
        } catch (SQLException se )  {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // finally block used to close resources
            try {
                if (statement != null)
                    statement.close();
            } catch (SQLException se2) {
                se2.printStackTrace();
            }
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye...!");
    }
}

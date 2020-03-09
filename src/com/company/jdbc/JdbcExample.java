package com.company.jdbc;

import java.sql.*;
import java.util.Scanner;
import java.sql.Connection;

public class JdbcExample {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/Employees";

    static final String USER = "root";
    static final String PASS = "MyLife18992@3595";

    void getData () throws SQLException, ClassNotFoundException {
        Class.forName(JDBC_DRIVER);
        Connection myConn = DriverManager.getConnection(DB_URL, USER, PASS);
        System.out.println(saveData(myConn) + "Record Inserted");
        Statement myStmt = myConn.createStatement();
        ResultSet myRs = myStmt.executeQuery("select * from EMP");

        while (myRs.next()) {
            System.out.println("ID : "+ myRs.getInt(1)+"\n" +
                    "First_Name : " + myRs.getString(2) + "\n" +
                    "Last_Name : " + myRs.getString(3) + "\n" +
                    "Job_Title : " + myRs.getString(4) + "\n" +
                    "Address : " + myRs.getString(5));
        }
        myConn.close();
    }

    int saveData(Connection myConn) throws SQLException {
        PreparedStatement myPr = myConn.prepareStatement("Insert into EMP values(?,?,?,?,?)");
        System.out.print("Enter ID : ");
        Scanner scanner = new Scanner(System.in);
        myPr.setInt(1, scanner.nextInt());
        System.out.print("Enter First Name : ");
        myPr.setString(2, scanner.next());
        System.out.print("Enter Last Name : ");
        myPr.setString(3, scanner.next());
        System.out.print("Enter Job Title : ");
        myPr.setString(4,scanner.next());
        System.out.print("Enter Address : ");
        myPr.setString(5,scanner.next());
        int i = myPr.executeUpdate();
        return i;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        JdbcExample connectivity = new JdbcExample();
        connectivity.getData();

    }
}

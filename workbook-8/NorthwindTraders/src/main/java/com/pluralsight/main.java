package com.pluralsight;
import java.sql.*;
import java.sql.Connection;

public class main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northwind",
                "root",
                "P@sswOrd"
        );

        Statement statement = connection.createStatement();

        String query = "SELECT ProductName FROM Products";

        ResultSet results = statement.executeQuery(query);

        while (results.next()) {
            String products = results.getString("ProductName");
            System.out.println(products);
        }
        connection.close();
    }
}



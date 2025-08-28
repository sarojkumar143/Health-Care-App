package com.healthcare.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            return DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "admin", "manage"
            );
        } catch (Exception e) {
            throw new SQLException("Database connection failed.", e);
        }
    }

}

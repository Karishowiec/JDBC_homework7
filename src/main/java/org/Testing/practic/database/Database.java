package org.Testing.practic.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String URL = "jdbc:h2:mem:testjdb";
    private static final String USER = "sa";
    private static final String PASSWORD = "";

    private static Database database;
    private  Connection connection;
    public static Database getInstance(){
        if (database == null) {
            database = new Database();
        }
        return database;
    }
    private Database(){
        try {
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
            if (connection != null) {
                System.out.println("connected");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection getConnection() {
        return connection;
    }
}


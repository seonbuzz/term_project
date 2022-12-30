package com.retoree.term_project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Commons {
    public Statement getStatement() {
        String url = "jdbc:mysql://localhost:3306/retoree_termproject";
        String user = "root";
        // String password = "*khacademy!";
        String password = "root";

        Statement statement = null;
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }

    public Connection connection() throws SQLException {

        String url = "jdbc:mysql://localhost:3306/retoree_termproject";
        String user = "root";
        // String password = "*khacademy!";
        String password = "root";
        
        Connection connection = DriverManager.getConnection(url, user, password);

        return connection;

    }

    public String getGeneratorID() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyyhh:mm:ss");
        String strDate = formatter.format(date);
        return strDate;
    }

}
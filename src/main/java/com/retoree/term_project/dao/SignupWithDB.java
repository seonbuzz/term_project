package com.retoree.term_project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;

public class SignupWithDB {
    public int checkId(String checkID) {
        int result = -1;
        Commons commons = new Commons();
        Statement statement = commons.getStatement();

        String query = "SELECT * FROM USERS_LIST " +
        "WHERE ID = '" + checkID + "'";

        ResultSet resultSet;
        try {
            resultSet = statement.executeQuery(query);
            if(resultSet.next()) {
                result = 0;
            } else {
                result = 1;
            }
            // 중복 있을 경우 0, 중복 없을 경우 1, 오류 -1
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return result;
    }   

    public int number() {
        Commons commons = new Commons();
        Statement statement = commons.getStatement();
        
        String query = "SELECT COUNT(*) FROM USERS_LIST";
        int result = 0;
        
        try {
            ResultSet resultSet = statement.executeQuery(query);
            if(resultSet.next()) {
                result = resultSet.getInt(1) + 1;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
        
    }
    public int signUp(String usersUid, String id, String pwd, String name, String phone, String eamil) throws SQLException{
        Commons commons = new Commons();
        String query ="INSERT INTO USERS_LIST " + 
        "VALUES(?, ?, ?, ?, ?, ?)";

        Connection connection = commons.connection();
        PreparedStatement pstmt;
        try {
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, usersUid);
            pstmt.setString(2, phone);
            pstmt.setString(3, name);
            pstmt.setString(4, eamil);
            pstmt.setString(5, id);
            pstmt.setString(6, pwd);
            
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}

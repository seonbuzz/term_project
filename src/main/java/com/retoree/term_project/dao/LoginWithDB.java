package com.retoree.term_project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.retoree.term_project.member.controller.LoginController;

public class LoginWithDB {
    

    public void loginMember(Connection connection, String userId, String userPwd) throws SQLException {

        Commons commons = new Commons(); 
        PreparedStatement pstmt = null; //sql문에 '?'가 있을땐 preparedstatement
        // Statement statement = commons.getStatement(); //쿼리문을 넣으려면 statement
        ResultSet resultSet = null;
        
        LoginController loginCtr = null;

    
            
        
        String query = "SELECT USERS_UID, PHONE, NAME, EMAIL, ID, PWD " +
                        "FROM users_list " +
                        "WHERE ID = ? " +
                        "AND pwd = ? ";

     pstmt = connection.prepareStatement(query);
     pstmt.setString(1, userId);
     pstmt.setString(2, userPwd);

     resultSet = pstmt.executeQuery();
   
    }

}

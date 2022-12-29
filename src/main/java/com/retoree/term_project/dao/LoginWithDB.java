package com.retoree.term_project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import com.retoree.term_project.member.controller.LoginController;

public class LoginWithDB {

    public HashMap<String, Object> loginMember(String id, String pwd)
            throws SQLException {

        Commons commons = new Commons();
        Connection connection = commons.connection();
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;

        // LoginController loginCtr = null;

        String query = "SELECT USERS_UID, PHONE, NAME, EMAIL, ID, PWD " +
                "FROM users_list " +
                "WHERE ID = ? " +
                "AND PWD = ? ";

        pstmt = connection.prepareStatement(query);
        pstmt.setString(1, id);
        pstmt.setString(2, pwd);

        resultSet = pstmt.executeQuery(); // 조회 결과가 있다면 1 row 출력 or not = nothing

        HashMap<String, Object> result = null;
        while (resultSet.next()) {
            result = new HashMap<>();
            result.put("ID", resultSet.getString("ID"));
            result.put("PWD", resultSet.getString("PWD"));

        }
        return result;
    }
}

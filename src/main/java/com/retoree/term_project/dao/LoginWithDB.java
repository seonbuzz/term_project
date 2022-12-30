package com.retoree.term_project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.retoree.term_project.Bean.Member;

public class LoginWithDB {

    public Member loginMember(String id, String pwd)
            throws SQLException {

        Member m = null;
        Commons commons = new Commons();
        Connection connection = commons.connection();
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;

        String query = "SELECT USERS_UID, PHONE, NAME, EMAIL, ID, PWD " +
                "FROM USERS_LIST " +
                "WHERE ID = ? AND PWD = ? ";

        try {

            pstmt = connection.prepareStatement(query); // 미완성된 sql문
            pstmt.setString(1, id);
            pstmt.setString(2, pwd);

            resultSet = pstmt.executeQuery(); // 조회 결과가 있다면 1 row 출력 or not = nothing

            if (resultSet.next()) {
                m = new Member(resultSet.getString("users_uid"),
                        resultSet.getString("phone"),
                        resultSet.getString("name"),
                        resultSet.getString("email"),
                        resultSet.getString("id"),
                        resultSet.getString("pwd"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // resultSet.close();
        // pstmt.close();
        // connection.close();

        return m;
    }
}

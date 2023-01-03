package com.retoree.term_project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.retoree.term_project.Bean.Member;

public class FindWithDB {

    // 아이디 찾기
    public String findId(String name, String email) throws SQLException {

        String id = null;

        Member m = null;
        Commons commons = new Commons();
        Connection connection = commons.connection();
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;

        String query = "SELECT id " +
                "FROM USERS_LIST " +
                "WHERE NAME = ? AND email = ? ";

        try {

            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, name);
            pstmt.setString(2, email);

            resultSet = pstmt.executeQuery();

            if (resultSet.next()) {
                id = resultSet.getString("id");
            }

        } catch (Exception e) {
        }

        return id;
    }

    // 비밀번호 찾기
    public String findPwd(String id, String email, String name) throws SQLException {

        String pwd = null;

        // Member m = null;
        Commons commons = new Commons();
        Connection connection = commons.connection();
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;

        String query = "SELECT pwd " +
                "FROM USERS_LIST " +
                "WHERE id =? AND " +
                "email =? AND " +
                "name =? ";

        try {
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, id);
            pstmt.setString(2, email);
            pstmt.setString(3, name);

            resultSet = pstmt.executeQuery();

            if (resultSet.next()) {
                pwd = resultSet.getString("pwd");

            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return pwd;
    }
}
package com.retoree.term_project.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class AdminWithDB {
    public ArrayList<HashMap> getUserList() {
        Commons commons = new Commons();
        Statement statement = commons.getStatement();

        String query = "SELECT * FROM USERS_LIST";
        HashMap<String, Object> userInfo = null;
        ArrayList<HashMap> userList = new ArrayList<>();

        try {
            ResultSet resultSet = statement.executeQuery(query);
            
            while(resultSet.next()) {
                userInfo = new HashMap<>();
                userInfo.put("USERS_UID", resultSet.getString("USERS_UID"));
                userInfo.put("ID", resultSet.getString("ID"));
                userInfo.put("PWD", resultSet.getString("PWD"));
                userInfo.put("NAME", resultSet.getString("NAME"));
                userInfo.put("PHONE", resultSet.getString("PHONE"));
                userInfo.put("EMAIL", resultSet.getString("EMAIL"));
                userInfo.put("SURVEYCHECK", resultSet.getString("SURVEYCHECK"));
                userInfo.put("AUTH", resultSet.getString("AUTH"));

                userList.add(userInfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }
}

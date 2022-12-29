package com.retoree.term_project.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class SurveyWithDB{
    private static String questionsUid; //추가됨

    public static HashMap<String, Object> getQuestion(String questionUid) throws SQLException{ 
        
        Commons commons = new Commons();
        Statement statement = commons.getStatement();
 
    String query = "SELECT * FROM QUESTIONS_LIST " +
      " WHERE QUESTIONS_UID = '"+questionsUid+"'";

      ResultSet resultSet = statement.executeQuery(query);
      HashMap<String, Object> result = null;
      while(resultSet.next()){
        result = new HashMap<>();
        result.put("QUESTIONS_UID",resultSet.getString("QUESTIONS_UID"));
        result.put("QUESTIONS",resultSet.getString("QUESTIONS"));
        result.put("ORDERS",resultSet.getInt("ORDERS"));
      }
      return result;
    } 
}

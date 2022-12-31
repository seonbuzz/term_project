package com.retoree.term_project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;


public class SurveyWithDB{

  public ArrayList<HashMap<String, String>> getQuestions(){

    Commons commons = new Commons();
    Statement statement = commons.getStatement();
  
    String query = "SELECT * FROM QUESTIONS_LIST ORDER BY ORDERS;";
  
    ArrayList<HashMap<String, String>> questions = new ArrayList<>();
    try {
      ResultSet resultSet = statement.executeQuery(query);
      while(resultSet.next()){
        HashMap<String, String> question = new HashMap<>();
        question.put("QUESTIONS_UID", resultSet.getString("QUESTIONS_UID"));
        question.put("QUESTIONS", resultSet.getString("QUESTIONS"));
        question.put("ORDERS", resultSet.getString("ORDERS"));
  
        questions.add(question);
        }
      }catch(SQLException e){
        e.printStackTrace();
      }
      return questions;
    }
    

    public ArrayList<HashMap<String, String>> getExamples(){

      Commons commons = new Commons();
      Statement statement = commons.getStatement();
    
      String query = "select ANSWERS.*, EXAMPLE_LIST.EXAMPLE FROM ANSWERS INNER JOIN EXAMPLE_LIST ON ANSWERS.EXAMPLE_UID = EXAMPLE_LIST.EXAMPLE_UID order by QUESTIONS_UID; ";
      // QUESTIONS_UID, EXAMPLE_UID, EXAMPLE
      ArrayList<HashMap<String, String>> examples = new ArrayList<>();
      try {
        ResultSet resultSet = statement.executeQuery(query);
        while(resultSet.next()){
          HashMap<String, String> example = new HashMap<>();
          example.put("QUESTIONS_UID", resultSet.getString("QUESTIONS_UID"));
          example.put("EXAMPLE_UID", resultSet.getString("EXAMPLE_UID"));
          example.put("EXAMPLE", resultSet.getString("EXAMPLE"));
    
          examples.add(example);
          }
        }catch(SQLException e){
          e.printStackTrace();
        }
        return examples;
      }

      public void insertSurvey(String userUid, String q1, String q2, String q3, String q4, String q5) throws SQLException{
        Commons commons = new Commons();
        Statement statement = commons.getStatement();
        Statement statementSurveyCheck = commons.getStatement();
        ResultSet rs = null;
        String query ="INSERT SURVEY (USERS_UID, QUESTIONS_UID, EXAMPLE_UID) " + 
        "VALUES ('"+userUid+"', 'Q1', '"+q1+"'), ('"+userUid+"', 'Q2', '"+q2+"'), ('"+userUid+"', 'Q3', '"+q3+"'), ('"+userUid+"', 'Q4', '"+q4+"'), ('"+userUid+"', 'Q5', '"+q5+"')";
        String querySurveyCheck = "UPDATE USERS_LIST SET SURVEYCHECK = 'YES' WHERE (USERS_UID = '"+userUid+"');";
        try {
          statement.executeUpdate(query);
          statement.executeUpdate(querySurveyCheck);
        } catch (Exception e) {
          // TODO: handle exception
        }
        
        

      }
  }

  // survey 추가.
  // INSERT SURVEY (USERS_UID, QUESTIONS_UID, EXAMPLE_UID)
  // VALUES ('U1', 'Q1', 'E1-1'), ('U1', 'Q2', 'E2'), ('U1', 'Q3', 'E5'), ('U1', 'Q4', 'E3'), ('U1', 'Q5', 'E3');

  //YES 수정
  //UPDATE USERS_LIST SET SURVEYCHECK = 'YES' WHERE (USERS_UID = 'U6');






    
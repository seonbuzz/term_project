// package com.retoree.term_project.dao;

// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;
// import java.util.ArrayList;
// import java.util.HashMap;

// import com.mysql.cj.protocol.Resultset;

// public class SurveyWithDB_old{

//     public ArrayList<HashMap<String, String>> getQuestions(){

//       Commons commons = new Commons();
//       Statement statement = commons.getStatement();
  
//       String query = "SELECT * FROM QUESTIONS_LIST ORDER BY ORDERS;";
  
      
//       ArrayList<HashMap<String, String>> questions = new ArrayList<>();
//       try {
//         ResultSet resultSet = statement.executeQuery(query);
//         while(resultSet.next()){
//           HashMap<String, String> question = new HashMap<>();
//           question.put("QUESTIONS_UID", resultSet.getString("QUESTIONS_UID"));
//           question.put("QUESTIONS", resultSet.getString("QUESTIONS"));
//           question.put("ORDERS", resultSet.getString("ORDERS"));
  
//           questions.add(question);
//       }
//       } catch (SQLException e) {
//         e.getStackTrace();
//       }
      
//       return questions;
//     }
  
//     public ArrayList<HashMap<String, String>> getAnswersList(){
  
//       Commons commons = new Commons();
//       Statement statement = commons.getStatement();
  
//       // String query = "SELECT ANSWERS.QUESTIONS_UID, EXAMPLE_LIST.ORDERS, EXAMPLE_LIST.EXAMPLE " +
//       //                    "FROM ANSWERS "+
//       //                    "INNER JOIN EXAMPLE_LIST "+
//       //                    "ON ANSWERS.EXAMPLE_UID = EXAMPLE_LIST.EXAMPLE_UID "+
//       //                    "WHERE QUESTIONS_UID = '"+ Q1 +"' " +
//       //                    "ORDER BY QUESTIONS_UID "; //답 나옴
                        
//       String query = "SELECT ANSWERS.QUESTIONS_UID, EXAMPLE_LIST.ORDERS, EXAMPLE_LIST.EXAMPLE " +
//                          "FROM ANSWERS "+
//                          "INNER JOIN EXAMPLE_LIST "+
//                          "ON ANSWERS.EXAMPLE_UID = EXAMPLE_LIST.EXAMPLE_UID "+
//                          "WHERE QUESTIONS_UID = '"+ QUESTIONS_UID +"' " + 
//                          "ORDER BY QUESTIONS_UID "; 
       

//       ArrayList<HashMap<String, String>> answers = new ArrayList<>();
//       try {
//         ResultSet resultSet = statement.executeQuery(query);
//         while(resultSet.next()){
//           HashMap<String, String> answer = new HashMap<>();
//           answer.put("QUESTIONS_UID", resultSet.getString("QUESTIONS_UID"));
//           answer.put("ORDERS", resultSet.getString("ORDERS"));
//           answer.put("EXAMPLE", resultSet.getString("EXAMPLE"));
  
//           answers.add(answer);
//         }
//           } catch (Exception e) {
//                 e.getStackTrace(); 
//       }                   
//          return answers;
//       }
//    }











    
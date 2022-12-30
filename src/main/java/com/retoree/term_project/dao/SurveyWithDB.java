package com.retoree.term_project.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import com.mysql.cj.protocol.Resultset;

public class SurveyWithDB{


    // public ArrayList<HashMap<String, String>> getQuestions(String questions_Uid) throws SQLException{
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
      } catch (SQLException e) {
        e.getStackTrace();
      }
      
      return questions;
    }
  
    public ArrayList<HashMap<String, String>> getAnswersList(){
  
      Commons commons = new Commons();
      Statement statement = commons.getStatement();
  
      // String query = "SELECT ANSWERS.QUESTIONS_UID, EXAMPLE_LIST.ORDERS, EXAMPLE_LIST.EXAMPLE " +
      //                    "FROM ANSWERS "+
      //                    "INNER JOIN EXAMPLE_LIST "+
      //                    "ON ANSWERS.EXAMPLE_UID = EXAMPLE_LIST.EXAMPLE_UID "+
      //                    "WHERE QUESTIONS_UID = '"+ Q1 +"' " +
      //                    "ORDER BY QUESTIONS_UID "; //답 나옴
                        
      String query = "SELECT ANSWERS.QUESTIONS_UID, EXAMPLE_LIST.ORDERS, EXAMPLE_LIST.EXAMPLE " +
                         "FROM ANSWERS "+
                         "INNER JOIN EXAMPLE_LIST "+
                         "ON ANSWERS.EXAMPLE_UID = EXAMPLE_LIST.EXAMPLE_UID "+
                         "WHERE QUESTIONS_UID = '"+ questions_Uid +"' " +
                         "ORDER BY QUESTIONS_UID ";
      ArrayList<HashMap<String, String>> answers = new ArrayList<>();
      try {
        ResultSet resultSet = statement.executeQuery(query);
        while(resultSet.next()){
          HashMap<String, String> answer = new HashMap<>();
          answer.put("QUESTIONS_UID", resultSet.getString("QUESTIONS_UID"));
          answer.put("ORDERS", resultSet.getString("ORDERS"));
          answer.put("EXAMPLE", resultSet.getString("EXAMPLE"));
  
          answers.add(answer);
        }
          } catch (Exception e) {
                e.getStackTrace(); 
      }                   
         return answers;
      }
  }

//다시한거
// public ArrayList<HashMap<String, String>> getQuestions(){

//   Commons commons = new Commons();
//   Statement statement = commons.getStatement();

//   String query = "SELECT * FROM QUESTIONS_LIST ORDER BY ORDERS;";

  
//   ArrayList<HashMap<String, String>> questions = new ArrayList<>();
//   try {
//     ResultSet resultSet = statement.executeQuery(query);
//     while(resultSet.next()){
//       HashMap<String, String> question = new HashMap<>();
//       question.put("QUESTIONS_UID", resultSet.getString("QUESTIONS_UID"));
//       question.put("QUESTIONS", resultSet.getString("QUESTIONS"));
//       question.put("ORDERS", resultSet.getString("ORDERS"));

//       questions.add(question);
//   }
//   } catch (SQLException e) {
//     e.getStackTrace();
//   }
  
//   return questions;
// }

// public ArrayList<HashMap<String, String>> getAnswersList(){

//   Commons commons = new Commons();
//   Statement statement = commons.getStatement();

//   String query = "SELECT ANSWERS.QUESTIONS_UID, EXAMPLE_LIST.ORDERS, EXAMPLE_LIST.EXAMPLE " +
//                      "FROM ANSWERS "+
//                      "INNER JOIN EXAMPLE_LIST "+
//                      "ON ANSWERS.EXAMPLE_UID = EXAMPLE_LIST.EXAMPLE_UID "+
//                      "WHERE QUESTIONS_UID = '"+ questions_Uid+"' " +
//                      "ORDER BY QUESTIONS_UID ";
//   ArrayList<HashMap<String, String>> answers = new ArrayList<>();
//   try {
//     ResultSet resultSet = statement.executeQuery(query);
//     while(resultSet.next()){
//       HashMap<String, String> answer = new HashMap<>();
//       answer.put("QUESTIONS_UID", resultSet.getString("QUESTIONS_UID"));
//       answer.put("ORDERS", resultSet.getString("ORDERS"));
//       answer.put("EXAMPLE", resultSet.getString("EXAMPLE"));

//       answers.add(answer);
//     }
//       } catch (Exception e) {
//             e.getStackTrace(); 
//   }                   
//      return answers;
//   }
// }






//전에꺼
  //  public HashMap<String, Object> getQuestion(String questions_Uid) throws SQLException{ //quesionsUid
        
  //       Commons commons = new Commons();
  //       Statement statement = commons.getStatement();
 
  //   String query = "SELECT * FROM QUESTIONS_LIST " +
  //     " WHERE QUESTIONS_UID = '"+questions_Uid+"'";

  //     ResultSet resultSet = statement.executeQuery(query);
  //     HashMap<String, Object> result = null;
  //     while(resultSet.next()){
  //       result = new HashMap<>();
  //       result.put("QUESTIONS_UID",resultSet.getString("QUESTIONS_UID"));
  //       result.put("QUESTIONS",resultSet.getString("QUESTIONS"));
  //       result.put("ORDERS",resultSet.getInt("ORDERS"));
  //     }
  //     return result; 
  //   } 
  //   public ArrayList<HashMap>getAnswersList(String questions_Uid) throws SQLException{ //quesionsUid
  //     Commons commons = new Commons();
  //     Statement statement = commons.getStatement();
  //     String query = "SELECT ANSWERS.QUESTIONS_UID, EXAMPLE_LIST.ORDERS, EXAMPLE_LIST.EXAMPLE " +
  //                    "FROM ANSWERS "+
  //                    "INNER JOIN EXAMPLE_LIST "+
  //                    "ON ANSWERS.EXAMPLE_UID = EXAMPLE_LIST.EXAMPLE_UID "+
  //                    "WHERE QUESTIONS_UID = '"+questions_Uid+"' " +
  //                    "ORDER BY QUESTIONS_UID ";
  //     ResultSet resultSet = statement.executeQuery(query);

  //     ArrayList<HashMap> answers_list = new ArrayList<>();
  //     while(resultSet.next()){
  //       HashMap<String,Object> answers = new HashMap<String,Object>();
  //       answers.put("QUESTIONS_UID", resultSet.getString("QUESTIONS_UID"));
  //       answers.put("EXAMPLE", resultSet.getString("EXAMPLE"));
  //       answers.put("ORDERS", resultSet.getInt("ORDERS"));
     
  //       answers_list.add(answers);
  //     }

  //     return answers_list;
      
  //   }

       



    
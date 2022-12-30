package com.retoree.term_project.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class StatisticsWithDB {
    String users_Uid; //세션에서 받아오기
    public StatisticsWithDB(){
    }
    public StatisticsWithDB(String users_Uid){
        //생성자 통해서 세션값 받아올때.
        users_Uid = this.users_Uid;
    }
    // 1. 회원 설문/답문 조회

    public ArrayList getUserServey(){
        Commons commons = new Commons();
        Statement statement = commons.getStatement();
        users_Uid = "U1"; //테스트용 값
        String query = "select * from survey where USERS_UID ='"+users_Uid+"'order by QUESTIONS_UID;";
        ArrayList survey_answer = new ArrayList<>();  
        try {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                survey_answer.add(resultSet.getString("EXAMPLE_UID"));
            }
        } catch (SQLException e) {
            e.getStackTrace();
        }
        return survey_answer;
    } 

    public String getUserName(){
        Commons commons = new Commons();
        Statement statement = commons.getStatement();
        users_Uid = "U1"; //테스트용 값
        String query = "select * from users_list where USERS_UID ='"+users_Uid+"';";
        String userName ="";
        try {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                userName=resultSet.getString("NAME");
            }
        } catch (SQLException e) {
            e.getStackTrace();
        }
        return userName;
    }
    
    public ArrayList getQuestion(){
        Commons commons = new Commons();
        Statement statement = commons.getStatement();

        String query = "SELECT * FROM questions_list;";
        ArrayList questions = new ArrayList<>();
        

        try {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                HashMap question = new HashMap<>();
                question.put("QUESTIONS", resultSet.getString("QUESTIONS"));
                question.put("ORDERS", Integer.parseInt(resultSet.getString("ORDERS")));
                questions.add(question);
            }
        } catch (SQLException e) {
            e.getStackTrace();
        }

        return questions;        
    }
    // 2. 설문자별 통계

    public ArrayList getUsersInfo(){
        Commons commons = new Commons();
        Statement statement = commons.getStatement();
        
        String query = "select * from users_list order by USERS_UID;";
        ArrayList userNameArr =new ArrayList<>();

        try {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                userNameArr.add(resultSet.getString("NAME"));
            }
        } catch (SQLException e) {
            e.getStackTrace();
        }
        return userNameArr;
    }

    public HashMap<String, String> getUsersServey(){
        Commons commons = new Commons();
        Statement statement = commons.getStatement();
        String query = "select * from survey order by USERS_UID, QUESTIONS_UID;";

        HashMap<String, String> survey = new HashMap<>();
        try {
                ResultSet resultSet = statement.executeQuery(query);
                while (resultSet.next()){
                    
                    survey.put(resultSet.getString("USERS_UID")+resultSet.getString("QUESTIONS_UID"), resultSet.getString("EXAMPLE_UID"));
                }
            } catch (SQLException e) {
                e.getStackTrace();
            }
            System.out.println();
            return survey;
    }
    // 3. 질문별 총 답변 수

    public HashMap<String, String> getStatisticsSurvey(){
        String query = "select QUESTIONS_UID,EXAMPLE_UID, count(EXAMPLE_UID) As nums FROM survey group by EXAMPLE_UID, QUESTIONS_UID order by QUESTIONS_UID,EXAMPLE_UID;"; 
        Commons commons = new Commons();
        Statement statement = commons.getStatement();
        HashMap<String, String> statistics = new HashMap<>();
        try {
            
            ResultSet resultSet = statement.executeQuery(query);


            while (resultSet.next()){
                statistics.put(resultSet.getString("QUESTIONS_UID")+resultSet.getString("EXAMPLE_UID") ,resultSet.getString("nums"));
            }
        } catch (SQLException e) {
            e.getStackTrace();
        }
        
        return statistics;
    }
}


// users_Uid = "U1"; //테스트용 값
// String query = "select * from survey order by USERS_UID, QUESTIONS_UID;";
// ArrayList survey_answers = new ArrayList<>();

// //arr -> arr arr arr arr arr 
// try {
//     ResultSet resultSet = statement.executeQuery(query);
//     while (resultSet.next()){
//         HashMap survey_answer = new HashMap<>(); 
//         survey_answer.put("USERS_UID", resultSet.getString("USERS_UID"));
//         survey_answer.put("QUESTIONS_UID", resultSet.getString("QUESTIONS_UID"));
//         survey_answer.put("EXAMPLE_UID", resultSet.getString("EXAMPLE_UID"));
//         survey_answers.add(survey_answer);
//     }
// } catch (SQLException e) {
//     e.getStackTrace();
// }
// return survey_answers;
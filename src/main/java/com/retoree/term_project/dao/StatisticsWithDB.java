package com.retoree.term_project.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StatisticsWithDB {
    String users_Uid; //세션에서 받아오기
    public StatisticsWithDB(){
    }
    public StatisticsWithDB(String users_Uid){
        //생성자 통해서 세션값 받아올때.
        users_Uid = this.users_Uid;
    }
    // 1. 회원 설문/답문 조회
    // users_list.USERS_UID 조회 -> survey.EXAMPLE_UID 출력
    // 
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

    // 2. 설문자별 통계

    // 3. 질문별 총 답변 수
}

package com.retoree.term_project.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.retoree.term_project.dao.StatisticsWithDB;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/statisticsUsersServeyServlet")
public class StatisticsUsersServeyServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StatisticsWithDB db = new StatisticsWithDB();
        ArrayList userNameArr = new ArrayList<>();
        ArrayList survey_answers = new ArrayList<>();
        // ArrayList surveys = new ArrayList<>();
        // String checkUid="";
        userNameArr = db.getUsersInfo();
        // survey_answers = db.getUsersServey();
        // System.out.println(userNameArr);
        // System.out.println(survey_answers);


        // for(int i=0; i<survey_answers.size();i++){
        //     HashMap survey_answer = (HashMap)survey_answers.get(i);
        //     ArrayList survey = new ArrayList<>();
        //     if(survey_answer.get("USERS_UID").equals(checkUid)){
        //         System.out.println(survey_answer.get("EXAMPLE_UID"));
        //         survey.add(survey_answer.get("EXAMPLE_UID"));
        //     }else{
        //         checkUid = (String)survey_answer.get("USERS_UID");
        //         System.out.println("------------------");
        //         System.out.println(survey_answer.get("EXAMPLE_UID"));
        //         survey.add(survey_answer.get("EXAMPLE_UID"));
        //     }
        //     surveys.add(survey);
        // }
        
        
        // System.out.println(surveys);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/result2.jsp");
        request.setAttribute("userNameArr", userNameArr);
        // request.setAttribute("surveys", surveys);
        


        requestDispatcher.forward(request, response);
    }
}

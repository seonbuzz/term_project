package com.retoree.term_project.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.retoree.term_project.dao.SurveyWithDB;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/surveyServlet") 
public class SurveyServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // input type
       String questions_Uid = request.getParameter("QUESTIONS_UID");

       SurveyWithDB surveyWithDB = new SurveyWithDB();
      
       HashMap<String, Object> question = null;
       ArrayList<HashMap> answers = null;
    
       try {
      question = surveyWithDB.getQuestion(questions_Uid);
        answers= surveyWithDB.getAnswersList();
        for(int i = 0; i< question.size(); i++){
            HashMap<String, Object>  questions;
            HashMap<String, Object> questions_list =  (HashMap<String, Object>) question.get(i);
        }
       
            answers = surveyWithDB.getAnswersList();
       } catch (Exception e) {
        e.printStackTrace();
       }
       for (int i = 0; i < answers.size(); i++) {
                   HashMap<String, Object> answers_list = answers.get(i);
               }
        request.setAttribute("question", question);
        request.setAttribute("answers", answers);
      
     
       RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/survey.jsp");
       requestDispatcher.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
        this.doGet(request, response);
    }

}


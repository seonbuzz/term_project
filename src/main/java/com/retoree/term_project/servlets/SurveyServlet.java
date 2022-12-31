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
       
        SurveyWithDB surveyWithDB = new SurveyWithDB();

        ArrayList<HashMap<String, String>> questions = surveyWithDB.getQuestions();
       // ArrayList<HashMap<String, String>>answers = surveyWithDB.getAnswersList();

        for(int i = 0; i<questions.size(); i++){
            System.out.println(questions.get(i).get("QUESTIONS"));
        }
        //for(int i = 0; i<answers.size();i++){
        //    System.out.println(answers.get(i).get("ANSWERS"));
        //}

        request.setAttribute("questions", questions);
        //request.setAttribute("answers", answers);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/survey.jsp");
        requestDispatcher.forward(request, response);
    }
}
       
       
   



       
    


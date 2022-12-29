package com.retoree.term_project.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.retoree.term_project.dao.SurveyWithDB;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "") //아직 작성x
public class SurveyServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // input type
       String questions_Uid = request.getParameter("QUESTIONS_UID");

       SurveyWithDB surveyWithDB = new SurveyWithDB();
       HashMap<String, Object> question = null;
       ArrayList<HashMap> answer_list = null;
       try {
        question = surveyWithDB.getQuestion(questions_Uid);

        System.out.println(question.get("QUESTIONS_UID"));
        System.out.println(question.get("QUESTIONS"));
        System.out.println(question.get("ORDERS"));
       
        answer_list = surveyWithDB.getAnswerList(questions_Uid);
       } catch (Exception e) {
        e.printStackTrace();
       }
        for(int i = 0; i< answer_list.size(); i++){
            HashMap<String,Object> answer = answer_list.get(i);
            System.out.println(answer.get("ORDERS"));
            System.out.println(answer.get("EXAMPLE"));
        }
        request.setAttribute("question", question);
        request.setAttribute("answer_list", answer_list);

       RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/survey.jsp");
       requestDispatcher.forward(request, response);
    }
    


}

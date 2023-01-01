package com.retoree.term_project.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.retoree.term_project.bean.Member;
import com.retoree.term_project.dao.SurveyWithDB;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/surveyServlet") 
public class SurveyServlet extends HttpServlet{
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /*
        1. 로그인 시 설문조사 가능 USERS_UID 
        2. 중복 설문 불가
    
        */
        SurveyWithDB surveyWithDB = new SurveyWithDB();
        ArrayList<HashMap<String, String>> questions = surveyWithDB.getQuestions();
        ArrayList<HashMap<String, String>> examples = surveyWithDB.getExamples();

        HttpSession httpSession = request.getSession();
        Member loginUser = (Member)httpSession.getAttribute("loginUser");
        RequestDispatcher requestDispatcher = null;

        if (loginUser == null){
            requestDispatcher = request.getRequestDispatcher("/views/errorPage3.jsp");
            requestDispatcher.forward(request, response);

        }else{
            if(loginUser.getSurveyCheck().equals("YES")){
                //설문 진행시
                System.out.println();

                requestDispatcher = request.getRequestDispatcher("/views/completeSurvey.jsp");
            }else if(loginUser.getSurveyCheck().equals("NO")){
                //설문 미 진행시
                System.out.println();
                request.setAttribute("questions", questions);
                request.setAttribute("examples", examples);
                requestDispatcher = request.getRequestDispatcher("/views/survey.jsp");
            }
            System.out.println();
            requestDispatcher.forward(request, response);
        }
    }
}
       
       
   



       
    


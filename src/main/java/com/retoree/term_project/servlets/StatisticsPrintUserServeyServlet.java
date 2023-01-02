package com.retoree.term_project.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.retoree.term_project.Bean.Member;
import com.retoree.term_project.dao.StatisticsWithDB;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns="/statisticsPrintUserServeyServlet")
public class StatisticsPrintUserServeyServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
        Member loginUser = (Member)httpSession.getAttribute("loginUser");
        RequestDispatcher requestDispatcher = null;
        
        if (loginUser == null){
            requestDispatcher = request.getRequestDispatcher("/views/errorPage3.jsp");
            requestDispatcher.forward(request, response);

        }else{
            String userUid = loginUser.getUsersUid();
            System.out.println(loginUser.getUsersUid());
            StatisticsWithDB db = null;
            ArrayList survey_answer = new ArrayList<>();
            ArrayList questions = new ArrayList<>();
            String userName ="";
        

        
            if(loginUser.getSurveyCheck().equals("YES")){
                //설문 진행시
                db = new StatisticsWithDB(userUid);
                requestDispatcher = request.getRequestDispatcher("/views/result1.jsp");
            }else if(loginUser.getSurveyCheck().equals("NO")){
                //설문 미 진행시
                db = new StatisticsWithDB(userUid);
                requestDispatcher = request.getRequestDispatcher("/views/errorPage2.jsp");
            }
            
            
            
            survey_answer = db.getUserServey();
            questions = db.getQuestion();
            userName = db.getUserName();
            request.setAttribute("survey_answer", survey_answer);
            request.setAttribute("questions", questions);
            request.setAttribute("userName", userName);
            requestDispatcher.forward(request, response);
        }   
    }
    
}

package com.retoree.term_project.servlets;

import java.io.IOException;

import com.retoree.term_project.bean.Member;
import com.retoree.term_project.dao.LoginWithDB;
import com.retoree.term_project.dao.SurveyWithDB;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/surveySubmitServlet") 
public class SurveySubmitServlet extends HttpServlet{
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        SurveyWithDB db = new SurveyWithDB();
        HttpSession httpSession = request.getSession();
        Member loginUser = (Member)httpSession.getAttribute("loginUser");
        int result;
        String userUid = loginUser.getUsersUid();
        String Q1 = request.getParameter("Q1");
        String Q2 = request.getParameter("Q2");
        String Q3 = request.getParameter("Q3");
        String Q4 = request.getParameter("Q4");
        String Q5 = request.getParameter("Q5");
        try {
            System.out.println();
            db.insertSurvey(userUid, Q1, Q2, Q3, Q4, Q5);

            //세션 갱신
            Member loginUserUpdate = new LoginWithDB().loginMember(loginUser.getId(), loginUser.getPwd());
            HttpSession session = request.getSession();
            session.setAttribute("loginUser", loginUserUpdate);


        } catch (Exception e) {
            e.printStackTrace();
        }
        
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/survey_submit.jsp");
        requestDispatcher.forward(request, response);
    }
}
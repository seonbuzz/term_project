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
        ArrayList<HashMap<String, String>> statistics = new ArrayList<>();
        // String checkUid="";
        userNameArr = db.getUsersInfo();
        survey_answers =db.getUsersServey();
        // statistics = db.getStatisticsSurvey();
        
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/result2.jsp");
        request.setAttribute("userNameArr", userNameArr);
        request.setAttribute("survey_answers", survey_answers);
        


        requestDispatcher.forward(request, response);
    }
}

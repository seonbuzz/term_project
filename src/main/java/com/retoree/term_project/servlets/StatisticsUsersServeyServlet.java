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
        ArrayList userNameArr = userNameArr = db.getUsersInfo();
        HashMap<String, String> survey =  db.getUsersServey();
        
        System.out.println(survey.get("U1Q1"));
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/result2.jsp");
        request.setAttribute("userNameArr", userNameArr);
        request.setAttribute("survey", survey);


        requestDispatcher.forward(request, response);
    }
}

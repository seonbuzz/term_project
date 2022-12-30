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

@WebServlet(urlPatterns="/statisticsServeyServlet")
public class StatisticsServeyServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StatisticsWithDB db = new StatisticsWithDB();
        HashMap<String, String> statistics = new HashMap<>();
        // String checkUid="";

        statistics = db.getStatisticsSurvey();
        System.out.println(statistics);



        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/result3.jsp");
        request.setAttribute("statistics", statistics);

        requestDispatcher.forward(request, response);
    }
}

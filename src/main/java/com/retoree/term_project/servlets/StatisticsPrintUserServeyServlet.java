package com.retoree.term_project.servlets;

import java.io.IOException;
import java.util.ArrayList;

import com.retoree.term_project.dao.StatisticsWithDB;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/statisticsPrintUserServeyServlet")
public class StatisticsPrintUserServeyServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StatisticsWithDB db = new StatisticsWithDB();
        ArrayList survey_answer = new ArrayList<>();
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/result1.jsp");
        survey_answer = db.getUserServey();

        request.setAttribute("survey_answer", survey_answer);

        requestDispatcher.forward(request, response);
    }
    
}

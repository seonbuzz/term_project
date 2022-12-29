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

@WebServlet(urlPatterns="/statisticsPrintUserServeyServlet")
public class StatisticsPrintUserServeyServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StatisticsWithDB db = new StatisticsWithDB();
        ArrayList survey_answer = new ArrayList<>();
        ArrayList questions = new ArrayList<>();
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/result1.jsp");
        survey_answer = db.getUserServey();
        questions = db.getQuestion();

        request.setAttribute("survey_answer", survey_answer);
        request.setAttribute("questions", questions);
        System.out.println(questions.get(0));
        HashMap questionT = (HashMap) questions.get(0);
        System.out.println(questionT.get("ORDERS"));
        requestDispatcher.forward(request, response);
    }
    
}

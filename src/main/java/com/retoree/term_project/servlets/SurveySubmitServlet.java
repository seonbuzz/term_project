package com.retoree.term_project.servlets;

import java.io.IOException;

import com.retoree.term_project.dao.SurveyWithDB;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/surveySubmitServlet") 
public class SurveySubmitServlet extends HttpServlet{
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        SurveyWithDB surveyWithDB = new SurveyWithDB();

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/survey_submit.jsp");
        requestDispatcher.forward(request, response);
    }
}
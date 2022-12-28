package com.retoree.term_project.servlets;

import java.io.IOException;
import java.util.HashMap;

import com.retoree.term_project.dao.PollWithDB;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "") //아직 작성x
public class PollDetailServlets extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // input type
       String questions_Uid = request.getParameter("QUESTIONS_UID");

       PollWithDB pollWithDB = new PollWithDB();
       HashMap<String, Object> quetion = null;
       try {
        quetion = pollWithDB.getQuestion(questions_Uid);
        
       } catch (Exception e) {
       
       }
        

       RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/details.jsp");
       requestDispatcher.forward(request, response);
    }
    


}

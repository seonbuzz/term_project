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

@WebServlet(urlPatterns="/statisticsUsersServeyServlet")
public class StatisticsUsersServeyServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
        Member loginUser = (Member)httpSession.getAttribute("loginUser");
        StatisticsWithDB db = new StatisticsWithDB();

        ArrayList userNameArr = userNameArr = db.getUsersInfo();
        HashMap<String, String> survey =  db.getUsersServey();
        RequestDispatcher requestDispatcher = null;
        
        if (loginUser == null){
            requestDispatcher = request.getRequestDispatcher("/views/errorPage3.jsp");
            requestDispatcher.forward(request, response);
        }else{
            if(loginUser.getAuth().equals("YES")){
                requestDispatcher = request.getRequestDispatcher("/views/result2.jsp");
                request.setAttribute("loginData", httpSession.getAttribute("loginUser"));
                request.setAttribute("userNameArr", userNameArr);
                request.setAttribute("survey", survey);
                requestDispatcher.forward(request, response);
            }else{
                requestDispatcher = request.getRequestDispatcher("/views/errorPage4.jsp");
                requestDispatcher.forward(request, response);
            }

        }
        
        
    }
}

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

@WebServlet(urlPatterns="/statisticsServeyServlet")
public class StatisticsServeyServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StatisticsWithDB db = new StatisticsWithDB();
        HttpSession httpSession = request.getSession();
        Member loginUser = (Member)httpSession.getAttribute("loginUser");
        HashMap<String, String> statistics = new HashMap<>();
        RequestDispatcher requestDispatcher = null;
        // String checkUid="";

        if (loginUser == null){
            requestDispatcher = request.getRequestDispatcher("/views/errorPage3.jsp");
            requestDispatcher.forward(request, response);

        }else{
            if(loginUser.getAuth().equals("YES")){
                requestDispatcher = request.getRequestDispatcher("/views/result3.jsp");
                statistics = db.getStatisticsSurvey();
                request.setAttribute("statistics", statistics);
                requestDispatcher.forward(request, response);
            }else{
                requestDispatcher = request.getRequestDispatcher("/views/errorPage4.jsp");
                requestDispatcher.forward(request, response);
            }
        }

    }
}

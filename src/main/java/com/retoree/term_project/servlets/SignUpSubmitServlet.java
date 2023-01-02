package com.retoree.term_project.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.retoree.term_project.bean.Member;
import com.retoree.term_project.dao.SignupWithDB;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/SignUpSubmitServlet")
public class SignUpSubmitServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        SignupWithDB db = new SignupWithDB();

        int result;
        String usersUid;
        try {
            usersUid = "U" + db.number();
        String id = request.getParameter("user_id");
        String pwd = request.getParameter("user_pw");
        String name = request.getParameter("user_name");
        String phone = request.getParameter("number_first") + "-" + request.getParameter("number_second") + "-" + request.getParameter("number_third");
        String emailAddr = "";
        if(request.getParameter("email_second").isEmpty()) {
            emailAddr = request.getParameter("email_second_choose");
        } else {
            emailAddr = request.getParameter("email_second");
        }
        String eamil = request.getParameter("email_first") + "@" + emailAddr;

        result = db.signUp(usersUid, id, pwd, name, phone, eamil);

    } catch (SQLException e) {
        e.printStackTrace();
    }
    RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/signup_submit.jsp");
    requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);

    }

}

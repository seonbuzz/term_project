package com.retoree.term_project.member.controller;

import java.io.IOException;
import java.sql.SQLException;

import com.retoree.term_project.Bean.Member;
import com.retoree.term_project.dao.LoginWithDB;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//서블릿
@WebServlet(urlPatterns = "/login.me")
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");

        // 요청처리
        try {
            Member loginUser = new LoginWithDB().loginMember(id, pwd);
            System.out.println(loginUser);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // LoginWithDB loginWithDB = new LoginWithDB(); // 인스턴스화
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doGet(request, response);
    }
}

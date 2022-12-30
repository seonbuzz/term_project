package com.retoree.term_project.member.controller;

import java.io.IOException;
import java.sql.SQLException;

import com.retoree.term_project.Bean.Member;
import com.retoree.term_project.dao.LoginWithDB;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//서블릿
@WebServlet(urlPatterns = "/login")
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try {
            String id = request.getParameter("id");
            String pwd = request.getParameter("pwd");

            // System.out.println(id);
            // System.out.println(pwd);

            // 요청처리
            Member loginUser = new LoginWithDB().loginMember(id, pwd);
            System.out.println(loginUser);

            if (loginUser == null) {
                // 조회결과없음 == => 에러페이지 나오게 하기
                request.setAttribute("errorMsg", "아이디 또는 비밀번호가 맞지 않습니다.");
                // RequestDispatcher view = request.getRequestDispatcher("views/login.jsp");

                RequestDispatcher view = request.getRequestDispatcher("views/errorPage.jsp");
                view.forward(request, response);

            } else {
                // 조회결과있음 ==> 메인페이지(index) 응답

                // loginUser를 session 처리

                HttpSession session = request.getSession();
                session.setAttribute("loginUser", loginUser);

                RequestDispatcher view = request.getRequestDispatcher("views/welcome.jsp");
                view.forward(request, response);
                // response.sendRedirect(request.getContextPath()); 일단 쓰지 않기

            }

        } catch (

        SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doGet(request, response);
    }
}

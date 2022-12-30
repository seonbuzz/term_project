package com.retoree.term_project.member.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogoutController
 */
@WebServlet("/logout.me")
public class LogoutController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 로그아웃 요청 처리 => session만료시키기 == 세션을 무효화시키기
        // HttpSession session = request.getSession();
        // session.invalidate();
        request.getSession().invalidate();

        // 응답페이지 => /jsp url재요청 => index페이지
        response.sendRedirect(request.getContextPath());

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}

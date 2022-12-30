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
@WebServlet(urlPatterns = "/login.me")
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");

        System.out.println(id);
        System.out.println(pwd);

        // 요청처리
        try {
            Member loginUser = new LoginWithDB().loginMember(id, pwd);
            System.out.println(loginUser);

            if (loginUser == null) {
                // 조회결과없음 == => 에러페이지 나오게 하기
                request.setAttribute("errorMsg", "아이디 또는 비밀번호가 맞지 않습니다.");

                // 응답페이지 (jsp)에게 위임시 필요한 객체 (RequestDispatcher)
                // 포워딩 방식 : 해당 경로로 선택된 뷰가 보여질 뿐 url은 절대 변경되지 않음 (즉, 요청했을때의 url이 여전히 남아있음)
                RequestDispatcher view = request.getRequestDispatcher("views/errorPage.jsp");
                view.forward(request, response);

            } else {
                // 조회결과있음 ==> 메인페이지(index) 응답

                // 로그인한 회원정보(loginUser)를 session에 담아버리기(왜? 여기저기서 다 갖다쓰도록)

                // Servlet에서는 session에 접근하고자 한다면 우선 세션객체 얻어와야됨
                HttpSession session = request.getSession();
                session.setAttribute("loginUser", loginUser);

                // response.sendRedirect(request.getContextPath()); 일단 쓰지 않기

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doGet(request, response);
    }
}

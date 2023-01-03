package com.retoree.term_project.servlets;

import java.io.IOException;
import java.sql.SQLException;

import com.retoree.term_project.dao.FindWithDB;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/findPwdServlet")
public class FindPwdServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        FindWithDB findWithDB = new FindWithDB();

        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String pwd;
        try {

            pwd = findWithDB.findPwd(id, email, name);
            request.setAttribute("pwd", pwd);

            if (pwd != null) {

                RequestDispatcher view = request.getRequestDispatcher("/views/findPwd_success.jsp");
                view.forward(request, response);

            } else {
                RequestDispatcher view = request.getRequestDispatcher("/views/findPwd.jsp");
                view.forward(request, response);

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

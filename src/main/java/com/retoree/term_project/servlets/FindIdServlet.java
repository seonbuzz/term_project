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

@WebServlet(urlPatterns = "/findIdServlet")
public class FindIdServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        FindWithDB findWithDB = new FindWithDB();

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String id;

        try {
            id = findWithDB.findId(name, email);
            request.setAttribute("id", id);
            if (id != null) {

                RequestDispatcher view = request.getRequestDispatcher("/views/findId_success.jsp");
                view.forward(request, response);

            } else {
                RequestDispatcher view = request.getRequestDispatcher("/views/findId.jsp");
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

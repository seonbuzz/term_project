package com.retoree.term_project.servlets.admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.retoree.term_project.Bean.Member;
import com.retoree.term_project.dao.AdminWithDB;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/adminUserListServlet")
public class AdminUserListServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession httpSession = request.getSession();
        Member loginUser = (Member) httpSession.getAttribute("loginUser");

        AdminWithDB db = new AdminWithDB();

        ArrayList<HashMap> userList = db.getUserList();
        request.setAttribute("userList", userList);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/admin_userlist.jap");
        requestDispatcher.forward(request, response);
    
        for(int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i).get("USERS_UID"));
        }


    }
}

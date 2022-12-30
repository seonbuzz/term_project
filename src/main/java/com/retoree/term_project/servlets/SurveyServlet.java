package com.retoree.term_project.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.retoree.term_project.dao.SurveyWithDB;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/surveyServlet") 
public class SurveyServlet extends HttpServlet{
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        SurveyWithDB surveyWithDB = new SurveyWithDB();

        ArrayList<HashMap<String, String>> questions = surveyWithDB.getQuestions();
       // ArrayList<HashMap<String, String>>answers = surveyWithDB.getAnswersList();

        for(int i = 0; i<questions.size(); i++){
            System.out.println(questions.get(i).get("QUESTIONS"));
        }
        //for(int i = 0; i<answers.size();i++){
        //    System.out.println(answers.get(i).get("ANSWERS"));
        //}

        request.setAttribute("questions", questions);
        //request.setAttribute("answers", answers);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/survey.jsp");
        requestDispatcher.forward(request, response);
    }
}
       
       
   



       
    //나중에한거   
// @WebServlet(urlPatterns = "/surveyServlet") 
// public class SurveyServlet extends HttpServlet{
// @Override
//     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
//         SurveyWithDB surveyWithDB = new SurveyWithDB();

//         ArrayList<HashMap<String, String>> questions = surveyWithDB.getQuestions();
//         ArrayList<HashMap<String, String>>answers = surveyWithDB.getAnswersList();

//         for(int i = 0; i<questions.size(); i++){
//             System.out.println(questions.get(i).get("QUESTIONS"));
//         }
//         for(int i = 0; i<answers.size();i++){
//             System.out.println(answers.get(i).get("ANSWERS"));
//         }

//         request.setAttribute("questions", questions);
//         request.setAttribute("answers", answers);
        
//         RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/survey.jsp");
//         requestDispatcher.forward(request, response);
//     }
// }
       
       
        // input type
       // 세션으로 불러올 값
        //String questions_Uid = request.getParameter("QUESTIONS_UID");
    //     String questions_Uid = "U1";
    //    SurveyWithDB surveyWithDB = new SurveyWithDB();
      
    //    HashMap<String, Object> question = null;
    //    ArrayList<HashMap> answers = null;
    
    //    try {
    //     questions = surveyWithDB.getQuestion(questions_Uid);
    //     answers = surveyWithDB.getAnswersList(questions_Uid);
    //     // System.out.println(question.get("QUESTIONS_UID"));
    //     // System.out.println(question.get("QUESTIONS"));
    //     // System.out.println(question.get("ORDERS"));
    //     for (int i = 0; i <  question.size(); i++) {
    //         HashMap<String, Object> questions_list =  (HashMap<String, Object>) questions.get(i);
    //     }

    //     answers = surveyWithDB.getAnswersList(questions_Uid);
    // } catch (SQLException e) {
    //     e.printStackTrace();
    // }
    // for(int i=0;i < answers.size();i++){
    //     HashMap<String, Object>  answer = answers.get(i);
    //     // System.out.println(answer.get("ORDERS"));
    //     // System.out.println(answer.get("EXAMPLE"));
    // }
    // request.setAttribute("questions", questions);
    // request.setAttribute("answers", answers);

    //    RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/survey.jsp");
    //    requestDispatcher.forward(request, response);
    //}
    
    // @Override
    // protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
    //     this.doGet(request, response);
    // }

//}


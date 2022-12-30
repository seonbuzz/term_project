<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.HashMap"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="./css/all.css" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
    <title>SUN - 설문</title>
  </head>
  <body>

<%
ArrayList<HashMap<String, String>> questions = (ArrayList<HashMap<String, String>>)request.getAttribute("questions");
HashMap<String, String> question = questions.get(0);
String a= question.get("QUESTIONS");
%> 
    <%@ include file="header.jsp" %>
<%=a%>
     
    <div
      class="container border d-flex justify-content-center border-dark rounded form-signin mt-4 p-5"
    >
      <main>
        <form action="./survey_submit.html" method="get">
          <table class="table table-borderless">
                  <% for(int i=0; i<questions.size();i++){
            HashMap<String, String> question = questions.get(i);

             String question = (String)questions.get("QUESTION");
               String question_ID = (String) questions.get("QUESTION_ID");
            int order = (int) questions.get("ORDERS"); %>
           <%}%>
          </table>
          <div class="d-flex justify-content-center">
            <button class="mx-3 w-25 btn btn-warning border-dark" type="submit">
              답안 제출
            </button>
          </div>
        </form>
      </main>
    </div>
    <%@ include file="footer.jsp" %>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>

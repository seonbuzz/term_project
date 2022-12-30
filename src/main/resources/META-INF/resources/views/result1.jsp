<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="com.retoree.term_project.bean.Member" %>
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
    <title>SUN - 통계 : 회원 설문/답문 조회</title>
  </head>
  <body>
<%
ArrayList survey_answer = (ArrayList)request.getAttribute("survey_answer");
ArrayList questions = (ArrayList)request.getAttribute("questions");
Member loginUser = (Member)request.getAttribute("loginUser");
String userName = (String)request.getAttribute("userName");
%> 
    <%@ include file="header.jsp" %>

    <div class="container border border-dark rounded text-center w-100 mt-4">
      <main class="p-5">
        <div class="text-center pb-5"><%= userName%>님의 설문조사 결과입니다.</div>
        <%--  --%>
        <table
          class="table table-primary table-bordered border-dark text-center"
        >
          <thead>
            <tr class="table-light border-dark">
              <th>질문</th>
              <th>답문</th>
            </tr>
          </thead>
          <tbody>
          <% for(int i=0; i<survey_answer.size();i++){
            String answer = (String)survey_answer.get(i);
            HashMap question = (HashMap)questions.get(i);
            %>
            <tr>
              <td><%= question.get("ORDERS")%>. <%= question.get("QUESTIONS")%></td>
              <td>
                <%= answer.charAt(answer.length()-1)%>
                <div><%
                if(answer.length()<4){
                  switch(answer){
                    case "E1":%>
                    (매우 아니다)
                    <%
                    break;
                    case "E2":%>
                    (아니다)
                    <%
                    break;
                    case "E3":%>
                    (보통이다)
                    <%
                    break;
                    case "E4":%>
                    (그렇다)
                    <%
                    break;
                    case "E5":%>
                    (매우 그렇다)
                  <%}
                }else{
                  switch(answer){
                    case "E1-1":%>
                    (무선 이어폰)
                    <%
                    break;
                    case "E1-2":%>
                    (헤드셋)
                    <%
                    break;
                    case "E1-3":%>
                    (유선 이어폰)
                    <%
                    break;
                  }
                }
                %></div>
              </td>
            </tr>
          <% }%>
            
            
          </tbody>
        </table>
        <br /><br /><br />
        
        <table>
          <a class="btn btn-lg btn-warning border-dark" href="/index"
            >메인</a
          >
        </table>
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

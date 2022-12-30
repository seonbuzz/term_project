<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.HashMap"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>SUN - 통계 : 설문자별 통계</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="./css/all.css" />
  </head>
  <body>
<%
ArrayList userNameArr = (ArrayList)request.getAttribute("userNameArr");
HashMap<String, String> survey = (HashMap<String, String>)request.getAttribute("survey");
%>


    <%@ include file="header.jsp" %>

    <div class="container text-center border border-dark rounded bg-white my-4">
      <main class="p-5">
        <div class="pb-5">설문자별 통계입니다.</div>
        <table class="table table-primary table-bordered border-dark">
          <thead>
            <tr class="table-light border-dark">
              <th>회원 아이디</th>
              <th>질문(1)</th>
              <th>질문(2)</th>
              <th>질문(3)</th>
              <th>질문(4)</th>
              <th>질문(5)</th>
            </tr>
          </thead>
          <tbody>
          
            
            
           <% for(int i=0; i<userNameArr.size();i++){
              String userName = (String)userNameArr.get(i); 
               
              %>
              
            <tr>
              <td><%=userName%></td>
              <%for(int k=0; k<5 ;k++){
                String surveyStr = (String)survey.get("U"+(i+1)+"Q"+(k+1));
                %>
                <td><%=surveyStr.charAt(surveyStr.length()-1)%></td>
              <%}%>
            </tr>
            <%}%>


          <%-- <% for(int i=0; i<userNameArr.size();i++){
            String userName = (String)userNameArr.get(i);
            HashMap example_uid = (HashMap)survey_answers.get(i);
            String example_uid_str = (String)example_uid.get("EXAMPLE_UID");
            %>
            <tr>
              <td><%=userName%></td>
              <td><%=example_uid_str%></td>
            </tr>
            <%}%> --%>
          </tbody>
        </table>
        <br /><br /><br />
        <div class="d-flex justify-content-center p-3">
          <a href="./index.html" class="btn btn-lg btn-warning border-dark"
            >메인</a
          >
        </div>
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

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
    <%@ include file="header.jsp" %>
<%
ArrayList<HashMap<String, String>> questions = (ArrayList<HashMap<String, String>>)request.getAttribute("questions");
ArrayList<HashMap<String, String>> examples = (ArrayList<HashMap<String, String>>)request.getAttribute("examples");
%>
    <div
      class="container border d-flex justify-content-center border-dark rounded form-signin mt-4 p-5"
    >
      <main>
        <form action="/surveySubmitServlet" method="get">
          <table class="table table-borderless">
          <%for(int i=0; i<questions.size();i++){
            HashMap<String, String> question = questions.get(i);
            if(i == 0){%>
            <%-- 1번 문항. --%>
            <tr>
              <td>
                <div>
                  <%=question.get("ORDERS")%>. <%=question.get("QUESTIONS")%>
                </div>
                <%for(int j=0; j<examples.size();j++){
                HashMap<String, String> example = examples.get(j);
                if(example.get("QUESTIONS_UID").equals("Q1")){
                  String id = "E1-"+(j+1);
                  String name = question.get("QUESTIONS_UID");
                %>
                <div class="form-check">
                  <input
                    type="radio"
                    class="form-check-input"
                    name="<%=name%>"
                    value="E1-1"
                    id="<%=id%>"
                    required
                  />
                  <label for="<%=id%>" class="form-check-label"
                    >(<%=j+1%>) <%= example.get("EXAMPLE")%></label
                  >
                </div>
                <%}%>
              <%}%>
              </td>
            </tr>
              
              <%}else{%>
                <tr>
              <td>
                <div>
                  <%=question.get("ORDERS")%>. <%=question.get("QUESTIONS")%>
                </div>
                <%-- <div class="form-check form-check-inline"> --%>
                <%for(int j=0; j<examples.size();j++){
                HashMap<String, String> example = examples.get(j);
                if(example.get("QUESTIONS_UID").equals("Q"+(i+1))){
                  String answerNum = example.get("EXAMPLE_UID");
                  String id = example.get("QUESTIONS_UID")+example.get("EXAMPLE_UID");
                  String name = example.get("QUESTIONS_UID");
                %>
                
<%-- answerNum.charAt(answerNum.length()-1) --%>
                <input
                    type="radio"
                    class="form-check-input"
                    name="<%=name%>"
                    id="<%=id%>"
                    value="E1"
                    required
                  />
                  <label for="<%=id%>" class="form-check-label"
                    >(<%=answerNum.charAt(answerNum.length()-1)%>) <%= example.get("EXAMPLE")%></label
                  >
                
                <%}%>
                <%-- </div> --%>
              <%}%>
              </td>
            </tr>
            <%}%>
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

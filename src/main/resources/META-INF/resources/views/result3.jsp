<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.HashMap"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>SUN - 통계 : 질문별 총 답변 수</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="./bootstraps/css/all.css" />
  </head>
  <body>

<%
HashMap<String, String> statistics = (HashMap<String, String>)request.getAttribute("statistics");
%>

    <%@ include file="header.jsp" %>

    <div class="container text-center border border-dark rounded bg-white my-4">
      <main class="p-5">
        <div class="pb-5">질문별 총 답변 수 입니다.</div>
        <table class="table table-primary table-bordered border-dark">
          <thead>
            <tr class="table-light border-dark">
              <th></th>
              <th>답(1)</th>
              <th>답(2)</th>
              <th>답(3)</th>
              <th>답(4)</th>
              <th>답(5)</th>
            </tr>
          </thead>
          <tbody>
            <tr>
            <td>질문(1)</td>
              <%if(statistics.get("Q1E1-1")==null){%>
                <td>0</td>
              <%}else{%>
                <td><%= statistics.get("Q1E1-1")%></td>
              <%}%>
              <%if(statistics.get("Q1E1-2")==null){%>
                <td>0</td>
              <%}else{%>
                <td><%= statistics.get("Q1E1-2")%></td>
              <%}%>
              <%if(statistics.get("Q1E1-3")==null){%>
                <td>0</td>
              <%}else{%>
                <td><%= statistics.get("Q1E1-3")%></td>
              <%}%>
              <td>-</td>
              <td>-</td>
            </tr>
          <%for(int i=0;i<4;i++){%>
            <tr>
              <td>질문(<%=i+2%>)</td>
              
              <%if(statistics.get("Q"+(i+2)+"E1")==null){%>
                <td>0</td>
              <%}else{%>
                <td><%= statistics.get("Q"+(i+2)+"E1")%></td>
              <%}%>

              <%if(statistics.get("Q"+(i+2)+"E2")==null){%>
                <td>0</td>
              <%}else{%>
                <td><%= statistics.get("Q"+(i+2)+"E2")%></td>
              <%}%>

              <%if(statistics.get("Q"+(i+2)+"E3")==null){%>
                <td>0</td>
              <%}else{%>
                <td><%= statistics.get("Q"+(i+2)+"E3")%></td>
              <%}%>

              <%if(statistics.get("Q"+(i+2)+"E4")==null){%>
                <td>0</td>
              <%}else{%>
                <td><%= statistics.get("Q"+(i+2)+"E4")%></td>
              <%}%>

              <%if(statistics.get("Q"+(i+2)+"E5")==null){%>
                <td>0</td>
              <%}else{%>
                <td><%= statistics.get("Q"+(i+2)+"E5")%></td>
              <%}%>

            </tr>
          <%}%>

          </tbody>
        </table>
        <br /><br /><br />
        <div class="d-flex justify-content-center p-3">
          <a href="/index" class="btn btn-lg btn-warning border-dark"
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

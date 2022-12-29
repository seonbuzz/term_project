<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList"%>
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
%> 
    <%@ include file="header.jsp" %>
    <% for(int i=0; i<survey_answer.size();i++){%>
     <div><%=
     survey_answer.get(i)
    %></div>
    <% }%>

    <div class="container border border-dark rounded text-center w-100 mt-4">
      <main class="p-5">
        <div class="text-center pb-5">회원님의 설문조사 결과입니다.</div>

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
            <tr>
              <td>1. 현재 사용중인 제품을 선택해 주세요.</td>
              <td>
                1
                <div>(무선 이어폰)</div>
              </td>
            </tr>
            <td>2. 현재 사용중인 제품의 가격이 적당하다고 생각하십니까?</td>
            <td>
              2
              <div>(아니다)</div>
            </td>
            <tr>
              <td>3. 사용중인 제품의 음향은 만족스러우신가요?</td>
              <td>
                3
                <div>(보통이다)</div>
              </td>
            </tr>
            <td>4. 사용중인 제품의 디자인은 만족스러우신가요?</td>
            <td>
              4
              <div>(그렇다)</div>
            </td>
            <tr>
              <td>5. 사용중인 제품은 사용이 편리한가요?</td>
              <td>
                4
                <div>(그렇다)</div>
              </td>
            </tr>
          </tbody>
        </table>
        <br /><br /><br />
        <table>
          <a class="btn btn-lg btn-warning border-dark" href="./index.html"
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

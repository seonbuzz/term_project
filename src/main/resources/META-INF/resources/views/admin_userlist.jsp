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
    <title>SUN - ADMIN</title>
  </head>
  <body>

    <%@ include file="header.jsp" %>

    <div class="container border border-dark rounded text-center w-100 mt-4">
      <main class="p-5">
        <div class="text-center pb-5">전체 회원을 조회합니다.</div>

        <table
          class="table table-primary table-bordered border-dark text-center"
        >
          <thead>
            <tr class="table-light border-dark">
              <th>UID</th>
              <th>아이디</th>
              <th>비밀번호</th>
              <th>이름</th>
              <th>연락처</th>
              <th>이메일</th>
              <th>설문 여부</th>
              <th>관리자 여부</th>
            </tr>
          </thead>
          <tbody>
            <%
            ArrayList<HashMap> userList = (ArrayList<HashMap>)request.getAttribute("userList");
            for(int i = 0; i < userList.size(); i++){ 
              String users_uid = (String)userList.get(i).get("USERS_UID");
              String id = (String)userList.get(i).get("ID");
              String pwd = (String)userList.get(i).get("PWD");
              String name = (String)userList.get(i).get("NAME");
              String phone = (String)userList.get(i).get("PHONE");
              String email = (String)userList.get(i).get("EMAIL");
              String surveycheck = (String)userList.get(i).get("SURVEYCHECK");
              String auth = (String)userList.get(i).get("AUTH");
              %>
            <tr>
              <td><%= users_uid %></td>
              <td><%= id %></td>
              <td><%= pwd %></td>
              <td><%= name %></td>
              <td><%= phone %></td>
              <td><%= email %></td>
              <td><%= surveycheck %></td>
              <td><%= auth %></td>
            </tr>
          <% } %>
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

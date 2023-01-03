<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.retoree.term_project.dao.FindWithDB " %>
<%
String id = request.getParameter("id");
String email = request.getParameter("email");
String name = request.getParameter("name");
FindWithDB findWithDB = new FindWithDB();
String find = findWithDB.findPwd(id, email, name);
String pwd = (String)session.getAttribute("pwd");

%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <link rel="stylesheet" href="./bootstraps/css/all.css" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
    
    <title>SUN - Success Find Password!</title>
  </head>
  <body>
     <%@ include file="header.jsp" %>
  
   <% if (pwd == null) { %>
    <div
      class="container border border-dark rounded text-center form-signin w-100 mt-4"
    >
      <main class="p-5">
        <div class="row">
          <div class="col-lg-5 col-md-7 mx-auto">
            <form action="/index" method="post">
            
              <div class="text-center p-3">회원님의 비밀번호는 <%=find%>입니다.</div>
       
            
        <div class="text-center">
         <button class="btn btn-warning">
        <a class="text-dark text-decoration-none" href="/loginServlet">로그인 하기</a> </button>
        </div>
</form>

     
      </main>
    </div>
      <% } else { %>
 <div
      class="container border border-dark rounded text-center form-signin w-100 mt-4"
    >
      <main class="p-5">
        <div class="row">
          <div class="col-lg-5 col-md-7 mx-auto">
            <form action="/index" method="post">
            
              <div class="text-center p-3">일치하는 정보가 없습니다.</div>
       
            
        <div class="text-center">
         <button class="btn btn-warning">
        <a class="text-dark text-decoration-none" href="/loginServlet">로그인 하기</a> </button>
        </div>
   <% } %>
      <%@ include file="footer.jsp" %>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>

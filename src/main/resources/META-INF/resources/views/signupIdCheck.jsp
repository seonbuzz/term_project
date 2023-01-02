<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.retoree.term_project.dao.SignupWithDB" %> 
<link
href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
rel="stylesheet"
integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
crossorigin="anonymous"
/>
<link rel="stylesheet" href="./bootstraps/css/all.css" />
<% String id = request.getParameter("user_id");
SignupWithDB db = new SignupWithDB(); 
int result = db.checkId(id);
String msg ="";
if(result == 0) {
    msg = "이미 사용중인 ID입니다."; %>

    <center class="m-4">
        <div class="my-3"><%= msg %></div>
        <a href="javascript:window.close()" class="btn btn-light border-secondary" > 확인 </a>
      </center>

<% } else if(result == 1) {
    msg = "사용 가능한 ID입니다."; %>
    <center class="m-4" >
        <div class="my-3"><%= msg %></div>
        <a href="javascript:window.close()" onclick="setId()" class="btn btn-light border-secondary"> 확인 </a>
      </center>
<% } else { %> 
    msg = "error!";
    <center class="m-4">
        <div class="my-3"><%= msg %></div>
        <a href="javascript:window.close()" class="btn btn-light border-secondary" > 확인 </a>
      </center>
<% } %>


<script>
    function setId(){
        opener.signupForm.idCheck.value = "inCheck";
    }
    </script>
    <script
    src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
    crossorigin="anonymous"
  ></script>
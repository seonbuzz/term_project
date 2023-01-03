<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.retoree.term_project.bean.Member" %>
<% 
Member loginUser = (Member)session.getAttribute("loginUser");
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
    
    <title>SUN - FIND PASSWORD</title>
  </head>
  <body>
     <%@ include file="header.jsp" %>
  
    <div
      class="container border border-dark rounded text-center form-signin w-100 mt-4"
    >
      <main class="p-5">
        <div class="row">
          <div class="col-lg-5 col-md-7 mx-auto">
            <form action="/findPwdServlet" method="post">
              <h2>비밀번호 찾기</h2>
              <div>이름, 가입한 아이디, 이메일을 입력해주세요.</div>
              <div class="input-group pt-4">
                <label for="" class="input-group-text">이름</label>
                <input
                  type="text"
                  class="form-control"
                  name="name"
                  id="name"
                  placeholder="이름을 입력하세요"
                  required
                />
              </div>
              <div class="input-group pt-4">
                <label for="" class="input-group-text">아이디</label>
                <input
                  type="text"
                  class="form-control"
                  name="id"
                  id="id"
                  placeholder="아이디를 입력하세요"
                  required
                />
              </div>
            
              <div class="input-group pt-4">
                <label for="" class="input-group-text">이메일</label>
                <input
                  type="email"
                  class="form-control"
                  name="email"
                  id="email"
                  placeholder="이메일을 입력하세요"
                  required
                />
              </div>
            
          </div>
        </div>
        <div class="pt-4">
          <button class="btn btn-warning" type="submit">비밀번호 찾기</button>
          
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

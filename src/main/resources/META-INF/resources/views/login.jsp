<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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
    <title>SUN - Log In</title>
  </head>
  <body>
     <%@ include file="header.jsp" %>


    <div
      class="container border border-dark rounded text-center form-signin w-100 mt-4"
    >
      <main class="p-5">
        <div class="row">
          <div class="col-lg-5 col-md-7 mx-auto">
            <form action="/jsp/login.me" method="post">
              <div>로그인 화면입니다.</div>
              <div>아이디와 비밀번호를 입력해주세요.</div>
              <div class="input-group pt-4">
                <label for="" class="input-group-text">ID</label>
                <input
                  type="text"
                  class="form-control"
                  name="userID"
                  id=""
                  placeholder="ID를 입력하세요"
                  required
                />
              </div>
              <div class="input-group pt-4">
                <label for="" class="input-group-text">Password</label>
                <input
                  type="password"
                  class="form-control"
                  name="userPwd"
                  id=""
                  placeholder="비밀번호를 입력하세요"
                  required
                />
              </div>
            
          </div>
        </div>
        <div class="pt-4">
          <button class="btn btn-warning" type="submit">로그인</button>
          
        </div>
</form>
        <div class="pt-4">
          회원이 아니신가요?
          <button class="btn btn-sm btn-secondary">
            <a class="text-light text-decoration-none" href="./signup.html">
              회원가입</a
            >
          </button>
        </div>
      </main>

      <%@ include file="footer.jsp" %>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>

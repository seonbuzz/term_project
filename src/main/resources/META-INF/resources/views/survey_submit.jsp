<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.HashMap"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
   <link rel="stylesheet" href="./bootstraps/css/all.css" />
    <title>SUN - 제출 완료</title>
  </head>
  <body>
     <%@ include file="header.jsp" %>

    <div class="container border border-dark rounded bg-white w-100 mt-4">
      <main class="p-5">
        <div class="text-center p-3">답변 제출이 완료되었습니다.</div>
        <div class="text-center p-3">감사합니다.</div>

        <div class="d-flex justify-content-center p-3">
          <a href="./index.html" class="btn btn-sm btn-light border-dark"
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

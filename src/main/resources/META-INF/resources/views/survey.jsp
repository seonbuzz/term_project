<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.HashMap, java.util.ArrayList" %>
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
    <header
      style="
        background-color: RGB(222, 220, 238);
        color: RGB(106, 96, 169);
        font-weight: 800;
      "
    >
      <nav class="navbar">
        <div class="container-fluid my-2 mx-5 align-items-start">
          <a href="./index.html" class="nav-link fs-5" style="width: 25%"
            >이어폰 만족도 조사</a
          >
          <a href="./index.html" class="nav-link fs-5" style="width: 15%"
            >HOME</a
          >
          <a href="./survey.html" class="nav-link fs-5" style="width: 15%"
            >설문</a
          >
          <div style="width: 15%">
            <a
              href="#collapseId"
              class="navbar-toggler border-0 text-decoration-none fs-5 btn"
              data-bs-toggle="collapse"
              style="color: RGB(106, 96, 169); font-weight: 800"
              >통계</a
            >
            <div class="collapse navbar-collapse" id="collapseId">
              <div class="navbar-nav">
                <a
                  href="./result1.html"
                  class="nav-link"
                  style="color: RGB(106, 96, 169)"
                  >회원 설문/답문 조회</a
                >
                <a
                  href="./result2.html"
                  class="nav-link"
                  style="color: RGB(106, 96, 169)"
                  >설문자별 통계</a
                >
                <a
                  href="./result3.html"
                  class="nav-link"
                  style="color: RGB(106, 96, 169)"
                  >질문별 총 답변 수</a
                >
              </div>
            </div>
          </div>
          <a href="./login.html" class="nav-link fs-5" style="width: 15%"
            >로그인</a
          >
        </div>
      </nav>
    </header>

    <div
      class="container border d-flex justify-content-center border-dark rounded form-signin mt-4 p-5"
    >
      <main>
        <form action="./survey_submit.html" method="get">
          <table class="table table-borderless">
          <%-- <tr>부터 --%>
          <%
          Array 
          %>
           <%-- </tr>까지 --%>
          </table>
          <div class="d-flex justify-content-center">
            <button class="mx-3 w-25 btn btn-warning border-dark" type="submit">
              답안 제출
            </button>
          </div>
        </form>
      </main>
    </div>
    <footer
      class="fixed-bottom"
      style="
        background-color: RGB(222, 220, 238);
        color: RGB(106, 96, 169);
        font-weight: 800;
      "
    >
      <nav class="navbar">
        <div class="container-fluid navbar-brand d-flex justify-content-center">
          KH Toy Project- Team SUN
        </div>
      </nav>
    </footer>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>

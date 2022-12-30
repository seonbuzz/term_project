<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.retoree.term_project.dao.SignupWithDB" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />

    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>SUN - 이어폰 만족도 조사</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="./css/all.css" />
  </head>
  <body>
    <%@ include file="header.jsp" %>

    <div class="container border border-dark rounded bg-white  my-4">
      <main class="p-5">
      <div class="fs-3 text-center">회원가입</div>
      <hr />
      <form action="/SignUpSubmitServlet" method="post" name="signupForm">
        <table class="table table-borderless">
          <tr>
            <th scope="row">아이디</th>
            <td scope="col">
              <div class="d-flex">
                <input
                  type="text"
                  name="user_id"
                  id="user_id"
                  class="form-control w-50 mx-2"
                  required
                />

                <button
                  type="button"
                  class="btn btn-light border-secondary"
                  onclick="alert('')"
                >
                  중복확인
                </button>
              </div>

              <div class="small mx-2 my-1">
                6~16자까지 영문자(소문자), 숫자 사용 가능합니다.
              </div>
            </td>
          </tr>
          <tr>
            <th scope="row">비밀번호</th>
            <td scope="col">
              <input
                type="password"
                name="user_pw"
                id="user_pw"
                class="form-control w-50 mx-2"
                required
              />
              <div class="small mx-2 my-1">
                6~16자까지 영문자(대소문자), 숫자 및 특수문자 사용 가능합니다.
              </div>
            </td>
          </tr>
          <tr>
            <th scope="row">비밀번호 확인</th>
            <td scope="col">
              <input
                type="password"
                name="user_pw_confirm"
                id="user_pw_confirm"
                class="form-control w-50 mx-2"
                required
              />
            </td>
          </tr>
          <tr>
            <th scope="row">이름</th>
            <td scope="col">
              <input
                type="text"
                name="user_name"
                id="user_name"
                class="form-control w-50 mx-2"
                required
              />
            </td>
          </tr>
          <tr>
            <th scope="row">전화번호</th>
            <td scope="col">
              <div class="d-flex">
                <select
                  class="form-select mx-2"
                  style="width: 5rem"
                  aria-label=""
                  name="number_first"
                  id="number_first"
                  required
                >
                  <option value="010">010</option>
                  <option value="010">02</option>
                  <option value="010">031</option>
                  <option value="010">070</option>
                </select>
                <div class="fs-4">-</div>
                <input
                  type="text"
                  name="number_second"
                  id="number_second"
                  class="form-control mx-2"
                  style="width: 8rem"
                  required
                />
                <div class="fs-4">-</div>
                <input
                  type="text"
                  name="number_third"
                  id="number_third"
                  class="form-control mx-2"
                  style="width: 8rem"
                  required
                />
              </div>
            </td>
          </tr>
          <tr>
            <th scope="row">이메일</th>
            <td scope="col">
              <div class="d-flex">
                <input
                  type="text"
                  name="email_first"
                  id="email_first"
                  class="form-control w-50 mx-2"
                  required
                />
                <div class="fs-5">@</div>
                <input
                  type="text"
                  name="email_second"
                  id="email_second"
                  class="form-control w-50 mx-2"
                />
                <select
                  class="form-select mx-2"
                  style="width: 10rem"
                  aria-label=""
                  name="email_second_choose"
                  id="email_second_choose"
                >
                  <option value="직접 입력">직접 입력</option>
                  <option value="naver.com">naver.com</option>
                  <option value="gmail.com">gmail.com</option>
                  <option value="hanmail.net">hanmail.net</option>
                </select>
              </div>
            </td>
            <tr>
              <th scope="row">정보수신 동의</th>
              <td scope="col">
                <div class="d-flex">
                  <div class="form-check mx-2">
                      <input type="checkbox" class="form-check-input" name="checksms" id="checksms">
                      <label for="checksms">SMS로</label>
                  </div>
                  <div class="form-check mx-2">
                      <input type="checkbox" class="form-check-input" name="checkemail" id="checkemail">
                      <label for="checkemail">이메일로</label>
                  </div>
                  <div>정보를 수신하겠습니다.</div>
                  </div>
            </tr>
          </tr>
        </table>
        <div class="d-flex justify-content-center">
            <button type="reset" class="btn btn-light mx-3 w-25 border-secondary">초기화</button>
            <button type="submit" class="btn btn-warning mx-3 w-25 border-secondary">회원가입</button>
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

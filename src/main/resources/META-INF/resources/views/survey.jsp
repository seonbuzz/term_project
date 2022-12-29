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
   <%@ include file="header.jsp" %>
    
    <div
      class="container border d-flex justify-content-center border-dark rounded form-signin mt-4 p-5"
    >
      <main>
        <form action="./survey_submit.html" method="get">
          <table class="table table-borderless">
                 <%-- 답항,설문 --%>
          <%
          ArrayList<HashMap> answers_list = null;
          answers_list = (ArrayList<HashMap>)request.getAttribute("answers_list");
       
          %>
           
          <% for(int i = 0; i < answers_list.size; i++){
            HashMap<String,Object> questions = (HashMap<String, Object>)answers.get("questions");
            HashMap<String,Object> answers = answers_list.get(i);
         <% }%>

            <div> <%= orders %>. <%= question %> </div>

          <%
          ArrayList<HashMap> answers_list = questions.get("answers_list"); 
          %>
         <tr>
              <td>
                <div>
                  1. 현재 사용중인 제품을 선택해주세요. (답은 한가지만 선택가능)
                </div>
                <div class="form-check">
                  <input
                    type="radio"
                    class="form-check-input"
                    name="flex"
                    id="default-radio"
                    required
                  />
                  <label for="default-radio" class="form-check-label"
                    >(1)무선 이어폰</label
                  >
                </div>
                <div class="form-check">
                  <input
                    type="radio"
                    class="form-check-input"
                    name="flex"
                    id="checked-radio"
                    required
                  />
                  <label for="checked-radio" class="form-check-label"
                    >(2)헤드셋</label
                  >
                </div>
                <div class="form-check">
                  <input
                    type="radio"
                    class="form-check-input"
                    name="flex"
                    id="checked-radio3"
                    required
                  />
                  <label for="checked-radio3" class="form-check-label"
                    >(3)유선 이어폰</label
                  >
                </div>
              </td>
            </tr>
            <tr>
              <td>
                <div>
                  2. 현재 사용중인 제품의 가격이 적당하다고 생각하십니까? (답은
                  한가지만 선택 가능)
                </div>
                <div class="form-check form-check-inline">
                  <input
                    type="radio"
                    class="form-check-input"
                    name="flex2"
                    id="checked2_1"
                    required
                    required
                  />
                  <label for="checked2_1" class="form-check-label"
                    >(1) 전혀 아니다.</label
                  >
                </div>

                <input
                  type="radio"
                  class="form-check-input"
                  name="flex2"
                  id="checked2_2"
                  required
                  required
                />
                <label for="checked2_2" class="form-check-label"
                  >(2)아니다.</label
                >

                <input
                  type="radio"
                  class="form-check-input"
                  name="flex2"
                  id="checked2_3"
                  required
                  required
                />
                <label for="checked2_3" class="form-check-label"
                  >(3)보통이다.</label
                >
                <input
                  type="radio"
                  class="form-check-input"
                  name="flex2"
                  id="checked2_4"
                  required
                  required
                />
                <label for="checked2_4" class="form-check-label"
                  >(4)그렇다.</label
                >
                <input
                  type="radio"
                  class="form-check-input"
                  name="flex2"
                  id="checked2_5"
                  required
                  required
                />
                <label for="checked2_5" class="form-check-label"
                  >(5)매우 그렇다.</label
                >
              </td>
            </tr>
            <tr>
              <td>
                <div>
                  3. 사용중인 제품의 음향은 만족스러우신가요? (답은 한가지만
                  선택 가능)
                </div>
                <div class="form-check form-check-inline">
                  <input
                    type="radio"
                    class="form-check-input"
                    name="flex3"
                    id="checked3_1"
                    required
                  />
                  <label for="checked3_1" class="form-check-label"
                    >(1) 전혀 아니다.</label
                  >
                </div>

                <input
                  type="radio"
                  class="form-check-input"
                  name="flex3"
                  id="checked3_2"
                  required
                />
                <label for="checked3_2" class="form-check-label"
                  >(2)아니다.</label
                >

                <input
                  type="radio"
                  class="form-check-input"
                  name="flex3"
                  id="checked3_3"
                  required
                />
                <label for="checked3_3" class="form-check-label"
                  >(3)보통이다.</label
                >
                <input
                  type="radio"
                  class="form-check-input"
                  name="flex3"
                  id="checked3_4"
                  required
                />
                <label for="checked3_4" class="form-check-label"
                  >(4)그렇다.</label
                >
                <input
                  type="radio"
                  class="form-check-input"
                  name="flex3"
                  id="checked3_5"
                  required
                />
                <label for="checked3_5" class="form-check-label"
                  >(5)매우 그렇다.</label
                >
              </td>
            </tr>
            <tr>
              <td>
                <div>
                  4. 사용중인 제품의 디자인은 만족스러우신가요? (답은 한가지만
                  선택 가능)
                </div>
                <div class="form-check form-check-inline">
                  <input
                    type="radio"
                    class="form-check-input"
                    name="flex4"
                    id="checked4_1"
                    required
                  />
                  <label for="checked4_1" class="form-check-label"
                    >(1) 전혀 아니다.</label
                  >
                </div>

                <input
                  type="radio"
                  class="form-check-input"
                  name="flex4"
                  id="checked4_2"
                  required
                />
                <label for="checked4_2" class="form-check-label"
                  >(2)아니다.</label
                >

                <input
                  type="radio"
                  class="form-check-input"
                  name="flex4"
                  id="checked4_3"
                  required
                />
                <label for="checked4_3" class="form-check-label"
                  >(3)보통이다.</label
                >
                <input
                  type="radio"
                  class="form-check-input"
                  name="flex4"
                  id="checked4_4"
                  required
                />
                <label for="checked4_4" class="form-check-label"
                  >(4)그렇다.</label
                >
                <input
                  type="radio"
                  class="form-check-input"
                  name="flex4"
                  id="checked4_5"
                  required
                />
                <label for="checked4_5" class="form-check-label"
                  >(5)매우 그렇다.</label
                >
              </td>
            </tr>
            <tr>
              <td>
                <div>
                  5. 사용중인 제품은 사용이 편리한가요? (답은 한가지만 선택
                  가능)
                </div>
                <div class="form-check form-check-inline">
                  <input
                    type="radio"
                    class="form-check-input"
                    name="flex5"
                    id="checked5_1"
                    required
                  />
                  <label for="checked5_1" class="form-check-label"
                    >(1) 전혀 아니다.</label
                  >
                </div>

                <input
                  type="radio"
                  class="form-check-input"
                  name="flex5"
                  id="checked5_2"
                  required
                />
                <label for="checked5_2" class="form-check-label"
                  >(2)아니다.</label
                >

                <input
                  type="radio"
                  class="form-check-input"
                  name="flex5"
                  id="checked5_3"
                  required
                />
                <label for="checked5_3" class="form-check-label"
                  >(3)보통이다.</label
                >
                <input
                  type="radio"
                  class="form-check-input"
                  name="flex5"
                  id="checked5_4"
                  required
                />
                <label for="checked5_4" class="form-check-label"
                  >(4)그렇다.</label
                >
                <input
                  type="radio"
                  class="form-check-input"
                  name="flex5"
                  id="checked5_5"
                  required
                />
                <label for="checked5_5" class="form-check-label"
                  >(5)매우 그렇다.</label
                >
              </td>
            </tr>
          
          </table>
          <div class="d-flex justify-content-center">
            <button class="mx-3 w-25 btn btn-warning border-dark" type="submit">
              답안 제출
            </button>
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
<%-- <% ArrayList<HashMap> question = (ArrayList<HashMap>)request.getAttribute("question");
      ArrayList<HashMap> answer = (ArrayList<HashMap>) request.getAttribute("answer"); 
    %>


    <main class="d-flex align-items-center mt-5" style="height: 40rem">
      <div class="container">
        <form action="./index.html">
          <div class="mb-3">
            <% for(int i=0;i<question.size();i++){ 
              HashMap<String, Object> questions_list = question.get(i);%>
            <div class="border bg-primary bg-opacity-10 mb-1 p-1 rounded"><%= (i+1) %>. <%= questions_list.get("QUESTION") %></div>
            <div class="row">
              <div class="col">
                <% for(int j=0;j<answer.size();j++){ 
                HashMap<String, Object> answers_list = answer.get(j);%>
                <input type="radio" class="form-check-input" name="survey_<%= (i+1) %>" id="radio<%= (i+1) %>-<%= (j+1) %>" value="survey<%= (i+1) %>-<%= (j+1) %>" />
                <label for="radio<%= (i+1) %>-<%= (j+1) %>" class="form-check-label"> (<%= (j+1) %>)<%= answers_list.get("ANSWER") %></label>
                <% } %>
              </div>
            </div>
            <% } %>
            <div class="d-flex justify-content-center mt-5">
              <button type="submit" class="btn bg-primary bg-opacity-10">제출하기</button>
            </div>
          </div>
        </form>
      </div>
    </main>


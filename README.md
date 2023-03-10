# 'ReToRee' Servlets With DB Project

## 📃콘텐츠 : 이어폰 관련 서비스 만족도에 관한 설문조사 폼

### 프로젝트 성격(업무 시나리오)

### 개발 기간

- 2022년 12월 27일~ 2023년 1월 3일

### 구현 영상

- [이어폰 폼 구현 영상](https://www.youtube.com/watch?v=hut0kScLikg&ab_channel=DEVELOP)

## Members

### 👩‍💻 김해인 : 회원가입, 회원조회

1. JSP

   -[ signup.jsp](https://github.com/seonbuzz/term_project/blob/master/src/main/resources/META-INF/resources/views/signup.jsp)

   -[ signupIdCheck.jsp](https://github.com/seonbuzz/term_project/blob/master/src/main/resources/META-INF/resources/views/signupIdCheck.jsp)

   -[ signup_submit.jsp](https://github.com/seonbuzz/term_project/blob/master/src/main/resources/META-INF/resources/views/signup_submit.jsp)

   -[ admin_userlist.jsp](https://github.com/seonbuzz/term_project/blob/master/src/main/resources/META-INF/resources/views/admin_userlist.jsp)

2. DB

   -[ AdminWithDB.java](https://github.com/seonbuzz/term_project/blob/master/src/main/java/com/retoree/term_project/dao/AdminWithDB.java)

   -[ SignupWithDB.java](https://github.com/seonbuzz/term_project/blob/master/src/main/java/com/retoree/term_project/dao/SignupWithDB.java)

3. Servlet

   -[ SignUpServlet.java](https://github.com/seonbuzz/term_project/blob/master/src/main/java/com/retoree/term_project/servlets/SignUpServlet.java)

   -[ SignUpSubmitServlet.java](https://github.com/seonbuzz/term_project/blob/master/src/main/java/com/retoree/term_project/servlets/SignUpSubmitServlet.java)

   -[ AdminUserListServlet.java](https://github.com/seonbuzz/term_project/blob/master/src/main/java/com/retoree/term_project/servlets/admin/AdminUserListServlet.java)

### 👩‍💻 윤선아 : 로그인/로그아웃, 아이디/비밀번호 찾기, 에러페이지

1. JSP

   -[ login.jsp](https://github.com/seonbuzz/term_project/blob/master/src/main/resources/META-INF/resources/views/login.jsp)

   -[ errorPage.jsp](https://github.com/seonbuzz/term_project/blob/master/src/main/resources/META-INF/resources/views/errorPage.jsp)

   -[ errorPage4.jsp](https://github.com/seonbuzz/term_project/blob/master/src/main/resources/META-INF/resources/views/errorPage4.jsp)
   
   -[ findId.jsp](https://github.com/seonbuzz/term_project/blob/master/src/main/resources/META-INF/resources/views/findId.jsp)
   
   -[ findId_success.jsp](https://github.com/seonbuzz/term_project/blob/master/src/main/resources/META-INF/resources/views/findId_success.jsp)
   
   -[ findPwd.jsp](https://github.com/seonbuzz/term_project/blob/master/src/main/resources/META-INF/resources/views/findPwd.jsp)
   
   -[ findPwd_success.jsp](https://github.com/seonbuzz/term_project/blob/master/src/main/resources/META-INF/resources/views/findPwd_success.jsp)

2. DB

   -[ Member.java](https://github.com/seonbuzz/term_project/blob/master/src/main/java/com/retoree/term_project/Bean/Member.java)

   -[ LoginWithDB.java](https://github.com/seonbuzz/term_project/blob/master/src/main/java/com/retoree/term_project/dao/LoginWithDB.java)
   
    -[ FindWithDB.java](https://github.com/seonbuzz/term_project/blob/master/src/main/java/com/retoree/term_project/dao/FindWithDB.java)

3. Servlet

   -[ LoginServlet.java](https://github.com/seonbuzz/term_project/blob/master/src/main/java/com/retoree/term_project/servlets/LoginServlet.java)
   
   -[ FindIdServlet.java](https://github.com/seonbuzz/term_project/blob/master/src/main/java/com/retoree/term_project/servlets/FindIdServlet.java)
   
   -[ FindPwdServlet.java](https://github.com/seonbuzz/term_project/blob/master/src/main/java/com/retoree/term_project/servlets/FindPwdServlet.java)

4. Controller

   -[ LoginController.java](https://github.com/seonbuzz/term_project/blob/master/src/main/java/com/retoree/term_project/member/controller/LoginController.java)

   -[ LogoutController.java](https://github.com/seonbuzz/term_project/blob/master/src/main/java/com/retoree/term_project/member/controller/LogoutController.java)

### 👩‍💻 박병주 : 통계(회원/설문자별/질문별), 메인, 에러페이지

1. JSP

   -[result1.jsp](https://github.com/seonbuzz/term_project/blob/master/src/main/resources/META-INF/resources/views/result1.jsp)

   -[result2.jsp](https://github.com/seonbuzz/term_project/blob/master/src/main/resources/META-INF/resources/views/result2.jsp)

   -[result3.jsp](https://github.com/seonbuzz/term_project/blob/master/src/main/resources/META-INF/resources/views/result3.jsp)

   -[errorPage2.jsp](https://github.com/seonbuzz/term_project/blob/master/src/main/resources/META-INF/resources/views/errorPage2.jsp)

   -[errorPage3.jsp](https://github.com/seonbuzz/term_project/blob/master/src/main/resources/META-INF/resources/views/errorPage3.jsp)

2. DB

   -[Member.java](https://github.com/seonbuzz/term_project/blob/master/src/main/java/com/retoree/term_project/Bean/Member.java)

   -[StatisticsWithDB.java](https://github.com/seonbuzz/term_project/blob/master/src/main/java/com/retoree/term_project/dao/StatisticsWithDB.java)

3. Servlet

   -[HomeServlet.java](https://github.com/seonbuzz/term_project/blob/master/src/main/java/com/retoree/term_project/servlets/HomeServlet.java)

   -[StatisticsPrintUserServeyServlet.java](https://github.com/seonbuzz/term_project/blob/master/src/main/java/com/retoree/term_project/servlets/StatisticsPrintUserServeyServlet.java)

   -[StatisticsServeyServlet.java](https://github.com/seonbuzz/term_project/blob/master/src/main/java/com/retoree/term_project/servlets/StatisticsServeyServlet.java)

   -[StatisticsUsersServeyServlet.java](https://github.com/seonbuzz/term_project/blob/master/src/main/java/com/retoree/term_project/servlets/StatisticsUsersServeyServlet.java)

### 👩‍💻 김다솜 : 설문

1. JSP

   -[survey.jsp](https://github.com/seonbuzz/term_project/blob/master/src/main/resources/META-INF/resources/views/survey.jsp)

   -[survey_submit.jsp](https://github.com/seonbuzz/term_project/blob/master/src/main/resources/META-INF/resources/views/survey_submit.jsp)

   -[completeSurvey.jsp](https://github.com/seonbuzz/term_project/blob/master/src/main/resources/META-INF/resources/views/completeSurvey.jsp)

2. DB

   -[SurveyWithDB.java](https://github.com/seonbuzz/term_project/blob/master/src/main/java/com/retoree/term_project/dao/SurveyWithDB.java)

3. Servlet

   -[SurveyServlet.java](https://github.com/seonbuzz/term_project/blob/master/src/main/java/com/retoree/term_project/servlets/SurveyServlet.java)

   -[SurveySubmitServlet.java](https://github.com/seonbuzz/term_project/blob/master/src/main/java/com/retoree/term_project/servlets/SurveySubmitServlet.java)

## 주요 코드

- 해인

```
<!-- 중복 체크 여부 -->
<input type="hidden" name="idCheck" value = "idUnCheck">
```

아이디 중복 체크 여부를 체크하기 위해 hidden값 부여

```
if(request.getAttribute("idCheck") == 1) {
document.signupForm.idCheck.value = "idCheck"
```

아이디 중복 체크 결과 사용 가능한 아이디일 경우 idCheck로 값 변경

```
<form action="/SignUpSubmitServlet" method="post" name="signupForm" onsubmit="return submitForm()">

      (생략)

function submitForm() {
        if(document.signupForm.user_id.value.length < 6  || document.signupForm.user_id.value.length > 16){
          alert("아이디는 6자~16자까지 사용 가능합니다.");
          return false;
        } else if (document.signupForm.idCheck.value == "idUnCheck") {
          alert("아이디 중복체크 필수입니다.");
        } else if(document.signupForm.user_pw.value != document.signupForm.user_pw_confirm.value) {
          alert("비밀번호가 일치하지 않습니다.");
          return false;
        } else if(document.signupForm.user_pw.value.length < 6  || document.signupForm.user_pw.value.length > 16) {
          alert("비밀번호는 6자~16자까지 사용 가능합니다.");
          return false;
        } else {
          return true;
        }
      }
```

onsubmit을 이용해 회원가입 폼 제출 시 아이디 중복체크 여부 및 기타 값 설정 확인

- 선아

```
조회결과가 없음 -> errorPage 이동 / 조회결과 있음 -> 메인 페이지 응답
         if (loginUser == null) {
          RequestDispatcher view = request.getRequestDispatcher("views/errorPage.jsp");
          view.forward(request, response);

           } else {

            // loginUser를 session 처리

           session.setAttribute("loginUser", loginUser);
           session.setAttribute("auth", loginUser.getAuth());

           RequestDispatcher view = request.getRequestDispatcher("views/welcome.jsp");
           view.forward(request, response);
          }
```

세션을 체크해서 로그인 여부, 권한 체크
서블릿의 session과 dispatcher의 두가지 기능으로 기능을 구현

- 병주

```

if (loginUser == null){
            requestDispatcher = request.getRequestDispatcher("/views/errorPage3.jsp");
            requestDispatcher.forward(request, response);
        }else{
            if(loginUser.getAuth().equals("YES")){
                requestDispatcher = request.getRequestDispatcher("/views/result2.jsp");
                request.setAttribute("loginData", httpSession.getAttribute("loginUser"));
                request.setAttribute("userNameArr", userNameArr);
                request.setAttribute("survey", survey);
                requestDispatcher.forward(request, response);
            }else{
                requestDispatcher = request.getRequestDispatcher("/views/errorPage4.jsp");
                requestDispatcher.forward(request, response);
            }

        }

```

- 다솜

```
if (loginUser == null){
            requestDispatcher = request.getRequestDispatcher("/views/errorPage3.jsp");
            requestDispatcher.forward(request, response);

        }else{
            if(loginUser.getSurveyCheck().equals("YES")){
                //설문 진행시
                System.out.println();

                requestDispatcher = request.getRequestDispatcher("/views/completeSurvey.jsp");
            }else if(loginUser.getSurveyCheck().equals("NO")){
                //설문 미 진행시
                System.out.println();
                request.setAttribute("questions", questions);
                request.setAttribute("examples", examples);
                requestDispatcher = request.getRequestDispatcher("/views/survey.jsp");
            }
            System.out.println();
            requestDispatcher.forward(request, response);
        }

```

로그인 여부 체크 후 설문 진행 판단

## 프로젝트를 통해 느낀 점

- 해인

  > 먼저 프로젝트를 시작할 때 코로나에 걸려서 초반에 참여를 하지 못했는데, 이를 이해해주고 배려해준 팀원들에게 고마움을 많이 느꼈습니다.
  > 애매모호하게 느껴졌던 서블렛의 기능이 프로젝트를 통해 더 와닿게 되었고, DB에 데이터가 들어가는게 보여서 진짜 뭔가를 하고 있다는 느낌이 들었습니다.

- 선아

  > 모든 홈페이지의 필수 기능인 로그인을 구현하게 되었습니다. 하나의 데이터를 관리하고 처리할 수 있는 beans를 활용하여 좀 더 쉽게 구현할 수 있었습니다.
  > 화면단에서 if문을 써서 로그인 전에는 로그인 화면을, 로그인 후에는 로그인 유저 정보가 뜨는 화면을 구현하고 싶었으나 if문 처리를 하면 로그인 화면이 두 번 나타나게 되어 곤혹을 겪었습니다. 이에 팀원들과 공유한 뒤 로그인 후 화면페이지를 따로 작성하는 것으로 수정하였습니다. 이러한 점들로 프로젝트를 할 때 팀원들과의 커뮤니케이션과 문제점 공유가 중요하다는 것을 깨달았습니다.

- 병주

  > 머릿속에서 복잡하게 얽혀있었던 서블렛의 각 기능들의 내용이 프로젝트를 진행하면서 정리되는 느낌이였습니다. 페이지를 이동하며 데이터가 어떻게 흘러야할지에 대한 다양한 생각을 해볼 수 있었던 기회였습니다.

- 다솜
  > 그전에 해왔던 프로젝트에 반해 상당히 난이도가 있었던 프로젝트였으며 파이널
  > 프로젝트를 위해 더욱 열심히 공부해야겠다고 느꼈고 많은 도움을 준 조원들에게 매우 감사함을 느끼게 해 준 한 주였던거 같다.

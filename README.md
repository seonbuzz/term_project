# 'ReToRee' Servlets With DB Project

## 📃콘텐츠 : 이어폰 관련 서비스 만족도에 관한 설문조사 폼

### 프로젝트 성격(업무 시나리오)

### 개발 기간

- 2022년 12월 27일~ 2023년 1월 3일

### 구현 영상
- [이어폰 폼 구현 영상](링크 추가 필요)

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

### 👩‍💻 윤선아 : 로그인/로그아웃, 에러페이지
1. JSP

    -[ login.jsp](https://github.com/seonbuzz/term_project/blob/master/src/main/resources/META-INF/resources/views/login.jsp)
    
    -[errorPage.jsp](https://github.com/seonbuzz/term_project/blob/master/src/main/resources/META-INF/resources/views/errorPage.jsp)

    -[ errorPage4.jsp](https://github.com/seonbuzz/term_project/blob/master/src/main/resources/META-INF/resources/views/errorPage4.jsp)

2. DB

    -[ Member.java](https://github.com/seonbuzz/term_project/blob/master/src/main/java/com/retoree/term_project/Bean/Member.java)
    
    -[ LoginWithDB.java](https://github.com/seonbuzz/term_project/blob/master/src/main/java/com/retoree/term_project/dao/LoginWithDB.java)

3. Servlet

    -[ LoginServlet.java](https://github.com/seonbuzz/term_project/blob/master/src/main/java/com/retoree/term_project/servlets/LoginServlet.java)
    
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
```

- 병주
```
```

- 다솜
```
```

## 프로젝트를 통해 느낀 점
- 해인

- 선아

- 병주

- 다솜

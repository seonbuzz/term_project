<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header style='
        background-color: RGB(222, 220, 238);
        color: RGB(106, 96, 169);
        font-weight: 800;
      '>
        <nav class='navbar'>
            <div class='container-fluid my-2 mx-5 align-items-start'>
                <a href='./index' class='nav-link fs-5' style='width: 25%'>이어폰 만족도 조사</a>
                <a href='./index' class='nav-link fs-5' style='width: 15%'>HOME</a>
                <a href='./surveyServlet' class='nav-link fs-5' style='width: 15%'>설문</a>
                <div style='width: 15%'>
                    <a href='#collapseId' class='navbar-toggler border-0 text-decoration-none fs-5 btn'
                        data-bs-toggle='collapse' style='color: RGB(106, 96, 169); font-weight: 800'>통계</a>
                    <div class='collapse navbar-collapse' id='collapseId'>
                        <div class='navbar-nav'>
                            <a href='/statisticsPrintUserServeyServlet' class='nav-link' style='color: RGB(106, 96, 169)'>회원 설문/답문 조회</a>
                            <a href='./statisticsUsersServeyServlet' class='nav-link' style='color: RGB(106, 96, 169)'>설문자별 통계</a>
                            <a href='./statisticsServeyServlet' class='nav-link' style='color: RGB(106, 96, 169)'>질문별 총 답변 수</a>
                        </div>
                    </div>
                </div>
                <a href='./loginServlet' class='nav-link fs-5' style='width: 15%'>로그인</a>
            </div>
        </nav>
    </header>
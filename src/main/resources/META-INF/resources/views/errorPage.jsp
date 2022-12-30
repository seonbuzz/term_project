<%@ page contentType="text/html;charset=UTF-8" language="java"
pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body>
    <%@ include file="header.jsp"%>
    <h1 align="center" style="color: red">
      <%= request.getAttribute("errorMsg") %>
    </h1>
    <%@ include file="footer.jsp"%>
  </body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 22/06/2022
  Time: 8:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/dictionary" method="post">
    <lable>Từ điển</lable>
    <input name="dictionary" type="text">
    <button type="submit">Search</button>
  </form>
  <p>Result : ${vocabulary}</p>
  <p>${message}</p>
  </body>
</html>

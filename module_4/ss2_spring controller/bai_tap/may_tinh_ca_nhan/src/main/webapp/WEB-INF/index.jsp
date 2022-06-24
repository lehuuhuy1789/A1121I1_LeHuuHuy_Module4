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
  <form action="/caculator" method="post">
    <lable>Caculator:</lable>
    <br>
    <input name="caculator1" type="text">
    <input name="caculator2" type="text"></br>
    <button type="submit" name="match" value="+">Addition(+)</button>
    <button type="submit" name="match" value="-">Subtraction(-)</button>
    <button type="submit" name="match" value="*">Multiplication(*)</button>
    <button type="submit" name="match" value="/">Division(/)</button>
  </form>
  <p>Result : ${result}</p>
  <p>${message}</p>
  </body>
</html>

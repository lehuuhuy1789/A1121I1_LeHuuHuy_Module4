<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24/06/2022
  Time: 6:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/condiment" method="post">
    <lable>Sandwich Condiments</lable>
  </br>
    <input type="checkbox" name="condiment" value="Lettuce">
    <input type="checkbox" name="condiment" value="Tomato">
    <input type="checkbox" name="condiment" value="Mustard">
    <input type="checkbox" name="condiment" value="Sprouts"></br>
    <button type="submit">save</button>
  </form>

  <c:forEach items="${condiment}" var="condiment">
    <p>${condiment}</p>
  </c:forEach>
  </body>
</html>

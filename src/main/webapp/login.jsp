<%--
  Created by IntelliJ IDEA.
  User: brettcrawford
  Date: 5/28/21
  Time: 9:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>

<%@include file="partials/common_navbar.jsp"%>

<form method="POST" action="login.jsp">

    <div>

        <label for="username">Username: </label>
        <input type="text" id="username" name="username">

    </div>

    <div>

        <label for="password">Password: </label>
        <input type="password" id="password" name="password">

    </div>

    <button type="submit">Submit</button>

</form>

<c:choose>


    <c:when test="${param.username == \"admin\" && param.password == \"password\"}">

        <c:redirect url="Profile.jsp"> </c:redirect>

    </c:when>


</c:choose>

</body>
</html>

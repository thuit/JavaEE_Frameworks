<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index page</title>
</head>
<body>
<h1>Index Page</h1>
<form action="/user/login" method="post">
    username <input name="username"><br>
    password <input type="password" name="password"><br>
    <input type="submit" value="login">
</form>
<em style="color: #f00; ">${requestScope.message}</em><br>
<a href="/signup.jsp">sign up</a>
</body>
</html>
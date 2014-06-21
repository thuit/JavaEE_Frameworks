<%@ page import="java.util.Date" %>
<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index page</title>
</head>
<body>
<h1>Index page</h1>
<form action="user_login" method="post">
    username: <input name="user.username"><br>
    password: <input type="password" name="user.password"><br>
    <input type="submit" value="LOGIN">
</form>
<em style="color: #f00;">${requestScope.message}</em><br>
<a href="signup.jsp">SIGN UP</a>
</body>
</html>
<%@ page import="java.util.Date" %>
<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index page</title>
</head>
<body>
<h1>Index page</h1>
<form action="login" method="post">
    username: <input name="username"><br>
    password: <input type="password" name="password"><br>
    <input type="submit" value="LOGIN">
</form>
<a href="signup.jsp">SIGN UP</a>
</body>
</html>
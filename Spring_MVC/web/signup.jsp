<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-6-29
  Time: 上午11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>sign up page</title>
</head>
<body>
<h1>Sign Up Page</h1>
<form action="/user/signup" method="post">
    username <input name="username"><br>
    password <input type="password" name="password"><br>
    <input type="submit" value="sign up">
</form>
</body>
</html>

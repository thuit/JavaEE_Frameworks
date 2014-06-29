<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-6-29
  Time: 下午3:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>home page</title>
</head>
<body>
<h1>Home Page</h1>
${sessionScope.user.username}<br>
${sessionScope.user.password}<br>
${sessionScope.user.id}<br>
<a href="/user/logout">logout</a>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-6-21
  Time: 上午10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>home page</title>
</head>
<body><c:if test="${sessionScope.user eq null}"><c:redirect url="index.jsp" /></c:if>
<h1>Home page</h1>
${sessionScope.user.username}<br>
<a href="user_logout">Logout</a>
</body>
</html>

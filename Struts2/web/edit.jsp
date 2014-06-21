<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-6-21
  Time: 下午4:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>edit page</title>
</head>
<body>
<h1>Edit page</h1>
<form action="book_update" method="post">
    <input type="hidden" name="book.id" value="${sessionScope.book.id}">
    title: <input name="book.title" value="${sessionScope.book.title}"><br>
    author: <input name="book.author" value="${sessionScope.book.author}"><br>
    amount: <input name="book.amount" value="${sessionScope.book.amount}"><br>
    <input type="submit" value="UPDATE">
</form>
</body>
</html>

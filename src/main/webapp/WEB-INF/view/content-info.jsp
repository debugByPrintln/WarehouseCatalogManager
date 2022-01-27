<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 27.01.2022
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Content info</title>
    <style><%@include file="/WEB-INF/view/css/style.css"%></style>
</head>
<body>
<h1>Type content info:</h1>
<br>
<form:form action="addContent" modelAttribute="content">
    <form:hidden path="id"/>

    Name: <form:input path="name"/>
    <br>
    Description: <form:input path="description"/>
    <br>
    Price: <form:input path="price"/>
    <br>
    Seller: <form:input path="seller"/>
    <br>
    Seller email: <form:input path="sellerMail"/>
    <br>
    <input type="submit" value="Add">
</form:form>
</body>
</html>

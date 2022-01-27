<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 27.01.2022
  Time: 21:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All content</title>
    <style><%@include file="/WEB-INF/view/css/style.css"%></style>
</head>
<body>
<h1>All content</h1>
<br>
<table>
    <tr>
        <th>Name</th>
        <th>Description</th>
        <th>DateOfAdd</th>
        <th>Price</th>
        <th>Seller</th>
        <th>Seller email</th>
        <th>Operations</th>
    </tr>

    <c:forEach var="tmp" items="${allContent}">
        <c:url var="updateButton" value="/updateContent">
            <c:param name="contentId" value="${tmp.id}"/>
        </c:url>
        <c:url var="deleteButton" value="/deleteContent">
            <c:param name="contentId" value="${tmp.id}"/>
        </c:url>
        <tr>
            <td>${tmp.name}</td>
            <td>${tmp.description}</td>
            <td>${tmp.dateOfAdd}</td>
            <td>${tmp.price}</td>
            <td>${tmp.seller}</td>
            <td>${tmp.sellerMail}</td>
            <td>
                <input type="button" value="Update" onclick="window.location.href = '${updateButton}'"/>
                <input type="button" value="Delete" onclick="window.location.href = '${deleteButton}'"/>
            </td>
        </tr>
    </c:forEach>
</table>
<br>
<input type="button" value="add" onclick="window.location.href = 'addNewContent'"/>
</body>
</html>

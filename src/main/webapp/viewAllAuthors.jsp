<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>All Authors</title>
</head>
<body>
    <h1>All Authors</h1>
    <ul>
        <c:forEach var="author" items="${allAuthors}">
            <li>${author.name}</li>
        </c:forEach>
    </ul>
    <a href="index.html">Back to Home</a>
</body>
</html>
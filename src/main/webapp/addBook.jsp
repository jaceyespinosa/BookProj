<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add New Book</title>
</head>
<body>
    <h1>Add New Book</h1>
    <form action="addBookServlet" method="post">
        Book Title: <input type="text" name="bookTitle" required><br>
        Author: 
        <select name="authorId">
            <c:forEach var="author" items="${allAuthors}">
                <option value="${author.id}">${author.name}</option>
            </c:forEach>
        </select><br>
        <input type="submit" value="Add Book">
    </form>
    <a href="index.html">Back to Home</a>
</body>
</html>
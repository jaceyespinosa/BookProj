<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>All Books</title>
</head>
<body>
    <h1>All Books</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Book Title</th>
                <th>Author</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="book" items="${allBooks}">
                <tr>
                    <td>${book.title}</td>
                    <td>${book.author.name}</td>
                    <td><a href="deleteBookServlet?bookId=${book.id}">Delete</a>
            </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="index.html">Back to Home</a>
</body>
</html>
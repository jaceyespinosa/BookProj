<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add New Author</title>
</head>
<body>
    <h1>Add New Author</h1>
    <form action="addAuthorServlet" method="post">
        Author Name: <input type="text" name="authorName" required>
        <input type="submit" value="Add Author">
    </form>
    <a href="index.html">Back to Home</a>
</body>
</html>
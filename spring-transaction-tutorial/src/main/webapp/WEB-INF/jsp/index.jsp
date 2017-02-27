<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Dummy Page</title>
</head>
<body>
<ul>
    <c:forEach var="i" items="${info}">
        <li>${i}</li>
    </c:forEach>
</ul>
</body>
</html>

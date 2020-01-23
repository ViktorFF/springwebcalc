<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Web Calculator - Users</title>
</head>
<body>
<header>
    <h1>Users</h1>
</header>
<main>
    <form action="${pageContext.request.contextPath}/calculator" method="get">
        <button type="submit">Back</button>
    </form>
    <c:forEach var="user" items="${users}">
        <form action="/users/${user.id}" method="get">
            <button type="submit" name="user" value="${user.id}">${user.nickname}</button>
        </form>
    </c:forEach>
</main>
</body>
</html>
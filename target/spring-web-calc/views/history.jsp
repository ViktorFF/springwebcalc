<%@ page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Web Calculator - History</title>
</head>
<body>
<header>
    <h1>History</h1>
</header>
<main>
    <form action="${pageContext.request.contextPath}/calculator" method="get">
        <button type="submit">Back</button>
    </form>
    <c:if test="${historyFlag}">
    <b>History is empty!
        </c:if>
        <c:if test="${!historyFlag}">
        <ul>
            <c:forEach var="event" items="${history}">
                <li>${event}</li>
            </c:forEach>
        </ul>
        </c:if>
</main>
</body>
</html>

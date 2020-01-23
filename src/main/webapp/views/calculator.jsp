<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Web Calculator</title>
</head>
<body>
<header>
    <h1>Welcome to Web Calculator</h1>
</header>
<main>
    <form action="${pageContext.request.contextPath}/profile" method="get">
        <button type="submit">My Profile</button>
    </form>
    <form action="${pageContext.request.contextPath}/users" method="get">
        <button type="submit">All Users</button>
    </form>
    <form action="${pageContext.request.contextPath}/logout" method="get">
        <button type="submit">Logout</button>
    </form>
<%--    <form action="${pageContext.request.contextPath}/calculator" method="post">--%>
<%--        <p>--%>
<%--            <label>A:--%>
<%--                <input type="text" name="firstElement" required>--%>
<%--            </label>--%>
<%--        </p>--%>
<%--        <p>--%>
<%--            <label>B:--%>
<%--                <input type="text" name="secondElement" required>--%>
<%--            </label>--%>
<%--        </p>--%>
<%--        <p>Result: ${result}</p>--%>
<%--        <p>--%>
<%--            <button name="operationType" value="sum">+</button>--%>
<%--            <button name="operationType" value="sub">-</button>--%>
<%--            <button name="operationType" value="mult">*</button>--%>
<%--            <button name="operationType" value="div">:</button>--%>
<%--        </p>--%>
<%--    </form>--%>
    <s:form action="/calculator" method="post" modelAttribute="operation">
        <p>A:<s:input path="var1" type="text" required="true"/></p>
        <p>B:<s:input path="var2" type="text" required="true"/></p>
        <p>Result: ${result}</p>
        <p>
            <s:button name="operationType" value="sum">+</s:button>
            <s:button name="operationType" value="sub">-</s:button>
            <s:button name="operationType" value="mult">*</s:button>
            <s:button name="operationType" value="div">:</s:button>
        </p>
    </s:form>
</main>
</body>
</html>

<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Web Calculator - Registration</title>
</head>
<body>
<header>
    <h1>Registration</h1>
</header>
<main>
    <s:form action="/reg" method="post" modelAttribute="newUser">
        <p>First Name:<s:input path="nickname" type="text" required="true" placeholder="Nickname"/></p>
        <p>Login:<s:input path="login" type="email" required="true" placeholder="Login"/></p>
        <p>Password:<s:input path="password" type="password" required="true" placeholder="Password"/></p>
        <p><s:button type="submit">Registry</s:button></p>
    </s:form>
    <form action="${pageContext.request.contextPath}/views/index.jsp" method="get">
        <button type="submit">Cancel</button>
    </form>
</main>
</body>
</html>

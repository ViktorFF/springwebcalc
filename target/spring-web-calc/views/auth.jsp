<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Web Calculator - Authentication</title>
</head>
<body>
<header>
    <h1>Authentication</h1>
</header>
<main>
    <s:form action="/auth" method="post" modelAttribute="newUser">
        <p>Login: <s:input path="login" type="email" required="true" placeholder="Login"/></p>
        <p>Password: <s:input path="password" type="password" required="true" placeholder="Password"/></p>
        <p><s:button type="submit">SignIn</s:button></p>
    </s:form>
    <form action="${pageContext.request.contextPath}/views/index.jsp" method="get">
        <button type="submit">Cancel</button>
    </form>
</main>
</body>
</html>

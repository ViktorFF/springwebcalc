<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Web Calculator - Start Page</title>
</head>
<body>
<header>
    <h1>Welcome to Web Calculator</h1>
</header>
<main>
    <form action="${pageContext.request.contextPath}/auth" method="get">
        <button type="submit">SignIn</button>
    </form>
    <form action="${pageContext.request.contextPath}/reg" method="get">
        <button type="submit">Registration</button>
    </form>
</main>
</body>
</html>

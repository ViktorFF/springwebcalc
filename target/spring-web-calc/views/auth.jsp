<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Web Calculator - Authentication</title>
</head>
<body>
<header>
    <h1>Authentication</h1>
</header>
<main>
    <form action="${pageContext.request.contextPath}/auth" method="post">
        <p>
            <label>Login:
                <input type="email" name="login" required placeholder="Login">
            </label>
        </p>
        <p>
            <label>Password:
                <input type="password" name="password" required placeholder="Password">
            </label>
        </p>
        <p><button type="submit">SignIn</button></p>
    </form>
    <form action="${pageContext.request.contextPath}/views/index.jsp" method="get">
        <button type="submit">Cancel</button>
    </form>
</main>
</body>
</html>

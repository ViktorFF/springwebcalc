<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Web Calculator - Profile</title>
</head>
<body>
<header>
    <h1>Profile</h1>
</header>
<main>
    <form action="${pageContext.request.contextPath}/history" method="get">
        <button type="submit">History</button>
    </form>
    <form action="${pageContext.request.contextPath}/edit" method="get">
        <p>ID: #${id}</p>
        <p>
            Nickname: ${nickname}
            <button type="submit" name="fieldEdit" value="nickname">Change</button>
        </p>
        <p>
            Login: ${login}
            <button type="submit" name="fieldEdit" value="login">Change</button>
        </p>
        <p>
            Password: ${password}
            <button type="submit" name="fieldEdit" value="password">Change</button>
        </p>
    </form>
    <form action="${pageContext.request.contextPath}/calculator" method="get">
        <button type="submit">Back</button>
    </form>
</main>
</body>
</html>

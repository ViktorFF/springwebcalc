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
    <p>ID: #${id}</p>
    <p>Nickname: ${nickname}</p>
    <form action="${pageContext.request.contextPath}/calculator" method="get">
        <button type="submit">Back</button>
    </form>
</main>
</body>
</html>

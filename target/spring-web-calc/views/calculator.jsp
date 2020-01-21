<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
        <button type="submit">Profile</button>
    </form>
    <form action="${pageContext.request.contextPath}/logout" method="get">
        <button type="submit">Logout</button>
    </form>
    <form action="${pageContext.request.contextPath}/calculator" method="post">
        <p>
            <label>A:
                <input type="text" name="firstElement" required>
            </label>
        </p>
        <p>
            <label>B:
                <input type="text" name="secondElement" required>
            </label>
        </p>
        <p>Result: ${result}</p>
        <p>
            <button name="operation" value="sum">+</button>
            <button name="operation" value="sub">-</button>
            <button name="operation" value="mult">*</button>
            <button name="operation" value="div">:</button>
        </p>
    </form>
</main>
</body>
</html>

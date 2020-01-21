<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Web Calculator - Settings</title>
</head>
<body>
<header>
    <h1>Settings</h1>
</header>
<main>
    <form action="${pageContext.request.contextPath}/edit" method="post">
        <p>Old value: ${oldValue}</p>
        <p>
            <label>New value:
                <input type="text" name="newValue" placeholder="New value">
            </label>
        </p>
        <p><button type="submit" name="field" value="${field}">Change</button></p>
    </form>
    <form action="${pageContext.request.contextPath}/profile" method="get">
        <button type="submit">Cancel</button>
    </form>
</main>
</body>
</html>

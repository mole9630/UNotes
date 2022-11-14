<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>cookie信息</title>
</head>
<body>
    对象信息:${cookie.userName}
    <hr>
    名:${cookie.userName.name}
    <hr>
    值:${cookie.userName.value}
    <hr>

    <%
        response.addCookie(new Cookie("userName", "Hello-EL!"));
    %>
</body>
</html>

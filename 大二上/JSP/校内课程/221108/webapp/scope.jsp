<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        application.setAttribute("u_name", "name-application");
        session.setAttribute("u_name", "name-session");
        pageContext.setAttribute("u_name", "admin");
        request.setAttribute("u_name", "name-request");
    %>
    application:${applicationScope.u_name}<br>
    session:${sessionScope.u_name}<br>
    page:${pageScope.u_name}<br>
    request:${requestScope.u_name}<br>
    没有范围:${u_name}<br>
</body>
</html>

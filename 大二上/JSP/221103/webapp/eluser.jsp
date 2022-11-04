<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>显示信息</title>
</head>
<body>
    <%
        String userName = String.valueOf(request.getAttribute("user_name"));
        String userPassword = String.valueOf(request.getAttribute("user_password"));
        out.print("用户名为:" + userName + "<br>");
        out.print("密码为:" + userPassword + "<br>");
    %>
    使用EL获取范围内的属性值并显示:<br>
    用户名为:${user_name} <br>
    密码为:${requestScope.user_password}
</body>
</html>

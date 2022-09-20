<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/9/20
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>数据处理</title>
</head>
<body>
    数据获取 -> 处理
    <%
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String pwd = request.getParameter("pwd");

        // 判断是否为空
        if (username.equals("admin") && pwd.equals("admin")){
            // 验证通过
            response.sendRedirect("https://mole9630.top");
        }
        else {
    %>
        <jsp:forward page="login.jsp"></jsp:forward>
    <%
        }
    %>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/9/20
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>自动刷新</title>
</head>
<body>
    <%!
        int i = 0;
    %>

    <%
        i ++;
        response.setHeader("refresh", "2");  // 2秒自动刷新1次
        // response.setHeader("refresh", "2;url=https://mole9630.top");  // 刷新重定向到指定网址

    %>
    您是第<%=i%>位访客.
</body>
</html>

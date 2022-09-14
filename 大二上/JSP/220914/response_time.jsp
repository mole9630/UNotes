<%@ page import="java.util.Date" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/9/14
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示时间(response)</title>
</head>
<body>
    当前日期:
    <%=new Date()%>
    <%
        response.setHeader("refresh","1"); //每1秒刷新一次
    %>
</body>
</html>

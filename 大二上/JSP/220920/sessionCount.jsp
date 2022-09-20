<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/9/20
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>会话计数器</title>
</head>
<body>
    <%!
        int i = 0;
    %>
    <%
        if (session.isNew()){
            i ++;
        }
    %>
    您是第<%=i%>位访客.
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>网页会话计数器</title>
</head>
<body>
    <%!int i = 1;%>
    <%
        if (session.isNew()) { //判断是否是一个新的会话
            i++;
        }
        application.setAttribute("count", i);
        Integer count = (Integer) application.getAttribute("count");
    %>
    您是第<%=i%>位访客.

</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%!
        int i = 0;
    %>
    <%
        i ++;
        application.setAttribute("count", i);
    %>
    您是网站的第<%=i%>位访客.<br>
    您是网站的第<%=application.getAttribute("count")%>位访客.<br>

</body>
</html>

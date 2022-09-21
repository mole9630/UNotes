<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>网页访问计数器</title>
</head>
<body>
    <%!
        int count = 0;
    %>
    <%
        if (application.getAttribute("count") == null) {
            application.setAttribute("count", 1);
        }
        else {
            count = (int) application.getAttribute("count");
            count ++;
            application.setAttribute("count", count);
        }
    %>
    网站的总访问次数为:<%=count%>次.
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/9/13
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    这里是跳转页面
    <%!
        int n = 9630;
    %>
    <br>
    1.不带参数
    <jsp:forward page="forward2.jsp"></jsp:forward>
    <%=n%> <%-- 这里及以下将不会执行 --%>
    <br>
    2.带有参数的
    <%
        request.setCharacterEncoding("utf-8");
    %>
    <jsp:forward page="forward2.jsp">
        <jsp:param name="username" value="张三"/>
        <jsp:param name="userpassword" value="123321"/>
    </jsp:forward>
</body>
</html>

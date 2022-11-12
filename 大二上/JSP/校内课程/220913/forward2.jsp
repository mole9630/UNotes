<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/9/13
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    这里是跳转到的页面
    <%
        String uname = request.getParameter("username");
        String upassword = request.getParameter("userpassword");
        out.print("用户名:" + uname + " 密码:" + upassword);
    %>
</body>
</html>
